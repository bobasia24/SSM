package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.SpecialSQLMapper;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SpecialSQLTest {

    @Test
    public void testgetUserByUserName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> user = mapper.getUserByLike("y");

        System.out.println(user);

    }

    @Test
    public void testdeleteMore() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMore("6,7");

    }


    @Test
    public void testgetUserByTable() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> t_user = mapper.getUserByTable("t_user");
        System.out.println(t_user);

    }

    @Test
    public void testinsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null, "lili", "123", 31, "女", "12345@qq.com");
        mapper.insertUser(user);
        System.out.println(user);

    }
}
