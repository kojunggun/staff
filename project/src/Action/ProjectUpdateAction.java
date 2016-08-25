package Action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.projectDao;
import dto.projectDto;

public class ProjectUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		projectDto pDto = new projectDto();
		
		
		pDto.setProno(Integer.parseInt(request.getParameter("prono")));
		pDto.setPname(request.getParameter("pname"));	
		pDto.setPcontent(request.getParameter("pcontent"));
		pDto.setProsta(request.getParameter("prosta"));
		pDto.setPselect(request.getParameter("pselect"));
		
		projectDao pDao = projectDao.getInstance();
		pDao.updateProject(pDto);
		
		new ProjectListViewAction().execute(request, response);

	}

}
