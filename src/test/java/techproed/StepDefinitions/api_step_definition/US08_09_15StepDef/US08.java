package techproed.StepDefinitions.api_step_definition.US08_09_15StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pojos.US08_09_15.LessonsPojo;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static techproed.StepDefinitions.ui_step_defs.US12_US25_StepDefenition.US25_StepDefiniton.response;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US08 {

    LessonsPojo payload;

    @Given("lesson save icin url duzenlenir")
    public void lessonSaveIcinUrlDuzenlenir() {
        //https://managementonschools.com/app/lessons/save
        spec.pathParams("first","lessons","second","save");

    }

    @And("lesson save icin payload duzenlenir")
    public void lessonSaveIcinPayloadDuzenlenir() {
        payload = new LessonsPojo(true,"5","sosyolojii");

    }

    @When("lesson save icin POST Request gonderilir Response alinir")
    public void lessonSaveIcinPOSTRequestGonderilirResponseAlinir() {
        given(spec).body(payload).when().post("{frist}/{second}");
        response.prettyPrint();
    }

    @Then("Status kodun {int} oldugu dogrulanır")
    public void statusKodunOlduguDogrulanır(int arg0) {
    }

    @And("lesson save icin gelen Response dogrulanir")
    public void lessonSaveIcinGelenResponseDogrulanir() {
    }
}
