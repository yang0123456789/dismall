package com.yang.thirdparty;


import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class MallThirdPartyApplicationTests {
    @Autowired
    OSSClient ossClient;

    @Test
    void contextLoads() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
//// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
//        String accessKeyId = "LTAI4G6nRjPNrpTUyYJhjK4Q";
//        String accessKeySecret = "CGhdrl1x51bn4Wsmt6YYRYGE4pvLAT";


//// 创建OSSClient实例。
//        ossClient.build(endpoint, accessKeyId, accessKeySecret);

// 上传文件流。
        InputStream inputStream = new FileInputStream("D:\\task\\dismall\\mall-third-party\\src\\test\\java\\com\\yang\\thirdparty\\3.jpg");
        ossClient.putObject("dismall-yang", "test/testpic2", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传完成");
    }

}
