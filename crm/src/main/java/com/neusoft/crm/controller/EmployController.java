package com.neusoft.crm.controller;

import com.neusoft.crm.bean.Department;
import com.neusoft.crm.bean.Employ;
import com.neusoft.crm.bean.ResultBean;
import com.neusoft.crm.dao.EmployMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employ")
@Api(value = "员工",tags = "employ")
public class EmployController {
    @Autowired
    private EmployMapper mapper;


    @PostMapping("save")
    @ApiOperation(value="员工，保存",tags = "employ")
    public Object save(@RequestBody Employ employ){
        int rows=0;
        if (employ.getId()!=null){
            rows=mapper.updateByPrimaryKeySelective(employ);
        }
        else {
            rows= mapper.insertSelective(employ);
        }

        ResultBean bean=null;
        if(rows>=1){
            bean=new ResultBean();
            bean.setObject(employ);
            return bean;
        }
        else{
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            return bean;
        }
    }

    @GetMapping("delete")
    @ApiOperation(value="员工，删除",tags = "employ")
    public Object delete(Integer id){
        int rows=mapper.deleteByPrimaryKey(id);
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
    @ApiOperation(value="员工，查询",tags = "employ")
    public Object select(String name){
        ResultBean bean=null;
        try {
            List<Employ> list =mapper.selectall(name);
            bean=new ResultBean();
            bean.setObject(list);
        }
        catch (Exception e){
            e.printStackTrace();
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            bean.setMessage("查询员工异常，请联系管理员");
        }

        return bean;
    }

}
