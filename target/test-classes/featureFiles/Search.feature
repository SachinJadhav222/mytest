@search
  Feature: Search Feature
    AS user
    I wanto search

    Background:
      Given I am on Home Psge
   @rm
  Scenario: Search for London
    When I search for "London"
    Then I can see London  Information