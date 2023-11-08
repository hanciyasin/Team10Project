package techproed.StepDefinitions.api_step_definition.US04_05_16;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class DeanControlStepDef_API {
    @Given("Dean Save icin URL duzenlenir")
    public void deanSaveIcinURLDuzenlenir() {
    //https://managementonschools.com/app/dean/save
        spec.pathParams("first","dean","second","save");
    }

    @And("Dean Save icin payload duzenlenir")
    public void deanSaveIcinPayloadDuzenlenir() {
    /*
    {
  "birthDay": "1975-05-05",
  "birthPlace": "İstanbul",
  "gender": "FEMALE",
  "name": "pink",
  "password": "Dilek143",
  "phoneNumber": "465-676-7892",
  "ssn": "523-65-7746",
  "surname": "floyd",
  "username": "adminsemih"
}
     */

    }

    @When("Dean Save icin POST Request gonderilir ve Reponse alinir")
    public void deanSaveIcinPOSTRequestGonderilirVeReponseAlinir() {
    }

    @Then("Status kodun {int} oldugu dogrulanir")
    public void statusKodunOlduguDogrulanir(int arg0) {
    }

    @And("Dean Save icin gelen Response body dogrulanir")
    public void deanSaveIcinGelenResponseBodyDogrulanir() {
    }

    @Given("Kayitli Dean hesab bilgisinin ID nosu alinir")
    public void kayitliDeanHesabBilgisininIDNosuAlinir() {
    }

    @And("Dean GetManagerById icin URL duzenlenir")
    public void deanGetManagerByIdIcinURLDuzenlenir() {
    }

    @And("Dean GetManagerById icin beklenen veriler duzenlenir")
    public void deanGetManagerByIdIcinBeklenenVerilerDuzenlenir() {
    }

    @When("Dean GetManagerById icin GET Request gonderilir ve Response alinir")
    public void deanGetManagerByIdIcinGETRequestGonderilirVeResponseAlinir() {
    }

    @And("Dean GetManagerById icin gelen Response body dogrulanir")
    public void deanGetManagerByIdIcinGelenResponseBodyDogrulanir() {
    }
}
