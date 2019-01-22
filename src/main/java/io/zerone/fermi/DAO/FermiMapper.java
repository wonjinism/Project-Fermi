package io.zerone.fermi.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import io.zerone.fermi.VO.FermiQuestion;

public interface FermiMapper {
	public int insertFermi(FermiQuestion fermi);
	public ArrayList<FermiQuestion> selectFermiList(RowBounds rb, String search); // 인터페이스에 파라미터 추가
	public FermiQuestion selectFermi(int fermi_id);
	public int updateFermi(FermiQuestion fermi);
	public int deleteFermi(int fermi_id);
	public int countTotalPost(String search);
}
