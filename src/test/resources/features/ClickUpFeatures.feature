Feature: ClickUp feature test

  Scenario: Create new list and task after creating Folder
    Given Folder is created
    When I create new List "My first list"
    And Verify that the List name is correct
    Then I create Task in the List
    And Verify that Task name is correct
    And I remove the Task from the List