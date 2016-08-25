package controller;

import Action.Action;
import Action.EmployeeListViewAction;
import Action.EmployeeViewAction;
import Action.EmployeeWriteAction;
import Action.EmployeeWriteFormAction;
import Action.LoginAction;
import Action.LoginFormAction;
import Action.LogoutAction;
import Action.MainViewAction;
import Action.NoticeDeleteAction;
import Action.NoticeListViewAction;
import Action.NoticeUpdateAction;
import Action.NoticeUpdateFormAction;
import Action.NoticeViewAction;
import Action.NoticeWriteAction;
import Action.NoticeWriteFormAction;
import Action.ProjectListViewAction;
import Action.ProjectUpdateAction;
import Action.ProjectUpdateFormAction;
import Action.ProjectViewAction;
import Action.ProjectWriteAction;
import Action.ProjectWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	private ActionFactory(){
		super();
	}
	public static ActionFactory getInstance(){
		return instance;
	}
	public Action getAction(String command){
		Action action = null;
		System.out.println("ActionFactory :" +command);
		
		if(command.equals("notice_write")){
			action = new NoticeWriteAction();
		}else if(command.equals("notice_write_form")){
			action = new NoticeWriteFormAction();
		}else if(command.equals("notice_list_view")){
			action = new NoticeListViewAction();
		}else if(command.equals("main_view")){
			action = new MainViewAction();
		}else if(command.equals("notice_view")){
			action = new NoticeViewAction();
		}else if(command.equals("notice_update")){
			action = new NoticeUpdateAction();
		}else if(command.equals("notice_update_form")){
			action = new NoticeUpdateFormAction();
		}else if(command.equals("notice_delete")){
			action = new NoticeDeleteAction();
		}else if(command.equals("project_list_view")){
			action = new ProjectListViewAction();
		}else if(command.equals("project_write_form")){
			action = new ProjectWriteFormAction();
		}else if(command.equals("project_write")){
			action = new ProjectWriteAction();
		}else if(command.equals("project_view")){
			action = new ProjectViewAction();
		}else if(command.equals("login_view")){
			action = new LoginFormAction();
		}else if(command.equals("login_action")){
			action = new LoginAction();
		}else if(command.equals("logout_action")){
			action = new LogoutAction();
		}else if(command.equals("employee_list_view")){
			action = new EmployeeListViewAction();
		}else if(command.equals("employee_write_form")){
			action = new EmployeeWriteFormAction();
		}else if(command.equals("employee_write")){
			action = new EmployeeWriteAction();
		}else if(command.equals("employee_view")){
			action = new EmployeeViewAction();
		}else if(command.equals("project_update")){
			action = new ProjectUpdateAction();
		}else if(command.equals("project_update_form")){
			action = new ProjectUpdateFormAction();
		}
		
		return action;
	}
}
