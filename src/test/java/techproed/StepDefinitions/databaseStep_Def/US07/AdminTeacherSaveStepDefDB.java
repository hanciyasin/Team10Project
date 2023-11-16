package techproed.StepDefinitions.databaseStep_Def.US07;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US07_24.US24.PostTeacherSave.TeacherPostPojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminTeacherSaveStepDefDB {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    TeacherPostPojo payloadDb;
    Response response24;

    @Given("Database baglantisi kurulur.")
    public void databaseBaglantisiKurulur() {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");

    }

    @And("Teacher icin beklenen veriler duzenlenir")
    public void teacherIcinBeklenenVerilerDuzenlenir() {
    }

    @When("Kayitli Teacher hesab bilgisini almak icin Query gonderilir")
    public void kayitliTeacherHesabBilgisiniAlmakIcinQueryGonderilir() {
    }

    @Then("Kayitli Teacher bilgisi dogrulanir")
    public void kayitliTeacherBilgisiDogrulanir() {
    }

    @And("Database baglantisi kesilir.")
    public void databaseBaglantisiKesilir() {
    }
}