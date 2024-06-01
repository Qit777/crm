package com.neusoft.crm.controller;

import com.neusoft.crm.bean.Department;
import com.neusoft.crm.bean.LinkMan;
import com.neusoft.crm.bean.ResultBean;
import com.neusoft.crm.dao.DepartmentMapper;
import com.neusoft.crm.dao.LinkManMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("linkman")
@Api(value = "对接人",tags = "linkman")
public class LinkManController {
    @Autowired
    private LinkManMapper mapper;

    @PostMapping("save")
    @ApiOperation(value="对接人，保存",tags = "linkman")
    public Object save(@RequestBody LinkMan linkman){
        int rows=0;
        if (linkman.getId()!=null){
            rows=mapper.updateByPrimaryKeySelective(linkman);
        }
        else {
            rows= mapper.insertSelective(linkman);
        }

        ResultBean bean=null;
        if(rows>=1){
            bean=new ResultBean();
            bean.setObject(linkman);
            return bean;
        }
        else{
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            return bean;
        }
    }

    @GetMapping("delete")
    @ApiOperation(value="对接人，删除",tags = "linkman")
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
    @ApiOperation(value="对接人，查询",tags = "linkman")
    public Object select(String name){
        ResultBean bean=null;
        try {
            List<LinkMan> list =mapper.selectall(name);
            bean=new ResultBean();
            bean.setObject(list);
        }
        catch (Exception e){
            e.printStackTrace();
            bean=new ResultBean(ResultBean.ResultType.FAIL);
            bean.setMessage("查询对接人异常，请联系管理员");
        }

        return bean;
    }

}
