package techproed.StepDefinitions.databaseStep_Def.US08_09_15;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import techproed.utilities.JDBC_utils;

import java.sql.*;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static techproed.StepDefinitions.api_step_definition.US08_09_15StepDef.US15Pozitif.payload15;


public class US15DbStepDef {
    Statement statement;
    Connection connection;
    ResultSet resultset;
 String expectName = "Student10Team";
    @Given("Database'e bağlanır.")
    public void databaseEBağlanır() throws SQLException {
        connection= JDBC_utils.connectToDatabase();
        //connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }

    @And("Aday ogrenci icin sorgulama yapar.")
    public void adayOgrenciIcinSorgulamaYapar() throws SQLException {
        statement = connection.createStatement();
        resultset = statement.executeQuery("select * from student where username='Student10Team'");

    }
    @And("Aday ogrenci icin doğrulama yapar.")
    public void adayOgrenciIcinDoğrulamaYapar() throws SQLException {
        resultset.next();
        assertEquals(payload15.getBirthDay(), resultset.getString("birth_day"));
        assertEquals(payload15.getBirthPlace(), resultset.getString("birth_place"));
        assertEquals(0, resultset.getInt("gender"));
        assertEquals(payload15.getName(), resultset.getString("name"));
        assertEquals(payload15.getSsn(), resultset.getString("ssn"));
        assertEquals(payload15.getPhoneNumber(), resultset.getString("phone_number"));
        assertEquals(payload15.getSurname(), resultset.getString("surname"));
        assertEquals(payload15.getUsername(), resultset.getString("username"));


    }
}
