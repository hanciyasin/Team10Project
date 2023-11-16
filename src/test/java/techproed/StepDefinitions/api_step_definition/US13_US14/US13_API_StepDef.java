package techproed.StepDefinitions.api_step_definition.US13_US14;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.US13_US14.ObjectPojo;
import techproed.pojos.US13_US14.TeacherInfoPostPojo;
import techproed.pojos.US13_US14.TeacherResponsePojo;
import techproed.utilities.ConfigReader;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static techproed.base_url.ManagementonSchoolsBaseUrl.*;



public class US13_API_StepDef {


    public static TeacherInfoPostPojo expecteddata ;

    public static TeacherResponsePojo actualData;

    public static int  userId;
    public static Response response;
    public static Object payLoad;
    public static TeacherResponsePojo obj;
    public static TeacherResponsePojo actualDataPUT;
    public static ObjectPojo object;
    public static TeacherResponsePojo expectedData;



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
        spec.pathParams("first","teachers","second","update","third",userId);
        ObjectPojo objectPojo = new ObjectPojo(3085,"Elifuzay17","Elif","Ay","2000-03-09","225-37-1520","Rize","631-287-4225","FEMALE","Ellenor@gmail.com",true);
        TeacherResponsePojo teacherResponsePojo = new TeacherResponsePojo(objectPojo,"Teacher saved successfully","CREATED");
        Response response1 = given(spec).body(teacherResponsePojo).when().put("{first}/{second}/{third}");
        actualDataPUT = response1.as(teacherResponsePojo.getClass());

        //assertEquals(teacherResponsePojo.getObject(),actualDataPUT.getObject());
        assertEquals(teacherResponsePojo.getObject().getUsername(),actualDataPUT.getObject().getUsername());
        assertEquals(teacherResponsePojo.getObject().getName(),actualDataPUT.getObject().getName());
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

    @Given("Kayitli teacher bilgisinin Id No'su alinir")
    public void kayitliTeacherBilgisininIdNoSuAlinir() {
        //https://managementonschools.com/app/teachers/getAll
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));

        spec.pathParams("first","teachers","second","getAll");
        response = given(spec).when().get("{first}/{second}");
        JsonPath json = response.jsonPath();
        List<Integer>userIdList = json.getList("findAll{it.username=='Elifuzay17'}.userId");
        userId = userIdList.get(0);
        //userId = response.jsonPath().getInt("object.id");
        System.out.println(userId);//3137

    }
    @Then("getSavedTeacher By Id icin url duzenlenir")
    public void getsavedteacherByIdIcinUrlDuzenlenir() {
        //https://managementonschools.com/app/teachers/getSavedTeacherById/1
        spec.pathParams("first","teachers","second","getSavedTeacherById","third",userId);


        /*
        {
    "object": {
        "id": 3137,
        "username": "Elifuzay17",
        "name": "Elif",
        "surname": "Uzay",
        "email": "Ellenor@gmail.com",
        "gender": "FEMALE",
        "birthPlace": "Rize",
        "phoneNumber": "631-287-4225",
        "ssn": "225-37-1520",
        "birthDay": "2000-03-09",
        "isAdvisor": true,
        "lessonsProgramList": [
            {
                "id": 2106,
                "day": "MONDAY",
                "startTime": "22:59:00",
                "stopTime": "23:59:00",
                "lesson": [
                    {
                        "lessonId": 1865,
                        "lessonName": "Computer Science",
                        "creditScore": 8,
                        "compulsory": false
                    }
                ]
            }
        ]
    },
    "message": "Teacher successfully found",
    "httpStatus": "OK"
}
         */
    }

    @Then("getSavedTeacher By Id icin beklenen veriler duzenlenir")
    public void getsavedteacherByIdIcinBeklenenVerilerDuzenlenir() {
        object = new ObjectPojo(userId,"Elifuzay17","Elif","Uzay","2000-03-09", "225-37-1520","Rize","631-287-4225","FEMALE","Ellenor@gmail.com",true);
        expectedData = new TeacherResponsePojo(object,"Teacher successfully found","OK");

    }

    @When("GetSavedTeacherById icin GET request gonderilir Response al.")
    public void getsavedteacherbyidIcinGETRequestGonderilirResponseAl() {
        response =  given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
        actualData = response.as(TeacherResponsePojo.class);
    }
    @And("Status code dogrulanir")
    public void statusCodeDogrulanir() {
        assertEquals(200,response.getStatusCode());

    }

    @And("Teacher save icin gelen data dogrulanir")
    public void teacherSaveIcinGelenDataDogrulanir() {
       // assertEquals(object.getUserId(),actualData.getObject().getUserId());
        assertEquals(object.getUsername(),actualData.getObject().getUsername());
        assertEquals(object.getName(),actualData.getObject().getName());
        assertEquals(object.getSurname(),actualData.getObject().getSurname());
        assertEquals(object.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(object.getSsn(),actualData.getObject().getSsn());
        assertEquals(object.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(object.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(object.getGender(),actualData.getObject().getGender());
        assertEquals(object.getEmail(),actualData.getObject().getEmail());
        assertEquals(object.isAdvisorTeacher(),actualData.getObject().isAdvisorTeacher());
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());

    }
}

