package techproed.StepDefinitions.api_step_definition.US_03_10_11;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import techproed.pojos.US03_10_11.US03Pojo.ContactPostPojo;
import techproed.pojos.US03_10_11.US03Pojo.ResponsePojo_US_03;
import techproed.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;


public class US_03_API {
    static ContactPostPojo expectedData;
    static Response response;
    static ResponsePojo_US_03 actualData;

    @Given("Contact Message icin Url hazirlanir")
    public void contactMessageIcinUrlHazirlanir() {
        spec.pathParams("first", "contactMessages", "second", "save");
    }

    @Then("Contact Message icin payload olusturulur {string} {string} {string} {string}")
    public void contactMessageIcinPayloadOlusturulur(String email, String message, String name, String subject) {
        expectedData = new ContactPostPojo("contact@gmail.com", "My_Message@1", "Fahri","Dersler");
    }

    @When("Contact Message icin Post request gonderilir")
    public void contactMessageIcinPostRequestGonderilir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
    }

    @And("Gelen response ile dogrulama yapilir")
    public void gelenResponseIleDogrulamaYapilir() {
        actualData = response.as(ResponsePojo_US_03.class);
        assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
        assertEquals(expectedData.getMessage(), actualData.getObject().getMessage());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getSubject(), actualData.getObject().getSubject());
        assertEquals("Contact Message Created Successfully", actualData.getMessage());
    }



    /*
    host: managementonschools.com
    port: 5432
    database name: school_management
    user: select_user
    password: 43w5ijfso
    */
}
