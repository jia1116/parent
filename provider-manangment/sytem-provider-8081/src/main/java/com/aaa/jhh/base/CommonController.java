package com.aaa.jhh.base;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/5/12 16:35
 * @Description
 **/
public abstract class CommonController<T> extends BaseController {

    /**
     * @author Seven Lee
     * @description
     *      钩子函数，在新增之前所执行的内容
     * @param [map]
     * @date 2020/5/12
     * @return void
     * @throws
    **/
    protected void beforeAdd(Map map) {
        // TODO 钩子函数，也就是说如果在插入之前你需要执行某些业务的时候，则需要编写内容
    }

    /**
     * @author Seven Lee
     * @description
     *      钩子函数，在新增之后所执行的内容
     * @param [map]
     * @date 2020/5/12
     * @return void
     * @throws
    **/
    protected void afterAdd(Map map) {
        // TODO 钩子函数，也就是说如果在插入之后你需要执行某些业务的时候，则需要编写内容
    }

    public abstract BaseSerivce<T> getBaseService();

    /**
     * @author Seven Lee
     * @description
     *      新增数据
     * @param [map]
     * @date 2020/5/12
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    public ResultData add(@RequestBody Map map) {
        ResultData resultData = new ResultData();
        beforeAdd(map);
        T instance = getBaseService().newInstance(map);
        try {
            Integer insertResult = getBaseService().add(instance);
            if(insertResult > 0) {
                // 说明保存成功
                afterAdd(map);
                return loginSuccess();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loginFailed();
    }

    // TODO delete, batchDelete, update, getOne, getList, getListByPage(不带条件的分页查询)

    /**
     * @author Seven Lee
     * @description
     *      防止数据不安全，所以不能直接在controller某个方法中直接接收HttpServletRequest对象
     *      必须要从本地当前线程中获取对象
     * @param []
     * @date 2020/5/12
     * @return javax.servlet.http.HttpServletRequest
     * @throws
    **/
    public HttpServletRequest getServletRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes;
        if(requestAttributes instanceof ServletRequestAttributes) {
            servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
            return servletRequestAttributes.getRequest();
        }
        return null;
    }

    /**
     * @author Seven Lee
     * @description
     *      获取当前客户端的session对象(如果不存在，则会重新创建一个)
     * @param []
     * @date 2020/5/12
     * @return javax.servlet.http.HttpSession
     * @throws
    **/
    public HttpSession getSession() {
        return getServletRequest().getSession();
    }

    /**
     * @author Seven Lee
     * @description
     *      获取当前客户端的session对象(如果不存在，则直接返回为null)
     * @param []
     * @date 2020/5/12
     * @return javax.servlet.http.HttpSession
     * @throws
    **/
    public HttpSession getExistSession() {
        return getServletRequest().getSession(false);

    }


}
