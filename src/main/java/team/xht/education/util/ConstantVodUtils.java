package team.xht.education.util;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ConstantVodUtils implements InitializingBean {

    @Value("${aliyun.vod.file.keyid}")
    private String keyId;

    @Value("${aliyun.vod.file.keysecret}")
    private String keySecret;


    public static String KEY_ID;
    public static String KEY_SECRET;

    //初始化之后执行下方法
    @Override
    public void afterPropertiesSet() throws Exception {
        KEY_ID=keyId;
        KEY_SECRET=keySecret;
    }
}
