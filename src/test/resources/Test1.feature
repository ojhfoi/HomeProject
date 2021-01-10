@test1
Feature: Open pikabu, go to hot post, select first post, first comment and set plus | minus

  Scenario: Uncover PlusCannon
    Given Create copy "chrome" driver
    When Open site
    And Go to hot post
    Given Select post by num 1
    Then Set plus on 1 comment
    Then Close web driver copy

  Scenario: Uncover MinusCannon
    Given Create copy "chrome" driver
    When Open site
    And Go to hot post
    Given Select post by num 1
    Then Set minus on 1 comment
    Then Close web driver copy


