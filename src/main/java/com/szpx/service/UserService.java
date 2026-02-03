package com.szpx.service;

import com.szpx.entity.User;

import java.util.List;


public interface UserService {

    User selectUserById(Integer id);

    List<User> selectAllUser();

    int addUser(User user); //添加
    int delUser(Integer id); //删去
    int updateUser(User user); //修改

    User login(User user); //登录功能

    List<User> getListByCon(User user); //多条件分页模糊查
}
