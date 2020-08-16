package com.fh.entity.bo;

public class MovieCriteriaMjb {

    private String movieName;

    private Integer movieStock;

    private Integer showHomeId;

    private Long start;

    private  Long length;

    private Long draw;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMovieStock() {
        return movieStock;
    }

    public void setMovieStock(Integer movieStock) {
        this.movieStock = movieStock;
    }

    public Integer getShowHomeId() {
        return showHomeId;
    }

    public void setShowHomeId(Integer showHomeId) {
        this.showHomeId = showHomeId;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getDraw() {
        return draw;
    }

    public void setDraw(Long draw) {
        this.draw = draw;
    }

}
