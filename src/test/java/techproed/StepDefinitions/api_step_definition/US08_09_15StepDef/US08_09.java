package techproed.StepDefinitions.api_step_definition.US08_09_15StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US08_09_15.Us08Pojo.US08_LessonsPojo;
import techproed.pojos.US08_09_15.Us08Pojo.US08_ResponsePojo;
import techproed.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US08_09 {

    US08_LessonsPojo payload;
    Response response;
    US08_ResponsePojo actualData;
    public static int lessonId;

    @Given("lesson save icin url duzenlenir")
    public void lessonSaveIcinUrlDuzenlenir() {
        //https://managementonschools.com/app/lessons/save
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first","lessons","second","save");

    }

    @And("lesson save icin payload duzenlenir")
    public void lessonSaveIcinPayloadDuzenlenir() {
        payload = new US08_LessonsPojo(true,"5","sosyolojii");

    }

    @When("lesson save icin POST Request gonderilir Response alinir")
    public void lessonSaveIcinPOSTRequestGonderilirResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        lessonId = response.jsonPath().getInt("object.lessonId");
        actualData = response.as(US08_ResponsePojo.class);

    }

    @Then("Status kodun {int} oldugu dogrulanır")
    public void statusKodunOlduguDogrulanır(int statusCode) {
        assertEquals(statusCode, response.statusCode());

    }

    @And("lesson save icin gelen Response dogrulanir")
    public void lessonSaveIcinGelenResponseDogrulanir() {
        assertEquals(payload.getLessonName(), actualData.getObject().getLessonName());

    }

    @Given("lesson delete icin url duzenlenir")
    public void lessonDeleteIcinUrlDuzenlenir() {
        //https://managementonschools.com/app/lessons/delete/2956
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first","lessons","second","delete","third",lessonId);
    }


    @Then("Kayitli lesson silinir")
    public void kayitliLessonSilinir() {

        response = given(spec).when().delete("{first}/{second}/{third}");
    }

    @And("lesson silindigi dogrulanır")
    public void lessonSilindigiDogrulanır() {
        String expectedData = "Lesson Deleted";
        assertEquals(expectedData,response.jsonPath().getString("message"));
    }
}