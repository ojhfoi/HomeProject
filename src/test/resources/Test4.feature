@test4
Feature: Open site and insert data in authorization form. Then click submit. Test always fail

  Scenario: Check authorization
    Given Create copy "chrome" driver
    When Open site
    Then Insert username and password in authorization form
    Given Submit authorization
    Then Close web driver copy