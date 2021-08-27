package team.xht.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import team.xht.education.reult.R;
import team.xht.education.service.OssService;

/**
 * @author Ydy
 * @date 2020/10/4 - 17:05
 */
@RestController
@RequestMapping("/eduoss/fileoss")
public class OssController {

    @Autowired
    private OssService ossService;

    //上传头像方法
    @PostMapping("uploadFileOss")
    public R uploadOssFile(MultipartFile file){
        //MultipartFile 获取上传文件
        String url=ossService.uploadOssFile(file);
        return R.ok().data("url",url);
    }

}
