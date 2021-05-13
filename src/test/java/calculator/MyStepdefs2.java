package calculator;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs2 {
    private Calculator calculator;
    private int value1;
    private int value2;
    private String opt;
    private int result;

    @Before
    public void before()  {
        calculator = new Calculator();
    }

    @Given("^Three input values, ([+-]?\\d+) and (\\d+) and \"([\\^/])\"$")
    public void threeInputValuesAndAnd(int arg0, int arg1, String arg2) {
        value1 = arg0;
        value2 = arg1;
        opt = arg2;
    }

    @When("^I operate the two values$")
    public void iOperateTheTwoValues() {
        result = calculator.operation(value1, value2, opt);
    }

    @Then("^I expect the answer ([+-]?\\d+)$")
    public void iExpectTheAnswer(int arg0) {
        Assert.assertEquals(result, arg0);
    }

}
