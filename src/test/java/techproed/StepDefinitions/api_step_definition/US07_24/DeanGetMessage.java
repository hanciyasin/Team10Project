package techproed.StepDefinitions.api_step_definition.US07_24;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import techproed.pojos.US04_05_16.ViceDean.ContactGetAllGetResponse;
import techproed.pojos.US07_24.US07.GetMessageSearchByEmail.ResponsePojoGetMessageSearchByEamilPojo;
import techproed.pojos.US07_24.US07.PostMessage.PostMesssagePojo;
import techproed.pojos.US07_24.US07.PostMessage.ResponsePojoPostMessagePojo;
import techproed.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class DeanGetMessage {

    public static PostMesssagePojo expectedData;
    public static Response response;
    public static ResponsePojoPostMessagePojo actualData;
    public static ResponsePojoGetMessageSearchByEamilPojo actualDataGet;



    @Given("Mesaj eklemek icin post request hazirlanir")
    public void mesajEklemekIcinPostRequestHazirlanir() {
        setUp(ConfigReader.getProperty("DeanMessageUser"),ConfigReader.getProperty("DeanMessagePass"));
        spec.pathParams("first","contactMessages","second","save");
    }

    @And("Gonderilecek mesaj bilgileri girilir")
    public void gonderilecekMesajBilgileriGirilir() {
        expectedData = new PostMesssagePojo(
                "samgam@gmail.com",
                "Bazen kendi sonunu bile bilmek istemezsin ya, hani nasıl iyi olacak diye inanamazsın. Bu kadar kötülük olduktan sonra dünya nasıl eski haline dönecek? Ama sonuç olarak bu geçici bir şey, bu gölge yani. Karanlık bile bitmeli hep.",
                "Samwise",
                "Bakis Acisi");
    }

    @When("Mesaj eklemek icin post request yollanir")
    public void mesajEklemekIcinPostRequestYollanir() {
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
        actualData= response.as(ResponsePojoPostMessagePojo.class);
    }

    @Then("Mesaj bilgileri kontrol edilir")
    public void mesajBilgileriKontrolEdilir() {
        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(expectedData.getMessage(),actualData.getMessage());
        Assert.assertEquals(expectedData.getName(),actualData.getObject().getName());
        Assert.assertEquals(expectedData.getEmail(),actualData.getObject().getEmail());
        Assert.assertEquals(expectedData.getSubject(),actualData.getObject().getSubject());
    }

    @Given("Mesaj cagirmak icin get request hazirlanir")
    public void mesajCagirmakIcinGetRequestHazirlanir() {
        setUp(ConfigReader.getProperty("DeanMessageUser"),ConfigReader.getProperty("DeanMessagePass"));
        spec.pathParams("first","contactMessages","second","searchByEmail");

    }

    @When("Mesaj eklemek icin get request yollanir")
    public void mesajEklemekIcinGetRequestYollanir() {
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        actualDataGet =response.as(ResponsePojoGetMessageSearchByEamilPojo.class);
    }

    @Then("Mesaj infosu kontrol edilir")
    public void mesajInfosuKontrolEdilir() {
    }
}
