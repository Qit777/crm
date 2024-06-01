package com.neusoft.crm.dao;

import com.neusoft.crm.bean.Department;
import com.neusoft.crm.bean.LinkMan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LinkManMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LinkMan record);

    int insertSelective(LinkMan record);

    LinkMan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LinkMan record);

    int updateByPrimaryKey(LinkMan record);

    List<LinkMan> selectall(@Param("name") String name);
}