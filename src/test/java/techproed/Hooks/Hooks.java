package techproed.Hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;


public class Hooks {

    @Before
    public void setUp() throws Exception {

        System.out.println("Scenariolar calismaya basladi");
        //Driver.getDriver().get(ConfigReader.getProperty("manSchoolUrl"));
       //Driver.getDriver().get(ConfigReader.getProperty("schoolsUrl"));


    }
    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            //TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            //scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", "scenario_" + scenario.getName());
            //Driver.closeDriver();
        }


    }


}
