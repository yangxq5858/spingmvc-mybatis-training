package com.hx.mybatis.controller;

import com.hx.mybatis.bean.Employee;
import com.hx.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author yxqiang
 * @create 2018-10-09 23:05
 */

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/getEmps")
    public String getEmps(Map<String,Object> map){
        List<Employee> emps = employeeService.getEmps();
        map.put("allEmps",emps);
        return "employeeList";
    }
}
