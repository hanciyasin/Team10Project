package techproed.StepDefinitions.api_step_definition.US04_05_16;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.US04_05_16.DeanPostPojo;
import techproed.pojos.US04_05_16.ObjectPojo;
import techproed.pojos.US04_05_16.Put_Dean.PutDeanPojo;
import techproed.pojos.US04_05_16.Put_Dean.PutResponsePojo;
import techproed.pojos.US04_05_16.ResponsePojo;
import techproed.utilities.ConfigReader;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.StepDefinitions.ui_step_defs.US04_05_16_StepDefinition.DeanBilgileriStepDef.*;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class DeanManagementAPI {

    public static  DeanPostPojo payload;
    public static Response response;
    public static ResponsePojo actualData;
    public static int userId;
    public static ObjectPojo object;
    public static ResponsePojo expectedData;
    public static PutDeanPojo expectedDataPut;
    public static PutResponsePojo actualDataPut;


    @Given("Dean Save icin URL duzenlenir")
    public void deanSaveIcinURLDuzenlenir() {
        setUp(ConfigReader.getProperty("manSchoolAdmin"),ConfigReader.getProperty("manSchoolAdminPass"));
        spec.pathParams("first","dean","second","save");
    }

    @And("Dean Save icin payload duzenlenir")
    public void deanSaveIcinPayloadDuzenlenir() {
      payload = new DeanPostPojo("1975-05-05", fakeBirtPlace,"MALE",fakeName,
              "Dilek143",fakePhone,fakeSSN,fakeSurName,"adminsemih" );
    }



    @When("Dean Save icin POST Request gonderilir ve Reponse alinir")
    public void deanSaveIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(ResponsePojo.class);
    }

    @Then("Status kodun {int} oldugu dogrulanir")
    public void statusKodunOlduguDogrulanir(int statuscode) {
        assertEquals(statuscode,response.statusCode());
    }

    @And("Dean Save icin gelen Response body dogrulanir")
    public void deanSaveIcinGelenResponseBodyDogrulanir() {
        assertEquals(payload.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(),actualData.getObject().getGender());
        assertEquals(payload.getName(),actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(),actualData.getObject().getSsn());
        assertEquals(payload.getSurname(),actualData.getObject().getSurname());
        assertEquals(payload.getUsername(),actualData.getObject().getUsername());
    }

    @Given("Kayitli Dean hesab bilgisinin ID nosu alinir")
    public void kayitliDeanHesabBilgisininIDNosuAlinir() {
        spec.pathParams("first","dean","second","getAll");
        response =  given(spec).when().get("{first}/{second}");

        JsonPath json = response.jsonPath();
        List<Integer> userIdlist = json.getList("findAll{it.username=='adminsemih'}.userId");
        userId = userIdlist.get(0);
    }

    @And("Dean GetManagerById icin URL duzenlenir")
    public void deanGetManagerByIdIcinURLDuzenlenir() {
       //https://managementonschools.com/app/dean/getManagerById/1
        spec.pathParams("first","dean","second","getManagerById","third",userId);
    }

    @And("Dean GetManagerById icin beklenen veriler duzenlenir")
    public void deanGetManagerByIdIcinBeklenenVerilerDuzenlenir() {
        object = new ObjectPojo(userId,"adminsemih",fakeName,fakeSurName,"1975-05-05",fakeSSN,fakeBirtPlace,fakePhone,"MALE");
        expectedData = new ResponsePojo(object,"Dean successfully found","OK");
    }

    @When("Dean GetManagerById icin GET Request gonderilir ve Response alinir")
    public void deanGetManagerByIdIcinGETRequestGonderilirVeResponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
        actualData = response.as(ResponsePojo.class);
    }

    @And("Dean GetManagerById icin gelen Response body dogrulanir")
    public void deanGetManagerByIdIcinGelenResponseBodyDogrulanir() {
        assertEquals(object.getUserId(), actualData.getObject().getUserId());
        assertEquals(object.getUsername(), actualData.getObject().getUsername());
        assertEquals(object.getName(), actualData.getObject().getName());
        assertEquals(object.getSurname(), actualData.getObject().getSurname());
        assertEquals(object.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(object.getSsn(), actualData.getObject().getSsn());
        assertEquals(object.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(object.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(object.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());
    }

    @Given("Kayitli Dean hesabi icin put request hazirligi yapilir")
    public void kayitliDeanHesabiIcinPutRequestHazirligiYapilir() {
       //https://managementonschools.com/app/dean/update/1
        spec.pathParams("first","dean","second","update","third",userId);
    }

    @And("Update edilecek dean bilgileri hazirlanir")
    public void updateEdilecekDeanBilgileriHazirlanir() {
        expectedDataPut = new PutDeanPojo("1992-08-14","zonguldak","FEMALE"
                ,"dilek","Dilek143","465-676-9292","523-34-8765","ak","dilekadmn");
    }

    @When("Kayitli Dean id ile editlenir")
    public void kayitliDeanIdIleEditlenir() {
      response =  given(spec).body(expectedDataPut).when().put("{first}/{second}/{third}");
      actualDataPut =response.as(PutResponsePojo.class);
    }

    @Then("Guncel Dean bilgileri dogrulanir")
    public void guncelDeanBilgileriDogrulanir() {
        assertEquals(expectedDataPut.getBirthDay(),actualDataPut.getObject().getBirthDay());
        assertEquals(expectedDataPut.getGender(),actualDataPut.getObject().getGender());
        assertEquals(expectedDataPut.getName(),actualDataPut.getObject().getName());
        assertEquals(expectedDataPut.getSsn(),actualDataPut.getObject().getSsn());
        assertEquals(expectedDataPut.getPhoneNumber(),actualDataPut.getObject().getPhoneNumber());
        assertEquals(expectedDataPut.getSurname(),actualDataPut.getObject().getSurname());
        assertEquals(expectedDataPut.getBirthPlace(),actualDataPut.getObject().getBirthPlace());
        assertEquals(expectedDataPut.getUsername(),actualDataPut.getObject().getUsername());
    }

    @Given("Kayitli Dean hesabi icin delete request hazirligi yapilir")
    public void kayitliDeanHesabiIcinDeleteRequestHazirligiYapilir() {
        //https://managementonschools.com/app/dean/delete/1
        spec.pathParams("first","dean","second","delete","third",userId);
    }

    @When("Kayitli Dean hesabi silinir")
    public void kayitliDeanHesabiSilinir() {
        response = given(spec).when().delete("{first}/{second}/{third}");
    }

    @Then("Dean hesabi silindigi dogrulanir")
    public void deanHesabiSilindigiDogrulanir() {
        String expectedData = "Dean Deleted";
        assertEquals(expectedData,response.jsonPath().getString("message"));
    }
}
