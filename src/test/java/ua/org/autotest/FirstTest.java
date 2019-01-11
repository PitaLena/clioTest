package ua.org.autotest;

import com.clio.LoginTest;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\olpi\\IdeaProjects\\first-test\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://olenap.cliodev.dk/myclio");
    }

    @Test
    public void userLogin() throws InterruptedException {
        LoginTest loginTest = new LoginTest(driver);
        loginTest.clickOnArrow();
        loginTest.clickOnClioLoginButton();
        loginTest.editLoginField("myclio");
        loginTest.editPasswordField("myclio");
        loginTest.clickOnLoginButton();
        loginTest.clickOnSchoolButton();
        Assert.assertEquals("Clio Universum", loginTest.getPortalName());

    }


}


//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }
//}