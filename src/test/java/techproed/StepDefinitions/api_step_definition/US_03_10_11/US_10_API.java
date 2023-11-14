package techproed.StepDefinitions.api_step_definition.US_03_10_11;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US03_10_11.US10Pojo.LessonProgramPostPojo;
import techproed.pojos.US03_10_11.US10Pojo.LessonProgramResponsePojo;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US_10_API {
    public int savedLessonProgramID;
    LessonProgramPostPojo expectedData;
    Response response;
    LessonProgramResponsePojo actualData;

    @Given("Lesson Program save icin URL duzenlenir")
    public void lessonProgramSaveUrl() {
        spec.pathParams("first", "contactMessages", "second", "save");
    }

    @And("Gonderilecek ders programi bilgileri icin payload olusturulur")
    public void lessonProgramPayload() {
        expectedData = new LessonProgramPostPojo("FRIDAY", "15",
                Collections.singletonList("23"), "12:00", "13:00");
    }
    @When("Lesson Program save icin Post request gonderilir ve response alinir")
        public void lessonProgramPostRequest() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        }
    @Then("Lesson Program Post sonrasi gelen response dogrulanir")
    public void lessonProgramRequestKontrol() {
        actualData = response.as(LessonProgramResponsePojo.class);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getDay(), actualData.getObject().getDay());
        assertEquals("Created Lesson Program", actualData.getMessage());
        assertEquals("CREATED", actualData.getHttpStatus());
        savedLessonProgramID = actualData.getObject().getLessonProgramId();
    }
}
