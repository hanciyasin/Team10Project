package techproed.base_url;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static techproed.utilities.Authentication.generateToken;

public class ManagementonSchoolsBaseUrl {
    public static RequestSpecification spec;
    @Before
    public static void setUp(String username, String password){
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateToken(username,password))
                .build();



    }
}
