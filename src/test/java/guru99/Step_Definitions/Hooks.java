package guru99.Step_Definitions;

import guru99.utils.ConfigurationsReader;
import guru99.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationsReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void closing(){
        Driver.closeDriver();
    }
}
