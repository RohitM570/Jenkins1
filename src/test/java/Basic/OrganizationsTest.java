package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationsTest {

	
		@Test
		public void CreateOrganizationsTest()  {
			
			//Launch to application
			WebDriver driver = new ChromeDriver();
			//Login to application
			driver.get("http://localhost:8888/");
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
			
			//To Click on organization
			//driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	}

}
