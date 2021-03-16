package com.hbnu.aop;

import com.hbnu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈迪凯
 * @date 2021-03-16 16:45
 */
public class AOPTest {

    @Test
    public void testAop() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aopContext.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.insertUser();
    }
}
