package actiTime.TestScript.pgrm;

import actiTime.Pages.pgrm.TimeTrackPage;

import actiTime.Pages.pgrm.LoginPage;
import actiTime.generic.pgrm.BaseTest;
import actiTime.generic.pgrm.FWUtils;

public class TestTimeTrackPage extends BaseTest{

	public static void main(String[] args) throws InterruptedException {
		BaseTest.oppApplication("chrome");
		
		String un=FWUtils.Read_XL_Data(XL_Data_path,"ValidLoginPage",1,0);
	    String pw=FWUtils.Read_XL_Data(XL_Data_path,"ValidLoginPage", 1,1);
     	String expLCP = FWUtils.Read_XL_Data(XL_Data_path, "ValidLoginPage", 1, 3);
	   // System.out.println(expLCP);

	    LoginPage lgP=new LoginPage(driver);
		lgP.setUserName(un);
		lgP.setPassword(pw);
		lgP.clickonLoginbtn();
		
		Thread.sleep(3000);
		//FWUtils.verifyLGP(driver, expTitle);
		
		TimeTrackPage lcp=new TimeTrackPage(driver);
		lcp.clickOnSetting();
		lcp.clickOnLicenses();
		Thread.sleep(4000);
		
		FWUtils.verifyLCP(driver, expLCP);
		
		Thread.sleep(4000);
		
		FWUtils.closeApplication();
	}

}
