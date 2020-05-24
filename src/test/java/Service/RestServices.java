package Service;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestServices {

    @Test
    public void getPost(){
        given()
        .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
        .then()
                .statusCode(200)
                .assertThat().body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));
        System.out.println("Get Post çalıştı");
    }

    @Test
    public void getUser(){
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users/1")
                .then()
                .statusCode(200)
                .assertThat().body("name", equalTo("Leanne Graham"));
        System.out.println("Get User çalıştı");
    }

    @Test
    public void getComment(){
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/comments/1")
                .then()
                .statusCode(200);
        System.out.println("Get Comment çalıştı");
    }
}
