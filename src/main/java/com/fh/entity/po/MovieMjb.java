package com.fh.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;


@TableName("t_movie")
public class MovieMjb {

    @TableId(value = "movieId",type = IdType.AUTO)
    private Integer movieId;

    @TableField("movieName")
    private String movieName;

    @TableField("movieShowTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date movieShowTime;

    @TableField("movieStock")
    private Integer movieStock;

    @TableField("moviePrice")
    private BigDecimal moviePrice;

    @TableField("moviePhotoPath")
    private String moviePhotoPath;

    @TableField("showHomeId")
    private Integer showHomeId;

    @TableField(exist = false)
    private String showHomeName;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getMovieShowTime() {
        return movieShowTime;
    }

    public void setMovieShowTime(Date movieShowTime) {
        this.movieShowTime = movieShowTime;
    }

    public Integer getMovieStock() {
        return movieStock;
    }

    public void setMovieStock(Integer movieStock) {
        this.movieStock = movieStock;
    }

    public BigDecimal getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(BigDecimal moviePrice) {
        this.moviePrice = moviePrice;
    }

    public String getMoviePhotoPath() {
        return moviePhotoPath;
    }

    public void setMoviePhotoPath(String moviePhotoPath) {
        this.moviePhotoPath = moviePhotoPath;
    }

    public Integer getShowHomeId() {
        return showHomeId;
    }

    public void setShowHomeId(Integer showHomeId) {
        this.showHomeId = showHomeId;
    }

    public String getShowHomeName() {
        return showHomeName;
    }

    public void setShowHomeName(String showHomeName) {
        this.showHomeName = showHomeName;
    }
}
