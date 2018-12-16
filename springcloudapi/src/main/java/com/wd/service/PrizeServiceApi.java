package com.wd.service;

import com.wd.model.PrizeBean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Program: springclouddemo
 * @Description:
 * @Author: 王栋
 * @Create: 2018/12/14 15:52
 **/
@RequestMapping("prizeServiceApi")
public interface PrizeServiceApi {

    /**
     * @Description // 查询
     * @Author 王栋
     * @Date 2018/12/14 15:56
     * @param:
     * @return java.util.List<com.wd.model.PrizeBean>
     **/
    @GetMapping("prize")
    List<PrizeBean> queryPrizeList();

    /**
     * @Description // 新增
     * @Author 王栋
     * @Date 2018/12/14 15:57
     * @param: prizeBean
     * @return java.lang.Boolean
     **/
    @PostMapping("prize")
    Boolean savePrize(PrizeBean prizeBean);

    /**
     * @Description // 修改
     * @Author 王栋
     * @Date 2018/12/14 15:58
     * @param: prizeBean
     * @return java.lang.Boolean
     **/
    @PutMapping("prize")
    Boolean editPrize(PrizeBean prizeBean);

    /**
     * @Description // 删除
     * @Author 王栋
     * @Date 2018/12/14 15:59
     * @param: prizeId
     * @return java.lang.Boolean
     **/
    @DeleteMapping("prize")
    Boolean deletePrize(@RequestParam("prizeId") String prizeId);

    //传参测试 string
    @GetMapping("test")
    void stringTest(@RequestParam("name") String name, @RequestParam("id") Integer id);

}
