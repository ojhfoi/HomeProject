@test2
Feature: Open pikabu site, go to new post, select author of first post.
  Set filter by rating and sort it from best to bad.
  Click on share and copy link

  Scenario: Search author and check share
    When Open site
    And Go to new post
    Given Click on author link on post by number 1
    Given Set filter by filter name "По рейтингу"
    Given Set sort post filter
    Then Click on share button and copy link
