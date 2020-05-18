package com.aaa.jhh.controller;

import com.aaa.jhh.model.User;
import com.aaa.jhh.redis.RedisService;
import com.aaa.jhh.service.LoginService;
import com.aaa.jhh.vo.TokenVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/5/15 16:22
 * @Description
 **/
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private RedisService redisService;

    /**
     * @author Seven Lee
     * @description
     *      执行登录操作
     * @param [user]
     * @date 2020/5/15
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    @PostMapping("/doLogin")
    public TokenVo doLogin(@RequestBody User user) {
        return loginService.doLogin(user, redisService);
    }
}
