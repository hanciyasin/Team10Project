package techproed.StepDefinitions.api_step_definition.US01_02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import techproed.pojos.US04_05_16.ViceDean.ContactGetAllGetResponse;
import techproed.pojos.us01_us02.ObjectPojo;
import techproed.pojos.us01_us02.RegisterPojo;
import techproed.pojos.us01_us02.ResponsePojo;
import techproed.utilities.ConfigReader;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class APİUS01REGİSTER {


    RegisterPojo payload;


    public static int userId;

    Response response;
    ResponsePojo actualData;
    ObjectPojo objectPojo;
    public static String Register;
    public static int RegisterPojo;


    @Given("REGİSTER icin URL duzenlenir")
    public void registerIcinURLDuzenlenir() {

        //https://managementonschools.com/app/guestUser/register
        setUp(ConfigReader.getProperty("USERNAME"), ConfigReader.getProperty("PASSWORD"));
        spec.pathParams("first", "guestUser", "second", "register");


    }

    @And("REGİSTER icin payload duzenlenir")
    public void registerIcinPayloadDuzenlenir() {

        payload = new RegisterPojo("1990-12-12", "KONYA", "MALE", "SUAT", "1234500Ab", "555-123-1255", "123-44-2331", "özgültekin", "misnoku");

        /*
         "birthDay":"1990-12-12",
  "birthPlace": "KONYA",
  "gender": "MALE",
  "name": "SUAT",
  "password": "1234500Ab",
  "phoneNumber": "555-123-1255",
  "ssn": "123-44-2331",
  "surname": "özgültekin",
  "username": "misnoku"
         */
    }

    @When("REGİSTER POST Request gonderilir ve Reponse alinir")
    public void registerPOSTRequestGonderilirVeReponseAlinir() {

        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        userId = response.jsonPath().getInt("object.id");
        actualData = response.as(ResponsePojo.class);


    }

    @And("REGİSTER icin gelen Response body dogrulanir")
    public void registerIcinGelenResponseBodyDogrulanir() {
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }


    @Then("Status kodun {int} oldugu dogrulanir.")
    public void statusKodunOlduguDogrulanir(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }


}
