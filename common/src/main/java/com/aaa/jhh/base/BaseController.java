package com.aaa.jhh.base;

import static com.aaa.jhh.status.LoginStatus.*;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/5/12 16:49
 * @Description
 *      通用controller，就是实现consumer和provider统一返回值
 **/
public class BaseController {

    /**
     * @author Seven Lee
     * @description
     *      登录成功，使用系统消息
     * @param []
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginSuccess() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * @author Seven Lee
     * @description
     *      登录成功，使用自定义消息
     * @param [msg]
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginSuccess(String msg) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author Seven Lee
     * @description
     *      登录成功，使用系统消息，自定义返回值
     * @param [data]
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginSuccess(Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     * @author Seven Lee
     * @description
     *      登录成功，自定义消息，自定义返回值
     * @param [msg, data]
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginSuccess(String msg, Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }

    /**
     * @author Seven Lee
     * @description
     *      登录失败，使用系统消息
     * @param []
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    protected ResultData loginFailed() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        return resultData;
    }

    // TODO 我就不再写了

}
