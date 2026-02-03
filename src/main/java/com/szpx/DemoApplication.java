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
     * 
     * @author
     * 
     * @since 2023/4/4 23:46
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(DemoApplication.class);
    }

    /*
     *
     * 程序启动主入口--请勿修改
     *
     * 访问地址为：127.0.0.1:8086
     * 
     * # 进入项目根目录（包含 pom.xml 的目录）
     * cd 当前目录，比如：cd /workspace/spring-boot-cloud-studio-demo
     * # 清理并运行项目
     * mvn clean spring-boot:run
     * 在控制台中Ctrl + c停止运行
     * 
     * mvn test
     * # 或指定单个测试类
     * mvn -Dtest=DemoApplicationTests test
     * 
     */

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
