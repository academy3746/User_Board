package board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;
import board.command.*;

/**
 * Servlet implementation class BoardFrontController
 */
@WebServlet("*.bbs")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		String requestURI = request.getRequestURI();
		
		String contextPath = request.getContextPath();
		
		String cmdURI = requestURI.substring(contextPath.length());
		
		BoardCmd cmd = null;
		String viewPage = null;
		
		// 글 목록 조회 처리
		if(cmdURI.equals("/boardList.bbs")){
			cmd = new BoardListCmd();
			cmd.execute(request, response);
			viewPage = "boardList.jsp";
		}
		
		// 글 작성 화면 제공
		if(cmdURI.equals("/boardWriteForm.bbs")){
			viewPage = "boardWrite.jsp";
		}
		
		// 글 작성 처리
		if(cmdURI.equals("/boardWrite.bbs")){
			cmd = new BoardWriteCmd();
			cmd.execute(request, response);
			viewPage = "boardList.jsp";
		}
		
		// 글 열람 처리
		if(cmdURI.equals("/boardRead.bbs")){
			cmd = new BoardReadCmd();
			cmd.execute(request, response);
			viewPage = "boardRead.jsp";
		}
		
		// 글 수정 비밀번호 확인 화면 제공
		if(cmdURI.equals("/boardUpdatePassword.bbs")){
			cmd = new BoardUpdatePasswordCmd();
			cmd.execute(request, response);
			viewPage = "boardUpdatePassword.jsp";
		}
		
		// 글 수정 비밀번호 확인 처리
		if(cmdURI.equals("/boardUpdateCheck.bbs")){
			cmd = new BoardUpdateCheckCmd();
			cmd.execute(request, response);
			
			BoardUpdateCheckCmd checkCmd = (BoardUpdateCheckCmd) cmd;
			if(checkCmd.password_check){
				viewPage = "boardUpdateForm.bbs";
			}else{
				viewPage = "boardUpdateError.bbs";
			}
			
		}
		
		// 글 수정 비밀번호 오류 화면 제공
		if(cmdURI.equals("/boardUpdateError.bbs")){
			viewPage = "boardUpdateError.jsp";
		}
		
		// 글 수정 화면 제공
		if(cmdURI.equals("/boardUpdateForm.bbs")){
			cmd = new BoardUpdateFormCmd();
			cmd.execute(request, response);
			viewPage = "boardUpdateForm.jsp";
		}
		
		// 글 수정 처리
		if(cmdURI.equals("/boardUpdate.bbs")){
			cmd = new BoardUpdateCmd();
			cmd.execute(request, response);
			viewPage = "boardList.jsp";
		}
		
		RequestDispatcher dis = request.getRequestDispatcher(viewPage);
		dis.forward(request, response);
		
	}

}
