package kr.co.fstudy.BoardService;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kr.co.fstudy.BoardVO.BoardVO;

public interface BoardService {

	int Writeboard(HttpServletRequest req);

	ArrayList<BoardVO> getboard(HttpServletRequest req);

	ArrayList<BoardVO> getsubboard(HttpServletRequest req);

}
