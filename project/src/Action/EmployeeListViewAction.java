package Action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.employeeDao;
import dto.employeeDto;

public class EmployeeListViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		employeeDao eDao = employeeDao.getInstance();
		List<employeeDto> emplist = eDao.selectAllemployees();
		request.setAttribute("emplist", emplist);
		
		RequestDispatcher disp = request.getRequestDispatcher("project/e_list.jsp");
		disp.forward(request, response);
	}

}
