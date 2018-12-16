package com.wd.controller;

import com.wd.model.PrizeBean;
import com.wd.service.PrizeService;
import com.wd.service.PrizeServiceApi;
import com.wd.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @Program: springclouddemo
 * @Description:
 * @Author: 王栋
 * @Create: 2018/12/13 17:17
 **/
@RestController
public class PrizeController implements PrizeServiceApi{

    @Autowired
    private PrizeService prizeService;

    private static final Logger logger = LoggerFactory.getLogger(PrizeController.class);

    /**
     * @Description // 查询
     * @Author 王栋
     * @Date 2018/12/14 16:14
     * @param:
     * @return java.util.List<com.wd.model.PrizeBean>
     **/
    @Override
    public List<PrizeBean> queryPrizeList() {
        logger.info("进入生产者查询方法");
        List<PrizeBean> list = prizeService.queryPrizeList();
        return list;
    }

    /**
     * @Description // 新增
     * @Author 王栋
     * @Date 2018/12/14 16:14
     * @param: prizeBean
     * @return java.lang.Boolean
     **/
    @Override
    public Boolean savePrize(@RequestBody PrizeBean prizeBean) {
        logger.info("进入生产者新增方法"+prizeBean);
        try {
            prizeBean.setPrizeId(StringUtil.getUUId());
            prizeService.savePrize(prizeBean);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @Description // 修改
     * @Author 王栋
     * @Date 2018/12/14 16:14
     * @param: prizeBean
     * @return java.lang.Boolean
     **/
    @Override
    public Boolean editPrize(@RequestBody PrizeBean prizeBean) {
        logger.info("进入生产者修改方法"+prizeBean);
        try {
            prizeService.editPrize(prizeBean);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @Description // 删除
     * @Author 王栋
     * @Date 2018/12/14 16:14
     * @param: prizeId
     * @return java.lang.Boolean
     **/
    @Override
    public Boolean deletePrize(String prizeId) {
        logger.info("进入生产者删除方法"+prizeId);

        try {
            prizeService.deletePrize(prizeId);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    //传参测试 string
    @Override
    public void stringTest(String name, Integer id) {
        logger.info("可以接收到string类型的：" + name+"和 Integer类型的："+id);
    }

}
