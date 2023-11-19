package techproed.StepDefinitions.databaseStep_Def.US01_02;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import techproed.pojos.us01_us02.ObjectPojo;
import techproed.pojos.us01_us02.RegisterPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class Guestuser_DB {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    Object object;
    RegisterPojo register;
    Response response;
    @Given("DATABASE  bağlanılır")
    public void databaseBağlanılır() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }


    @And("aday öğrenci  için  sorgulama  yapar")
    public void adayÖğrenciIçinSorgulamaYapar() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from dean where username='misnoku'");
    }

    @And("aday  öğrenci  için  doğrulama  yapar")
    public void adayÖğrenciIçinDoğrulamaYapar() throws SQLException {

        resultSet.next();
        assertEquals(RegisterPojo.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(RegisterPojo.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(1, resultSet.getInt("gender"));
        assertEquals(RegisterPojo.getName(), resultSet.getString("name"));
        assertEquals(RegisterPojo.getSsn(), resultSet.getString("ssn"));
        assertEquals(RegisterPojo.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(RegisterPojo.getSurname(), resultSet.getString("surname"));
        assertEquals(RegisterPojo.getUsername(), resultSet.getString("username"));
    }




    }



