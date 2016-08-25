package Action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.projectDao;
import dto.projectDto;

public class ProjectViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prono = request.getParameter("prono");
		
		projectDao pDao = projectDao.getInstance();
		
		projectDto pDto= pDao.selectOneByprono(prono);
		request.setAttribute("project", pDto);
		
		RequestDispatcher disp = request.getRequestDispatcher("project/p_content.jsp");
		disp.forward(request, response);
	}

}
