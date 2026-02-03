package com.szpx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("com.szpx.mapper")
public class DemoApplication extends SpringBootServletInitializer {

    /*
     * TODO 此方法的用途:
     *
     * 使用外置tomcat部署
     * configure
     *
     * @return org.springframework.boot.builder.SpringApplicationBuilder
     * @author
     * @since 2023/4/4 23:46
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(DemoApplication.class);
    }


    /*
     * TODO 此方法的用途:
     *
     * 程序启动主入口--请勿修改
     *
     * 访问地址为：127.0.0.1:8086
     *
     * @return
     * @author
     * @since 2023/3/22 0:11
     */

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
