package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {

    List<User> getUserByLike(@Param("mohu") String mohu);

    void deleteMore(@Param("ids") String ids);

    List<User>  getUserByTable(@Param("tablename") String tablename);

    void insertUser(User user);
}
