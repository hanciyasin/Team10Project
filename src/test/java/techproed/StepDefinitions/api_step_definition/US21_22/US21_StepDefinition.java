package techproed.StepDefinitions.api_step_definition.US21_22;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import techproed.pojos.US21_22.US_21.*;


import java.util.*;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US21_StepDefinition {
    ChooseLessonPojo payLoad;
    Response response;
    ChooseLessonResponsePojo actualData;
    Map<String,Object> getActualData;
    Map<String,Object> expectedData;
    Map<String, Object> getAllActualData;
    Map<String, Object> expectedAllData;


    @Given("Student yetkisiyle giris yapilir")
    public void studentYetkisiyleGirisYapilir() {
        setUp("ogrencikutay","142536rR");
    }

    @And("getAll lesson program by student icin URL duzenlenir")
    public void getallLessonProgramByStudentIcinURLDuzenlenir() {
        //https://managementonschools.com/app/lessonPrograms/getAllLessonProgramByStudent
        spec.pathParams("first","lessonPrograms","second","getAllLessonProgramByStudent");

    }

    @And("getAll lesson program by student icin beklenen veriler duzenlenir")
    public void getallLessonProgramByStudentIcinBeklenenVerilerDuzenlenir() {

        expectedAllData = new HashMap<>();
        expectedAllData.put("userId",2853);
        expectedAllData.put("day","MONDAY");
        expectedAllData.put("startTime","11:00:00");
        expectedAllData.put("stopTime","12:00:00");



    }

    @When("getAll lesson program by student icin get request gonderilir response alinir")
    public void getallLessonProgramByStudentIcinGetRequestGonderilirResponseAlinir() {
        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        String startTime = jsonPath.getString("[0].startTime");
        String stopTime = jsonPath.getString("[0].stopTime");
        int userId = jsonPath.get("[0].teachers.find{it.username=='kellee.goyette'}.userId");
        String day = jsonPath.get("[0].day");

        getAllActualData = new HashMap<>();
        getAllActualData.put("startTime",startTime);
        getAllActualData.put("stopTime",stopTime);
        getAllActualData.put("userId",userId);
        getAllActualData.put("day",day);


    }

    @And("getAll lesson program by student icin get request icin gelen response body dogrulanir")
    public void getallLessonProgramByStudentIcinGetRequestIcinGelenResponseBodyDogrulanir() {
        assertEquals(expectedAllData.get("userId"),getAllActualData.get("userId"));
        assertEquals(expectedAllData.get("startTime"),getAllActualData.get("startTime"));
        assertEquals(expectedAllData.get("stopTime"),getAllActualData.get("stopTime"));
        assertEquals(expectedAllData.get("day"),getAllActualData.get("day"));

    }




    @And("Choose Lesson icin URL duzenlenir")
    public void chooseLessonIcinURLDuzenlenir() {
        //https://managementonschools.com/app/students/chooseLesson
        spec.pathParams("first","students","second","chooseLesson");
    }

    @And("Choose Lesson icin payLoad duzenlenir")
    public void chooseLessonIcinPayLoadDuzenlenir() {
        payLoad = new ChooseLessonPojo(Collections.singletonList(1391));

    }

    @When("Choose Lesson icin post request gonderilir response alinir")
    public void chooseLessonIcinGetRequestGonderilirResponseAlinir() {
        response = given(spec).body(payLoad).when().post("{first}/{second}");
        actualData = response.as(ChooseLessonResponsePojo.class);
        response.prettyPrint();
        //{
        //    "object": {
        //        "userId": 2155,
        //        "username": "ogrencikutay",
        //        "name": "Kutay",
        //        "surname": "Ogrenci",
        //        "birthDay": "1999-05-16",
        //        "birthPlace": "Türkiye",
        //        "phoneNumber": "111-222-3453",
        //        "gender": "MALE",
        //        "studentNumber": 1325,
        //        "motherName": "Melix",
        //        "fatherName": "Felix",
        //        "email": "arrian.kacper@forkshape.com",
        //        "active": true
        //    },
        //    "message": "Lesson added to Student",
        //    "httpStatus": "CREATED"
        //}

        JsonPath json = response.jsonPath();
        Integer userId = json.getInt("object.userId");
        String username = json.getString("object.username");
        String name = json.getString("object.name");
        String surname = json.getString("object.surname");
        String birthDay = json.getString("object.birthDay");
        String birthPlace = json.getString("object.birthPlace");
        String phoneNumber = json.getString("object.phoneNumber");
        String gender = json.getString("object.gender");
        Integer studentNumber = json.getInt("object.studentNumber");
        String motherName = json.getString("object.motherName");
        String fatherName = json.getString("object.fatherName");
        String email = json.getString("object.email");
        Boolean active = json.getBoolean("object.active");

        getActualData = new HashMap<>();
        getActualData.put("userId",userId);
        getActualData.put("username",username);
        getActualData.put("name",name);
        getActualData.put("surname",surname);
        getActualData.put("birthDay",birthDay);
        getActualData.put("birthPlace",birthPlace);
        getActualData.put("phoneNumber",phoneNumber);
        getActualData.put("gender",gender);
        getActualData.put("studentNumber",studentNumber);
        getActualData.put("motherName",motherName);
        getActualData.put("fatherName",fatherName);
        getActualData.put("email",email);
        getActualData.put("active",active);


        expectedData = new HashMap<>();
        expectedData.put("userId",2155);
        expectedData.put("username","ogrencikutay");
        expectedData.put("name","Kutay");
        expectedData.put("surname","Ogrenci");
        expectedData.put("birthDay","1999-05-16");
        expectedData.put("birthPlace","Türkiye");
        expectedData.put("phoneNumber","111-222-3453");
        expectedData.put("gender","MALE");
        expectedData.put("studentNumber",1325);
        expectedData.put("motherName","Melix");
        expectedData.put("fatherName","Felix");
        expectedData.put("email","arrian.kacper@forkshape.com");
        expectedData.put("active",true);



    }
    @Then("Status kodun {int} oldugu dogrulanirrr")
    public void statusKodunOlduguDogrulanirrr(int arg0) {
        Assert.assertEquals(200,response.statusCode());
    }

    @And("Choose Lessson icin body dogrulanir")
    public void chooseLesssonIcinBodyDogrulanir() {
        Assert.assertEquals(expectedData.get("username"),getActualData.get("username"));
        Assert.assertEquals(expectedData.get("userId"),getActualData.get("userId"));
        Assert.assertEquals(expectedData.get("name"),getActualData.get("name"));
        Assert.assertEquals(expectedData.get("surname"),getActualData.get("surname"));
        Assert.assertEquals(expectedData.get("birthDay"),getActualData.get("birthDay"));
        Assert.assertEquals(expectedData.get("birthPlace"),getActualData.get("birthPlace"));
        Assert.assertEquals(expectedData.get("phoneNumber"),getActualData.get("phoneNumber"));
        Assert.assertEquals(expectedData.get("gender"),getActualData.get("gender"));
        Assert.assertEquals(expectedData.get("studentNumber"),getActualData.get("studentNumber"));
        Assert.assertEquals(expectedData.get("motherName"),getActualData.get("motherName"));
        Assert.assertEquals(expectedData.get("fatherName"),getActualData.get("fatherName"));
        Assert.assertEquals(expectedData.get("email"),getActualData.get("email"));
        Assert.assertEquals(expectedData.get("active"),getActualData.get("active"));

    }


}
