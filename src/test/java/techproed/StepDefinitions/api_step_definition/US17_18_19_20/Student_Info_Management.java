package techproed.StepDefinitions.api_step_definition.US17_18_19_20;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.Node;
import io.restassured.response.Response;
import techproed.pojos.US17_18_19_20.ObjectPojo;
import techproed.pojos.US17_18_19_20.ResponsePojo;
import techproed.pojos.US17_18_19_20.StudentInfoSavePojo;
import techproed.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class Student_Info_Management {

    StudentInfoSavePojo payload;

    Response response;

    ResponsePojo actualData;

    int userId;
    int page = 1;
    int size = 10;


    @Given("Not verme icin URL duzenlenir")
    public void notVermeIcinURLDuzenlenir() {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/save
        spec.pathParams("first","studentInfo","second","save");
    }

    @And("Not verme icin payload duzenlenir")
    public void notVermeIcinPayloadDuzenlenir() {
        payload = new StudentInfoSavePojo(5,15,85,"Basarilidir",1863,75,2046);

    }

    @When("Not verme icin POST Request gonderilir ve Reponse alinir")
    public void notVermeIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(ResponsePojo.class);


    }

    @And("Not verme icin gelen Response body dogrulanir")
    public void notVermeIcinGelenResponseBodyDogrulanir() {
        assertEquals(payload.getAbsentee(),actualData.getObject().getAbsentee());
        assertEquals(payload.getEducationTermId(),actualData.getObject().getEducationTermId());
        assertEquals(payload.getFinalExam(),actualData.getObject().getFinalExam());
        assertEquals(payload.getInfoNote(),actualData.getObject().getInfoNote());
        assertEquals(payload.getLessonId(),actualData.getObject().getLessonId());
        assertEquals(payload.getMidtermExam(),actualData.getObject().getMidtermExam());
        assertEquals(payload.getStudentId(),actualData.getObject().getStudentResponse().getUserId());



    }


    @And("GetByStudentId icin URL duzenlenir")
    public void getbystudentıdIcinURLDuzenlenir() {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/getAllByStudent?page=1&size=1
        spec.pathParams("first","studentInfo","second","getAllByStudent").
                queryParams("page",1,"size",10);


        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(ResponsePojo.class);


    }
}
