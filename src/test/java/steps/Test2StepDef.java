package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2StepDef {

    @Given("^Login to Second Home Page$")
    public void login_to_Second_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();

        System.out.println("Login to Second Home Page\n");
    }

    @When("^Enter Second Details$")
    public void enter_Second_Details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();

        System.out.println("Enter Second Details\n");
    }

    @Then("^Print Second Details$")
    public void print_Second_Details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();

        System.out.println("Print Second Details\n");
    }

}
