package guru99.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "guru99/Step_Definitions",
        tags = "@regression or @smoke",
        dryRun = false,
        plugin= {"pretty",
                "html:target/cucumber-reports",
                "json:target/cucumber/report.json",
                "junit:target/cucumber-repo/Cucumber.xml",
                "rerun:target/rerun.txt"

        },
        publish = true,
        monochrome = true


)


public class TestRunner {

}
