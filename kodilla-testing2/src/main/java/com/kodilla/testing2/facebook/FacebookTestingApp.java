package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public final static String BUTTON_COOKIES = "u_0_h";
    public final static String CREATE_ACCOUNT = "u_0_2";
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String BIRTHDAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String MONTHOFBIRTHDAY = "//*[@id=\"month\"]";
    public static final String YEAROFBIRTHDAY = "//*[@id=\"year\"]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement buttonCookies = driver.findElement(By.id(BUTTON_COOKIES));
        buttonCookies.click();

        WebElement createAccount = driver.findElement(By.id(CREATE_ACCOUNT));
        createAccount.click();

//
//        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());
//
//        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_WAIT_FOR));
//        Select selectDay = new Select(selectDayCombo);
//        selectDay.selectByIndex(2);
    }
}
