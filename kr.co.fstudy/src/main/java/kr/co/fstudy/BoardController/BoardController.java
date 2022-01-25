package kr.co.fstudy.BoardController;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.fstudy.BoardService.BoardService;
import kr.co.fstudy.BoardVO.BoardVO;
@Controller
public class BoardController {
	@Autowired
	BoardService bse;
	//글작성 get
	@RequestMapping(value = "/write.do", method = RequestMethod.GET)
	public String WriteBoard() {
		
		return "write";
	}
	//글작성 post
	@RequestMapping(value="/write.do",method =RequestMethod.POST)
	public String WriteBoard(HttpServletRequest req) {
		bse.Writeboard(req);
		return "index"; 
	}
	//글 목록 ajax
	@RequestMapping(value="/getboard.do",method =RequestMethod.POST)
	@ResponseBody
	public ArrayList<BoardVO> getBoard(HttpServletRequest req) {
		ArrayList<BoardVO> Board = bse.getboard(req);
		return Board; 
	}
	@RequestMapping(value="/getsubboard.do",method =RequestMethod.POST)
	@ResponseBody
	public ArrayList<BoardVO> getsubBoard(HttpServletRequest req) {
		ArrayList<BoardVO> Board = bse.getsubboard(req);
		return Board; 
	}
	
}
