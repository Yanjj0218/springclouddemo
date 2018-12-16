/**
 * <pre>项目名称:temp_wd
 * 文件名称:PageResult.java
 * 包名:com.jk.wd.utils
 * 创建日期:2018年9月18日下午12:45:05
 * Copyright (c) 2018, All Rights Reserved.</pre>
 */
package com.wd.utils;

import lombok.Data;

import java.util.List;

/**
 * @Description // 分页工具类
 * @Author 王栋
 * @Date 2018/12/12 18:29
 **/
@Data
public class PageResult {

	private Integer total;

	private List<?> rows;

}
