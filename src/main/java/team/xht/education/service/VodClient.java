package team.xht.education.service;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import team.xht.education.reult.R;

import java.util.List;

@Component
public interface VodClient {
    //调用的方法路径
    //根据id删除阿里云视频
    @DeleteMapping("/eduvod/video/removeAlyVideo/{id}")
    R removeAlyVideo(@PathVariable("id") String id);//特别注意，调用方法是要指明参数名称

    //删除多个视频
    @DeleteMapping("/eduvod/video/delete-batch")
    R deleteBatch(@RequestParam("videoIdList") List<String> videoIdList);


}
