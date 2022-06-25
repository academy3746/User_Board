package board.command;

import javax.servlet.http.*;
import board.model.*;
import java.util.ArrayList;

public class BoardSearchCmd implements BoardCmd{
	
	public void execute(HttpServletRequest request, HttpServletResponse response){
		BoardDAO dao = new BoardDAO();
		String searchOption = request.getParameter("searchOption");
		String searchWord = request.getParameter("searchWord");
		
		ArrayList<BoardDTO> list = dao.boardSearch(searchOption, searchWord);
		request.setAttribute("boardList", list);
	}

}
