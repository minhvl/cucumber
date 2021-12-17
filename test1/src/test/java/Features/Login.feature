@purchase
Feature: test login


  Scenario Outline:login kiotviet
    Given open browser
    When Input user "<user>"
    And Input password "<password>"
    And I click quan ly button
    Then I see dashboard "<link>"
    And Quit browser
    Examples:
      | user   | password  | link                                             |
      | admin  | admin@123 | https://marketleminh.kiotviet.vn/man/#/DashBoard |
#      | admin1 | admin@123 | https://marketleminh.kiotviet.vn/man/#/login     |

#  https://marketleminh.kiotviet.vn/man/#/login