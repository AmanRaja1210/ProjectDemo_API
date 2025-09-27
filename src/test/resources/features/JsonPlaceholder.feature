Feature: JSONPlaceholder API CRUD Tests

  Scenario: Get a post
    When I send a GET request to "/posts/1"
    Then the response status code should be 200
    And the response should contain "userId"

  Scenario: Create a new post
    When I send a POST request to "/posts" with body:
      """
      { "title": "foo", "body": "bar", "userId": 1 }
      """
    Then the response status code should be 201
    And the response should contain "id"

  Scenario: Update a post with PUT
    When I send a PUT request to "/posts/1" with body:
      """
      { "id": 1, "title": "updated title", "body": "updated body", "userId": 1 }
      """
    Then the response status code should be 200
    And the response should contain "updated title"

  Scenario: Partially update a post with PATCH
    When I send a PATCH request to "/posts/1" with body:
      """
      { "title": "patched title" }
      """
    Then the response status code should be 200
    And the response should contain "patched title"

  Scenario: Delete a post
    When I send a DELETE request to "/posts/1"
    Then the response status code should be 200
