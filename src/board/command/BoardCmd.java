package board.command;

import javax.servlet.http.*;

public interface BoardCmd {
	// This page is not a java class but interface
	// Abstract class
	
	public void execute(HttpServletRequest request, HttpServletResponse response);
	// 해당 자식객체에서 물려받은 execute() 메서드를 완성해서 쓸 것이 강제된다!

}
