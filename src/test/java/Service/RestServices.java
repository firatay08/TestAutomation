package Service;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestServices {

    public static HashMap map = new HashMap();

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

    @Test
    public void postComments(String parameter)
    {
        String[] paramater = parameter.split(", ");
        map.put("postId", paramater[0]);
        map.put("name", paramater[1]);
        map.put("email", paramater[2]);
        map.put("body", paramater[3]);

        RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
        RestAssured.basePath="/comments/1";

        given()
            .contentType("application/json; charset=utf-8")
            .body(map);
        when()
             .put()
        .then()
                .statusCode(200);
        System.out.println("post Comment çalıştı");
    }


}
