import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithJDBC {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Added from x new line of code1");
		System.out.println("Added from x new line of code2");
		
		System.out.println("Added from x new line of code3");
		System.out.println("Added from x new line of code4");
		
		
		
		System.out.println("Added from Y new line of code1");
		System.out.println("Added from Y new line of code2");
		
		System.out.println("Added from Y new line of code3");
		System.out.println("Added from Y  new line of code4");
		
		
		System.out.println("Added from B new line of code1");
		System.out.println("Added from B new line of code2");
		
		System.out.println("Added from B new line of code3");
		System.out.println("Added from B  new line of code4");
		
		System.out.println("Added from BBBB new line of code1");
		System.out.println("Added from BBBB new line of code2");
		
		System.out.println("Added from BBBB new line of code3");
		System.out.println("Added from BBBB  new line of code4");
		
		
		String host="localhost";
		int port=3306;
		Connection con  = DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port+ "/qadbt","root","root"); 
        Statement st = con.createStatement();
      ResultSet rs =  st.executeQuery("select * from credentials where scenario='Zeobalance'");
      String userName = null;
      String passWord = null; 
      while(rs.next()) {
    	   
    	    userName = rs.getString("UserName");
    	    passWord = rs.getString("Password");
    	   System.out.println(userName+ "********" +passWord );
       }
      System.setProperty("webdriver.chrome.driver","E:\\Selenium\\SeleniumSoftwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
      driver.get("https://login.salesforce.com/");
     WebElement uName =  driver.findElement(By.id("username"));
     WebElement pass =  driver.findElement(By.id("password"));
     uName.sendKeys(userName);
     pass.sendKeys(passWord);
     

	}

}
