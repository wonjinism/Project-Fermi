package io.zerone.fermi.DAO;

import java.util.ArrayList;

import io.zerone.fermi.VO.FermiQuestion;

public interface FermiMapper {
	public int insertFermi(FermiQuestion fermi);
	public ArrayList<FermiQuestion> selectFermiList();
	public FermiQuestion selectFermi(int fermi_id);
	public int updateFermi(FermiQuestion fermi);
	public int deleteFermi(int fermi_id);
}
