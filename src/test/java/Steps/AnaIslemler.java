package Steps;

import Base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ve;

public class AnaIslemler extends BasePage {

    private BasePage basePage;
    public String degisken;

    @Given("taryıcıyı açarsam")
    public void taryıcıyıAçarsam() {
        openBrowser();
    }

    @And("{string} öğesine tıklarsam")
    public void öğesineTıklarsam(String oge) {
        clickElement(oge);
    }

    @And("enter basarsam")
    public void enterBasarsam() {
        pressEnter();
    }

    @And("yazarsam")
    public void yazarsam() {
    }

    @And("{string} adresine gidersem")
    public void stringAdresineGidersem(String url) {
        goToLink(url);
    }

    @And("{int} saniye beklersem")
    public void intSaniyeBeklersem(int saniye) {
        pause(saniye*1000);
    }

    @And("ekranın yüklendiğini görürüm")
    public void ekranınYüklendiğiniGörürüm() {

    }

    @And("tarayıcıyı kapatırım")
    public void tarayıcıyıKapatırım() {
        closeBrowser();
    }

    @And("{string} metnini konsol ekranına yazarsam")
    public void stringMetniniKonsolEkranınaYazarsam(String mesaj) { logconsole(mesaj); }

    @And("{string} metnini degisken olarak kaydedersem")
    public void stringMetniniTestOlarakKaydedersem(String icerik) {
        degisken=icerik;
    }


    @And("{string} metnine tıklarsam")
    public void metnineTıklarsam(String metin) { clickText(metin);}

    @And("{string} sayfasının açıldığını görürüm")
    public void sayfasınınAçıldığınıGörürüm(String sayfaAdi) { checkThePage(sayfaAdi); }

    @And("{string} öğesini temizlersem")
    public void öğesiniTemizlersem(String oge) { clerarElement(oge); }

    @And("{string} öğesine {string} yazarsam")
    public void öğesineYazarsam(String oge, String metin) { testElement(oge,metin); }

    @Then("{string} metnini görürüm")
    public void metniniGörürüm(String metin) { seeText(metin); }


}
