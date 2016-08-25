package Action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.projectDao;
import dto.projectDto;

public class ProjectListViewAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		projectDao nDao =projectDao.getInstance();
		List<projectDto> projectList = nDao.selectAllProjects();
		request.setAttribute("projectList", projectList);
		
		RequestDispatcher disp = request.getRequestDispatcher("/project/p_list.jsp");
		disp.forward(request, response);
	}

}
