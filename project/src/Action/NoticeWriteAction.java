package Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.noticeDao;
import dto.noticeDto;

public class NoticeWriteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		noticeDto nDto = new noticeDto();
		
		nDto.setNotname(request.getParameter("notname"));
		nDto.setNotcon(request.getParameter("notcon"));
		
		noticeDao nDao = noticeDao.getInstance();
		nDao.insertNotice(nDto);
		
		response.sendRedirect("staffServlet?command=notice_list_view");
//		RequestDispatcher disp = request.getRequestDispatcher("staffServlet?command=notice_list_view");
//		disp.forward(request, response);
	}

}
