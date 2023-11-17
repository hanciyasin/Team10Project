package techproed.StepDefinitions.api_step_definition.US21_22;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import techproed.pojos.US21_22.AdminPostPojo;
import techproed.pojos.US21_22.Response22Pojo;
import techproed.pojos.US21_22.ResponsePojo;

import java.util.HashMap;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class US22_StepDefinition {

    public static AdminPostPojo payLoad;
    Response response;
    public static Response22Pojo actualdata;
    public static Map<String,Object> expectedData;
//    public static GetResponsePojo getActualData;
    public static Map<String,Object> getActualData;
    public static int userID;

    @Given("Admin yetkisiyle giris yapilir")
    public void adminYetkisiyleGirisYapilir() {
        setUp("adminkutay","142536rR");
    }

    @And("Admin save icin URL düzenlenir")
    public void adminSaveIcinURLDüzenlenir() {
        //https://managementonschools.com/app/admin/save
        spec.pathParams("first","admin","second","save");
    }

    @And("Admin save icin payload düzenlenir")
    public void adminSaveIcinPayloadDüzenlenir() {
//        {
//          "birthDay": "1987-02-15",
//          "birthPlace": "Turkey",
//          "built_in": "true",
//          "gender": "FEMALE",
//          "name": "candan",
//          "password": "Candan1234",
//          "phoneNumber": "513-412-5548",
//          "ssn": "652-12-8194",
//          "surname": "zeki",
//          "username": "candan3374"
//        }

        payLoad = new AdminPostPojo("1987-02-15","Turkey","true","FEMALE","candan","Candan1234","513-412-5548","652-12-8194","zeki","candan3374");




    }

    @When("Admin save icin POST request gonderilir ve response alinir")
    public void adminSaveIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payLoad).when().post("{first}/{second}");
        actualdata = response.as(Response22Pojo.class);
        response.prettyPrint();
    }

    @Then("Status kodun {int} oldugu dogrulanirr")
    public void statusKodunOlduguDogrulanirr(int status) {
        Assert.assertEquals(200,response.statusCode());
    }

    @And("Admin save icin gelen response body dogrulanir")
    public void adminSaveIcinGelenResponseBodyDogrulanir() {
        Assert.assertEquals(payLoad.getBirthDay(),actualdata.getObject().getBirthDay());
        Assert.assertEquals(payLoad.getBirthPlace(),actualdata.getObject().getBirthPlace());
        Assert.assertEquals(payLoad.getName(),actualdata.getObject().getName());
        Assert.assertEquals(payLoad.getGender(),actualdata.getObject().getGender());
        Assert.assertEquals(payLoad.getSsn(),actualdata.getObject().getSsn());
        Assert.assertEquals(payLoad.getPhoneNumber(),actualdata.getObject().getPhoneNumber());
        Assert.assertEquals(payLoad.getUsername(),actualdata.getObject().getUsername());
        Assert.assertEquals(payLoad.getSurname(),actualdata.getObject().getSurname());
    }

    @Given("Kayitli admin hesap bilgisinin id numarasi alinir ve URL duzenlenir")
    public void kayitliAdminHesapBilgisininIdNumarasiAlinir() {
        //https://managementonschools.com/app/admin/getAll?page=0&size=1000&sort=name&type=desc
        spec.pathParams("first","admin","second","getAll")
                .queryParams("page","0","size","1000","sort","name","type","desc");

        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        userID = jsonPath.get("content.find{it.username =='candan3374'}.id");

        //JsonPath json2 = response.jsonPath();
        //        List<Integer> studNumberList = json2.getList("findAll{it.username=='Student10Team'}.studentNumber");
        //        StudNmbr = studNumberList.get(0);




    }

    @And("Admin get icin beklenen veriler duzenlenir")
    public void adminGetIcinBeklenenVerilerDuzenlenir() {
        JsonPath jsonPath = response.jsonPath();
//        int userID = jsonPath.get("content.find{it.username =='candan3374'}.id");
        String ssn = jsonPath.get("content.find{it.username =='candan3374'}.ssn");
        String username = jsonPath.get("content.find{it.username =='candan3374'}.username");
        String name = jsonPath.get("content.find{it.username =='candan3374'}.name");
        String surname = jsonPath.get("content.find{it.username =='candan3374'}.surname");
        String birthDay = jsonPath.get("content.find{it.username =='candan3374'}.birthDay");
        String birthPlace = jsonPath.get("content.find{it.username =='candan3374'}.birthPlace");
        String phoneNumber = jsonPath.get("content.find{it.username =='candan3374'}.phoneNumber");
        String gender = jsonPath.get("content.find{it.username =='candan3374'}.gender");


        getActualData = new HashMap<>();
        getActualData.put("username",username);
        getActualData.put("ssn",ssn);
        getActualData.put("name",name);
        getActualData.put("surname",surname);
        getActualData.put("birthDay",birthDay);
        getActualData.put("birthPlace",birthPlace);
        getActualData.put("phoneNumber",phoneNumber);
        getActualData.put("gender",gender);


        expectedData = new HashMap<>();
        expectedData.put("ssn","652-12-8194");
        expectedData.put("username","candan3374");
        expectedData.put("name","candan");
        expectedData.put("surname","zeki");
        expectedData.put("birthDay","1987-02-15");
        expectedData.put("phoneNumber","513-412-5548");
        expectedData.put("birthPlace","Turkey");
        expectedData.put("gender","FEMALE");

    }


    @And("Admin get icin gelen response body dogrulanir")
    public void adminGetIcinGelenResponseBodyDogrulanir() {
        Assert.assertEquals(expectedData.get("username"),getActualData.get("username"));
        Assert.assertEquals(expectedData.get("ssn"),getActualData.get("ssn"));
        Assert.assertEquals(expectedData.get("name"),getActualData.get("name"));
        Assert.assertEquals(expectedData.get("surname"),getActualData.get("surname"));
        Assert.assertEquals(expectedData.get("birthDay"),getActualData.get("birthDay"));
        Assert.assertEquals(expectedData.get("birthPlace"),getActualData.get("birthPlace"));
        Assert.assertEquals(expectedData.get("phoneNumber"),getActualData.get("phoneNumber"));
        Assert.assertEquals(expectedData.get("gender"),getActualData.get("gender"));
    }


    @Given("Admin DELETE icin URL duzenlenir")
    public void adminDELETEIcinURLDuzenlenir() {
        //https://managementonschools.com/app/admin/delete/98785
        spec.pathParams("first","admin","second","delete","third",userID);

    }

    @When("Admin DELETE icin DELETE Request gonderilir ve response alinir")
    public void adminDELETEIcinDELETERequestGonderilirVeResponseAlinir() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();


    }

    @And("Admin DELETE icin gelen response body dogrulanir")
    public void adminDELETEIcinGelenResponseBodyDogrulanir() {
        Assert.assertEquals("Admin deleted Successful",response.prettyPrint());
    }
}
