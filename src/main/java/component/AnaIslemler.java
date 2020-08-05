package component;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;



public class AnaIslemler {

    public static WebDriver webDriver;
    public WebElement webElement(By Locator){
        return webDriver.findElement(Locator);
    }


    public void openBrowser(){
        System.out.println("Tarayıcı açılıyor...");
        WebDriverManager.chromedriver().setup();
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


    public void pause(Integer seconds){
        try {
            int milliseconds=seconds*1000;
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void clickElement(String element){
        JsonIslemleri json=new JsonIslemleri();
        webDriver.findElement(By.xpath(json.getElement(element))).click();
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
            System.out.println("TarayÄ±cÄ± aÃ§Ä±ldÄ±.");
        }
        else{
            System.out.println("TarayÄ±cÄ± aÃ§Ä±lamadÄ±.");
            Assert.assertTrue(false);
        }
    }


    public void clerarElement(String element){
        webDriver.findElement(By.xpath(element)).clear();
    }


    public void textElement(String element, String text){
        JsonIslemleri json=new JsonIslemleri();
       // webDriver.findElement(By.xpath(json.getElement(element)))
        webDriver.findElement(By.xpath(json.getElement(element))).sendKeys(text);
    }


    public void seeText(String text){
        String newText= "//*[text()='"+text+"']";
        By countInstructors=By.xpath(newText);
        int userNameCount = webDriver.findElements(countInstructors).size();
        if (userNameCount<1){
            Assert.assertTrue(false);
        }
    }


    public void setSelecbox(String element, String value){
        JsonIslemleri json=new JsonIslemleri();
        Select dropdown = new Select(webDriver.findElement(By.xpath(json.getElement(element))));
        dropdown.selectByVisibleText(value);
    }

}
