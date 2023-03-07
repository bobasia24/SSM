package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {

    Emp getUserById(@Param("empId") Integer empId); //处理单字段和属性映射关系
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);//关联查询
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId); //分步查询
}
