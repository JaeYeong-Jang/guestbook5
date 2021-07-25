package com.javaex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestBookVo;

@Repository
public class GuestBookDao {
	
	@Autowired
	private SqlSession sqlSession;
	//리스트
	public List<GuestBookVo> guestbookList() {
		
		List<GuestBookVo> guestList = sqlSession.selectList("guestbook.guestList");
		
		return guestList;
		
	}
	
	//삭제
	public int guestBookDelete(int no, String pw) {
			
		
		
	}
	
	//입력
	public int guestBookInsert(GuestBookVo guestBookVo) {
		
		
		
	}
	
}
