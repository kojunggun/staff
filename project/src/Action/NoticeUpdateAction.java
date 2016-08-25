package Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.noticeDao;
import dto.noticeDto;

public class NoticeUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		noticeDto nDto = new noticeDto();
		
		
		nDto.setNotno(Integer.parseInt(request.getParameter("notno")));	
		nDto.setNotname(request.getParameter("notname"));
		nDto.setNotcon(request.getParameter("notcon"));
	
		noticeDao nDao = noticeDao.getInstance();
		nDao.updateNotice(nDto);
		new NoticeListViewAction().execute(request, response);
	}

}
