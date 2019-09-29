package gitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstGitTest {

	public void logintest() throws IOException {
		
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/?toWww=1&redig=2F1237C58A2E4402A484A621CF60C76A");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.submit();
		
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\workspace\\GitTest\\Screenshot\\screenshot.jpg"));
	}
}
