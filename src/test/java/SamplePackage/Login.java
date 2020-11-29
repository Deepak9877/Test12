package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
public void launch() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver dr= new ChromeDriver();
	dr.get("https://www.facebook.com/");
	dr.manage().window().maximize();
//dr.findElement(By.id("email")).sendKeys("deepak.pt.lr@gmail.com");
	dr.findElement(By.name("email")).sendKeys("deepak.pt.lr@gmail.com");
dr.findElement(By.id("pass")).sendKeys("Newuser@123");
dr.findElement(By.id("u_0_b")).click();
	Thread.sleep(5000);
	dr.close();
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Login l = new Login();
		
l.launch();
	}

}
