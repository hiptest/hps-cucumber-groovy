Feature: Grounds
    # As a coffee lover
    # I have to empty the grounds
    # So I don't end up with a total mess around the coffee machine

  Background:
    Given the coffee machine is started
    And I handle everything except the grounds

  @priority-high
  Scenario: Message "Empty grounds" is displayed after 30 coffees are taken (uid:478c182e-4af7-4a2d-9616-d059ff2af49c)
    When I take "30" coffees
    Then message "Empty grounds" should be displayed

  @priority-medium
  Scenario: When the grounds are emptied, message is removed (uid:60ffd6ef-e91c-449c-bbef-0fac073e25bf)
    When I take "30" coffees
    And I empty the coffee grounds
    Then message "Ready" should be displayed
