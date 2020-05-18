package com.aaa.jhh.base;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: Jia Hao Hao
 * @Date: 2020-05-12 22:01
 * @Description:
 **/
@Data
@Accessors(chain = true)
public class ResultData<T> implements Serializable {
    private String code;
    private String msg;
    private String detail;
    private T data;
}
