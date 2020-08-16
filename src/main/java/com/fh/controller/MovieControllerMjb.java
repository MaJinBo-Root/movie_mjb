package com.fh.controller;


import com.fh.entity.bo.MovieCriteriaMjb;
import com.fh.entity.po.MovieMjb;
import com.fh.entity.ro.ControllerResultMjb;
import com.fh.service.face.MovieServiceMjb;
import com.fh.util.OssUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("movie")
public class MovieControllerMjb {

    @Autowired
    private MovieServiceMjb movieServiceMjb;

    @RequestMapping("selectMovieMjb")
    public Map<String,Object> selectMovieMjb(MovieCriteriaMjb movieCriteriaMjb){
        Map<String, Object> map = movieServiceMjb.selectMovieMjb(movieCriteriaMjb);
        return map;
    }

    @RequestMapping("insertMovieMjb")
    public ControllerResultMjb insertMovieMjb(MovieMjb movieMjb){
        movieServiceMjb.insertMovieMjb(movieMjb);
        ControllerResultMjb successControllerResult = ControllerResultMjb.getSuccessControllerResult("新增正常", null);
        return successControllerResult;
    }


    @RequestMapping("uploadPhoto")
    public ControllerResultMjb uploadPhoto(MultipartFile moviePhoto){
        String moviePhotoPath = OssUtil.uploadFile(moviePhoto);
        ControllerResultMjb successControllerResult = ControllerResultMjb.getSuccessControllerResult("上传正常", moviePhotoPath);
        return successControllerResult;
    }

    @RequestMapping("toBuy")
    public ControllerResultMjb toBuy(Integer movieId){
        movieServiceMjb.toBuy(movieId);
        ControllerResultMjb successControllerResult = ControllerResultMjb.getSuccessControllerResult("购票正常", null);
        return successControllerResult;
    }
}
