package com.ccc.dao.impl;

import com.alibaba.fastjson.JSON;
import com.ccc.User;
import com.ccc.dao.sqlMapper.UserMapper;
import org.apache.commons.dbcp.BasicDataSource;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserMapperImplTest {

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
    public void getUserList1() {
        UserMapper userDao = new UserMapperImpl();
        List<User> userList = userDao.getUserList();
        System.out.println(JSON.toJSONString(userList));
    }
}
