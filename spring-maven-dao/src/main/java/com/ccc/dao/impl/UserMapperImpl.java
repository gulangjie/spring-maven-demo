package com.ccc.dao.impl;

import com.ccc.User;
import com.ccc.dao.sqlMapper.UserMapper;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserMapperImpl{
//    public static void main(String[] args) {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.msql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring_maven_demo?autoReconnect=true&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull&useSSL=false");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        Connection conn = null;
//        try {
//            conn = dataSource.getConnection();
//            System.out.println(conn);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public List<User> getUserList() {
//        List<User> userList = null;
//        try {
//            InputStream resourceStream = Resources.getResourceAsStream("spring-mybatis.xml");
//            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceStream);
//            SqlSession session = sessionFactory.openSession();
//            userList = session.selectList("com.ccc.dao.sqlMapper.UserMapper.getUserList");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return userList;
//    }
}
