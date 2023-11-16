package techproed.StepDefinitions.ui_step_defs.US04_05_16_StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import techproed.pages.US04_05_16.SchoolHomePage;
import techproed.pages.US04_05_16.ViceDeanManagementPage;
import static org.junit.Assert.assertTrue;

public class ViceDeanBilgiStepDef {

    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
    SchoolHomePage schoolHomePage = new SchoolHomePage();

    @And("Main menuden Contact Get All secilir")
    public void mainMenudenContactGetAllSecilir() {
        viceDeanManagementPage.viceDeanContactDd.click();
    }

    @Then("email bilgisi gorunur")
    public void emailBilgisiGorunur() {
       assertTrue(viceDeanManagementPage.viceDeanContactMessEmailDd.isDisplayed());
    }

    @Then("date bilgisi gorunur")
    public void dateBilgisiGorunur() {
        assertTrue(viceDeanManagementPage.viceDeanContactMessDateDd.isDisplayed());
    }

    @Then("subject bilgisi gorunur")
    public void subjectBilgisiGorunur() {
        assertTrue(viceDeanManagementPage.viceDeanContactMessSubjectDd.isDisplayed());
    }
    @Then("message bilgisi gorunur")
    public void messageBilgisiGorunur() {
        assertTrue(viceDeanManagementPage.viceDeanContactMessMessageDd.isDisplayed());
    }
/*
//
 */
}
