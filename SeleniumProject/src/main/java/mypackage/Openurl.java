package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\sivar\\OneDrive\\Eclipse Workspaces\\830PMBatch\\SeleniumProject\\chromedriver.exe" );
//System.setProperty("webdriver.gecko.driver","Location");
//System.setProperty("webdriver.edge.driver", "Location");
ChromeDriver c = new ChromeDriver();
c.manage().window().maximize();
c.get("https://mail.rediff.com/cgi-bin/login.cgi");
String  title = c.getTitle();
System.out.println(title);
//sendkeys  --> send values into webpage/write values into webpage
//click  --> click the element in the webpage
//gettext --> get the text from webpage
//gettitle --> get the title from webpage
//c.findElement(By.name("login")).sendKeys("abcd@rediffmail.com");
//c.findElement(By.id("login1")).sendKeys("12345@rediffmai");
c.findElement(By.name("login")).sendKeys("acvcvvbbbv");
c.quit();
	}

}
