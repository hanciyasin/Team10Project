package techproed.StepDefinitions.databaseStep_Def.US24;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import java.sql.*;

import techproed.StepDefinitions.ui_step_defs.US07_US24_StepDefinition.US07_StepDefinition;
import techproed.StepDefinitions.ui_step_defs.US07_US24_StepDefinition.US24_StepDefinition;
import techproed.pojos.US07_24.US24.PostTeacherSave.TeacherPostPojo;
import techproed.utilities.ConfigReader;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class AdminTeacherSaveStepDefDB {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    TeacherPostPojo payloadDb;
    Response response24;

    @Given("Database baglantisi kurulur.")
    public void databaseBaglantisiKurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");

    }

    @And("Teacher icin beklenen veriler duzenlenir")
    public void teacherIcinBeklenenVerilerDuzenlenir() {
        setUp(ConfigReader.getProperty("TeacherSaveAdmin"), ConfigReader.getProperty("TeacherSaveAdminPass"));
        spec.pathParams("first","teachers","second","save");
        payloadDb = new TeacherPostPojo("1986-04-06","Middle Earth",
                US07_StepDefinition.fakeEmail,
                "MALE",
                "true",
                Collections.singletonList("1398"),
                "Legolas",
                "Legolas12.",
                US07_StepDefinition.fakePhone,
                US07_StepDefinition.fakeSSN,
                "Gamgee",
                "LegoLas123");
        response24 = given(spec).body(payloadDb).when().post("{first}/{second}");
        response24.prettyPrint();
    }

    @When("Kayitli Teacher hesab bilgisini almak icin Query gonderilir")
    public void kayitliTeacherHesabBilgisiniAlmakIcinQueryGonderilir() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from teacher where username= 'LegoLas123'");

    }

    @Then("Kayitli Teacher bilgisi dogrulanir")
    public void kayitliTeacherBilgisiDogrulanir() throws SQLException {
        resultSet.next();
        Assert.assertEquals(payloadDb.getBirthDay(),
                resultSet.getString(2));
        Assert.assertEquals(payloadDb.getPhoneNumber(),resultSet.getString("phone_number"));
        Assert.assertEquals(payloadDb.getBirthPlace(),resultSet.getString("birth_place"));
        Assert.assertEquals(payloadDb.getSsn(),resultSet.getString("ssn"));
        Assert.assertEquals(payloadDb.getName(),resultSet.getString("name"));
        Assert.assertEquals(payloadDb.getSurname(),resultSet.getString("surname"));
        Assert.assertEquals(payloadDb.getEmail(),resultSet.getString("email"));
        Assert.assertEquals(payloadDb.getUsername(),resultSet.getString("username"));

    }

    @And("Database baglantisi kesilir.")
    public void databaseBaglantisiKesilir() throws SQLException {
        statement.close();
        connection.close();
    }
}
