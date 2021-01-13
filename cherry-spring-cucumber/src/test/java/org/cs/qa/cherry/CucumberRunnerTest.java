package org.cs.qa.cherry;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "org.cs.qa.cherry")
public class CucumberRunnerTest extends CherryTest{

}
