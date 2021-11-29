package com.mycompany.ldit.attendance.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.ldit.attendance.model.vo.WorkBreak;

@Repository("attDao")
public class AttendanceDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int countAttStart(int stfNo){
		int r = -1;
		System.out.println("Dao에서 stfNo: "+stfNo);
		r = sqlSession.selectOne("aboutAtt.countAttStart", stfNo);
		return r;
	}

	public int insertCheckin(int stfNo) {
		return sqlSession.insert("aboutAtt.insertCheckin", stfNo);
	}
	
	public String getAttStart(int stfNo) {
		return sqlSession.selectOne("aboutAtt.getAttStart", stfNo);
	}
	
	public int updateCheckout(int stfNo) {
		return sqlSession.update("aboutAtt.updateCheckout", stfNo);
	}
	
	public String getAttEnd(int stfNo) {
		return sqlSession.selectOne("aboutAtt.getAttEnd", stfNo);
	}
	
	public int insertRestin(int stfNo) {
		return sqlSession.insert("aboutAtt.insertRestin", stfNo);
	}
	
	public WorkBreak getRestStart(int stfNo) {
		return sqlSession.selectOne("aboutAtt.getRestStart", stfNo);
	}
	
	public int updateBrEnd(int brNo) {
		return sqlSession.update("aboutAtt.updateBrEnd", brNo);
	}
	
	public String getBrEnd(int brNo) {
		return sqlSession.selectOne("aboutAtt.getBrEnd", brNo);
	}
	
	public String getLatestBrStart(int stfNo) {
		return sqlSession.selectOne("aboutAtt.getLatestBrStart", stfNo);
	}

	public String getLatestBrEnd(int stfNo) {
		return sqlSession.selectOne("aboutAtt.getLatestBrEnd", stfNo);
	}
}
