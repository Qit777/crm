package com.neusoft.crm.bean;

import java.io.Serializable;

public class Department implements Serializable {
    private Integer id;

    private String depName;

    private String depOrder;

    private Integer depPid;

    private String depRemark;

    private Integer depState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    public String getDepOrder() {
        return depOrder;
    }

    public void setDepOrder(String depOrder) {
        this.depOrder = depOrder == null ? null : depOrder.trim();
    }

    public Integer getDepPid() {
        return depPid;
    }

    public void setDepPid(Integer depPid) {
        this.depPid = depPid;
    }

    public String getDepRemark() {
        return depRemark;
    }

    public void setDepRemark(String depRemark) {
        this.depRemark = depRemark == null ? null : depRemark.trim();
    }

    public Integer getDepState() {
        return depState;
    }

    public void setDepState(Integer depState) {
        this.depState = depState;
    }
}