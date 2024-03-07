Feature: google browser saerching control feature

  Scenario: Control google function
    Given user open browser
    And see the google search bar
    When enter the search text
    And click the enter
    Then navigate the search result
