package team.xht.education.service.serviceImpl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import team.xht.education.service.OssService;
import team.xht.education.util.ConstantPropertiesUtils;

import java.io.InputStream;
import java.util.UUID;

/**
 * @author Ydy
 * @date 2020/10/4 - 17:06
 */
@Service
public class OssServiceImpl implements OssService {
    @Override
    public String uploadOssFile(MultipartFile file) {

        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = ConstantPropertiesUtils.END_POINT;
        String accessKeyId = ConstantPropertiesUtils.KEY_ID;
        String accessKeySecret = ConstantPropertiesUtils.KEY_SECRET;
        String bucketName=ConstantPropertiesUtils.BUCKET_NAME;

        try {
            // 创建OSSClient实例。
            OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
            // 上传文件流。
            InputStream inputStream = file.getInputStream();

            //1.在文件名称里添加唯一值
            String uuid= UUID.randomUUID().toString().replaceAll("-","");
            String  fileName=file.getOriginalFilename();
            fileName=uuid+fileName;
            //2.实现按日期进行分类
            //获取当前日期
            String dataPath=new DateTime().toString("yyyy/MM/dd");
            fileName=dataPath+"/"+fileName;
            //调用oss方法实现上传
            //第一个参数，Bucket名称，
            //第二个参数：上传到oss文件路径和文件名称 /bb/aa/a.jpg
            //第三个参数：上传文件输入流
            ossClient.putObject(bucketName,fileName,inputStream);

            // 关闭OSSClient。
            ossClient.shutdown();

            //把上传到阿里云oss路径手动拼接出来
            String url="https://"+bucketName+"."+endpoint+"/"+fileName;
            return url;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }





    }
}
