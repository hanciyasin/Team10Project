package techproed.StepDefinitions.api_step_definition.US08_09_15StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US08_09_15.US15Pojo.negatif.NegatifPojoUS15;
import techproed.pojos.US08_09_15.US15Pojo.pozitif.US15_PozitifPojo;
import techproed.pojos.US08_09_15.US15Pojo.pozitif.US15_ResponsePojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US15_Negatif {

    US15_PozitifPojo expectedData;
    Response response;
    NegatifPojoUS15 actualData;

    @And("Student bilgileri girilmez.")
    public void studentBilgileriGirilmez() {
        expectedData = new US15_PozitifPojo(0,"","","","","MALE","","","","","","","");

    }

    @When("Eksik bilgilerle Post request gonderilir")
    public void eksikBilgilerlePostRequestGonderilir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        actualData = response.as(NegatifPojoUS15.class);
    }

    @Then("Eksik Student bilgileri dogrulanir")
    public void eksikStudentBilgileriDogrulanir() {

        assertEquals(400,response.statusCode());
        assertNotEquals(expectedData.getBirthDay(),actualData.getValidations().getBirthDay());
        assertNotEquals(expectedData.getFatherName(),actualData.getValidations().getFatherName());
        assertNotEquals(expectedData.getBirthPlace(),actualData.getValidations().getBirthPlace());
        assertNotEquals(expectedData.getPassword(),actualData.getValidations().getPassword());
        assertNotEquals(expectedData.getPhoneNumber(),actualData.getValidations().getPhoneNumber());
        assertNotEquals(expectedData.getAdvisorTeacherId(),actualData.getValidations().getAdvisorTeacherId());
        assertNotEquals(expectedData.getSurname(),actualData.getValidations().getSurname());
        assertNotEquals(expectedData.getMotherName(),actualData.getValidations().getMotherName());
        assertNotEquals(expectedData.getName(),actualData.getValidations().getName());
        assertNotEquals(expectedData.getEmail(),actualData.getValidations().getEmail());
        assertNotEquals(expectedData.getUsername(),actualData.getValidations().getUsername());
        assertNotEquals(expectedData.getSsn(),actualData.getValidations().getSsn());
    }
}
