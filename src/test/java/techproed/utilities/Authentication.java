package techproed.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static void main(String[] args) {
        System.out.println(generateToken("username", "password"));
    }
    public static String generateToken(String username, String password) {
        Map<String, Object> token=new HashMap<>();
        token.put( "password", password);
        token.put("username", username);
        Response response=given().contentType(ContentType.JSON).body(token).
                post("https://managementonschools.com/app/auth/login");
        response.prettyPrint();
        return response.jsonPath().getString("token");
    }
}