package com.hbnu.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈迪凯
 * @date 2021-03-09 16:57
 */
public class AnnotationTest {

    @Test
    public void testAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.printUserService();
    }
}
