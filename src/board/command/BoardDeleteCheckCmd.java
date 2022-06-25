package board.command;

import javax.servlet.http.*;

import board.model.*;

public class BoardDeleteCheckCmd implements BoardCmd{
	
	public boolean password_check;
	public boolean reply_check;
	
	public void execute(HttpServletRequest request, HttpServletResponse response){
		
		String inputNum = request.getParameter("num");
		String inputPassword = request.getParameter("password");
		
		request.setAttribute("num", inputNum);
		
		BoardDAO dao = new BoardDAO();
		
		password_check = dao.boardPasswordCheck(inputNum, inputPassword);
		reply_check = dao.boardReplyCheck(inputNum);
		
		System.out.println("password_check: " + password_check);
		System.out.println("reply_check: " + reply_check);
		
	}

}
