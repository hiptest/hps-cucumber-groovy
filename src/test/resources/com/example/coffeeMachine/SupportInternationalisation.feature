@sprint-3
Feature: Support internationalisation
    # **In order to** practice my use of greetings in several languages
    # **As a** polyglot coffee lover
    # **I can** select the language on the coffee machine

  @priority-medium
  Scenario Outline: Messages are based on language (<hiptest-uid>)
    When I start the coffee machine using language "<language>"
    Then message "<ready_message>" should be displayed

    Examples:
      | language | ready_message | hiptest-uid |
      | en | Ready | uid:ce2d473f-cfd9-4822-b736-1adc1dbdbc28 |
      | fr | Pret | uid:9f9c25c3-b0b7-49b2-a91a-086f614ae5f2 |

  @priority-medium
  Scenario: No messages are displayed when machine is shut down (uid:37a8eb40-16a0-4cdf-8351-211a9df79e84)
    Given the coffee machine is started
    When I shutdown the coffee machine
    Then message "" should be displayed
