package com.neusoft.crm.controller;

import com.neusoft.crm.bean.CustomerType;
import com.neusoft.crm.bean.ResultBean;
import com.neusoft.crm.dao.CustomerTypeMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer_type")
@Api(tags="customer_type",value = "顾客类型")
public class CustomerTypeController {
    @Autowired
    private CustomerTypeMapper mapper;

    //插入、更新
    @PostMapping("save")
    @ApiOperation(value = "顾客类型，保存",tags = "customer_type")
    public Object save(@RequestBody CustomerType customer_type){
        int rows=0;
        if (customer_type.getId()!=null)
        {
            rows= mapper.updateByPrimaryKeySelective(customer_type);
        }
        else {
            rows= mapper.insertSelective(customer_type);
        }
        ResultBean bean=null;
        if(rows>=1)
        {
            bean=new ResultBean();
            bean.setObject(customer_type);
            return bean;
        }
        else{
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            return bean;
        }
    }


    //删除
    @GetMapping("delete")
    @ApiOperation(value = "顾客类型，删除",tags = "customer_type")
    public Object delete(Integer id){
        int rows=mapper.deleteByPrimaryKey(id);
        ResultBean bean=null;
        if(rows>=1)
        {
            bean=new ResultBean();
            return bean;
        }
        else{
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            return bean;
        }
    }


    //查询
    @GetMapping("select")
    @ApiOperation(value = "顾客类型，查询",tags = "customer_type")
    public Object select(String name){
        ResultBean bean=null;
        try{
            List<CustomerType> list=mapper.selectall(name);
            bean=new ResultBean();
            bean.setObject(list);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            bean.setMessage("查询异常，请联系管理员");
        }
        return bean;
    }

}
