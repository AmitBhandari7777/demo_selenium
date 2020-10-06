package evening;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"evening/bdd/demo/login", "evening/bdd/demo/customer/add"},
        plugin = {"html:target/site/cucumber-pretty",
                "json:target/cucumber.json"},
        monochrome = true
)
public class ApplicationRunner {

    public static void main(String[] args) {

    }
}
