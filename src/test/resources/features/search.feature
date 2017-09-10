Feature: Search by keyword
   As a videogame collectionist
   I want to be able to search vintage consoles

  Scenario: Search vintage consoles by keyword

    Given that Richard wants to buy cool stuff in Amazon
    When he searches for items containing Sega Genesis
    Then he should only see items related to Video Games