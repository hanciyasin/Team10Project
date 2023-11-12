package techproed.StepDefinitions.api_step_definition.US12_25;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US12_25.US_25.StudentGetResponse;
import techproed.pojos.US12_25.US_25.StudentPost;
import techproed.pojos.US12_25.US_25.StudentPostResponse;
import techproed.utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US_25 {
    StudentPost expectedData;
    Response response;
    public static StudentPostResponse actualData;
    public static StudentGetResponse actualDataGet;
    Faker faker = new Faker();
    String email;
    String phoneNumber;
    String ssn;
    String username;
    private static int idStudent;
    @Given("Admin olarak Studen eklemek icin post request hazirligi yapilir")
    public void admin_olarak_studen_eklemek_icin_post_request_hazirligi_yapilir() {
        setUp("AdminBatch171", "Batch171+");
        spec.pathParams("first", "students", "second", "save");
    }
    @Given("Gonderilecek studen bilgileri hazirlanir")
    public void gonderilecek_studen_bilgileri_hazirlanir() {
        email = faker.internet().emailAddress();
        phoneNumber = ReusableMethods.randomPhone();
        ssn = ReusableMethods.randomSsn();
        username = faker.name().firstName();
        expectedData = new StudentPost(11, "1999-05-28", "Ankara", email, "Ali", "MALE", "Ayse", "Rana", "RanaTeam15", phoneNumber, ssn, "Turkmen", username);

    }
    @When("Student eklemek icin post request gonderilir")
    public void student_eklemek_icin_post_request_gonderilir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
        idStudent = response.jsonPath().getInt("object.id");
        System.out.println(idStudent);
        actualData = response.as(StudentPostResponse.class);

    }

    @When("Kayitli Student id ile cagirilir")
    public void kayitli_student_id_ile_cagirilir() {
        setUp("AdminBatch171", "Batch171+");
        spec.pathParams("first", "students", "second", "getStudentById").queryParam("id", idStudent);
        Response response1 = given(spec).when().get("{first}/{second}");
        response1.prettyPrint();
        actualDataGet = response1.as(StudentGetResponse.class);
    }

    @Then("Student bilgileri dogrulanir\\(get)")
    public void studentBilgileriDogrulanirGet() {
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getBirthDay(), actualDataGet.getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualDataGet.getBirthPlace());
        assertEquals(expectedData.getEmail(), actualDataGet.getEmail());
        assertEquals(expectedData.getMotherName(), actualDataGet.getMotherName());
        assertEquals(expectedData.getFatherName(), actualDataGet.getFatherName());
        assertEquals(expectedData.getGender(), actualDataGet.getGender());
        assertEquals(expectedData.getName(), actualDataGet.getName());
        assertEquals(expectedData.getPhoneNumber(), actualDataGet.getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualDataGet.getSsn());
        assertEquals(expectedData.getSurname(), actualDataGet.getSurname());
        assertEquals(expectedData.getUsername(), actualDataGet.getUsername());
    }


    /*-----------------------------------------------*/

    @Given("Studen eklemek icin delete request hazirligi yapilir")
    public void studenEklemekIcinDeleteRequestHazirligiYapilir() {
        setUp("AdminBatch171", "Batch171+");
        spec.pathParams("first", "students", "second", "delete", "third", idStudent);
    }

    @When("Student eklemek icin delete request gonderilir")
    public void studentEklemekIcinDeleteRequestGonderilir() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("Student bilgileri dogrulanir\\(delete)")
    public void studentBilgileriDogrulanirDelete() {
        String expectedData = "Student Deleted";
        assertEquals(200, response.statusCode());
        assertEquals(expectedData, response.jsonPath().getString("message"));
    }

}
