@test
Feature: Open pikabu, go to hot post, select first post, first comment and set plus | minus

  Scenario: Uncover PlusCannon
    When Open site
    And Go to hot post
    Given Select post by num 1
    Then Set plus on 1 comment

  Scenario: Uncover MinusCannon
    When Open site
    And Go to hot post
    Given Select post by num 1
    Then Set minus on 1 comment


