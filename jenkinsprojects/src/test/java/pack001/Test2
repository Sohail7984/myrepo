package pack001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJenkins {
  @Test
  public void test001() throws Exception {
	  ChromeOptions options = new chromeOptions();
    WebDriver driver = new RemoteDriver(new URL("http://localhost:4444/wd/hub"),options);
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://www.youtube.com/");
	  Thread.sleep(2000);
	  driver.quit();
  }
}
