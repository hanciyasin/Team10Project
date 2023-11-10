package techproed.StepDefinitions.api_step_definition.US07_24;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import techproed.pojos.US07_24.US24_ObjectPojo;
import techproed.pojos.US07_24.US24_ResponsePojo;
import techproed.pojos.US07_24.US24_TeacherPostPojoByAdmin;
import techproed.utilities.ConfigReader;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static techproed.StepDefinitions.ui_step_defs.US04_05_16_StepDefinition.DeanBilgileriStepDef.*;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class US24_TeacherManagementByAdminAPI {

    US24_TeacherPostPojoByAdmin payload;
    Response response;
    US24_ResponsePojo actualData;
    int userId;
    public static US24_ObjectPojo object;
    public static  US24_ResponsePojo expectedData;
    public static List<String> lessonIdList(){
        lessonIdList().add("1956");
        lessonIdList().add("1869");
        return lessonIdList();
    }



    @Given("Teacher save icin URL duzenlenir")
    public void teacherSaveIcinURLDuzenlenir() {
       // setUp(ConfigReader.getProperty("manSchoolAdmin"),ConfigReader.getProperty("manSchoolAdminPass"));

        setUp(ConfigReader.getProperty("AdminBatch171+"),ConfigReader.getProperty("Batch171+"));
        spec.pathParams("first","teachers","second","save");
    }


    @And("Teacher save icin payload duzenlenir")
    public void teacherSaveIcinPayloadDuzenlenir() {
        payload=new US24_TeacherPostPojoByAdmin("Samwise","Gamgee","Middle Earth","samgam@gmail.com","345-754-5643","453-43-6534","Samwise","SamGam12.","1986-04-06",lessonIdList());
    }

    @When("Teacher save icin post request gonderilir ve response alinir")
    public void teacherSaveIcinPostRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(US24_ResponsePojo.class);
    }

    @Then("status kodun {int} oldugu dogrulanir")
    public void statusKodunOlduguDogrulanir(int statusCode) {
        Assert.assertEquals(statusCode,response.statusCode());
    }

    @And("Teacher save icin gelen response body dogrulanir")
    public void teacherSaveIcinGelenResponseBodyDogrulanir() {
        Assert.assertEquals(payload.getName(),actualData.getObject().getName());
        Assert.assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        Assert.assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        Assert.assertEquals(payload.getEmail(),actualData.getObject().getEmail());
        Assert.assertEquals(payload.getDateOfBirth(),actualData.getObject().getBirthDay());
        Assert.assertEquals(payload.getPhone(),actualData.getObject().getPhoneNumber());
        Assert.assertEquals(payload.getSsn(),actualData.getObject().getSsn());

    }

    @Given("Kayıtlı Teacher hesap bilgisinin id nosu alinir")
    public void kayıtlıTeacherHesapBilgisininIdNosuAlinir() {
        spec.pathParams("first","teachers","second","getAll");
        response =  given(spec).when().get("{first}/{second}");

        JsonPath json = response.jsonPath();
        List<Integer> userIdlist = json.getList("findAll{it.username=='Samwise'}.userId");
        userId = userIdlist.get(0);
    }

    @And("Teacher GetSavedTeacherById icin URL duzenlenir")
    public void teacherGetSavedTeacherByIdIcinURLDuzenlenir() {
        //https://managementonschools.com/app/teachers/getSavedTeacherById/2850
        spec.pathParams("first","teachers","second","getSavedTeacherById","third",userId);
    }

    @And("Teacher GetSavedTeacherById icin beklenen veriler duzenlenir")
    public void teacherGetSavedTeacherByIdIcinBeklenenVerilerDuzenlenir() {
        object = new US24_ObjectPojo(userId,"Samwise","Samwise","Gamgee","1986-04-06","453-43-6534","Middle Earth","345-754-5643","MALE","samgam@gmail.com",true);
        expectedData = new US24_ResponsePojo(object,"Teacher saved successfully","OK");
    }

    @When("GetSavedTeacherById icin GET request gonderilir ve Response alinir")
    public void getsavedteacherbyidIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
        actualData = response.as(US24_ResponsePojo.class);
    }

    @And("Teacher GetSavedTeacherById icin gelen response body dogrulanir")
    public void teacherGetSavedTeacherByIdIcinGelenResponseBodyDogrulanir() {
        Assert.assertEquals(object.getName(),actualData.getObject().getName());
        Assert.assertEquals(object.getSurname(),actualData.getObject().getSurname());
        Assert.assertEquals(object.getEmail(),actualData.getObject().getEmail());
        Assert.assertEquals(object.getSsn(),actualData.getObject().getSsn());
        Assert.assertEquals(object.getUsername(),actualData.getObject().getUsername());
        Assert.assertEquals(object.getUserId(),actualData.getObject().getUserId());
        Assert.assertEquals(object.getBirthDay(),actualData.getObject().getBirthDay());
        Assert.assertEquals(object.getBirthPlace(),actualData.getObject().getBirthPlace());
        Assert.assertEquals(object.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        Assert.assertEquals(object.getAdvisorTeacher(),actualData.getObject().getAdvisorTeacher());

    }
}
