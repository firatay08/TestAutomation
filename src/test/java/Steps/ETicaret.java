package Steps;

import Base.ECommerce;
import io.cucumber.java.en.And;

public class ETicaret extends ECommerce {

    @And("rasgele ürün seç")
    public void rasgeleÜrünSeç() { selectProduct(); }

    @And("sepete ekle ve kontrol et")
    public void sepeteEkleVeKontrolEt() { addBasket(); }
}
