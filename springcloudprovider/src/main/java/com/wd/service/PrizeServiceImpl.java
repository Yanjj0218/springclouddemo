package com.wd.service;

import com.wd.mapper.PrizeMapper;
import com.wd.model.PrizeBean;
import com.wd.model.RecordBean;
import com.wd.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: springclouddemo
 * @Description:
 * @Author: 王栋
 * @Create: 2018/12/13 17:18
 **/
@Service
public class PrizeServiceImpl implements PrizeService {

    @Autowired
    private PrizeMapper prizeMapper;

    @Override
    public List<PrizeBean> queryPrizeList() {
        return prizeMapper.queryPrizeList();
    }

    @Override
    public void savePrize(PrizeBean prizeBean) {
        prizeMapper.savePrize(prizeBean);
    }

    @Override
    public void editPrize(PrizeBean prizeBean) {
        prizeMapper.editPrize(prizeBean);
    }

    @Override
    public void deletePrize(String prizeId) {
        prizeMapper.deletePrize(prizeId);
    }

}
