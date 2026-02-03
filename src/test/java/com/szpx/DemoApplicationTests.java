package com.szpx;

import com.szpx.entity.User;
import com.szpx.mapper.UserMapper;
import com.szpx.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@SpringBootTest
public class DemoApplicationTests {
    /**
     * 热部署等相关配置参照explain.xml中的说明
     */
    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;
    @Test
    public void  testDataSource() throws Exception{
        System.out.println("数据源:"+dataSource.getClass());
        Connection con = dataSource.getConnection();
        System.out.println("连接对象:"+con);
    }

    @Test
    public void selectById(){
        User user = userService.selectUserById(3);
        if(user != null){
            System.out.println(user.getName());
        }else{
            System.out.println("error!");
        }
    }

    /**
     * 团购网站
     */

    @Test
    public void selectAllUser(){
        List<User> users = userService.selectAllUser();
        if(users != null){
            for (User u:users){
                System.out.println(u.getName());
            }
        }
    }

}
