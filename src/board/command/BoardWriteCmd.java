package board.command;

import javax.servlet.http.*;
import board.model.*;

public class BoardWriteCmd implements BoardCmd{
	
	public void execute(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		String password = request.getParameter("password");
		
		BoardDAO dao = new BoardDAO();
		dao.boardWrite(name, subject, content, password);
	}

}
