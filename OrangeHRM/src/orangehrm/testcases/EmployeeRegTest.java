package orangehrm.testcases;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeRegTest {

	public static void main(String[] args)
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		Employee emp = new Employee(); 
		boolean res = emp.addEmployee("Smith", "j");
		
		if(res)
		{
			System.out.println("New Employee Registered Successfully, Test Pass");
		}else
		{
			System.out.println("New Employee Not Registered Successfully, Test Fail");
		}
		
		lp.logout();
		
		AppUtils.closeApp();
	}

}
