package team.xht.education.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Ydy
 * @date 2020/10/4 - 17:05
 */
public interface OssService {
    String uploadOssFile(MultipartFile file);
}
