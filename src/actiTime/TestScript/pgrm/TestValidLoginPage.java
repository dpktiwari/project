package actiTime.TestScript.pgrm;

import actiTime.Pages.pgrm.LoginPage;
import actiTime.generic.pgrm.BaseTest;
import actiTime.generic.pgrm.FWUtils;


public class TestValidLoginPage extends BaseTest {

	public static void main(String[] args) throws InterruptedException {
		BaseTest.oppApplication("chrome");
		 
		String un=FWUtils.Read_XL_Data(XL_Data_path,"ValidLoginPage",1,0);
	    String pw=FWUtils.Read_XL_Data(XL_Data_path,"ValidLoginPage", 1,1);
	    String expTitle=FWUtils.Read_XL_Data(XL_Data_path,"ValidLoginPage",1,2);
     	System.out.println(expTitle);
	    LoginPage lgP=new LoginPage(driver);
		lgP.setUserName(un);
		lgP.setPassword(pw);
		lgP.clickonLoginbtn();
		
		Thread.sleep(2000);
		FWUtils.verifyLGP(driver, expTitle);
		
		
		lgP.clickonLogout();
		
		FWUtils.closeApplication();
	
	}

}
