package com.example.coffeeMachine;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com/example/coffeeMachine",
        format = "json:target/cuke-results.json"
)
public class CoffeeMachineTest {
}