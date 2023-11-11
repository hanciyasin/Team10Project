package techproed.StepDefinitions.api_step_definition.US17_18_19_20;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.pojos.US04_05_16.ResponsePojo;
import techproed.pojos.US17_18_19_20.*;
import techproed.utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsBaseUrl.setUp;
import static techproed.base_url.ManagementonSchoolsBaseUrl.spec;

public class Student_Info_Management {

    SaveStudentInfoSavePojo payload;

    Response response;

    SaveResponsePojo actualData;



    private static int userId;

    GetStudentResponsePojo g1;

    GetResponsePojo g2;

    GetResponsePojo actualData2;



    @Given("Not verme icin URL duzenlenir")
    public void notVermeIcinURLDuzenlenir() {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/save
        spec.pathParams("first","studentInfo","second","save");
    }

    @And("Not verme icin payload duzenlenir")
    public void notVermeIcinPayloadDuzenlenir() {
        payload = new SaveStudentInfoSavePojo(5,15,85,"Basarilidir",1864,75,2046);

    }

    @When("Not verme icin POST Request gonderilir ve Reponse alinir")
    public void notVermeIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(SaveResponsePojo.class);

        userId = actualData.getObject().getId();
        System.out.println(userId);

        System.out.println(response.statusCode());


    }

    @And("Not verme icin gelen Response body dogrulanir")
    public void notVermeIcinGelenResponseBodyDogrulanir() {
        assertEquals(payload.getAbsentee(),actualData.getObject().getAbsentee());
        assertEquals(payload.getEducationTermId(),actualData.getObject().getEducationTermId());
        assertEquals(payload.getFinalExam(),actualData.getObject().getFinalExam());
        assertEquals(payload.getInfoNote(),actualData.getObject().getInfoNote());
        assertEquals(payload.getLessonId(),actualData.getObject().getLessonId());
        assertEquals(payload.getMidtermExam(),actualData.getObject().getMidtermExam());
        assertEquals(payload.getStudentId(),actualData.getObject().getStudentResponse().getUserId());

    }


    @And("GetByStudentId icin URL duzenlenir")
    public void getbystudentıdIcinURLDuzenlenir() {


    }



    @Given("StudentInfoGetID icin URL duzenlenir")
    public void verilenNotlariGetirmekIcinURLDuzenlenir() {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/get/1
        spec.pathParams("first","studentInfo","second","get","third",userId);
    }

    @And("StudentInfoGetID icin beklenen veriler olusturulur")
    public void studentınfogetıdIcinBeklenenVerilerOlusturulur() {
            g1 = new GetStudentResponsePojo(2046,"harryPotter","Harry","Potter","1991-03-07","New York","333-665-9854",
                    "MALE",1216,"Lilly", "James","harry.potter@hogwarts.edu.usa",true);

            g2 = new GetResponsePojo(userId,75.0,85.0,5,"Basarilidir","Criminology",1864,6,15,81.0,g1,true,"BA");
    }

    @When("StudentInfoGetID icin POST Request gonderilir ve Reponse alinir")
    public void studentınfogetıdIcinPOSTRequestGonderilirVeReponseAlinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
        actualData2 = response.as(GetResponsePojo.class);

    }

    @And("Verilen notlarin goruldugu dogrulanir")
    public void verilenNotlarinGorulduguDogrulanir() {
        assertEquals(g2.getFinalExam(),actualData2.getFinalExam());
        assertEquals(g2.getMidtermExam(),actualData2.getMidtermExam());
    }


    @Given("Not guncelleme icin URL düzenlenir")
    public void notGuncellemeIcinURLDüzenlenir() {
        setUp(ConfigReader.getProperty("glcnTeacherName"),ConfigReader.getProperty("glcnTeacherSifre"));
        //https://managementonschools.com/app/studentInfo/update/1
        spec.pathParams("first","studentInfo","second","update","third",userId);

    }

    @And("Not guncelleme icin payload duzenlenir")
    public void notGuncellemeIcinPayloadDuzenlenir() {

    }

    @When("Not guncelleme icin POST Request gonderilir ve Reponse alinir")
    public void notGuncellemeIcinPOSTRequestGonderilirVeReponseAlinir() {

    }

    @And("Not guncelleme icin gelen Response body dogrulanir")
    public void notGuncellemeIcinGelenResponseBodyDogrulanir() {

    }



}
