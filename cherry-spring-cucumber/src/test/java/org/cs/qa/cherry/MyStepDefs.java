package org.cs.qa.cherry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cs.qa.core.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;


public class MyStepDefs extends CherryTest {

    @Autowired
    FTPClient ftpClient;

    @Given("i enter {int}")
    public void iEnter(int arg0) {
        System.out.println("I have entered "+ arg0);
    }

    @When("i perform addition")
    public void iPerformAddition() {
        ftpClient.connect();
        System.out.println("I am performing addition ");
    }

    @Then("the result is {int}")
    public void theResultIs(int arg0) {
        System.out.println("I am checking result ");
    }

}
