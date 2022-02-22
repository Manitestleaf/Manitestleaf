package assignment.week2fully;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Salesforce {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
			driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("manikandan");
			driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("m");
			driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("manikandanaero@gmail.com");
			driver.findElement(By.name("CompanyName")).sendKeys("google");
			driver.findElement(By.name("UserPhone")).sendKeys("9176904095");
			
			WebElement element1 = driver.findElement(By.xpath("//option[text()='Marketing / PR Manager']/.."));
			Select se1= new Select(element1);
			se1.selectByVisibleText("Operations Manager");
			
			   WebElement element2 = driver.findElement(By.name("CompanyEmployees"));
			   Select se2 = new Select(element2);
			   se2.selectByValue("501 - 1500 employees");
			   
			    WebElement element3 = driver.findElement(By.name("CompanyCountry"));
			    Select se3 = new Select(element3);
			    se3.selectByValue("India");
			    Thread.sleep(2000);

	}
	}


