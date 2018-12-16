package com.wd.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Program: springclouddemo
 * @Description:
 * @Author: 王栋
 * @Create: 2018/12/13 16:42
 **/
@Data
public class UserBean implements Serializable {

    private static final long serialVersionUID = 5040458298986121180L;

    private String userId;

    private String userName;

    private String loginNum;

    private String loginPwd;
}
