package com.wd.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Program: springclouddemo
 * @Description: 奖品实体类
 * @Author: 王栋
 * @Create: 2018/12/13 16:36
 **/
@Data
public class PrizeBean implements Serializable {

    private static final long serialVersionUID = -5646324566723357514L;

    private String prizeId;
    
    private String prizeNmae;

    private Integer prizeSum;

    private Integer prizeStatus;

}
