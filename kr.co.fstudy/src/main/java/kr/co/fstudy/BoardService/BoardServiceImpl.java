package kr.co.fstudy.BoardService;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.fstudy.BoardDAO.BoardDAO;
import kr.co.fstudy.BoardVO.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	
	@Autowired
	BoardDAO dao;
	
	@Override
	public int Writeboard(HttpServletRequest req) {
		return dao.writeboard(req);
	}
	@Override
	public ArrayList<BoardVO> getboard(HttpServletRequest req) {
		return dao.getboard(req);
	}
	@Override
	public ArrayList<BoardVO> getsubboard(HttpServletRequest req) {
		return dao.getsubboard(req);
	}
}
