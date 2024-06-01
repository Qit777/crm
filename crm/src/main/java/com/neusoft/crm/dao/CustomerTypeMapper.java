package com.neusoft.crm.dao;

import com.neusoft.crm.bean.Customer;
import com.neusoft.crm.bean.CustomerType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerType record);

    int insertSelective(CustomerType record);

    CustomerType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerType record);

    int updateByPrimaryKey(CustomerType record);

    List<CustomerType> selectall(@Param("name") String name);

}