# API Automation Framework – JSONPlaceholder API

This project demonstrates **API automation testing** using **Java**, **RestAssured**, **Cucumber (BDD)**, **TestNG**, and **Extent Reports**.  
It validates CRUD operations (GET, POST, PUT, PATCH, DELETE) against the free [JSONPlaceholder API](https://jsonplaceholder.typicode.com).

---

## ✅ Scenarios Covered

| Test Case | Method | Endpoint   | Validation | Reason |
|-----------|--------|-----------|------------|--------|
| Get a Post | GET | `/posts/1` | Status `200`, response contains `"userId"` | Validates retrieval of resource |
| Create a Post | POST | `/posts` | Status `201`, response contains `"id"` | Confirms creation of new resource |
| Update a Post (PUT) | PUT | `/posts/1` | Status `200`, response reflects full update | Ensures full update works |
| Partially Update a Post (PATCH) | PATCH | `/posts/1` | Status `200`, response reflects partial update | Validates partial update functionality |
| Delete a Post | DELETE | `/posts/1` | Status `200` or `204` | Confirms deletion of resource |

---

## 🛠️ Tech Stack

- **Language**: Java 11+  
- **Build Tool**: Maven  
- **Testing Framework**: TestNG  
- **BDD Framework**: Cucumber (Gherkin)  
- **API Testing**: RestAssured  
- **Reporting**: Extent Reports (HTML + PDF), Cucumber HTML  

---

## 📂 Project Structure

```
API_Automation_JSONPlaceholder
│── src
│   ├── main/java/com/api/framework
│   │   ├── clients        # RestAssured request clients
│   │   └── utils          # Utilities and helpers
│   └── test/java/com/api/framework
│       ├── stepdefinitions  # Step definitions for feature files
│       ├── runners          # TestNG & Cucumber runners
│       └── hooks            # Setup/teardown logic
│── src/test/resources/features
│   └── JsonApi.feature
│── pom.xml
│── README.md
│── docs/demo.gif            # Demo run GIF
```

---

## ▶️ Run Tests

From project root, run:

```bash
mvn clean test
```

---

## 📊 Reports

After execution, reports are generated:

- **Extent Spark HTML Report** → `target/ExtentReport/ExtentReport.html`  
- **Extent PDF Report** → `target/ExtentReport/ExtentReport.pdf`  
- **Cucumber HTML Report** → `target/cucumber-report.html`  



---

## 🌟 Key Features

- Covers all **CRUD operations** (GET, POST, PUT, PATCH, DELETE).  
- **BDD Cucumber** for readability and collaboration.  
- Uses **RestAssured** for HTTP request handling.  
- Validates both **status codes** and **response body content**.  
- Generates **rich Extent Reports** (HTML + PDF) and **Cucumber reports**.  

---

## 📌 Notes

- Uses the free [JSONPlaceholder](https://jsonplaceholder.typicode.com/) API (no authentication required).  
- This framework is intended as a **submission-ready example** for API test automation.  

---
