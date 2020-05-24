package Base;

import org.openqa.selenium.By;
import org.testng.Assert;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ECommerce extends BasePage {

    String productName1;
    public void selectProduct(){
        Random rastgele = new Random();
        int rastgeleSayi = rastgele.nextInt(20)+1;
        String xpadth ="//*[@id='view']/ul/li["+ rastgeleSayi+"]/div/div[1]/a/img";
        webElement(By.xpath(xpadth)).click();
        pause(3000);
        String productName="//div[@class='proDetail']/div[1]/div/h1";
        productName1=webElement(By.xpath(productName)).getText();
        String productPrice="//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/div/ins";
        WriteFile(webElement(By.xpath(productName)).getText(),webElement(By.xpath(productPrice)).getText());
    }

    public void addBasket(){
        webElement(By.xpath("//a[@title='Sepete Ekle']")).click();
        pause(500);
        webElement(By.xpath("//a[@title='Sepetim']")).click();
        pause(1000);
        String newProductName="//td[@class='prodDetail']/div[@class='prodInfo']/div/a";
        String newProductName2=webElement(By.xpath(newProductName)).getText();
        if(productName1.equals(newProductName2)){}
        else{
            Assert.assertTrue(false);
        }
        System.out.println("çalıştı");
    }

    public void WriteFile(String str1, String str2) {


        File file = new File("src/test/resources/TxtFile/Product.txt");
        try{
            BufferedWriter br = new BufferedWriter(new FileWriter(file, false));
            br.write(str1+" - "+str2);
            br.close();
        } catch (IOException e) {
            System.out.println("Unable to read file " +file.toString());
        }

    }

}
