package com.wangyang.demo.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

//@Param(file)
@CrossOrigin
@RestController
public class Upload {
    @PostMapping("/upload")
    public Object upload(@RequestParam("file") MultipartFile fileUpload){
        System.out.println("1111");
        System.out.println(fileUpload);
        //获取文件名
        String fileName = fileUpload.getOriginalFilename();
        //获取文件后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //重新生成文件名
        fileName = UUID.randomUUID()+suffixName;
        //指定本地文件夹存储图片
        String filePath = "D:/java_project/springboot/src/main/resources/static/";
        try {
            //将图片保存到static文件夹里
            fileUpload.transferTo(new File(filePath+fileName));
//            return new Massage(0,"success to upload");
            return (filePath+fileName);
        } catch (Exception e) {
            e.printStackTrace();
//            return new Massage(-1,"fail to upload");
            return ("上传失败");
        }
    }
}
