package com.neusoft.crm.bean;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private Integer id;

    private String goodsName;

    private Integer goodsCateid;

    private String goodsCover;

    private Float goodsPrice;

    private Date goodsCreatetime;

    private String goodsCreateuser;

    private Date goodsUpdatetime;

    private String goodsUpdateuser;

    private Integer goodsStatus;

    private String goodsDesc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsCateid() {
        return goodsCateid;
    }

    public void setGoodsCateid(Integer goodsCateid) {
        this.goodsCateid = goodsCateid;
    }

    public String getGoodsCover() {
        return goodsCover;
    }

    public void setGoodsCover(String goodsCover) {
        this.goodsCover = goodsCover == null ? null : goodsCover.trim();
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Date getGoodsCreatetime() {
        return goodsCreatetime;
    }

    public void setGoodsCreatetime(Date goodsCreatetime) {
        this.goodsCreatetime = goodsCreatetime;
    }

    public String getGoodsCreateuser() {
        return goodsCreateuser;
    }

    public void setGoodsCreateuser(String goodsCreateuser) {
        this.goodsCreateuser = goodsCreateuser == null ? null : goodsCreateuser.trim();
    }

    public Date getGoodsUpdatetime() {
        return goodsUpdatetime;
    }

    public void setGoodsUpdatetime(Date goodsUpdatetime) {
        this.goodsUpdatetime = goodsUpdatetime;
    }

    public String getGoodsUpdateuser() {
        return goodsUpdateuser;
    }

    public void setGoodsUpdateuser(String goodsUpdateuser) {
        this.goodsUpdateuser = goodsUpdateuser == null ? null : goodsUpdateuser.trim();
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }
}