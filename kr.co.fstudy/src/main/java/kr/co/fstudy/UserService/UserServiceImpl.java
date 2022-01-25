package kr.co.fstudy.UserService;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fstudy.UserDAO.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO dao;
	@Override
	public int register(HttpServletRequest req) {
		return dao.RegisterUser(req);
	}
}
