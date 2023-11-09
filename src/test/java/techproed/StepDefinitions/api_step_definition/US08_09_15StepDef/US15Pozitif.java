package techproed.StepDefinitions.api_step_definition.US08_09_15StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US08_09_15.US15Pojo.pozitif.DeletePojo;
import techproed.pojos.US08_09_15.US15Pojo.pozitif.US15_PozitifPojo;
import techproed.pojos.US08_09_15.US15Pojo.pozitif.US15_ResponsePojo;
import techproed.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US15Pozitif {

    US15_PozitifPojo expectedData;
    Response response;
    Response response2;
    US15_ResponsePojo actualData;
    DeletePojo actualData2;
    public static int studentidUS15;


    @Given("Student eklemek icin Post request hazirligi yapilir")
    public void studentEklemekIcinPostRequestHazirligiYapilir() {
        //https://managementonschools.com/app/students/save
        setUp(ConfigReader.getProperty("VDUserName"),ConfigReader.getProperty("VDPassword"));
        spec.pathParams("first","students","second","save");


    }

    @And("Gonderilecek student bilgileri hazirlanir")
    public void gonderilecekStudentBilgileriHazirlanir() {
        expectedData = new US15_PozitifPojo(1250,"1992-10-12","Istanbul","merhaba@gmail.com","Ali","MALE","Fatma","StudentTeamOn","Team10Stu","234-333-5698","456-55-4398","TeamOn","Student10Team");

    }

    @When("Student eklemek icin Post request gonderilir")
    public void studentEklemekIcinPostRequestGonderilir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
        studentidUS15=  response.jsonPath().getInt("object.id");
        System.out.println("id : " + studentidUS15);
        actualData = response.as(US15_ResponsePojo.class);
    }

    @Then("Student bilgileri dogrulanir")
    public void studentBilgileriDogrulanir() {
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getAdvisorTeacherId(),actualData.getObject().getAdvisorTeacherId());
        assertEquals(expectedData.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getEmail(),actualData.getObject().getEmail());
        assertEquals(expectedData.getFatherName(),actualData.getObject().getFatherName());
        assertEquals(expectedData.getGender(),actualData.getObject().getGender());
        assertEquals(expectedData.getMotherName(),actualData.getObject().getMotherName());
        assertEquals(expectedData.getName(),actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(),actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());

        assertEquals("Student saved Successfully",actualData.getMessage());
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
