package com.mafh.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mafh
 * @create 2017-07-31 14:58
 * Created With Intellij IDEA
 */
public class LoginInterceptor implements HandlerInterceptor {
    //返回值：表示我们是否需要将当前的请求拦截下来
    //如果返回false，请求会被终止
    //如果返回true，请求继续
    //Object o 表示的是被拦截的请求的目标对象
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("执行preHandle方法");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("执行postHandle方法");
        //通过modelAndView参数来改变显示的视图，或修改发往视图的方法
        modelAndView.addObject("msg","这里是interceptor");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("执行afterCompletion方法");
    }
}
