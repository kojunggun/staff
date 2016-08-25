package Action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.noticeDao;
import dto.noticeDto;

public class NoticeUpdateFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String notno = request.getParameter("notno");
		noticeDao nDao = noticeDao.getInstance();
		noticeDto nDto = nDao.selectOneBynotno(notno);
		request.setAttribute("notice", nDto);
		
		RequestDispatcher disp = request.getRequestDispatcher("/project/n_update.jsp");
		disp.forward(request, response);
	}

}
