package com.expandtesting.steps;

import com.expandtesting.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ArithmeticSteps {
    private Calculator calculator = new Calculator();
    int a,b, result;

    @Given("the numbers {int} and {int}")
    public void givenNumbers(int a, int b) {
        this.a = a;
        this.b= b;
    }

    @When("I add the two numbers")
    public void addNumbers() {
        this.result = calculator.add(this.a, this.b);
    }

    @When("I subtract the two numbers")
    public void subtractNumbers() {
        this.result = calculator.subtract(this.a, this.b);
    }

    @Then("the result should be {int}")
    public void checkResult(int expected) {
        Assert.assertEquals(result, expected);

    }
}
