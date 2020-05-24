package Base;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileReader;

public class JsonOperation extends BasePage{


    public WebElement webElement(By Locator){
        return webDriver.findElement(Locator);
    }


    public void fillUserInformation(){

         String usurName = (String) getDataFile("Login.json").get("kullanici");
         String usurPasword = (String) getDataFile("Login.json").get("sifre");
         pause(2000);
         webDriver.findElement(By.id("email")).sendKeys(usurName);
         webDriver.findElement(By.id("password")).sendKeys(usurPasword);
         WebElement login = webElement(By.id("loginButton"));
         login.click();
         pause(2000);

    }

    protected JSONObject getDataFile(String dataFileName) {
        String dataFilePath = "src/test/resources/Jsons/";
        JSONObject testObject = null;

        try {
            FileReader reader = new FileReader(dataFilePath + dataFileName);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            testObject = (JSONObject) jsonObject;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return testObject;
    }
}
