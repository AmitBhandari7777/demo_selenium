package morning;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        plugin = {"html:target/site/cucumber-pretty",
                "json:target/cucumber.json"},
        glue = {"evening/bdd/demo/login", "evening/bdd/demo/customer/add"},
        monochrome = true
)
public class ApplicationRunner {
}
