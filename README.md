# hps-cucumber-groovy

[![Build Status](https://travis-ci.org/hiptest/hps-cucumber-groovy.svg?branch=master)](https://travis-ci.org/hiptest/hps-cucumber-groovy)

Hiptest publisher samples with Cucumber/Groovy

In this repository you'll find tests generated in Cucumber/Groovy format from [Hiptest](https://hiptest.com), using [Hiptest publisher](https://github.com/hiptest/hiptest-publisher).

The goals are:

 * to show how tests are exported in Cucumber/Groovy.
 * to check exports work out of the box (well, with implemented actionwords)

System under test
------------------

The SUT is a (not that much) simple coffee machine. You start it, you ask for a coffee and you get it, sometimes. But most of times you have to add water or beans, empty the grounds. You have an automatic expresso machine at work or at home? So you know how it goes :-)

Update tests
-------------


To update the tests:

    "hiptest-publisher -c cucumber-groovy.conf --only=features,step_definitions"

The tests are generated in [``src/test/groovy/com/example/coffeeMachine``](https://github.com/hiptest/hps-cucumber-groovy/tree/master/src/test/groovy/com/example/coffeeMachine)

Run tests
---------


To build the project and run the tests, use the following command:

    mvn test

The SUT implementation can be seen in [``src/main/groovy/com/example/coffeemachine/CoffeeMachine.groovy``](https://github.com/hiptest/hps-cucumber-groovy/blob/master/src/main/groovy/com/example/coffeeMachine/CoffeeMachine.groovy)

The test report is generated in ```target/cuke-results.json```