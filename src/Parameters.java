import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	
	static WebDriver driver = new ChromeDriver();
	
	static Random rand = new Random ();
	int RandomEmail=rand.nextInt(999);
	
	static int randomNumber = (int) (Math.random() * 999) + 1;
	
	static String WebsiteUrl = "https://magento.softwaretestingboard.com/";
	static String signUpPage = "https://magento.softwaretestingboard.com/customer/account/create/";
	static String logOutPage = "https://magento.softwaretestingboard.com/customer/account/logout/";
	static String loginPage = "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/";
	static String checkTheUrl ="https://magento.softwaretestingboard.com/customer/account/";


    static String[] firstNames = {"mohammad", "ali", "waleed", "ziad"};
	static String[] lastNames = {"ALassaf","abazeed", "waleed", "alnajar"};
	
	static int Index = rand.nextInt(4);
	
    static String firstName=firstNames[Index];
	
	static String lastName=lastNames[Index];
	

	static String email = firstName+lastName+randomNumber+"@gmail.com";
	
	static String password = firstName+lastName+randomNumber+"@";
	 
	
	static String WlcomeMsg="Welcome, "+firstName+" "+lastName+"!";
	

	
	
}
