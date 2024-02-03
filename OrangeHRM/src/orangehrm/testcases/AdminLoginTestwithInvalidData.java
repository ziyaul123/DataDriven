package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithInvalidData 
{

	public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("abc", "xyz");
		boolean res = lp.isErrMsgDisplayed();
		
		if(res)
		{
			System.out.println("Login Displaying expected Error Message for invalid inputs, Test Pass");
		}else
		{
			System.out.println("Login not Displaying expected Error Message for invalid inputs, Test Fail");
		}
		
		AppUtils.closeApp();
	}

}
