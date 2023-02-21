package org.Full_Creative;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trello_Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//wesite launch
		driver.get("https://trello.com/home");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("a[class=\"Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr\"]")).click();
		driver.findElement(By.cssSelector("input[inputmode=\"email\"]")).sendKeys("arunaadgokar@gmail.com");
		driver.findElement(By.cssSelector("input[value=\"Continue\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Saujanya@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Login Complete 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class=\"board-tile mod-add\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Full_Creative3");
		driver.findElement(By.xpath("//button[@data-testid=\"create-board-submit-button\"]")).click();
		// Board Created
		driver.findElement(By.xpath("//input[@class=\"list-name-input\"]")).sendKeys("A");
		driver.findElement(By.cssSelector("input[value=\"Add list\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"list-name-input\"]")).sendKeys("B");
		driver.findElement(By.xpath("//input[@value=\"Add list\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"js-add-a-card\"]")).click();
		driver.findElement(By.xpath("//textarea[@placeholder=\"Enter a title for this card…\"]")).sendKeys("Pending Work");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
//		WebElement source = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[1]/div[1]"));
//		WebElement destination = driver.findElement(By.xpath("//*[@id=\"board\"]/div[2]/div/div[1]/div[1]"));
//		Actions a = new Actions(driver);
//		a.dragAndDrop(source, destination);
		
		driver.findElement(By.cssSelector("span[class=\"DweEFaF5owOe02 rQ86P0iNikD4I9 Cg0RMJhBknTRbM\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("/html/body/div[3]/div/section/div/div/div/ul[3]/li[2]/button/span")).click();
		driver.findElement(By.cssSelector("button[id=\"logout-submit\"]")).click();
	}
}
