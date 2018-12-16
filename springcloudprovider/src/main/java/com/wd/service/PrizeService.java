package com.wd.service;

import com.wd.model.PrizeBean;
import com.wd.model.RecordBean;
import com.wd.model.UserBean;

import java.util.List;

/**
 * @Program: springclouddemo
 * @Description:
 * @Author: 王栋
 * @Create: 2018/12/13 17:18
 **/
public interface PrizeService {

    /**
     * @Description //查询奖品
     * @Author 王栋
     * @Date 2018/12/13 17:24
     * @param:
     * @return java.util.List<com.wd.model.PrizeBean>
     **/
    List<PrizeBean> queryPrizeList();

    /**
     * @Description // 新增奖品
     * @Author 王栋
     * @Date 2018/12/13 19:08
     * @param: prizeBean
     * @return void
     **/
    void savePrize(PrizeBean prizeBean);

    /**
     * @Description // 修改
     * @Author 王栋
     * @Date 2018/12/13 19:12
     * @param: prizeBean
     * @return void
     **/
    void editPrize(PrizeBean prizeBean);

    /**
     * @Description // 删除
     * @Author 王栋
     * @Date 2018/12/13 19:17
     * @param: prizeId
     * @return void
     **/
    void deletePrize(String prizeId);


}
