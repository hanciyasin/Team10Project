package techproed.StepDefinitions.ui_step_defs.US13_US14_StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.US04_05_16.ViceDeanManagementPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US14ViceDeanSeeCreatedTeacher {
    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
    Faker faker = new Faker();
    String NameBox;
    String SurnameBox;
    Select select;

    @Given("Go to Web")
    public void goToWeb() {
        Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));

    }
    @Then("Click on Login")
    public void clickOnLogin() {
        viceDeanManagementPage.Login01.click();

    }

    @Then("Enter user name and password")
    public void enterUserNameAndPassword() {
        viceDeanManagementPage.UserNameBox.sendKeys(ConfigReader.getProperty("VDUserName"));
        viceDeanManagementPage.PasswordBox.sendKeys(ConfigReader.getProperty("VDPassword"));

        
    }

    @And("Click on Login{int}")
    public void clickOnLogin(int arg0) {
        ReusableMethods.click(viceDeanManagementPage.Login02);
    }

    @And("Click on menu button")
    public void clickOnTeacherManagement() {
        viceDeanManagementPage.MenuButton.click();
        
    }

    @And("Click on Teacher Management")
    public void clickOnTeacherList() {
        ReusableMethods.click(viceDeanManagementPage.TeacherManagementButton);
        ReusableMethods.bekle(1);
        ReusableMethods.scrollDownJs();
        
    }


    @Then("Confirm able to see  created teacher on teacher list")
    public void confirmAbleToSeeCreatedTeacherOnTeacherList() {
    }



}
