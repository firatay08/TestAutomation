package steps;

import component.AnaIslemler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Islemler extends AnaIslemler {

    @Given("taryıcıyı açarsam")
    public void taryıcıyı_açarsam() {
        openBrowser();
    }

    @When("{string} adresine gidersem")
    public void adresineGidersem(String link) {
        goToLink(link);
    }

    @And("{string} sayfasının açıldığını görürüm")
    public void sayfasınınAçıldığınıGörürüm(String arg0) {
    }

    @And("{string} öğesine tıklarsam")
    public void öğesineTıklarsam(String oge) {
        clickElement(oge);
    }

    @And("{string} metnine tıklarsam")
    public void metnineTıklarsam(String arg0) {
    }

    @And("kullanıcı bilgilerini doldurursam")
    public void kullanıcıBilgileriniDoldurursam() {
    }

    @And("{int} saniye beklersem")
    public void saniyeBeklersem(int deger) {
        pause(deger);
    }

    @And("enter basarsam")
    public void enterBasarsam() {
    }

    @And("{string} metnini görürüm")
    public void metniniGörürüm(String metin) {
        seeText(metin);
    }

    @And("{string} öğesini temizlersem")
    public void öğesiniTemizlersem(String arg0) {
    }

    @And("{string} öğesine {string} yazarsam")
    public void öğesineYazarsam(String oge, String yazi) {
        textElement(oge,yazi);
    }

    @And("rasgele ürün seç")
    public void rasgeleÜrünSeç() {
    }

    @And("sepete ekle ve kontrol et")
    public void sepeteEkleVeKontrolEt() {
    }

    @And("tarayıcıyı kapatırım")
    public void tarayıcıyıKapatırım() {
        closeBrowser();
    }

    @And("{string} selectbox öğesine  {string} değeri atarsam")
    public void selectboxÖğesineDeğeriAtarsam(String oge, String deger) {
        setSelecbox(oge, deger);
    }

    @And("{string} öğesine rasgele mail oluşturup yazarsam")
    public void öğesineRasgeleMailOluşturupYazarsam(String oge) {
        textRandomMAil(oge);
    }

    @And("{string} tuşuna basarsam")
    public void tuşunaBasarsam(String tus) {
    }
}
