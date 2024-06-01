package com.neusoft.crm.bean;

import java.io.Serializable;

public class GoodsCategory implements Serializable {
    private Integer id;

    private String cateName;

    private String cateOrder;

    private Integer catePid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public String getCateOrder() {
        return cateOrder;
    }

    public void setCateOrder(String cateOrder) {
        this.cateOrder = cateOrder == null ? null : cateOrder.trim();
    }

    public Integer getCatePid() {
        return catePid;
    }

    public void setCatePid(Integer catePid) {
        this.catePid = catePid;
    }
}