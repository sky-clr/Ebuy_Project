package com.txf.mapper;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select count(*) from t_user where userName = #{arg0} and userPwd = #{arg1}")
    int login(String userName, String pwd);
}
