package techproed.StepDefinitions.api_step_definition.US04_05_16;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US04_05_16.ViceDean.ContactGetAllGetResponse;
import techproed.pojos.US04_05_16.ViceDean.ContactGetAllPostPojo;
import techproed.pojos.US04_05_16.ViceDean.ContactGetResponsePojo;
import techproed.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.StepDefinitions.ui_step_defs.US04_05_16_StepDefinition.DeanBilgileriStepDef.faker;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class ContactGetAllAPI {

    public static ContactGetAllPostPojo expectedData;
    public static Response response;
    public static String emailContact;
    public static String emailPost;
    public static ContactGetResponsePojo actualdata;
    public static ContactGetAllGetResponse actualDataGet;

    @Given("Mesaj eklemek icin post request hazirligi yapilir")
    public void mesajEklemekIcinPostRequestHazirligiYapilir() {
        setUp(ConfigReader.getProperty("manSchoolAdmin"),ConfigReader.getProperty("manSchoolAdminPass"));
        spec.pathParams("first", "contactMessages", "second", "save");
    }

    @And("Gonderilecek mesaj bilgileri hazirlanir")
    public void gonderilecekMesajBilgileriHazirlanir() {
        emailContact=faker.internet().emailAddress();
        expectedData=new ContactGetAllPostPojo(emailContact, "happy holiday","jane", "holiday");
    }

    @When("Mesaj eklemek icin post request gonderilir")
    public void mesajEklemekIcinPostRequestGonderilir() {
        response=given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
        emailPost=response.jsonPath().getString("object.email");
        actualdata=response.as(ContactGetResponsePojo.class);
    }

    @Then("Mesaj bilgileri dogrulanir")
    public void mesajBilgileriDogrulanir() {
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getName(),actualdata.getObject().getName());
        assertEquals(expectedData.getEmail(),actualdata.getObject().getEmail());
        assertEquals(expectedData.getMessage(),actualdata.getObject().getMessage());
        assertEquals(expectedData.getSubject(),actualdata.getObject().getSubject());
    }

    @Given("Mesaj cagirmak icin get request hazirligi yapilir")
    public void mesajCagirmakIcinGetRequestHazirligiYapilir() {
        //https://managementonschools.com/app/contactMessages/searchByEmail?email=sdfds%40gmail.com&page=0&size=10&sort=date&type=desc
        setUp(ConfigReader.getProperty("manSchoolAdmin"),ConfigReader.getProperty("manSchoolAdminPass"));
        spec.pathParams("first", "contactMessages", "second", "searchByEmail").queryParam("email",emailPost);
    }

    @When("Mesaj eklemek icin get request gonderilir")
    public void mesajEklemekIcinGetRequestGonderilir() {
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        actualDataGet =response.as(ContactGetAllGetResponse.class);

    }

    @Then("Mesaj bilgileri dogrulanir\\(get)")
    public void mesajBilgileriDogrulanirGet() {
        assertEquals(200,response.statusCode());
        assertEquals("jane",actualDataGet.getContent().get(0).getName());
        assertEquals(emailContact,actualDataGet.getContent().get(0).getEmail());
        assertEquals("happy holiday",actualDataGet.getContent().get(0).getMessage());
        assertEquals("holiday",actualDataGet.getContent().get(0).getSubject());

    }
}
