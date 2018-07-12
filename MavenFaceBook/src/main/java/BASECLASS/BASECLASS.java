package BASECLASS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Reporter;

public class BASECLASS {
	
	static WebDriver driver;
	public static void OpenBrowser() throws IOException, InterruptedException{
		
		FileInputStream Fis = new FileInputStream("C:\\Users\\Srini Talasani\\Desktop\\SOUTHAFRICA\\MavenFaceBook\\property.file");
		Properties prop= new Properties();
		prop.load(Fis);
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Srini Talasani\\Downloads\\chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.getCurrentUrl();
	driver.get(prop.getProperty("URL"));
	
	// second commit  jkdjfd kfv fvfkkvj
	///fh dovif[p gfd[vc,; nfgfkdlgnkrfle;
	
	
	driver.findElement(By.name("txtUserName")).sendKeys(prop.getProperty("userid"));
	driver.findElement(By.name("txtPassword")).sendKeys(prop.getProperty("pwd"));
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	System.out.println("login successful");
	//Reporter.log("browser opened and signin completed");
	

	}}
//dhfdfjkdfjdfjd
	
