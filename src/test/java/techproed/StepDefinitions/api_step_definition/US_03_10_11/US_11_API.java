package techproed.StepDefinitions.api_step_definition.US_03_10_11;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US03_10_11.US10Pojo.LessonProgramObjectPojo;
import techproed.pojos.US03_10_11.US10Pojo.LessonProgramPostPojo;
import techproed.pojos.US03_10_11.US10Pojo.LessonProgramResponsePojo;
import techproed.pojos.US03_10_11.US11Pojo.LessonProgramDeletePojo;
import techproed.pojos.US03_10_11.US11Pojo.LessonProgramDeleteResponse;
import techproed.pojos.US12_25.US_12.LessonProgramPojo;
import techproed.utilities.ConfigReader;

import java.util.*;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US_11_API {
    LessonProgramPojo expectedData;
    Response response;
    LessonProgramObjectPojo lessonProgramObject;
    Integer lessonProgramId;

    LessonProgramDeleteResponse actualData;

    @Given("Lesson Program Get icin Url duzenlenir")
    public void lessonProgramGetUrl() {
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first", "lessonPrograms", "second", "save");
    }

    @Then("Lesson Program Get request icin payload olusturulur {string} , {int} , {int} ,{string},{string}")
    public void lessonProgramGetRequestIcinPayloadOlusturulur(String day, Integer term, Integer lessonIdList, String startTime, String stopTime) {
        List<Integer> lessonIdList01 = new ArrayList<>();
        lessonIdList01.add(lessonIdList);
        expectedData = new LessonProgramPojo(day, term, lessonIdList01, startTime, stopTime);


    }

    @Then("Lesson Program goruntulemek icin Get response gonderilir ve response alinir")
    public void lessonProgramGoruntulemekIcinGetResponseGonderilirVeResponseAlinir() {
        response = given(spec).body(expectedData).post("{first}/{second}");
        actualData = response.as(LessonProgramDeleteResponse.class);
        Integer lessonProgramId = lessonProgramObject.getLessonProgramId();
        System.out.println(lessonProgramId);

    }


    @Then("Lesson Program Delete icin Url duzenlenir")
    public void lessonProgramDeleteIcinUrlDuzenlenir() {
        spec.pathParams("first", "lessonPrograms", "second", "delete", "third", lessonProgramId);
    }

    @When("Lesson Program Delete request ile silinir")
    public void lessonProgramDeleteRequestIleSilinir() {

        Response response = given(spec).delete("{first}/{second}/{third}");
        assertEquals(200, response.statusCode());
    }


}

