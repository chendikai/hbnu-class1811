package com.hbnu.transaction;

import com.hbnu.transaction.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈迪凯
 * @date 2021-03-30 14:53
 */
public class TransactionTest {

    @Test
    public void testTransaction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("transactionContext.xml");

        UserService userService = (UserService) context.getBean("userService");

        userService.account();
    }
}
