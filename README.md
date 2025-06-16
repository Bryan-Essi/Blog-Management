# 📝 Blog-Management API : How to test the Spring Boot API for our article blogging program

## 🛠️ Prerequisites

Recommended IDE: IntelliJ IDEA
Test tools: Swagger UI or Postman
Environment : JDK 21 and Maven

## 🚀 Launch & Test Guide

### 1️⃣ Importing the Project
```bash
Open the project folder in IntelliJ IDEA
Let the IDE configure dependencies automatically

2️⃣ Database Setup

# PostgreSQL Configuration
+ Create database "Blog Management" via pgAdmin
+ Export the supplied database (.backup format recommended)

# OR create custom database:
- Modify src/main/resources/application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password

3️⃣ Compilation & Launch

mvn clean install
Run main class (@SpringBootApplication)

4️⃣ Access Swagger UI

*Open a web browser
*Go to: http://localhost:8081/swagger-ui/index.html
*You should see interactive API documentation

5-Testing an endpoint (POST example): CASE OF AN ITEM ADD a. In Swagger UI:

✨ Adding an Article
Via Swagger:
Find your controller section

Click POST → Try it out

Replace example data:

json
{
    "title": "article_1",
    "content": "article content here",
    "author": "jeanjack"
}
Execute and verify "success add article" response

b. Via Postman :

*Create a new POST request to localhost:8081/blog/addArticle
*In the “Body” tab, select “raw” and “JSON”.
*Enter your JSON object (without id)
*Send the request and check the response

Tips :

-Check that port 8081 is available
-In case of error, check the application logs
-For Postman, you can import the Swagger configuration if available
Example of a JSON request body for adding an item:

CASE OF ADDING A COMMENT a. In Swagger UI :

💬 Adding a Comment
Via Swagger:
Navigate to Comments controller

Use this JSON template:

json
{
    "content": "Sample comment",
    "article": {
        "id": 1
    }
}

🔧 Troubleshooting Tips
🔴 Port conflicts? Check 8080/8081 availability

📜 Always check application logs for errors

🔄 Postman users: Import Swagger config if available

🐛 Common issues:

Database connection failures

Missing required fields

Invalid JSON formatting


       Example of a JSON request body for adding an item:
{
    "title": "article_1",
    "content": "article juste pour la forme quoi",
    "author": "jeanjack"
}
     Example of a JSON request body for adding a comment:

{
    "content": "Ceci est un commentaire",
    "article": {
        "id": 1
    }
}







