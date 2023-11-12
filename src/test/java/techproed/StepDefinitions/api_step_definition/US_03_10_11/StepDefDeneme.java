package techproed.StepDefinitions.api_step_definition.US_03_10_11;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US03_10_11.US03Pojo.ContactPostPojo;
import techproed.pojos.US03_10_11.US03Pojo.ResponsePojo_US_03;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class StepDefDeneme {
    static ContactPostPojo expectedData;
    static Response response;
    static ResponsePojo_US_03 actualData;
    @Given("Given{int} ile url")
    public void givenIleUrl(int arg0) {
        spec.pathParams("first", "contactMessages", "second", "save");
    }

    @Then("Then payload {string} {string} {string} {string}")
    public void thenPayload(String email, String message, String name, String subject) {
        expectedData = new ContactPostPojo(email, message, name, subject);
    }

    @When("When{int} post")
    public void whenPost(int arg0) {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
    }

    @And("And{int} ile kontrol")
    public void andIleKontrol(int arg0) {
        actualData = response.as(ResponsePojo_US_03.class);
        assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
        assertEquals(expectedData.getMessage(), actualData.getObject().getMessage());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getSubject(), actualData.getObject().getSubject());
        assertEquals("Contact Message Created Successfully", actualData.getMessage());
        assertEquals("CREATED", actualData.getHttpStatus());
    }
}
