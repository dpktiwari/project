package actiTime.TestScript.pgrm;

import actiTime.Pages.pgrm.LoginPage;
import actiTime.generic.pgrm.BaseTest;
import actiTime.generic.pgrm.FWUtils;

public class TestInvalidLoginPage extends BaseTest{

	public static void main(String[] args) throws InterruptedException {
		BaseTest.oppApplication("chrome");
		 int Rc = FWUtils.Count_XL_row(XL_Data_path, "InvalidLoginPage");
		for(int i=1;i<=Rc;i++) {
			 String un=FWUtils.Read_XL_Data(XL_Data_path,"InValidLoginPage",i,0);
			 String pw=FWUtils.Read_XL_Data(XL_Data_path,"InValidLoginPage", i,1);    	
		
	         LoginPage lgP=new LoginPage(driver);
		     lgP.setUserName(un);
	         lgP.setPassword(pw);
		     lgP.clickonLoginbtn();
		     Thread.sleep(2000);
		    }
		
    }
}
