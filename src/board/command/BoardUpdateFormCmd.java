package board.command;

import javax.servlet.http.*;

import board.model.*;

public class BoardUpdateFormCmd implements BoardCmd{
	
	public void execute(HttpServletRequest request, HttpServletResponse response){
		
		String inputNum = request.getParameter("num");
		BoardDAO dao = new BoardDAO();
		BoardDTO writing = dao.boardUpdateForm(inputNum);
		
		request.setAttribute("boardUpdateForm", writing);
	}

}
