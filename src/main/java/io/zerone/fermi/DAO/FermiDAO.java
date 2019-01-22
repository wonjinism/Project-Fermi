package io.zerone.fermi.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.fermi.VO.FermiQuestion;
import io.zerone.fermi.util.PageNavigator;

@Repository
public class FermiDAO {
	@Autowired
	SqlSession session;

	public int insertFermi(FermiQuestion fermi) {
		FermiMapper mapper = session.getMapper(FermiMapper.class);
		int result = 0;
		try {
			result = mapper.insertFermi(fermi);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	
	/*
	 * 전체 게시글을 가져오는 메소드
	 */
	public ArrayList<FermiQuestion> selectFermiList(PageNavigator pn, int postPerPage, String search) {
		// 전체 값 중에 어디서부터 어디까지 가져오겠다는 것을 지정할 수 있는 객체
		RowBounds rb = new RowBounds(pn.getStartPostInCurrentPage(), postPerPage);
		
		FermiMapper mapper = session.getMapper(FermiMapper.class);
		ArrayList<FermiQuestion> fermiList = null;
		try {
			fermiList = mapper.selectFermiList(rb, search); // Mapper.xml은 걸드릴 필요 없음
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fermiList;
	}

	public FermiQuestion selectFermi(int fermi_id) {
		FermiMapper mapper = session.getMapper(FermiMapper.class);
		FermiQuestion fermi = null;
		try {
			fermi = mapper.selectFermi(fermi_id);
		} catch (Exception e) {
			e.printStackTrace();
			return fermi;
		}
		return fermi;
	}
	
	public int updateFermi(FermiQuestion fermi) {
		FermiMapper mapper = session.getMapper(FermiMapper.class);
		int result = 0;

		return result;
	}

	public int deleteFermi(FermiQuestion fermi) {
		FermiMapper mapper = session.getMapper(FermiMapper.class);
		int result = 0;

		return result;
	}
	
	public int countTotalPost(String search) {
		System.out.println("mapper의" + search);
		FermiMapper mapper = session.getMapper(FermiMapper.class);
		int result = 0;
		try {
			result = mapper.countTotalPost(search);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}
}
