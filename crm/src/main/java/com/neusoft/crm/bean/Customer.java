package com.neusoft.crm.bean;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Integer id;

    private String customerName;

    private String customerAddress;

    private Integer customerTypeid;

    private Date customerCreatetime;

    private String customerCreatesuer;

    private Date customerUpdatetime;

    private String customerUpdateuser;

    private Integer customerStatus;

    private String customerTaxid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public Integer getCustomerTypeid() {
        return customerTypeid;
    }

    public void setCustomerTypeid(Integer customerTypeid) {
        this.customerTypeid = customerTypeid;
    }

    public Date getCustomerCreatetime() {
        return customerCreatetime;
    }

    public void setCustomerCreatetime(Date customerCreatetime) {
        this.customerCreatetime = customerCreatetime;
    }

    public String getCustomerCreatesuer() {
        return customerCreatesuer;
    }

    public void setCustomerCreatesuer(String customerCreatesuer) {
        this.customerCreatesuer = customerCreatesuer == null ? null : customerCreatesuer.trim();
    }

    public Date getCustomerUpdatetime() {
        return customerUpdatetime;
    }

    public void setCustomerUpdatetime(Date customerUpdatetime) {
        this.customerUpdatetime = customerUpdatetime;
    }

    public String getCustomerUpdateuser() {
        return customerUpdateuser;
    }

    public void setCustomerUpdateuser(String customerUpdateuser) {
        this.customerUpdateuser = customerUpdateuser == null ? null : customerUpdateuser.trim();
    }

    public Integer getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(Integer customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerTaxid() {
        return customerTaxid;
    }

    public void setCustomerTaxid(String customerTaxid) {
        this.customerTaxid = customerTaxid == null ? null : customerTaxid.trim();
    }
}