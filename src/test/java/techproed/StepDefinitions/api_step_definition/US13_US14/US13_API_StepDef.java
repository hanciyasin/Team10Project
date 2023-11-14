package techproed.StepDefinitions.api_step_definition.US13_US14;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.ManagementonSchoolsBaseUrl.*;
@JsonIgnoreProperties (ignoreUnknown = true)


public class US13_API_StepDef {


    public static TeacherInfoPostPojo expecteddata ;

    public static TeacherResponsePojo actualData;

    public static int  userId;
    Response response;
    Object payLoad;
    TeacherResponsePojo obj;

    TeacherResponsePojo actualDataPUT;


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
        //https://managementonschools.com/app/teachers/update/userId
        spec.pathParams("first","teachers","second","update","third","userId");
        ObjectPojo objectPojo = new ObjectPojo(3085,"Elifuzay17","Elif","Ay","2000-03-09","225-37-1520","Rize","631-287-4225","FEMALE","Ellenor@gmail.com",true);
        TeacherResponsePojo teacherResponsePojo = new TeacherResponsePojo(objectPojo,"Teacher saved successfully","CREATED");
        Response response1 = given(spec).body(teacherResponsePojo).when().put("{first}/{second}/{third}");
        actualDataPUT = response1.as(teacherResponsePojo.getClass());

        assertEquals(teacherResponsePojo.getObject(),actualDataPUT.getObject());
        assertEquals(teacherResponsePojo.getMessage(),actualDataPUT.getMessage());
        assertEquals(teacherResponsePojo.getHttpStatus(),actualDataPUT.getHttpStatus());
       /*
        {
    "object": {
        "userId": 3085,
        "username": "Elifuzay17",
        "name": "Elif",
        "surname": "Ay",
        "birthDay": "2000-03-09",
        "ssn": "225-37-1520",
        "birthPlace": "Rize",
        "phoneNumber": "631-287-4225",
        "gender": "FEMALE",
        "email": "Ellenor@gmail.com",
        "advisorTeacher": true
    },
    "message": "Teacher saved successfully",
    "httpStatus": "CREATED"
}
         */




    }

    @Then("kullanici olusturulan Teacheri siler.")
    public void kullaniciOlusturulanTeacheriSiler() {
        spec.pathParams("first","teachers","second","delete","third",userId);
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
        assertEquals(200, response.statusCode());
    }


}

