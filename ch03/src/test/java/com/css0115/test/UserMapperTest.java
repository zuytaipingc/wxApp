package com.css0115.test;

import com.alibaba.fastjson.JSON;
import com.css0115.dao.UserMapper;
import com.css0115.pojo.User;
import com.css0115.util.MyBatisUtil;
import org.apache.ibatis.ognl.JavaSource;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UserMapperTest {
    @Test
    public void testGetUserList(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            String userName = "张";
            String userName = null;
//            Integer roleId = 3;
            Integer roleId = null;
            List<User> userList =  userMapper.getUserList(userName,roleId);
            System.out.println(JSON.toJSONString(userList));
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
            }
    }

    @Test
    public void testGetUserList2(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            String userName = "张";
//            String userName = null;
            Integer roleId = 3;
//            Integer roleId = null;
            List<User> userList =  userMapper.getUserList2(userName,roleId);
            System.out.println(JSON.toJSONString(userList));
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
    }
    @Test
    public void testGetUserList3(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            String userName = "张";
//            String userName = null;
            Integer roleId = 3;
//            Integer roleId = null;
            List<User> userList =  userMapper.getUserList3(userName,roleId);
            System.out.println(JSON.toJSONString(userList));
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
    }
    @Test
    public void testGetUserList4(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            String userName = "张";
//            String userName = null;
            Integer roleId = 3;
//            Integer roleId = null;
            List<User> userList =  userMapper.getUserList4(userName,roleId);
            System.out.println(JSON.toJSONString(userList));
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
    }
        @Test
    public  void testgetUserList5(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList5("张",3);
            System.out.println(JSON.toJSONString(userList));
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        }

        @Test
    public void testgetUserListChoose(){
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            String userName = "";
            Integer roleId = null;
            String userCode = "";
            Date creationDate = new SimpleDateFormat("yyyy-MM-dd").parse("2019-10-01");
            List<User> userList = userMapper.getUserListChoose(userName,roleId,userCode,creationDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        }




}
