package com.szpx.config;

import com.szpx.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author lishihui
 * @date 2022/8/4 14:06
 */
@Configuration //代表该类是一个配置类
public class MvcConfig implements WebMvcConfigurer {

    /*
     * TODO 此方法的用途:
     *  添加视图控制器
     *  因为/index 和 /main 是需要跳转到登录页面的，所以需要加载至视图拦截器。
     *  其他请求路径请勿进行相关拦截配置。
     *
     * @return
     * @author
     * @since 2023/4/5 14:30
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //发送/index请求到达index页面
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        //        registry.addViewController("/toAddUser").setViewName("add");
    }


    /*
     * TODO 此方法的用途: 激活拦截器
     *  修改拦截规则：
     *  由/* 改为 /*
     *  /*所有请求都被拦截包括静态资源，同时也会拦截掉.js ，.css等请求
     *  原来过滤规则不变，在excludePathPatterns放行规则中添加："/static/**" ，表示放行static下的所有资源允许被访问
     *
     *
     *
     *  而/login和/index以及/static/属于放行的特殊请求
     * @return
     * @author
     * @since 2023/4/5 14:25
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*")
                .excludePathPatterns("/login", "/index","/static/**");
    }

    /*
     * TODO 此方法的用途:
     *  放行静态资源
     *  允许static文件下的静态资源使用绝对路径进行访问
     *  如：../img/bg.jpg
     * @return
     * @author
     * @since 2023/4/5 14:29
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //注册静态资源的处理器，指定statics文件夹的路径
        registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/");
    }


}
