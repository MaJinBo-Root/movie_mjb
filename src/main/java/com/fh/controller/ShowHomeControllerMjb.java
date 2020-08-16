package com.fh.controller;


import com.fh.entity.po.ShowHomeMjb;
import com.fh.entity.ro.ControllerResultMjb;
import com.fh.service.face.ShowHomeServiceMjb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("showHome")
public class ShowHomeControllerMjb {

    @Autowired
    private ShowHomeServiceMjb showHomeServiceMjb;

    @RequestMapping("selectShowHome")
    public ControllerResultMjb selectShowHome(){
        List<ShowHomeMjb> showHomeMjbList = showHomeServiceMjb.selectShowHome();
        ControllerResultMjb successControllerResult = ControllerResultMjb.getSuccessControllerResult("放映室查询正常", showHomeMjbList);
        return successControllerResult;
    }


}
