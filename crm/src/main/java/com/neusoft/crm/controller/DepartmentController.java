package com.neusoft.crm.controller;

import com.neusoft.crm.bean.Department;
import com.neusoft.crm.bean.ResultBean;
import com.neusoft.crm.dao.DepartmentMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
@Api(value = "部门",tags = "department")
public class DepartmentController {
    @Autowired
    private DepartmentMapper mapper;

    @PostMapping("save")
    @ApiOperation(value="部门，保存",tags = "department")
    public Object save(
            @RequestBody Department department){
        int rows=0;
        if (department.getId()!=null){
            rows=mapper.updateByPrimaryKeySelective(department);
        }
        else {
            rows= mapper.insertSelective(department);
        }

        ResultBean bean=null;
        if(rows>=1){
            bean=new ResultBean();
            bean.setObject(department);
            return bean;
        }
        else{
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            return bean;
        }
    }

    @GetMapping("delete")
    @ApiOperation(value="部门，删除",tags = "department")
    public Object delete(Integer id){
        int rows = mapper.deleteByPrimaryKey(id);
        ResultBean bean=null;
        if(rows>=1){
            bean=new ResultBean();
            return bean;
        }
        else{
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            return bean;
        }
    }

    @GetMapping("select")
    @ApiOperation(value="部门，查询",tags = "department")
    public Object select(String name){
        ResultBean bean=null;
        try {
            List<Department> list =mapper.selectall(name);
            bean=new ResultBean();
            bean.setObject(list);
        }
        catch (Exception e){
            e.printStackTrace();
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            bean.setMessage("查询部门异常，请联系管理员");
        }

        return bean;
    }

}
