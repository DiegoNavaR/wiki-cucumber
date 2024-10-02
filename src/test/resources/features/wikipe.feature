Feature: to find "hello world" in wikipedia

    Scenario: Search for "hello world" in wikipedia
        Given user is on the "https://www.wikipedia.org/" home page
        When user searches for "Bobo"
        Then the search 'Bobo' result is displayed