package com.fh.util;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.fh.global.enums.GlobalEnumMjb;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public class OssUtil {

    public static String uploadFile(MultipartFile file){
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String endpoint = "oss-cn-qingdao.aliyuncs.com";
        String fileName = UUID.randomUUID().toString().substring(0,6)+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String accessKeyId = GlobalEnumMjb.OSS_ACCESSKEYID.getCommonInfermation();
        String accessKeySecret = GlobalEnumMjb.OSS_ACCESSKEYSECRET.getCommonInfermation();
        String bucketName=GlobalEnumMjb.OSS_BUCKETNAME.getCommonInfermation();
        OSS ossClient = new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName,fileName,inputStream);
        PutObjectResult putObjectResult = ossClient.putObject(putObjectRequest);
        ossClient.shutdown();
        return "http://"+bucketName+"."+endpoint+"/"+fileName;

    }

}
