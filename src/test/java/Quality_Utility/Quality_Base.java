package Quality_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Quality_Base {
		
//Constructor should not have any return value //example:- We Don't use " public void " on Constructor.
		  //Constructor should have same name as class name
	
	public static WebDriver driver;
	public static Properties QPro;

	public Quality_Base () {   //constructor is handling config file
		try {
			FileInputStream Q_file = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\Quality_Config\\Quality_Config.Properties");
			QPro = new Properties();
			QPro.load(Q_file);
		} catch (FileNotFoundException e) {
			System.out.println("Please check the Constructor");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
				
	public void Quality_Browser() {   // Browser Setup
		
		String QBrowser = QPro.getProperty("Browser1");
		
		if(QBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Chrome_Driver\\chromedriver_win32 (1)\\chromedriver.exe");		
			ChromeOptions Chromeco = new ChromeOptions();
			Chromeco.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();  		
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Quality_Utility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Quality_Utility.implicitlyWait));
			driver.manage().window().maximize();
			
		}
		
		else if(QBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.Edge.driver", System.getProperty("user.dir")+ "\\Edge_Driver\\msedgedriver.exe");		
			EdgeOptions Edgeco = new EdgeOptions();
			Edgeco.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();  		
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.switchTo().alert().accept();
		}
	}
	
	public static void QualityLaunchingURL(String URL) {   // Putting URL in Browser
		
		Quality_Utility.takeMyScreenshot(driver, "Home Page");
		
		driver.get(QPro.getProperty("QualityURL"));
		
	}
}
