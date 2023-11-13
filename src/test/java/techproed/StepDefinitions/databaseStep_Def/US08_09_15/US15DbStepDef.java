package techproed.StepDefinitions.databaseStep_Def.US08_09_15;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static techproed.StepDefinitions.api_step_definition.US08_09_15StepDef.US15Pozitif.*;


public class US15DbStepDef {

    Connection connection;
    ResultSet resultset;

    @Given("Database'e bağlanır.")
    public void databaseEBağlanır() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }

    @And("Aday öğrenci için sorgulama yapar.")
    public void adayÖğrenciIçinSorgulamaYapar() throws SQLException {
        Statement statement = connection.createStatement();
        resultset = statement.executeQuery("select * from student where username='Student10Team'");
    }

    @And("Aday öğrenci için doğrulama yapar.")
    public void adayÖğrenciIçinDoğrulamaYapar() throws SQLException {
        resultset.next();
        assertEquals(0,resultset.getInt("gender"));
        assertEquals(object.getUsername(),resultset.getString("username"));
        assertEquals(object.getName(),resultset.getString("name"));
        assertEquals(object.getSsn(),resultset.getString("ssn"));
        assertEquals(object.getSurname(),resultset.getString("surname"));
        assertEquals(object.getEmail(),resultset.getString("email"));
        assertEquals(object.getFatherName(),resultset.getString("father_name"));
        assertEquals(object.getMotherName(),resultset.getString("mother_name"));
        assertEquals(object.getPhoneNumber(),resultset.getString("phone_number"));
        assertEquals(object.getBirthDay(),resultset.getString("birth_day"));
        assertEquals(object.getBirthPlace(),resultset.getString("birth_place"));


    }
}
