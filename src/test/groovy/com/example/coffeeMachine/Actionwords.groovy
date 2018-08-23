package com.example.coffeeMachine

class Actionwords {
  def sut
  def handleBeans = false
  def handleWater = false
  def handleGrounds = false

  Actionwords() {
    sut = CoffeeMachine.newInstance()
  } 

  def iStartTheCoffeeMachineUsingLanguageLang(lang) {
    sut.start(lang)
  }

  def iShutdownTheCoffeeMachine() {
    sut.stop()
  }

  def messageMessageShouldBeDisplayed(message) {
    return sut.message() == message
  }

  def coffeeShouldBeServed() {
    return sut.coffeeServed
  }

  def coffeeShouldNotBeServed() {
    return !sut.coffeeServed
  }

  def iTakeACoffee() {
    sut.takeCoffee()
    if (handleGrounds) {
      iEmptyTheCoffeeGrounds()
    }

    if (handleWater) {
      iFillTheWaterTank()
    }

    if (handleBeans) {
      iFillTheBeansTank()
    }
  }

  def iEmptyTheCoffeeGrounds() {
    sut.emptyGrounds()
  }

  def iFillTheBeansTank() {
    sut.fillBeans()
  }

  def iFillTheWaterTank() {
    sut.fillTank()
  }

  def iTakeCoffeeNumberCoffees(coffeeNumber) {
    while (coffeeNumber > 0) {
      iTakeACoffee()
      coffeeNumber -= 1
    }
  }

  def theCoffeeMachineIsStarted() {
    iStartTheCoffeeMachineUsingLanguageLang("en")
  }

  def iHandleEverythingExceptTheWaterTank() {
    iHandleCoffeeGrounds()
    iHandleBeans()
  }

  def iHandleWaterTank() {
    handleWater = true
  }

  def iHandleBeans() {
    handleBeans = true
  }

  def iHandleCoffeeGrounds() {
    handleGrounds = true
  }

  def iHandleEverythingExceptTheBeans() {
    iHandleWaterTank()
    iHandleCoffeeGrounds()
  }

  def iHandleEverythingExceptTheGrounds() {
    iHandleWaterTank()
    iHandleBeans()
  }

  def displayedMessageIs(freeText) {
    messageMessageShouldBeDisplayed(freeText)
  }

  def iSwitchToSettingsMode() {
    sut.showSettings()
  }

  def settingsShouldBe(datatable) {
    def settings = [:]
    List<List<String>> raws = datatable.raw()
    raws.each { raw ->
      settings.put(raw[0].replaceAll(' ', ''), raw[1].trim())
    }

    return settings == sut.getSettings()
  }
}
