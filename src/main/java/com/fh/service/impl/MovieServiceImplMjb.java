package com.fh.service.impl;

import com.fh.dao.MovieDaoMjb;
import com.fh.dao.ShowHomeDaoMjb;
import com.fh.entity.bo.MovieCriteriaMjb;
import com.fh.entity.po.MovieMjb;
import com.fh.entity.po.ShowHomeMjb;
import com.fh.service.face.MovieServiceMjb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieServiceImplMjb implements MovieServiceMjb {

    @Autowired
    private MovieDaoMjb movieDaoMjb;
    @Autowired
    private ShowHomeDaoMjb showHomeDaoMjbMjb;

    @Override
    public Map<String,Object> selectMovieMjb(MovieCriteriaMjb movieCriteriaMjb) {

        Map<String, Object> map = new HashMap<>();
        List<MovieMjb> movieMjbList = movieDaoMjb.selectMovieMjb(movieCriteriaMjb);
        Long count = movieDaoMjb.selectCountMjb(movieCriteriaMjb);
        map.put("draw",movieCriteriaMjb.getDraw());
        map.put("recordsFiltered",count);
        map.put("recordsTotal",count);
        map.put("data",movieMjbList);


        return map;
    }

    @Override
    @Transactional
    public void insertMovieMjb(MovieMjb movieMjb) {
        ShowHomeMjb showHomeMjb = showHomeDaoMjbMjb.selectById(movieMjb.getShowHomeId());
        movieMjb.setShowHomeName(showHomeMjb.getShowHomeName());
        movieDaoMjb.insert(movieMjb);

    }

}
