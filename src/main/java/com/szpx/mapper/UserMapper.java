package com.szpx.mapper;

import com.szpx.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User> {
    List<User> getListByCon(User user); //多条件分页模糊查

}
