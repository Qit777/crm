package com.neusoft.crm.controller;


import com.neusoft.crm.bean.Department;
import com.neusoft.crm.bean.GoodsCategory;
import com.neusoft.crm.bean.ResultBean;
import com.neusoft.crm.dao.GoodsCategoryMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("goods_category")
@Api(value = "商品分类",tags = "goods_category")
public class GoodsCategoryController {
    @Autowired
    private GoodsCategoryMapper mapper;
    @PostMapping("save")
    @ApiOperation(value="商品分类，保存",tags = "goods_category")
    public Object save(@RequestBody GoodsCategory goods_category){
        int rows=0;
        if (goods_category.getId()!=null){
            rows=mapper.updateByPrimaryKeySelective(goods_category);
        }
        else {
            rows= mapper.insertSelective(goods_category);
        }

        ResultBean bean=null;
        if(rows>=1){
            bean=new ResultBean();
            bean.setObject(goods_category);
            return bean;
        }
        else{
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            return bean;
        }
    }

    @GetMapping("delete")
    @ApiOperation(value="商品分类，删除",tags = "goods_category")
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
    @ApiOperation(value="商品分类，查询",tags = "goods_category")
    public Object select(String name){
        ResultBean bean=null;
        try {
            List<GoodsCategory> list =mapper.selectall(name);
            bean=new ResultBean();
            bean.setObject(list);
        }
        catch (Exception e){
            e.printStackTrace();
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            bean.setMessage("查询商品分类异常，请联系管理员");
        }

        return bean;
    }

}
