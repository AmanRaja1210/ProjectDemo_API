# API Automation Framework - JSONPlaceholder API

This project is a **BDD Cucumber + Rest Assured + TestNG + Extent Reports** framework to test the [JSONPlaceholder API](https://jsonplaceholder.typicode.com).

---

## Scenarios Covered ✅

| Test Case | Method | Endpoint | Validation | Reason |
|-----------|--------|----------|------------|--------|
| Get a Post | GET | `/posts/1` | Status 200, response contains `"userId"` | Validates retrieval of resource |
| Create a Post | POST | `/posts` | Status 201, response contains `"id"` | Confirms creation of new resource |
| Update a Post (PUT) | PUT | `/posts/1` | Status 200, response contains `"updated title"` | Ensures full update works |
| Partially Update a Post (PATCH) | PATCH | `/posts/1` | Status 200, response contains `"patched title"` | Validates partial update functionality |
| Delete a Post | DELETE | `/posts/1` | Status 200 | Confirms deletion of resource |

---

## Run Tests ⚡

```bash
mvn clean test
```

Reports:  
- **Cucumber HTML Report** → `target/cucumber-report.html`  
- **Extent Report** → `test-output/HtmlReport/index.html`  
