@sprint-2
Feature: Can be configured
    # **In order to** get the best possible coffees
    # **As a** geeky coffee lover
    # **I can** configure it to match my needs

  @priority-medium
  Scenario: Display settings (uid:64c14457-7dee-4327-a1d1-447ed57fc0ca)
    Given the coffee machine is started
    When I switch to settings mode
    Then displayed message is:
      """
      Settings:
       - 1: water hardness
       - 2: grinder
      """

  @priority-high
  Scenario: Default settings (uid:de0b2ccd-317f-40f6-aebf-cf8add21f46c)
    Given the coffee machine is started
    When I switch to settings mode
    Then settings should be:
      | water hardness | 2      |
      | grinder        | medium |
