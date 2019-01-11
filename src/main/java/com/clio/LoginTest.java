package com.clio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {
    public WebDriver driver;

    public LoginTest(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnArrow() {
        driver.findElement(By.cssSelector(".icon-font-accordion-arrow")).click();
    }

    public void clickOnClioLoginButton() {
        driver.findElement(By.cssSelector("a[data-login-provider=\"cliologin\"]")).click();
    }

    public void editLoginField(String text) {
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys(text);
    }

    public void editPasswordField(String text) {
        driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys(text);
    }

    public void clickOnLoginButton() {
        driver.findElement(By.cssSelector(".float-right")).click();
    }

    public void clickOnSchoolButton() {
        driver.findElement(By.cssSelector("a[data-instnr=\"myclio_account2\"]")).click();
    }

    public String getPortalName() {
        String portalName = driver.findElement(By.cssSelector(".my-clio-main-heading-title")).getText();
        return portalName;
    }
}
