package com.neusoft.crm.bean;

import java.io.Serializable;
import java.util.Date;

public class Employ implements Serializable {
    private Integer id;

    private String emName;

    private String emSno;

    private String emPhone;

    private String emSex;

    private String emPost;

    private String emAddress;

    private Integer emDepid;

    private Integer emState;

    private Date emCreatetime;

    private String emCreateuser;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName == null ? null : emName.trim();
    }

    public String getEmSno() {
        return emSno;
    }

    public void setEmSno(String emSno) {
        this.emSno = emSno == null ? null : emSno.trim();
    }

    public String getEmPhone() {
        return emPhone;
    }

    public void setEmPhone(String emPhone) {
        this.emPhone = emPhone == null ? null : emPhone.trim();
    }

    public String getEmSex() {
        return emSex;
    }

    public void setEmSex(String emSex) {
        this.emSex = emSex == null ? null : emSex.trim();
    }

    public String getEmPost() {
        return emPost;
    }

    public void setEmPost(String emPost) {
        this.emPost = emPost == null ? null : emPost.trim();
    }

    public String getEmAddress() {
        return emAddress;
    }

    public void setEmAddress(String emAddress) {
        this.emAddress = emAddress == null ? null : emAddress.trim();
    }

    public Integer getEmDepid() {
        return emDepid;
    }

    public void setEmDepid(Integer emDepid) {
        this.emDepid = emDepid;
    }

    public Integer getEmState() {
        return emState;
    }

    public void setEmState(Integer emState) {
        this.emState = emState;
    }

    public Date getEmCreatetime() {
        return emCreatetime;
    }

    public void setEmCreatetime(Date emCreatetime) {
        this.emCreatetime = emCreatetime;
    }

    public String getEmCreateuser() {
        return emCreateuser;
    }

    public void setEmCreateuser(String emCreateuser) {
        this.emCreateuser = emCreateuser == null ? null : emCreateuser.trim();
    }
}