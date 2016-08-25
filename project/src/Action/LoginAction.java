package Action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.employeeDao;
import dto.employeeDto;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/project/loginForm.jsp";
		String id = request.getParameter("id");
		String pswd = request.getParameter("pswd");
		employeeDao eDao = employeeDao.getInstance();
		int result = eDao.userCheck(id, pswd);
		if(result == 1){
			employeeDto eDto = eDao.getEmployee(id);
			HttpSession session=request.getSession();
			session.setAttribute("userid", id);
			session.setAttribute("emp", eDto);
			url="staffServlet?command=main_view";
		}else if(result == 0){
			url="/project/loginForm.jsp";
		}else if(result == -1){
			url="/project/loginForm.jsp";
		}
		
			RequestDispatcher disp = request.getRequestDispatcher(url);
			disp.forward(request, response);
	}

}
