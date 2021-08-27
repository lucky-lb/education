package team.xht.education.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xht.education.dao.CrmBannerMapper;
import team.xht.education.entity.CrmBanner;
import team.xht.education.entity.CrmBannerExample;
import team.xht.education.reult.ResultData;
import team.xht.education.service.CrmBannerService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrmBannerServiceImpl implements CrmBannerService {
    @Autowired
    private CrmBannerMapper mapper;//此处在mapper接口使用@Repository就不报错

    @Override
    public ResultData<List<String>> findAll() {//test
        ResultData<List<String>> resultData=new ResultData<>();
        CrmBannerExample example = new CrmBannerExample();
        example.createCriteria();
        List<CrmBanner> banners = mapper.selectByExample(example);
        List<String> list=new ArrayList<>();
        if(banners.size()>0){
            for (CrmBanner banner : banners) {
                list.add(banner.getImageUrl());
            }
            resultData.setCode(200);
            resultData.setMsg("find banner success");
        }else {
            resultData.setCode(404);
            resultData.setMsg("find banner error");
            resultData.setData(list);
        }
        return resultData;
    }
}
