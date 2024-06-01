package com.neusoft.crm.dao;

import com.neusoft.crm.bean.Employ;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employ record);

    int insertSelective(Employ record);

    Employ selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employ record);

    int updateByPrimaryKey(Employ record);

    List<Employ> selectall(@Param("name") String name);
}