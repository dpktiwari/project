package actiTime.TestScript.pgrm;

import actiTime.Pages.pgrm.LicensessPage;
import actiTime.Pages.pgrm.LoginPage;
import actiTime.Pages.pgrm.TimeTrackPage;
import actiTime.generic.pgrm.BaseTest;
import actiTime.generic.pgrm.FWUtils;

public class TestLicensesPage extends BaseTest {

	public static void main(String[] args) throws InterruptedException {
	BaseTest.oppApplication("chrome");
		
		String un=FWUtils.Read_XL_Data(XL_Data_path,"VerifyPage",1,0);
	    String pw=FWUtils.Read_XL_Data(XL_Data_path,"VerifyPage", 1,1);
	    String F_issueDate=FWUtils.Read_XL_Data(XL_Data_path,"VerifyPage",1,2);
	    String F_productEdition=FWUtils.Read_XL_Data(XL_Data_path,"VerifyPage", 1,3);
     	System.out.println(F_issueDate);
	    
	    LoginPage lgP=new LoginPage(driver);
		lgP.setUserName(un);
		lgP.setPassword(pw);
		lgP.clickonLoginbtn();
			
		
		TimeTrackPage Tcp=new TimeTrackPage(driver);
		Tcp.clickOnSetting();
		Tcp.clickOnLicenses();
		//Thread.sleep(3000);
		

		LicensessPage lcP=new LicensessPage(driver);
		Thread.sleep(3000);
		lcP.VerifyID(driver, F_issueDate);
		lcP.VerifyPE(driver, F_productEdition);
		lgP.clickonLogout();
	
		FWUtils.closeApplication();
	}

}
