package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.bo.MovieCriteriaMjb;
import com.fh.entity.po.MovieMjb;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDaoMjb extends BaseMapper<MovieMjb> {

    List<MovieMjb> selectMovieMjb(MovieCriteriaMjb movieCriteriaMjb);

    Long selectCountMjb(MovieCriteriaMjb movieCriteriaMjb);

}
