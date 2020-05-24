package Steps;


import io.cucumber.java.en.And;
import Base.JsonOperation;

public class JsonIslermleri extends JsonOperation{

    private JsonOperation jsonOperation;

    @And("kullanıcı bilgilerini doldurursam")
    public void kullanıcıBilgileriniDoldurursam() {
        fillUserInformation();
    }


}
