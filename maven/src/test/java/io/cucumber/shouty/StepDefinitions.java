package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class StepDefinitions {

    private Person sean;
    private Person lucy;
    private String messageFromSean;

    @Given("Lucy is located {int} meters from Sean")
    public void lucy_is_located_meters_from_sean(Integer distance) {
        sean = new Person();
        lucy = new Person();
        lucy.moveTo(distance);

    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        sean.shout(message);
        messageFromSean = message;
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        assertEquals(asList(messageFromSean), lucy.getMessagesHeard());
    }

}
