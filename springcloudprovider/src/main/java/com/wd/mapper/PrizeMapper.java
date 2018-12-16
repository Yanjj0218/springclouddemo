package com.wd.mapper;

import com.wd.model.PrizeBean;
import com.wd.model.RecordBean;
import com.wd.model.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Program: springclouddemo
 * @Description:
 * @Author: 王栋
 * @Create: 2018/12/13 17:19
 **/
public interface PrizeMapper {

    /**
     * @Description // 查询奖品
     * @Author 王栋
     * @Date 2018/12/13 17:25
     * @param:
     * @return java.util.List<com.wd.model.PrizeBean>
     **/
    List<PrizeBean> queryPrizeList();

    /**
     * @Description // 新增奖品
     * @Author 王栋
     * @Date 2018/12/13 19:09
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
     * @Date 2018/12/13 19:18
     * @param: prizeId
     * @return void
     **/
    void deletePrize(String prizeId);

}
