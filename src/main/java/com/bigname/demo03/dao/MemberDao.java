package com.bigname.demo03.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bigname.demo03.core.Member;

import java.util.List;

// 其实这个就是mapper
public interface MemberDao {
	Member selectMemberByName(@Param("name")String name)throws Exception;
	List<Member> queryAll()throws Exception;

}
