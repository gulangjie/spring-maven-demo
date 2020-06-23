package com.ccc.dao.impl;

import com.alibaba.fastjson.JSON;
import com.ccc.User;
import com.ccc.dao.sqlMapper.UserMapper;
import com.ccc.util.DateUtils;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-dao.xml"})
public class UserMapperImplTest {

    @Autowired
    private UserMapper mapper;

    @Test
    public void getUserList() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring_maven_demo?autoReconnect=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = dataSource.getConnection();
//            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/spring_maven_demo?serverTimezone=UTC","root","root");

            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testUserMapper(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        List<User> userList = userMapper.getUserList();
        System.out.println(JSON.toJSONString(userList));
    }

    @Test
    public void getUserListfdsa() {
        List<User> userList = mapper.getUserList();
        System.out.println(JSON.toJSONString(userList));
        System.out.println(userList.get(0).getCreatedTime());
        System.out.println(DateUtils.formateDate(userList.get(0).getCreatedTime()));
    }
}
