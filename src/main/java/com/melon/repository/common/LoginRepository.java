package com.melon.repository.common;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.melon.dto.common.LoginDto;

@Mapper
public interface LoginRepository {
	// Login
	@Select("select * from member where id = #{id} AND password = #{password}")
	public LoginDto login(LoginDto m);
	
	// Join
	@Insert("INSERT INTO member (ID, PASSWORD, NAME, BIRTHDAY, TEL, EMAIL, NICK) VALUES (#{id}, #{password}, #{name}, #{birthday}, #{tel}, #{email}, #{nick})")
	public void insertUser(LoginDto m);
	
	// Check
	@Select("select count(*) from member where id = #{id}")
	public int check(LoginDto m);
}
