package com.aaa.jhh.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: Jia Hao Hao
 * @Date: 2020-05-12 10:09
 * @Description
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BaseModel implements Serializable {

    @Id
    @NotNull
    private Long id;

    @Column(name = "create_time")
    @Max(value = 100, message = "时间长度最长不能超过100")
    private String createTime;

    @Column(name = "modify_time")
    @Max(value = 100, message = "时间长度最长不能超过100")
    private String modifyTime;
}
