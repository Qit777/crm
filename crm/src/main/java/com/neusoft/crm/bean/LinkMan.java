package com.neusoft.crm.bean;

import java.io.Serializable;

public class LinkMan implements Serializable {
    private Integer id;

    private String linkmanName;

    private String linkmanPhone1;

    private String linkmanPhone2;

    private String linkmanReamk;

    private String linkmanPost;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    public String getLinkmanPhone1() {
        return linkmanPhone1;
    }

    public void setLinkmanPhone1(String linkmanPhone1) {
        this.linkmanPhone1 = linkmanPhone1 == null ? null : linkmanPhone1.trim();
    }

    public String getLinkmanPhone2() {
        return linkmanPhone2;
    }

    public void setLinkmanPhone2(String linkmanPhone2) {
        this.linkmanPhone2 = linkmanPhone2 == null ? null : linkmanPhone2.trim();
    }

    public String getLinkmanReamk() {
        return linkmanReamk;
    }

    public void setLinkmanReamk(String linkmanReamk) {
        this.linkmanReamk = linkmanReamk == null ? null : linkmanReamk.trim();
    }

    public String getLinkmanPost() {
        return linkmanPost;
    }

    public void setLinkmanPost(String linkmanPost) {
        this.linkmanPost = linkmanPost == null ? null : linkmanPost.trim();
    }
}