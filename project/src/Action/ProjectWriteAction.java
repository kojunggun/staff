package Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.projectDao;
import dto.projectDto;

public class ProjectWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		projectDto pDto = new projectDto();
		
		pDto.setPname(request.getParameter("pname"));
		pDto.setProsta(request.getParameter("prosta"));
		pDto.setPenddate(request.getParameter("penddate"));
		pDto.setPcontent(request.getParameter("pcontent"));
		pDto.setPselect(request.getParameter("pselect"));
		
		projectDao pDao = projectDao.getInstance();
		pDao.insertProject(pDto);
		
		new ProjectListViewAction().execute(request, response);
		/*response.sendRedirect("staffServlet?command=project_list");*/
	}

}
