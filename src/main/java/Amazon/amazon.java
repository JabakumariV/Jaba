package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class amazon {
	EdgeDriver ob;
	@Test
	public void amz() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		 ob=new EdgeDriver();
		ob.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=774088017322&hvpos=&hvnetw=g&hvrand=3902963568824029176&hvqmt=e&hvdev=c&hvdvcm");
		//ob.get("https://www.amazon.com/");
		ob.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e = ob.findElementByXPath("/html/body/div[1]/header/div/div[1]/div[3]/div/div[2]/a");
		//e.click();
		Actions a=new Actions(ob);
		a.moveToElement(e).build().perform();
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(ob,4);
		//WebElement e2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Your Orders")));
		//e2.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']"))).sendKeys("8870800945");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']"))).click();
		
		Thread.sleep(6000);
		ob.findElementByXPath("//input[@name='password']").sendKeys("Jaba@8870");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("Jaba@8870");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signInSubmit']"))).click();
		System.out.println("Hi Hello");
			
	}
	
	@Test
	public void amzz()
	{
		
	}

}
