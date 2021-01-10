@tes3
Feature: Open pikabu, go to community and search league of testing.
  Open league, then subscribe, select first post and click save

  Scenario: Search community
    Given Create copy "chrome" driver
    When Open site
    And Go to community
    Given Search community "Лига тестировщиков" by name
    Given Select community by name "Лига тестировщиков" from community list
    Given Subscribe on community
    Then Set filter by filter name "Лучшее"
    And Save post number 1
    Then Close web driver copy
