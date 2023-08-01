package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivar\\OneDrive\\Eclipse Workspaces\\830PMBatch\\SeleniumProject\\chromedriver.exe" );
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://register.rediff.com/register/register.php?FormName=user_details");
        //c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Hello");
	    //c.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Hi How are u");
	    c.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(3) > td:nth-child(3) > input[type=text]")).sendKeys("ABCD");
	}

}
