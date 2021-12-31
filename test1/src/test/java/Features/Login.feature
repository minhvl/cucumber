@purchase
Feature: test login


  Scenario Outline:login kiotviet
    Given open browser
    When Input shop_name "<shop_name>"
    And Input user "<user>"
    And Input password "<password>"
    And I click quan ly button
    Then I see dashboard "<link>"
    And Logut
    Examples:
      |shop_name| user   | password  | link                                             |
      |testbg| admin  | 123 | https://booking.kiotviet.vn/testbg/#/DashBoard |
#      |spadev| qlbach | admin@123 | https://marketleminh.kiotviet.vn/man/#/DashBoard |

#  https://marketleminh.kiotviet.vn/man/#/login