package com.aaa.jhh.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author Jia Hao Hao
 * @Date Create in 2020/5/15 21:50
 * @Description
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class TokenVo implements Serializable {

    /**
     * 就是简单的token值
     */
    private String token;
    /**
     * 标识了方法是否执行成功
     */
    private Boolean ifSuccess;

    /**
     * 保存token的key值
     */
    private String redisKey;

}
