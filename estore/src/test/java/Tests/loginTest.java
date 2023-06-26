package Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Libraryfiles.Browserfile;
import Libraryfiles.exceldata;
import POMClasses.LoginFunction;

public class loginTest extends Browserfile {
	
	public LoginFunction logIn;
	
	@Test(dataProvider="ex_data")
	public void TestLogin(String UserID, String Userpass) {
		
		test = extent.createTest("test login is created ");
		
		logIn = new LoginFunction(driver);
		log.info("object is created for login test");
		test.info("object is created for login test");
		
		logIn.input_myaccount();
		log.info("my account option is click successfully");
		test.info("my account option is click successfully");
		
		logIn.input_login_option();
		log.info("login option is click successfully");
		test.info("login option is click successfully");
		
		logIn.input_username(UserID);
		log.info("username entered successfully");
		test.info("username entered successfully");
		
		logIn.input_password(Userpass);
		log.info("password entered successfully");
		test.info("password entered successfully");
		
		logIn.input_Login_button();
		log.info("login button click successfully");
		test.info("login button click successfully");
		
	}
	
	
	@DataProvider(name="ex_data")
	public String[][] datafromexcel() throws EncryptedDocumentException, IOException{
		String filepath ="C:\\Users\\SSK\\Desktop\\pet.xlsx"; 
		
		exceldata data = new exceldata(filepath);
		
		int ROW = data.rowcount("Sheet1");
		int COL = data.colcount("Sheet1", 1);
		
		String logindata[][] = new String[ROW][COL];
		
		for(int i=1; i<ROW; i++) {
			
			for(int j=0; j<COL; j++) {
				
				logindata[i][j] = data.getdata("Sheet1", i, j);
				
			}
		}
		
		return logindata;
		
	}
	
	
	
	
	
	
}
