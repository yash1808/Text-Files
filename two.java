
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class two {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YASH KERKAR\\Desktop\\20125\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("w3schools", Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
		driver.findElement(By.id("search2")).sendKeys("javascript", Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/a[16]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[3]/a")).click();
	}
}