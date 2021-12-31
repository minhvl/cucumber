@purchase
Feature: test login


  Scenario Outline:login kiotviet
    Given open browser
    When Input user "<user>"
    And Input password "<password>"
    And I click quan ly button
    Then I see dashboard "<link>"
    And Logut
    Examples:
      | user   | password  | link                                             |
      | admin  | 123 | https://marketleminh.kiotviet.vn/man/#/DashBoard |
      | qlbach | admin@123 | https://marketleminh.kiotviet.vn/man/#/DashBoard |

#  https://marketleminh.kiotviet.vn/man/#/login