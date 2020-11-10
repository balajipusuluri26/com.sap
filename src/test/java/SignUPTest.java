import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class SignUPTest {

	@Test
	public void registerTest() {
		WebDriverWait wait;
		WebDriver driver;
		Repostiry rs;

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Tiru balaji
		// pusuluri\\Desktop\\eclipse\\chromedriver.exe");
		WebDriverManager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://cai.tools.sap/");
		rs = new Repostiry(driver);
		rs.signup.click();
		rs.explicitWait("ids_overlay_container");
    int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame("IDS_UI_Window");
		rs.setfirstname("balaji");
		rs.setlastname("pusuluri");
		rs.setEmail("tirumalabalaji26@gmail.com");
		rs.setPwd("sapindiaSAP123!@#123");
		rs.setpwd1("sapindiaSAP123!@#123");
		rs.explicitWait1("pdAccept");
		rs.setcheck();
		rs.explicitWait2("touAccept");
		rs.setCheck2();
		rs.setCreated();

		driver.switchTo().defaultContent();
		driver.close();

	}

}