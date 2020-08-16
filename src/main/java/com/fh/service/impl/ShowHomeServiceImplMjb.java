package com.fh.service.impl;

import com.fh.dao.ShowHomeDaoMjb;
import com.fh.entity.po.ShowHomeMjb;
import com.fh.service.face.ShowHomeServiceMjb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowHomeServiceImplMjb implements ShowHomeServiceMjb {

    @Autowired
    private ShowHomeDaoMjb showHomeDaoMjb;

    @Override
    public List<ShowHomeMjb> selectShowHome() {
        List<ShowHomeMjb> showHomeMjbList = showHomeDaoMjb.selectList(null);
        return showHomeMjbList;
    }
}
