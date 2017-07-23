Feature: Search by keyword
  In order for buyers to find what they are looking for more efficiently
  As a seller
  I want buyers to be able to search for articles by keywords

  Scenario: Search for articles by keyword

    Given richard wants to buy cool stuff in Amazon
    When he search for items containing Sega
    Then he should only see items related to Sega