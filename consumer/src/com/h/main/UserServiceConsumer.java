package com.h.main;

import com.h.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceConsumer {


    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) ctx.getBean("userService");
        System.out.println("执行结果：" + userService.login("hello", "hello"));

    }
}
