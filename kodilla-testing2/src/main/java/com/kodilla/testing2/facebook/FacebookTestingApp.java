package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {
    public final static String BUTTON_COOKIES = "u_0_h";
    public static final String XPATH_REGISTRY = "//a[@role = \"button\"]";
    public static final String INPUT_NAME = "firstname";
    public static final String INPUT_SURNAME = "lastname";
    public static final String INPUT_EMAIL = "reg_email__";
    public static final String INPUT_EMAIL_CONFIRM = "reg_email_confirmation__";
    public static final String INPUT_PASSWORD = "reg_passwd__";
    public static final String XPATH_SELECT = "//div[@class = \"_5k_5\"]/span/span";
    public static final String XPATH_SELECT_DAY = "//div[@class = \"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class = \"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class = \"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        Thread.sleep(5000);

        WebElement buttonCookies = driver.findElement(By.id(BUTTON_COOKIES));
        buttonCookies.click();

        Thread.sleep(5000);

        WebElement registryButton = driver.findElement(By.xpath(XPATH_REGISTRY));
        registryButton.click();

        Thread.sleep(5000);

        WebElement inputName = driver.findElement(By.name(INPUT_NAME));
        inputName.sendKeys("Michal");

        Thread.sleep(3000);

        WebElement inputSurname = driver.findElement(By.name(INPUT_SURNAME));
        inputSurname.sendKeys("Kaczmarek");

        Thread.sleep(3000);

        WebElement inputEmail = driver.findElement(By.name(INPUT_EMAIL));
        inputEmail.sendKeys("mi123456ka@gmail.com");

        Thread.sleep(3000);

        WebElement inputEmailConfirm = driver.findElement(By.name(INPUT_EMAIL_CONFIRM));
        inputEmailConfirm.sendKeys("mi123456ka@gmail.com");

        Thread.sleep(3000);

        WebElement inputPassword = driver.findElement(By.name(INPUT_PASSWORD));
        inputPassword.sendKeys("Ka123456!");

        Thread.sleep(5000);

        WebDriverWait driverWait = new WebDriverWait(driver, 5);
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_SELECT)));

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select birthday = new Select(selectDay);
        birthday.selectByValue("24");
        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select birthMonth = new Select(selectMonth);
        birthMonth.selectByValue("6");
        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select birthYear = new Select(selectYear);
        birthYear.selectByValue("1988");
    }
}

