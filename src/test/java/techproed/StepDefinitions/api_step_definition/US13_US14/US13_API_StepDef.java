package techproed.StepDefinitions.api_step_definition.US13_US14;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US13_US14.ObjectPojo;
import techproed.pojos.US13_US14.TeacherInfoPostPojo;
import techproed.pojos.US13_US14.TeacherResponsePojo;
import techproed.utilities.ConfigReader;


import java.util.Collections;
import java.util.Map;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.ManagementonSchoolsBaseUrl.*;


public class US13_API_StepDef {


    public static TeacherInfoPostPojo expecteddata ;

    public static TeacherResponsePojo actualData;
    public static int  userId;
    Response response;


    @Given("Teacher eklemek icin Post request hazirligi yapilir.")
    public void teacherEklemekIcinPostRequestHazirligiYapilir() {
        // Set the URL
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first", "teachers", "second", "save");


    }

    @And("Gonderilecek Teacher bilgileri hazirlanir.")
    public void gonderilecekTeacherBilgileriHazirlanir() {

        // Set the Expected Data
        expecteddata = new TeacherInfoPostPojo("2000-03-09",
                "Rize",
                "Ellenor@gmail.com",
                "FEMALE",
                "True",
                Collections.singletonList("2106"),
                "Elif",
                "Liferay1234",
                "631-287-4225",
                "225-37-1520",
                "Uzay",
                "Elifuzay17") ;

    }

    @When("Teacher eklemek icin Post request gonderilir.")
    public void teacherEklemekIcinPostRequestGonderilir() {
        // Send Request
        response = given(spec).body(expecteddata).when().post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Teacher bilgileri dogrulanir.")
    public void teacherBilgileriDogrulanir() {

        // Get Response
        actualData = response.as(TeacherResponsePojo.class);
        System.out.println(actualData);

        assertEquals(200,response.getStatusCode());
        assertEquals(expecteddata.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expecteddata.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expecteddata.getEmail(), actualData.getObject().getEmail());
        assertEquals(expecteddata.getGender(), actualData.getObject().getGender());
        assertTrue(expecteddata.getIsAdvisorTeacher(), actualData.getObject().isAdvisorTeacher());
        assertEquals(expecteddata.getName(),actualData.getObject().getName());
        assertEquals(expecteddata.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expecteddata.getSsn(),actualData.getObject().getSsn());
        assertEquals("Teacher saved successfully",actualData.getMessage());
        assertEquals("CREATED",actualData.getHttpStatus());
        userId  = actualData.getObject().getUserId();

    }

    @Then("kullanici olusturulan Teacheri update eder")
    public void kullaniciOlusturulanTeacheriUpdateEder() {
        //https://managementonschools.com/app/teachers/update/3048
        spec.pathParams("first","teachers","second","update","third","3048");
        TeacherResponsePojo obj = new TeacherResponsePojo();
        //  Map<String, Object> payLoad = obj.getPayLoad(21, "Wash the dishes", false);
        String payload = obj.getObject().getEmail().replace("Ellenor@gmail.com","ThanksGod@gmail.com");
      Response  response = given(spec).body(payload).when().put("{first}/{second}");
      response.prettyPrint();

    }

    @Then("kullanici olusturulan Teacheri siler.")
    public void kullaniciOlusturulanTeacheriSiler() {
        spec.pathParams("first","teachers","second","delete","third",userId);
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
        assertEquals(200, response.statusCode());
    }


}

