package techproed.StepDefinitions.databaseStep_Def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.sql.*;

public class US15DbStepDef {

    Connection connection;
    ResultSet resultset;

    @Given("Database'e bağlanır.")
    public void databaseEBağlanır() throws SQLException {
        Connection connection = DriverManager.
                getConnection("jdbc:postgresql://managementonschools.com:5432/school_management",
                        " select_user", "43w5ijfso");
    }

    @And("Aday öğrenci için sorgulama yapar.")
    public void adayÖğrenciIçinSorgulamaYapar() throws SQLException {
        Statement statament = connection.createStatement();
        resultset = statament.executeQuery("select * from student where username='Ak1234'");
    }

    @And("Aday öğrenci için doğrulama yapar.")
    public void adayÖğrenciIçinDoğrulamaYapar() throws SQLException {
        resultset.next();

    }
}
