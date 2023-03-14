package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;

import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId); //分步查询

    Dept getDeptAndEmp(@Param("deptId") Integer deptId);//查询部门以及部门中的员工信息

    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
