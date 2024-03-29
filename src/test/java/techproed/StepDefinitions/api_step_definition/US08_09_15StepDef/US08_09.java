package techproed.StepDefinitions.api_step_definition.US08_09_15StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.WebElement;
import techproed.pojos.US08_09_15.Us08Pojo.US08_LessonsPojo;
import techproed.pojos.US08_09_15.Us08Pojo.US08_ObjectPojo;
import techproed.pojos.US08_09_15.Us08Pojo.US08_ResponsePojo;
import techproed.utilities.ConfigReader;
import techproed.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US08_09 {

    US08_LessonsPojo payload;
    Response response;
    US08_ResponsePojo actualData;
    public static String bylessonid;
    public static int lessonId;
    public int dersId;


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
        actualData = response.as(US08_ResponsePojo.class);
        lessonId = response.jsonPath().getInt("object.lessonId");

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


    @Given("lessons listesi alinir")
    public void lessonsListesiAlinir() {
        setUp(ConfigReader.getProperty("VDUserName"), ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first", "lessons", "second", "getAll");
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        JsonPath json = response.jsonPath();
        List<Integer> dersAdi = json.getList("findAll{it.lessonName==''}.lessonId");
           dersId = dersAdi.get(0);


    }


    @Given("lesson id ile ders kontrol edilir")
    public void lessonIdIleDersKontrolEdilir() {
        ReusableMethods.bekle(1);
        //https://managementonschools.com/app/lessons/getAllLessonByLessonId?lessonId=1255
        setUp(ConfigReader.getProperty("VDUserName"), ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first", "lessons", "second","getAllLessonByLessonId").queryParam("lessonId",lessonId);
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();



    }

    @Given("lesson name ile ders kontrol edilir")
    public void lessonNameIleDersKontrolEdilir() {
        ReusableMethods.bekle(1);
        //https://managementonschools.com/app/lessons/getLessonByName?lessonName=sosyoloji
        setUp(ConfigReader.getProperty("VDUserName"), ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first", "lessons", "second","getLessonByName").queryParam("lessonName","sosyolojii");
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }

    @And("lesson id ile ders kontrolu yapilir")
    public void lessonIdIleDersKontroluYapilir() {
        ReusableMethods.bekle(1);
        //https://managementonschools.com/app/lessons/getAllLessonByLessonId?lessonId=1255
        setUp(ConfigReader.getProperty("VDUserName"), ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first", "lessons", "second","getAllLessonByLessonId").queryParam("lessonId",dersId);
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        assertEquals("TeamOnDers",payload.getLessonName());
    }
}
