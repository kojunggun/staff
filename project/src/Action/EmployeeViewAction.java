package Action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.employeeDao;
import dto.employeeDto;

public class EmployeeViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empno = request.getParameter("empno");
		employeeDao eDao = employeeDao.getInstance();
		employeeDto eDto = eDao.selectOneBynotno(empno);
		request.setAttribute("emp", eDto);
		
		RequestDispatcher disp = request.getRequestDispatcher("/project/e_content.jsp");
		disp.forward(request, response);
	}

}
