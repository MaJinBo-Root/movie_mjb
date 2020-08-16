package com.fh.service.face;

import com.fh.entity.bo.MovieCriteriaMjb;
import com.fh.entity.po.MovieMjb;

import java.util.Map;

public interface MovieServiceMjb {

    Map<String,Object> selectMovieMjb(MovieCriteriaMjb movieCriteriaMjb);

    void insertMovieMjb(MovieMjb movieMjb);

    void toBuy(Integer movieId);
}
