Feature: Water
    # As a coffee lover
    # I have to handle the water tank
    # So I can have coffee when I need it

  Background:
    Given the coffee machine is started
    And I handle everything except the water tank

  @priority-high
  Scenario: Message "Fill water tank" is displayed after 50 coffees are taken (uid:c77e8f4b-cd03-46b3-ba93-b80b414f869f)
    When I take "50" coffees
    Then message "Fill tank" should be displayed

  @priority-low
  Scenario: It is possible to take 10 coffees after the message "Fill water tank" is displayed (uid:55984fc2-3f74-4562-8765-8b0e29734590)
    When I take "60" coffees
    Then coffee should be served
    When I take a coffee
    Then coffee should not be served

  @priority-high
  Scenario: When the water tank is filled, the message disappears (uid:3a44632c-c6db-499d-9616-564d7e7e3eab)
    When I take "55" coffees
    And I fill the water tank
    Then message "Ready" should be displayed
