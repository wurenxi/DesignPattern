package com.atguigu.principle.demeter.improve;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxl
 * @description
 * @createDate 2022/9/25 14:06
 */
public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("使用迪米特法则改进。。。");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

/**
 * 学校总部员工
 */
@Data
class Employee {
    private String id;
}

/**
 * 学院的员工
 */
@Data
class CollegeEmployee {
    private String id;
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager {
    /**
     * 返回学院的所有员工
     * @return
     */
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }

        return list;
    }

    // 输出学院员工的信息
    public void printEmployee() {
        List<CollegeEmployee> list1 = /*this.*/getAllEmployee();
        System.out.println("----------------分公司员工-----------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

// 分析 SchoolManager类的直接朋友类有哪些 Employee、CollegeManager
// CollegeEmployee不是直接朋友，而是一个陌生类，这样违背了迪米特法则
class SchoolManager {
    /**
     * 返回学校总部员工
     * @return
     */
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }

        return list;
    }

    void printAllEmployee(CollegeManager sub) {
        // 分析问题
        // 1.将输出学院的员工的方法封装到CollegeManager
        sub.printEmployee();

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----------------学校总部员工-------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
