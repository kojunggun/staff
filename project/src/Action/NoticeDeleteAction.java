package Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.noticeDao;

public class NoticeDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String notno = request.getParameter("notno");
		noticeDao nDao = noticeDao.getInstance();
		nDao.deleteNotice(notno);
		System.out.println(notno);
//		response.sendRedirect("staffServlet?command=notice_list_view");
		new NoticeListViewAction().execute(request, response);
	}
}
