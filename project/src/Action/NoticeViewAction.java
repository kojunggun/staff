package Action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.noticeDao;
import dto.noticeDto;

public class NoticeViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String notno = request.getParameter("notno");
		noticeDao nDao = noticeDao.getInstance();
		
		nDao.updateReadCount(notno); // 조회수 증가
		noticeDto nDto= nDao.selectOneBynotno(notno);
		request.setAttribute("notice", nDto);
		
		RequestDispatcher disp = request.getRequestDispatcher("project/n_content.jsp");
		disp.forward(request, response);
		
	}

}
