package com.huawei.dao;

import org.apache.ibatis.annotations.Param;

import com.huawei.pojo.User;

public interface UserMapper {
	 int deleteByPrimaryKey(Integer id);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);

	    int checkUsername(String username);

	    int checkEmail(String email);

	    User selectLogin(@Param("username") String username, @Param("password")String password);

	    String selectQuestionByUsername(String username);

	    int checkAnswer(@Param("username")String username,@Param("question")String question,@Param("answer")String answer);

	    int updatePasswordByUsername(@Param("username")String username,@Param("passwordNew")String passwordNew);

	    int checkPassword(@Param(value="password")String password,@Param("userId")Integer userId);

	    int checkEmailByUserId(@Param(value="email")String email,@Param(value="userId")Integer userId);
}