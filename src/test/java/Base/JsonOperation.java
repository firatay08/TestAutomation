package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class JsonOperation extends BasePage{


    //public WebDriver webDriver;
    public WebElement webElement(By Locator){
        return webDriver.findElement(Locator);
    }


    public void fillUserInformation(){

        //Kullancıı bilgileri json dosyasından alınacak enson bak

        pause(2000);
        WebElement username=webDriver.findElement(By.id("email"));
        username.sendKeys("karay0825@gmail.com");
        WebElement password=webDriver.findElement(By.id("password"));
        password.sendKeys("test123");
        WebElement login=webElement(By.id("loginButton"));
        login.click();
        pause(20000);
    }
}
