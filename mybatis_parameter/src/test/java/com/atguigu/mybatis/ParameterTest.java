package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class ParameterTest {

    @Test
    public void testgetUserByUserName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User allUser = mapper.getUserByUserName("root");
        System.out.println(allUser);
    }

    @Test
    public void testcheckLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User allUser = mapper.checkLogin("root", "123", "女");
        System.out.println(allUser);
    }

    @Test
    public void testcheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "root");
        map.put("password", "123");
        User user = mapper.checkLoginBymap(map);
        System.out.println(user);


    }

    @Test
    public void testinserUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(5, "yazhou", "123123", 30, "男", "123@qq.com");
        mapper.insertUser(user);

    }

    @Test
    public void testcheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User allUser = mapper.checkLoginByParam("root", "123");
        System.out.println(allUser);
    }
}

