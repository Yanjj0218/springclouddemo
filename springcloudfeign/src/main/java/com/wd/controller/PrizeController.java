package com.wd.controller;

import com.wd.model.PrizeBean;
import com.wd.service.PrizeServiceFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Program: springclouddemo
 * @Description:
 * @Author: 王栋
 * @Create: 2018/12/14 10:42
 **/
@Controller
public class PrizeController {

    @Autowired
    private PrizeServiceFeign prizeServiceFeign;

    private static final Logger logger = LoggerFactory.getLogger(PrizeController.class);

    /**
     * @Description // 查询
     * @Author 王栋
     * @Date 2018/12/14 16:35
     * @param:
     * @return java.util.List<com.wd.model.PrizeBean>
     **/
    @RequestMapping("queryPrizeList")
    @ResponseBody
    public List<PrizeBean> queryPrizeList(){
        return prizeServiceFeign.queryPrizeList();
    }
    /**
     * @Description // 新增
     * @Author 王栋
     * @Date 2018/12/14 16:34
     * @param: prizeBean
     * @return java.lang.Boolean
     **/
    @RequestMapping("savePrize")
    @ResponseBody
    public Boolean savePrize(PrizeBean prizeBean){
         return prizeServiceFeign.savePrize(prizeBean);
    }

    /**
     * @Description // 修改
     * @Author 王栋
     * @Date 2018/12/14 16:34
     * @param: prizeBean
     * @return java.lang.Boolean
     **/
    @RequestMapping("editPrize")
    @ResponseBody
    public Boolean editPrize(PrizeBean prizeBean){
         return prizeServiceFeign.editPrize(prizeBean);
    }

    /**
     * @Description // 删除
     * @Author 王栋
     * @Date 2018/12/14 16:34
     * @param: prizeId
     * @return java.lang.Boolean
     **/
    @RequestMapping("deletePrize")
    @ResponseBody
    public Boolean deletePrize(String prizeId){
        return prizeServiceFeign.deletePrize(prizeId);
    }

    //传参测试 string Integer
    @RequestMapping("stringTest")
    @ResponseBody
    public void stringTest(String name,Integer id){
        HashMap<String ,Object> params = new HashMap<>();
        params.put("name","小红");
        params.put("age",18);
        List<String> list = new ArrayList<>();
        list.add("小兰");
        list.add("小黑");
        prizeServiceFeign.stringTest(name,id);
    }
}
