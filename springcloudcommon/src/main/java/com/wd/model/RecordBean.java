package com.wd.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Program: springclouddemo
 * @Description: 领取记录
 * @Author: 王栋
 * @Create: 2018/12/13 16:40
 **/
@Data
public class RecordBean implements Serializable {

    private static final long serialVersionUID = 5385611312684003699L;

    private String recordId;

    private String recordInfo;

    private String userId;

    private String userName;

    private String prizeId;

    private String recordTime;
}
