@test4
Feature: Open site and insert data in authorization form. Then click submit. Test always fail

  Scenario: Check authorization
    When Open site
    Then Insert username and password in authorization form
    Given Submit authorization