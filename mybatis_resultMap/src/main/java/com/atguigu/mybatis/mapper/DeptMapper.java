package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;

import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId); //分步查询

}
