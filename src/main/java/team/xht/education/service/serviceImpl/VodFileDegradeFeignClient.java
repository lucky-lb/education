package team.xht.education.service.serviceImpl;


import org.springframework.stereotype.Component;
import team.xht.education.reult.R;
import team.xht.education.service.VodClient;

import java.util.List;

/**
 * @Author Miracle Luna
 * @Date 2021/8/26 23:04
 * @Version 1.0
 */

@Component
public class VodFileDegradeFeignClient implements VodClient {//出错执行方法
    @Override
    public R removeAlyVideo(String id) {
        return R.error().message("删除视频出错了");
    }

    @Override

    public R deleteBatch(List<String> videoIdList) {
        return R.error().message("删除多个视频出错了");
    }
}
