package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {
	WebDriver driver;
	Properties p;
	public Hooks(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	
	public Hooks() {
		//Default Constructor
	}



	public void setup() throws IOException {
		driver = BaseClass.initilizeBrowser();
		p = BaseClass.getProperties();
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	
//	@AfterStep
//    public void addScreenshot(Scenario scenario) {
//        
//        if(scenario.isFailed()) {
//        	
//        	TakesScreenshot ts=(TakesScreenshot) driver;
//        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
//        	scenario.attach(screenshot, "image/png",scenario.getName());
//        	            
//        }
//      
//    }
	
	

}
