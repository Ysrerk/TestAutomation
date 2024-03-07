Feature: feature login fuctionality

  Scenario: check login is succesfully with valid credentials
    Given user is loggin page
    When user enter username and password
    And clicks on login button
    Then user is navigated home page
# parametrik senario olusturmak icin
#  Scenario Outline: check login is succesfully with valid credentials
#    Given user is loggin page
#    When user enter <username> and <password>
#    And clicks on login button
#    Then user is navigated home page

#    Examples: 
#      | username | password |
#      | user1    | pass1    |
#      | user2    | pass2    |
