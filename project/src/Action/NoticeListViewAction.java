package Action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.noticeDao;
import dto.noticeDto;

public class NoticeListViewAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		noticeDao nDao =noticeDao.getInstance();
		List<noticeDto> noticeList = nDao.selectAllNotices();
		request.setAttribute("noticeList", noticeList);
		
		RequestDispatcher disp = request.getRequestDispatcher("/project/notice.jsp");
		disp.forward(request, response);
	}

}
