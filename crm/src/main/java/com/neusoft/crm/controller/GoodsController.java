package com.neusoft.crm.controller;

import com.neusoft.crm.bean.Employ;
import com.neusoft.crm.bean.Goods;
import com.neusoft.crm.bean.ResultBean;
import com.neusoft.crm.dao.EmployMapper;
import com.neusoft.crm.dao.GoodsMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("goods")
@Api(value = "产品",tags = "goods")
public class GoodsController {
    @Autowired
    private GoodsMapper mapper;


    @PostMapping("save")
    @ApiOperation(value="产品，保存",tags = "goods")
    public Object save(@RequestBody Goods goods){
        int rows=0;
        if (goods.getId()!=null){
            rows=mapper.updateByPrimaryKeySelective(goods);
        }
        else {
            rows= mapper.insertSelective(goods);
        }

        ResultBean bean=null;
        if(rows>=1){
            bean=new ResultBean();
            bean.setObject(goods);
            return bean;
        }
        else{
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            return bean;
        }
    }

    @GetMapping("delete")
    @ApiOperation(value="产品，删除",tags = "goods")
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
    @ApiOperation(value="产品，查询",tags = "goods")
    public Object select(String name){
        ResultBean bean=null;
        try {
            List<Goods> list =mapper.selectall(name);
            bean=new ResultBean();
            bean.setObject(list);
        }
        catch (Exception e){
            e.printStackTrace();
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            bean.setMessage("查询产品异常，请联系管理员");
        }

        return bean;
    }
}
