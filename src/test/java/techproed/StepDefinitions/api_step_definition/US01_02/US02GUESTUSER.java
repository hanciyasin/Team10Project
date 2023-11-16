package techproed.StepDefinitions.api_step_definition.US01_02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import techproed.pojos.us01_us02.ObjectPojo;
import techproed.pojos.us01_us02.RegisterPojo;
import techproed.pojos.us01_us02.ResponsePojo;
import techproed.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US02GUESTUSER {


    techproed.pojos.us01_us02.RegisterPojo payload;

    Response response;
    ResponsePojo actualData;
    ObjectPojo objectPojo;
    public static String Register;
    public static int RegisterPojo;

    @Given("GUEST icin URL duzenlenir")
    public void guestIcinURLDuzenlenir() {

        //https://managementonschools.com/app/guestUser/registere
        setUp(ConfigReader.getProperty("UserName"), ConfigReader.getProperty("Password"));
        spec.pathParams("first", "guestUser", "second", "registere");
        
    }

    @And("GUEST USER icin payload duzenlenir")
    public void guestUSERIcinPayloadDuzenlenir() {


        
    }

    @When("GUEST USER POST Request gonderilir ve Reponse alinir")
    public void guestUSERPOSTRequestGonderilirVeReponseAlinir() {

        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        RegisterPojo = response.jsonPath().getInt("object.RegisterId");
        actualData = response.as(ResponsePojo.class);
        
    }

    @Then("Status Kodun {int} oldugu dogrulanir")
    public void statusKodunOlduguDogrulanir(int statuscode) {
        assertEquals(statuscode, response.statusCode());

    }

    @And("GUEST USER icin gelen Response body dogrulanir")
    public void guestUSERIcinGelenResponseBodyDogrulanir() {
    }
}
