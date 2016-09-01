package longVeg;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Mike on 22-Aug-16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/longVeg/features",//path to the features
        format = {"json:target/integration_cucumber.json"},//what formatters to use
        tags = {"@run"})//what tags to include(@)/exclude(@~)
public class RunLogOnTest {
}
