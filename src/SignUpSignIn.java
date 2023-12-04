import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SignUpSignIn extends Parameters{
	
	SoftAssert Assertion = new SoftAssert();
	
	
	@BeforeTest
	public void Setup() {
		driver.get(WebsiteUrl);

	}
	
	@Test(priority = 1)
	public void SignUp() throws InterruptedException {
		driver.get(signUpPage);
		WebElement FirstName = driver.findElement(By.id("firstname"));
		WebElement LastName = driver.findElement(By.id("lastname"));
		WebElement Email = driver.findElement(By.id("email_address"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement confirmPassword = driver.findElement(By.id("password-confirmation"));
		WebElement Button = driver.findElement(By.className("primary"));

		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Email.sendKeys(email);
		Password.sendKeys(password);
		confirmPassword.sendKeys(password);
		Button.click();
		Thread.sleep(2000);
		String ActualMsg = driver.findElement(By.className("message-success")).getText();
		Assertion.assertEquals(ActualMsg.contains("registering"),true);
		Assertion.assertAll();
		
	}
	
	@Test(priority = 2)
	public void LogoutTest() throws InterruptedException {

		driver.get(logOutPage);
		Thread.sleep(7000);
		
		Assertion.assertEquals(driver.getCurrentUrl(),WebsiteUrl,"validaiton the url after logout");
		Assertion.assertAll();
	}
	
	@Test(priority = 3)
	public void LoginTest()throws InterruptedException  {

		driver.get(loginPage);
		WebElement emailInput = driver.findElement(By.id("email"));
		WebElement passInput = driver.findElement(By.id("pass"));
		WebElement loginbut = driver.findElement(By.id("send2"));

		emailInput.sendKeys(email);
		passInput.sendKeys(password);
		loginbut.click();
		Thread.sleep(2000);
		String ActualMsg = driver.findElement(By.cssSelector("div[class='panel header'] span[class='logged-in']")).getText();
		Assertion.assertEquals(ActualMsg,WlcomeMsg);
		Assertion.assertAll();
		
	
	}

	@AfterTest
	public void AfterTest() {
		
		driver.manage().window().maximize();

	}

}
