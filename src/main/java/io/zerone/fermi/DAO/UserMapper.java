package io.zerone.fermi.DAO;

import io.zerone.fermi.VO.User;

public interface UserMapper {
	public int insertUser(User user);
	public User selectUser(String user_id);
}
