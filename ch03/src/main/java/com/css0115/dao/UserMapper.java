package com.css0115.dao;

import com.css0115.pojo.User;
//import com.css0115.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    public List<User> getUserList(@Param("userName")String userName,
                                  @Param("userRole") Integer roleId);

    public List<User> getUserList2(@Param("userName")String userName,
                           @Param("userRole") Integer roleId);

    public List<User> getUserList3(@Param("userName")String userName,
                                   @Param("userRole") Integer roleId);
    public List<User> getUserList4(@Param("userName")String userName,
                                   @Param("userRole") Integer roleId);
    List<User> getUserList5(@Param("userName")String userName,
                            @Param("userRole") Integer roleId);
    public List<User> getUserListChoose(@Param("userName")String userName,
                                        @Param("userRole")Integer roleId,
                                        @Param("userCode")String userCode,
                                        @Param("creationDate") Date creationDate);

}


