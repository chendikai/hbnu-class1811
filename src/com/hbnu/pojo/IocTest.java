package com.hbnu.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 陈迪凯
 * @date 2021-03-02 16:30
 */
public class IocTest {

    @Test
    public void testIoc() {
        // 解析配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        DataType dataType = (DataType) applicationContext.getBean("dataType");

        dataType.printDataType();
    }
}
