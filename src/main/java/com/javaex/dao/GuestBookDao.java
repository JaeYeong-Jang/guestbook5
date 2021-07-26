package com.javaex.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		List<GuestBookVo> guestList = sqlSession.selectList("guestbook.guestbookList");
		
		return guestList;
		
	}
	
	//입력
	public void guestBookInsert(GuestBookVo guestBookVo) {
		
		sqlSession.insert("guestbook.guestbookInsert", guestBookVo);
		
	}
	
	//삭제
	public void guestBookDelete(int no, String pw) {
			
		Map<String, Object> guestbookMap = new HashMap<String, Object>();
		guestbookMap.put("no", no);
		guestbookMap.put("pw", pw);
		
		sqlSession.delete("guestbook.guestbookDelete", guestbookMap);
		
	}
	
}
