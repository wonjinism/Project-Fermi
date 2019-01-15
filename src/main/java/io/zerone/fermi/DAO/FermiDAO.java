package io.zerone.fermi.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.zerone.fermi.VO.FermiQuestion;

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

	public ArrayList<FermiQuestion> selectFermiList() {
		FermiMapper mapper = session.getMapper(FermiMapper.class);
		ArrayList<FermiQuestion> fermiList = null;
		try {
			fermiList = mapper.selectFermiList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fermiList;
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
}
