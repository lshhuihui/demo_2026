package com.szpx.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.sql.DataSource;


/**
 * @author lishihui
 * @date 2022/8/2 15:30
 */
@Configuration  //标识该类是一个配置类【相当于配置文件】
public class DruidConfig {

    //使其它数据源配置有效
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean(destroyMethod = "close", initMethod = "init")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    @Bean  //配置监控器
    public ServletRegistrationBean<Servlet> statViewServlet() {
        ServletRegistrationBean<Servlet> srb = new ServletRegistrationBean<Servlet>(new StatViewServlet(), "/druid/*");
        //添加IP白名单-空表示默认允许所有访问
        srb.addInitParameter("allow", "");
        //添加IP黑名单，当白名单和黑名单重复时，黑名单优先级更高
        srb.addInitParameter("deny", "192.168.11.18");
        //添加控制台 管理员账户信息
        srb.addInitParameter("loginUsername", "admin");
        srb.addInitParameter("loginPassword", "999999");
        //是否能够重置数据
        srb.addInitParameter("resetEnable", "false");
        return srb;
    }


    @Bean //配置服务过滤器
    public FilterRegistrationBean<Filter> statFile() {
        FilterRegistrationBean<Filter> frb = new FilterRegistrationBean<Filter>(new WebStatFilter());
        /**
         * 修改过滤规则：
         *         由/*改为*.lishihui
         */
        frb.addUrlPatterns("*.lishihui"); //添加过滤规则
        //忽略过滤格式
        frb.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.xml,*.css,*.ico,/druid/*");
        return frb;
    }

}
