Feature: Open pikabu, go to community and search league of testing.
  Open league, then subscribe, select first post and click save

  Scenario: Search community
    When Open site
    And Go to community
    Given Search community by name "Лига тестировщиков"
    Given Select community by name "Лига тестировщиков" from community list
    Given Subscribe on community
    Then Set filter by filter name "Лучшее"
    And Save post number 1