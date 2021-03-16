package com.hbnu.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 陈迪凯
 * @date 2021-03-09 8:08
 */
public class MyBatisTest {

    @Test
    public void findAll() throws IOException {
        // 1、读取核心配置文件mybatis-config.xml
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、通过配置信息创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);

        // 3、通过sqlSessionFactory构建sqlSession,sql可以发送sql语句去执行，获取返回结果
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4、执行sql语句
        String sqlId = "UserMapper.findAll";
        List<User> userList = sqlSession.selectList(sqlId);

        // 打印结果
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUser() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        String sqlId = "UserMapper.insert";
        int rows = sqlSession.insert(sqlId);

        sqlSession.commit();

        System.out.println("影响的数据：" + rows);

    }

    @Test
    public void updateUser() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        String sqlId = "UserMapper.update";
        int rows = sqlSession.update(sqlId);

        sqlSession.commit();

        System.out.println("影响的数据：" + rows);
    }

    @Test
    public void deleteUser() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        String sqlId = "UserMapper.delete";
        int rows = sqlSession.delete(sqlId);

        sqlSession.commit();

        System.out.println("影响的数据：" + rows);
    }

    @Test
    public void findUser() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        String sqlId = "UserMapper.selectOne";
        User user = sqlSession.selectOne(sqlId);

        System.out.println(user);
    }

    @Test
    public void testInsert() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("马云");
        user.setPassword("maoyun");
        user.setEmail("maoyun@aliyun.com");

        // 执行添加操作
        int row = sqlSession.insert("UserMapper.insert2", user);

        sqlSession.commit();

        System.out.println("影响的数据：" + row);
    }

    @Test
    public void testUpdate() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();

        user.setUsername("马云");
        user.setPassword("123456");

        int rows = sqlSession.update("UserMapper.update2", user);

        sqlSession.commit();

        System.out.println("影响的行数：" + rows);

    }

    @Test
    public void testSelect() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("UserMapper.findByUsername", "马云");

        System.out.println(user);

    }

    @Test
    public void testDelete() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        int rows = sqlSession.delete("UserMapper.deleteByUsername", "马云");

        sqlSession.commit();

        System.out.println("影响的行数：" + rows);

    }

    @Test
    public void testSelect2() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        Map<String, String> map = new HashMap<>();
        map.put("cols", "username, password, email");

        List<User> userList = sqlSession.selectList("UserMapper.select2", map);

        for (User user : userList) {
            System.out.println("用户名:" + user.getUsername() + "；邮箱：" + user.getEmail() + "；密码："
            + user.getPassword());
        }

    }


}
