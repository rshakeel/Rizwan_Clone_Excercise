package Maven_Rizwan_Excercise.CloneExcercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_1 {
			
		public static WebDriver driver;
		
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://rediff.com");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			String actualCurrentURL = driver.getCurrentUrl();
			String expectedCurrentURL = "https://www.rediff.com/";
			if (actualCurrentURL.equals(expectedCurrentURL)) {
				System.out.println("Actual and Expected URL are working fine");
			} else {
				System.out.println("URL is not working fine");
			}
			
			String actualTitle = driver.getTitle();
			String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
			if (actualTitle.equals(expectedTitle)) {
				System.out.println("Actual and Exptected Title are same");
			} else {
				System.out.println("Title is not working fine");
			}
			
			WebElement signinlink = driver.findElement(By.xpath("//a[@class='signin']"));
				System.out.println(signinlink.isDisplayed());
				boolean b1 = signinlink.isEnabled();
				boolean b2 = signinlink.isDisplayed();
					if (b1 == true && b2 == true) {
						driver.findElement(By.xpath("//a[@class='signin']")).click();
					} else
						System.out.println("signinlink is not working");
					
			WebElement username = driver.findElement(By.id("login1"));
				System.out.println(username.isDisplayed());
				boolean b3 = username.isEnabled();
				boolean b4 = username.isDisplayed();
					if (b3 == true && b4 == true) {
						driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
					} else
						System.out.println("username is not working");
		
			WebElement password = driver.findElement(By.id("password"));
				System.out.println(password.isDisplayed());
				boolean b5 = password.isEnabled();
				boolean b6 = password.isDisplayed();
					if (b5 == true && b6 == true) {
						driver.findElement(By.id("password")).sendKeys("Selenium@123");
					} else
						System.out.println("password is not working");
			
			WebElement signinbutton = driver.findElement(By.className("signinbtn"));
				System.out.println(signinbutton.isDisplayed());
				boolean b7 = signinbutton.isEnabled();
				boolean b8 = signinbutton.isDisplayed();
					if (b7 == true && b8 == true) {
						driver.findElement(By.className("signinbtn")).click();
					} else
						System.out.println("signinbutton is not working");
					
			WebElement logoutlink = driver.findElement(By.className("rd_logout"));
				System.out.println(logoutlink.isDisplayed());
				boolean b9 = logoutlink.isEnabled();
				boolean b10 = logoutlink.isDisplayed();
					if (b9 == true && b10 == true) {
						driver.findElement(By.className("rd_logout")).click();
					} else
						System.out.println("logoutlink is not working");

			WebElement rediffhomelink = driver.findElement(By.xpath("//a[@class='logo']/following-sibling::span/child::a[2]/child::b"));
				System.out.println(rediffhomelink.isDisplayed());
				boolean b11 = rediffhomelink.isEnabled();
				boolean b12 = rediffhomelink.isDisplayed();
					if (b11 == true && b12 == true) {
						driver.findElement(By.xpath("//a[@class='logo']/following-sibling::span/child::a[2]/child::b")).click();
					} else
						System.out.println("rediffhomelink is not working");
		}

	}
