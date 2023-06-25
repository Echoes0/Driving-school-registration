//package com.ll.dsr.filter;
//
//import com.alibaba.fastjson.JSON;
//import com.ll.dsr.common.BaseContext;
//import com.ll.dsr.common.Result;
//import com.ll.dsr.utils.JWTUtils;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.util.AntPathMatcher;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * 检查用户是否完成登录
// */
//@Slf4j
//@WebFilter(filterName = "LoginCheckFilter",urlPatterns = "/*")
//public class LoginCheckFilter implements Filter {
//
//    //路径匹配器，支持通配符
//    public static final AntPathMatcher PATH_MATCHER=new AntPathMatcher();
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request= (HttpServletRequest) servletRequest;
//        HttpServletResponse response= (HttpServletResponse) servletResponse;
//
//        //请求的Url
//        String requestURI = request.getRequestURI();
//
//        log.info("拦截到请求：{}",requestURI);
//
//
//        //不需要处理的请求路径
//        String[] urls=new String[]{
//                "/userSort/*",
//                "/user/sendMsg",
//        };
//
//        //请求是否需要处理
//        boolean check = check(urls, requestURI);
//
//        //无需处理，直接放行
//        if (check) {
//            log.info("本次请求{}无需处理",requestURI);
//            //请求放行
//            filterChain.doFilter(request,response);
//            return;
//        }
//
//        String token = request.getHeader("token");
//        log.info("token:"+token);
//
//        //token不为空
//        if (token!=null){
//            try{
//                JWTUtils.verifyToken(token);//验证令牌
//                log.info("用户已登录！");
//            } catch (Exception e) {
//                e.printStackTrace();
//                return;
//            }
//
//            //将登录用户的id存入当前线程
//            Long emId = JWTUtils.getAppUID(token);
//            BaseContext.setCurrentId(emId);
//
//            filterChain.doFilter(request,response);
//            return;
//        }
//
//        //未登录则返回未登录结果，通过输出流方式向客户端页面返回响应数据
//        response.getWriter().write(JSON.toJSONString(Result.error("NOTLOGIN")));
//        log.info("用户未登录访问！");
//    }
//
//    /**
//     * 路径匹配，检查本次请求是否放行
//     * @param urls
//     * @param requestURL
//     * @return
//     */
//    public boolean check(String[] urls, String requestURL){
//        for (String url:urls){
//            boolean match=PATH_MATCHER.match(url,requestURL);
//            if (match){
//                return true;
//            }
//        }
//        return false;
//    }
//}
