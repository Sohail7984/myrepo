package pack001;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void test001() throws Exception {
	  ChromeOptions options = new ChromeOptions();
	  WebDriver driver = new RemoteWebDriver (new URL("http://localhost:4444/wd/hub"),options);
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://www.youtube.com/");
	  Thread.sleep(2000);
	  driver.quit();
  }
}
