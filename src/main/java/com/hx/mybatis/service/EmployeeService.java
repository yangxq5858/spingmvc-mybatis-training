package com.hx.mybatis.service;

import com.hx.mybatis.bean.Employee;
import com.hx.mybatis.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yxqiang
 * @create 2018-10-09 23:05
 */

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmps(){
        List<Employee> emps = employeeMapper.getEmps();
        return emps;
    }
}
