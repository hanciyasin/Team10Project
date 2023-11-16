package techproed.StepDefinitions.api_step_definition.US07_24;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Sleeper;
import techproed.StepDefinitions.ui_step_defs.US07_US24_StepDefinition.US07_StepDefinition;
import techproed.pojos.US07_24.US24.GetSavedTeacherById.ResponsePojoAdminPojo;
import techproed.pojos.US07_24.US24.PostTeacherSave.ObjectPojo;
import techproed.pojos.US07_24.US24.PostTeacherSave.ResponsePojoAdminTeacherSave;
import techproed.pojos.US07_24.US24.PostTeacherSave.TeacherPostPojo;
import techproed.utilities.ConfigReader;

import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class AdminTeacherSave  {
    TeacherPostPojo payload;
    Response response;
    ResponsePojoAdminTeacherSave actualData;
    ResponsePojoAdminPojo actualDataGet;
    int userId;
    public static ObjectPojo object;
    public static ResponsePojoAdminTeacherSave expectedData;
    US07_StepDefinition fakerInfo;

    public static List<String>  lessonsIdList(){
        lessonsIdList().add("1397");
        lessonsIdList().add("1430");
        return lessonsIdList();

    }




    @Given("Teacher save icin URL duzenlenir")
    public void teacherSaveIcinURLDuzenlenir() {
        setUp(ConfigReader.getProperty("TeacherSaveAdmin"), ConfigReader.getProperty("TeacherSaveAdminPass"));
        spec.pathParams("first","teachers","second","save");
    }

    @And("Teacher save icin payload duzenlenir")
    public void teacherSaveIcinPayloadDuzenlenir() {
        payload = new TeacherPostPojo("1986-04-06",
                "Middle Earth",
                US07_StepDefinition.fakeEmail,
                "MALE",
                "true", Collections.singletonList("1398"),
                "Samwise",
                "Sg1234567",
                US07_StepDefinition.fakePhone,
                US07_StepDefinition.fakeSSN,
                "Gamgee",
                US07_StepDefinition.fakeUserName);

    }

    @When("Teacher save icin post request gonderilir ve response alinir")
    public void teacherSaveIcinPostRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(ResponsePojoAdminTeacherSave.class);
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
        Assert.assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        Assert.assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        Assert.assertEquals(payload.getSsn(),actualData.getObject().getSsn());
    }

    @Given("Kayıtlı Teacher hesap bilgisinin id nosu alinir")
    public void kayıtlıTeacherHesapBilgisininIdNosuAlinir() {
        spec.pathParams("first","teachers","second","getAll");
        response =  given(spec).when().get("{first}/{second}");

        JsonPath json = response.jsonPath();
        List<Integer> userIdlist = json.getList("findAll{it.username=='"+US07_StepDefinition.fakeUserName+"'}.userId");
        userId = userIdlist.get(0);
    }

    @And("Teacher GetSavedTeacherById icin URL duzenlenir")
    public void teacherGetSavedTeacherByIdIcinURLDuzenlenir() {
        //https://managementonschools.com/app/teachers/getSavedTeacherById/2850
        spec.pathParams("first","teachers","second","getSavedTeacherById","third",userId);
    }

    @And("Teacher GetSavedTeacherById icin beklenen veriler duzenlenir")
    public void teacherGetSavedTeacherByIdIcinBeklenenVerilerDuzenlenir() {
        object = new ObjectPojo(userId,
                US07_StepDefinition.fakeUserName,
                "Samwise",
                "Gamgee",
                "1986-04-06",
                US07_StepDefinition.fakeSSN,
                "Middle Earth",
                US07_StepDefinition.fakePhone,
                "MALE",
                "samgam086@gmail.com",
                true);
        expectedData = new ResponsePojoAdminTeacherSave(object,"Teacher saved successfully","CREATED");

    }

    @When("GetSavedTeacherById icin GET request gonderilir ve Response alinir")
    public void getsavedteacherbyidIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("/{first}/{second}/{third}");
        response.prettyPrint();
        actualDataGet = response.as(ResponsePojoAdminPojo.class);
    }

    @And("Teacher GetSavedTeacherById icin gelen response body dogrulanir")
    public void teacherGetSavedTeacherByIdIcinGelenResponseBodyDogrulanir() {
        Assert.assertEquals(object.getName(),actualDataGet.getObject().getName());
        Assert.assertEquals(object.getSurname(),actualDataGet.getObject().getSurname());
        //Assert.assertEquals(object.getEmail(),actualDataGet.getObject().getEmail());
        Assert.assertEquals(object.getSsn(),actualDataGet.getObject().getSsn());
        Assert.assertEquals(object.getUsername(),actualDataGet.getObject().getUsername());
        Assert.assertEquals(object.getBirthDay(),actualDataGet.getObject().getBirthDay());
        Assert.assertEquals(object.getBirthPlace(),actualDataGet.getObject().getBirthPlace());
        Assert.assertEquals(object.getPhoneNumber(),actualDataGet.getObject().getPhoneNumber());
    }
    @Then("kullanici olusturulan Teacheri siler")
    public void kullaniciOlusturulanTeacheriSiler() {
        spec.pathParams("first","teachers","second","delete","third",userId);
        response = given(spec).when().delete("{first}/{second}/{third}");
        Assert.assertEquals(200, response.statusCode());
        response.prettyPrint();
    }
}
