package com.fh.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_showHome")
public class ShowHomeMjb {

    @TableId(value = "showHomeId",type = IdType.AUTO)
    private Integer showHomeId;

    @TableField("showHomeName")
    private String showHomeName;

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
