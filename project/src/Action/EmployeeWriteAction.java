package Action;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.employeeDao;
import dto.employeeDto;

public class EmployeeWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ServletContext context = request.getServletContext();
		String path = context.getRealPath("upload");
		String encType = "UTF-8";
		int sizeLimit = 20 * 1024 * 1024;
		
		MultipartRequest multi = new MultipartRequest(request
													  ,path
													  ,sizeLimit
													  ,encType
													  ,new DefaultFileRenamePolicy());
		
		employeeDto eDto = new employeeDto();
		
		eDto.setEname(multi.getParameter("ename"));
		eDto.setId(multi.getParameter("id"));
		eDto.setPswd(multi.getParameter("Pswd"));
		eDto.setFjumin(multi.getParameter("fjumin"));
		eDto.setBjumin(multi.getParameter("bjumin"));
		eDto.setDeptno(multi.getParameter("deptno"));
		eDto.setJobno(multi.getParameter("jobno"));
		eDto.setHiredate(multi.getParameter("hiredate"));
		eDto.setResigndate(multi.getParameter("resigndate"));
		eDto.setSal(Integer.parseInt(multi.getParameter("sal")));
		eDto.setEpic(multi.getFilesystemName("epic"));
		eDto.setOrn_epic(multi.getOriginalFileName("orn_epic"));
		eDto.setEregdate(multi.getParameter("eregdate"));
		eDto.setEtc(multi.getParameter("etc"));
		eDto.setAdmin(multi.getParameter("admin"));
		
		employeeDao eDao = employeeDao.getInstance();
		eDao.insertEmployee(eDto);
		
		response.sendRedirect("staffServlet?command=employee_list_view");
	}

}
