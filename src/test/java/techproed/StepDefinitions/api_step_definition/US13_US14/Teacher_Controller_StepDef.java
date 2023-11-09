package techproed.StepDefinitions.api_step_definition.US13_US14;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US13_US14.TeacherSavepojo;
import techproed.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class Teacher_Controller_StepDef {
    Response response;
    TeacherSavepojo payload;

    @Given("Teacher kaydetmek icin URL duzenlenir")
    public void teacherKaydetmekIcinURLDuzenlenir() {
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first","teachers","second","save");
    }

    @Then("Teacher kaydi icin payload duzenlenir")
    public void teacherKaydiIcinPayloadDuzenlenir() {
        payload = new TeacherSavepojo(1700,"Elifdoo011","Ali","Kaya","1983-01-06","777-77-7773","California","631-229-6255","MALE","Alidd@gmail.com",false);

    }

    @When("Teacher kaydi icin Post request gonderilir ve response alinir")
    public void teacherKaydiIcinPostRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("status codun {int} oldugu dogrulanir")
    public void statusCodunOlduguDogrulanir(int arg0) {
    }

    @And("Teacher kaydi icin gelen response body dogrulanir")
    public void teacherKaydiIcinGelenResponseBodyDogrulanir() {
    }
}
