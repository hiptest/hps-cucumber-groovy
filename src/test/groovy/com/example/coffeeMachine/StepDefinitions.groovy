package com.example.coffeeMachine

import cucumber.api.DataTable

this.metaClass.mixin(cucumber.api.groovy.EN)

Actionwords actionwords = new Actionwords()

When(~"^I start the coffee machine using language \"(.*)\"\$") { String lang ->
    actionwords.iStartTheCoffeeMachineUsingLanguageLang(lang)
}

When(~"^I shutdown the coffee machine\$") {  ->
    actionwords.iShutdownTheCoffeeMachine()
}

Then(~"^message \"(.*)\" should be displayed\$") { String message ->
    actionwords.messageMessageShouldBeDisplayed(message)
}

Then(~"^coffee should be served\$") {  ->
    actionwords.coffeeShouldBeServed()
}

Then(~"^coffee should not be served\$") {  ->
    actionwords.coffeeShouldNotBeServed()
}

When(~"^I take a coffee\$") {  ->
    actionwords.iTakeACoffee()
}

When(~"^I empty the coffee grounds\$") {  ->
    actionwords.iEmptyTheCoffeeGrounds()
}

When(~"^I fill the beans tank\$") {  ->
    actionwords.iFillTheBeansTank()
}

When(~"^I fill the water tank\$") {  ->
    actionwords.iFillTheWaterTank()
}

When(~"^I take \"(.*)\" coffees\$") { int coffeeNumber ->
    actionwords.iTakeCoffeeNumberCoffees(coffeeNumber)
}

Given(~"^the coffee machine is started\$") {  ->
    actionwords.theCoffeeMachineIsStarted()
}

Given(~"^I handle everything except the water tank\$") {  ->
    actionwords.iHandleEverythingExceptTheWaterTank()
}

Given(~"^I handle water tank\$") {  ->
    actionwords.iHandleWaterTank()
}

Given(~"^I handle beans\$") {  ->
    actionwords.iHandleBeans()
}

Given(~"^I handle coffee grounds\$") {  ->
    actionwords.iHandleCoffeeGrounds()
}

Given(~"^I handle everything except the beans\$") {  ->
    actionwords.iHandleEverythingExceptTheBeans()
}

Given(~"^I handle everything except the grounds\$") {  ->
    actionwords.iHandleEverythingExceptTheGrounds()
}

Then(~"^displayed message is:\$") { String freeText ->
    actionwords.displayedMessageIs(freeText)
}

When(~"^I switch to settings mode\$") {  ->
    actionwords.iSwitchToSettingsMode()
}

Then(~"^settings should be:\$") { DataTable datatable ->
    actionwords.settingsShouldBe(datatable)
}

