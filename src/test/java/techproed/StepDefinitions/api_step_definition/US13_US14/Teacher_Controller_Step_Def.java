package techproed.StepDefinitions.api_step_definition.US13_US14;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US13_US14.TeacherRegisterPostpojo;
import techproed.utilities.ConfigReader;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static io.restassured.RestAssured.given;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class Teacher_Controller_Step_Def {

    TeacherRegisterPostpojo payload;

    @Given("Teacher kaydetmek icin URL duzenlenir")
    public void teacherKaydetmekIcinURLDuzenlenir() {
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first","teachers","second","save");
    }

    @Then("Teacher kaydi icin payload duzenlenir")
    public void teacherKaydiIcinPayloadDuzenlenir() {
        payload = new TeacherRegisterPostpojo("1976-02-06","New York","Turk102@gmail.com","FEMALE","false","2106,1375,1865","suman","959654Aabb","526-786-5584","343-19-3073","Asli","Bsumansari99");

        /*
        {
  "birthDay": "1976-02-06",
  "birthPlace": "New York",
  "email": "Turk102@gmail.com",
  "gender": "FEMALE",
  "isAdvisorTeacher": "false",
  "lessonsIdList": [
    2106,1375,1865
  ],
  "name": "suman",
  "password": "959654Aabb",
  "phoneNumber": "526-786-5584",
  "ssn": "343-19-3073",
  "surname": "Asli",
  "username": "Bsumansari99"
}
         */



    }

    @When("Teacher kaydi icin Post request gonderilir ve response alinir")
    public void teacherKaydiIcinPostRequestGonderilirVeResponseAlinir() {
       Response response = given(spec).body(payload).when().post("{first}/{second}");
       response.prettyPrint();
    }

    @Then("status codun {int} oldugu dogrulanir")
    public void statusCodunOlduguDogrulanir(int arg0) {
    }

    @And("Teacher kaydi icin gelen response body dogrulanir")
    public void teacherKaydiIcinGelenResponseBodyDogrulanir() {
    }
}
