package com.wd.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Program: springclouddemo
 * @Description:
 * @Author: 王栋
 * @Create: 2018/12/13 19:43
 **/
@Data
public class BeanUtil implements Serializable {
    private static final long serialVersionUID = -1456343996358846959L;

    private String prizes;

    private String records;

}
