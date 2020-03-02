package com.xiangxue.xiepan.test;

import com.xiangxue.xiepan.bean.Student;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void Test001(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.xiangxue.xiepan");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getUsername());
    }
}

