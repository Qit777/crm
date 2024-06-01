package com.neusoft.crm.controller;

import com.neusoft.crm.bean.Department;
import com.neusoft.crm.bean.Employ;
import com.neusoft.crm.bean.LinkMan;
import com.neusoft.crm.dao.DepartmentMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Controller
@RequestMapping("/test")

public class TestController {

    @Autowired
    private DepartmentMapper mapper;

    @GetMapping("hello")
    @ApiOperation(tags = "测试方法 helloworld",value = "test")
    public String helloworld(){
        return "hello world";
    }
    @GetMapping("list")
    public Object list() {
        List<Department> list = mapper.selectall(null);
        return list;
    }

}
