package com.yang.mall_product.controller;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * # @author  chilcyWind
 * # @Time   2020/11/6 10:04
 * # @version 1.0
 * # @File : OSStest.java
 * # @Software: IntelliJ IDEA
 */
public class OSStest {
    public static void main(String[] args) throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI4G6nRjPNrpTUyYJhjK4Q";
        String accessKeySecret = "CGhdrl1x51bn4Wsmt6YYRYGE4pvLAT";


// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 上传文件流。
        InputStream inputStream = new FileInputStream("src/main/java/com/yang/mall_product/controller/3.jpg");
        ossClient.putObject("dismall-yang", "test/testpic", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();
    }
}

