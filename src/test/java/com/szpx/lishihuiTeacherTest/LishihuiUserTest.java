package com.szpx.lishihuiTeacherTest;

import com.szpx.entity.User;
import com.szpx.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@SpringBootTest
public class LishihuiUserTest {
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
    public void testByCon(){
        User u = new User();
        u.setId(2);
        List<User> userList = userService.getListByCon(u);
        for (User u1 : userList){
            System.out.println(u1.getName());
        }
    }

}
