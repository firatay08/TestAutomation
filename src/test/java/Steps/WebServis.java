package Steps;

import Service.RestServices;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class WebServis extends RestServices {

    @Given("{string} servisini çalıştırırsam")
    public void servisiniÇalıştırırsam(String servis) {
        if("getPost".equals(servis)) {
            getPost();
        }
        else if ("getUser".equals(servis)){
            getUser();
        }
        else if("getComment".equals(servis)){
            getComment();
        }
    }

    @And("{string} parametreler ile {string} servisini çalıştırırsam")
    public void parametrelerIleServisiniÇalıştırırsam(String parametre, String servis) {
        System.out.println(parametre);
    }
}
