package com.hooks;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.reusableMethosd.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class HookMethods extends BaseClass {
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("scenario name is "+name);
		
	}
	
	public void afterHooks(Scenario s) {
		if(s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(screenshotAs, "image/png", "isfailed");
		}
		
		else {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(screenshotAs, "image/png", "ispassed");
		}
		
		
	}

}
