package techproed.StepDefinitions.api_step_definition.US08_09_15StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.US08_09_15.US15Pojo.*;

import techproed.utilities.ConfigReader;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US15Pozitif {

    public static US15_ResponsePojo expectedData;
    public static US15_PozitifPojo payload15;

    Response response;
    US15_ResponsePojo actualData;
    Response15Pojo actualData2;
    public static int studentidUS15;
    public static US15_ObjectPojo object;

    public static int StudId15;
    public static int StudNmbr;



    @Given("Student eklemek icin Post request hazirligi yapilir")
    public void studentEklemekIcinPostRequestHazirligiYapilir() {
        //https://managementonschools.com/app/students/save
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first","students","second","save");


    }

    @And("Gonderilecek student bilgileri hazirlanir")
    public void gonderilecekStudentBilgileriHazirlanir() {
        payload15 = new US15_PozitifPojo("1250","1992-10-12","Istanbul","merhaba@gmail.com","Ali","MALE","Fatma","StudentTeamOn","Team10Stu","234-333-5698","456-55-4398","TeamOn","Student10Team");

    }

    @When("Student eklemek icin Post request gonderilir")
    public void studentEklemekIcinPostRequestGonderilir() {
        response = given(spec).body(payload15).when().post("{first}/{second}");
        response.prettyPrint();
        studentidUS15=  response.jsonPath().getInt("object.id");
        System.out.println("id : " + studentidUS15);
        actualData = response.as(US15_ResponsePojo.class);
    }

    @Then("Student bilgileri dogrulanir")
    public void studentBilgileriDogrulanir() {
        assertEquals(200,response.statusCode());
        assertEquals(payload15.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload15.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload15.getGender(), actualData.getObject().getGender());
        assertEquals(payload15.getName(), actualData.getObject().getName());
        assertEquals(payload15.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload15.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload15.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload15.getUsername(), actualData.getObject().getUsername());

        assertEquals("Student saved Successfully",actualData.getMessage());
    }


    @Given("kayitli student bilgisinden id alınır")
    public void kayitliStudentBilgisindenIdAlınır() {
        //https://managementonschools.com/app/students/getAll
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first","students","second","getAll");
        response = given(spec).when().get("{first}/{second}");

        //JsonPath json = response.jsonPath();
        //List<Integer> studIdList = json.getList("findAll{it.username=='Student10Team'}.id");
        // StudId15 = studIdList.get(0);
        //System.out.println(StudId15);
        JsonPath json2 = response.jsonPath();
        List<Integer> studNumberList = json2.getList("findAll{it.username=='Student10Team'}.studentNumber");
        StudNmbr = studNumberList.get(0);
    }

    @And("getStudentById icin URL duzenlenir")
    public void getstudentbyıdIcinURLDuzenlenir() {
        //https://managementonschools.com/app/students/getStudentById?id=2222
        //setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first","students","second","getStudentById").queryParam("id",studentidUS15);

    }

    @And("getStudentById icin beklenen veriler duzenlenir")
    public void getstudentbyıdIcinBeklenenVerilerDuzenlenir() {
        object = new US15_ObjectPojo(studentidUS15,"Student10Team","456-55-4398","StudentTeamOn","TeamOn","1992-10-12","Istanbul",
                "234-333-5698","MALE","Fatma","Ali",StudNmbr,1250,"suat","özgültekin",
                "misnoku@gmail.com","merhaba@gmail.com",false);
        expectedData = new US15_ResponsePojo(object, "Student saved Successfully");
    }

    @When("getStudentById icin GET Request gonderilir ve Response alinir")
    public void getstudentbyıdIcinGETRequestGonderilirVeResponseAlinir() {

        response = given(spec).when().get("{first}/{second}");
        actualData2 = response.as(Response15Pojo.class);
        response.prettyPrint();
    }
    @And("getStudentById icin gelen Response body dogrulanir")
    public void getstudentbyıdIcinGelenResponseBodyDogrulanir() {
        assertEquals(object.getUsername(), actualData2.getUsername());
        assertEquals(object.getEmail(), actualData2.getEmail());
        assertEquals(object.getSsn(), actualData2.getSsn());
        assertEquals(object.getName(), actualData2.getName());
        assertEquals(object.getPhoneNumber(), actualData2.getPhoneNumber());
        assertEquals(object.getSurname(), actualData2.getSurname());
        assertEquals(object.getBirthDay(), actualData2.getBirthDay());
        assertEquals(object.getAdvisorTeacherId(), actualData2.getAdvisorTeacherId());
        assertEquals(object.getFatherName(), actualData2.getFatherName());
    }

    @When("Student delete")
    public void student_Delete() {
        //https://managementonschools.com/app/students/delete/id
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first","students","second","delete","third",studentidUS15);
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
        String expectedData = "Student Deleted";
        assertEquals(expectedData,response.jsonPath().getString("message"));

    }


}
