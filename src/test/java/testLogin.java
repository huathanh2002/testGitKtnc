import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testLogin {
    WebDriver driver;

    @BeforeClass
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @Test
    public void TestLogin() throws InterruptedException {
        WebElement usename = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));

        usename.sendKeys("student");
        Thread.sleep(2000);
        password.sendKeys("Password123");

        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

        String result = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")).getText();
        System.out.println(result);
        String expected = "Logged In Successfully";
        Assert.assertEquals(result,expected);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
