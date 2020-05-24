package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BasePage{


    public static WebDriver webDriver;
    public WebElement webElement(By Locator){
        return webDriver.findElement(Locator);
    }



    public void openBrowser(){

        System.out.println("Tarayıcı açılıyor...");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        webDriver = new ChromeDriver( options );
    }

    public void closeBrowser(){
        System.out.println("Tarayıcı kapatılıyor...");
        webDriver.close();
    }

    public void goToLink(String link){
        webDriver.get(link);
    }

    public void pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickElement(String element){
        webElement(By.xpath(element)).click();
    }

    public void pressEnter()  {
        webDriver.findElement(By.xpath("//body")).sendKeys(Keys.ENTER);
    }
    public void clickText(String text){
        String newText="//*[text()='"+text+"']";
        webDriver.findElement(By.xpath(newText)).click();
    }

    public void logconsole(String message){
        System.out.println(message);
    }

    public void checkThePage(String page){
        if(webDriver.getTitle() != null && webDriver.getTitle().contains(page)){
            System.out.println("Tarayıcı açıldı.");
        }
        else{
            System.out.println("Tarayıcı açılamadı.");
            Assert.assertTrue(false);
        }
    }

    public void clerarElement(String element){
        webDriver.findElement(By.xpath(element)).clear();
    }

    public void testElement(String element, String text){
        webDriver.findElement(By.xpath(element)).sendKeys(text);
    }

    public void seeText(String text){
        String newText= "//*[text()='"+text+"']";
        By countInstructors=By.xpath(newText);
        int userNameCount = webDriver.findElements(countInstructors).size();
        if (userNameCount<1){
            Assert.assertTrue(false);
        }
    }



}
