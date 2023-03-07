package com.atguigu.mybatis;

import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.atguigu.mybatis.mapper.SelectMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {


    @Test
    public void testgetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User userById = mapper.getUserById(3);
        System.out.println(userById);
    }
    @Test
    public void testgetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List userById = mapper.getAllUser();
        System.out.println(userById);
    }
    @Test
    public void testgetCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        int count = mapper.getCount();
        System.out.println(count);
    }
    @Test
    public void testgetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String,Object> map = mapper.getUserByIdToMap(5);
        System.out.println(map);
    }

    @Test
    public void testgetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map map = mapper.getAllUserToMap();
        System.out.println(map);
    }
}
