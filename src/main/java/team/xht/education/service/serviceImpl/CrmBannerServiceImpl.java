package team.xht.education.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.xht.education.dao.CrmBannerMapper;
import team.xht.education.entity.CrmBannerExample;
import team.xht.education.service.CrmBannerService;

@Service
public class CrmBannerServiceImpl implements CrmBannerService {
    @Autowired
    private CrmBannerMapper mapper;//此处在mapper接口使用@Repository就不报错

    @Override
    public void findAll() {//test
        CrmBannerExample example = new CrmBannerExample();
        CrmBannerExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo("1194556896025845762");
        long l = mapper.countByExample(example);
        System.out.println(l);
    }
}
