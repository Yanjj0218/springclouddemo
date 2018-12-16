package com.wd.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Program: springclouddemo
 * @Description:
 * @Author: 王栋
 * @Create: 2018/12/14 17:03
 **/
@FeignClient("cloudprovider")
public interface PrizeServiceFeign extends PrizeServiceApi{

}
