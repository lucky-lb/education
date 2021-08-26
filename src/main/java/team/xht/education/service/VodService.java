package team.xht.education.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface VodService {
    String uploadAlyVideo(MultipartFile file);

    //删除多个视频
    void removeMoreAlyVideo(List videoIdList);
}
