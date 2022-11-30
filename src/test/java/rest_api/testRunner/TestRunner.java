package rest_api.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/ClickUpFeatures.feature"},
        glue = {"rest_api/stepdefinitions"}
)
public class TestRunner {
}
