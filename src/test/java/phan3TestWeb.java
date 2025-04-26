import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class phan3TestWeb {
    WebDriver driver;
    @BeforeClass
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vitimex.com.vn/");
    }

    @Test
    public void testWeb() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"menu_item_36\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"province\"]")).click();
        String kq = driver.findElement(By.xpath("//*[@id=\"myTab-cat\"]/li[1]/p[1]")).getText();
        String kqmm = "Vitimex BigC Thăng Long - Hà Nội";
        Assert.assertEquals(kqmm,kq);
    }

    @Test
    public void testThemGioHang() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"slide-hbc-28\"]/div[1]/div/div[6]/a/h3")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"size1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"addCart_page0\"]/svg")).click();
        String kq = driver.findElement(By.xpath("//*[@id=\"myPage\"]/header/div[2]/div/div[2]/div[2]/div[3]/div[2]/div/a")).getText();
        String kqmm = "Thanh toán";
        Assert.assertEquals(kqmm,kq);
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
