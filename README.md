# Task-2-WeatherAPIClient

Name:MENDA NAGAMANI

company:CODTECH IT SOLUTIONS

ID:CT08EKW

DOMAIN:Java Programming

DURATION:DECEMBER 17 2024 TO JANUARY 17 2025

OVERVIEW OF THE PROJECT:

PROJECT: WeatherAPIClient using Java Programming

![image alt](https://github.com/NagamaniMenda/Task-2-WeatherAPIClient/blob/8172d64d8709fc08af98d6d9ed5ecb2f25c5565e/weatherapiclient.png)


### **Overview of Java REST API**

Java REST API development involves creating web services that conform to the REST (Representational State Transfer) architectural style. These APIs allow applications to interact with one another over the web, typically using HTTP as the protocol. Java provides robust frameworks and tools, such as Spring Boot, JAX-RS, and Jersey, to simplify REST API creation and management.

### **Objective of Java REST API Development**
The primary goal of creating a REST API in Java is to enable seamless communication between different software systems, including:
- **Data Sharing**: Facilitate the exchange of data between applications.
- **Interoperability**: Ensure systems built with different technologies can communicate effectively.
- **Scalability**: Design APIs to handle varying levels of load efficiently.
- **Ease of Integration**: Provide endpoints that are simple for developers to consume and integrate into their applications.
- **Modularity**: Structure applications into distinct services that can be updated or replaced independently.


### **Key Activities in Java REST API Development**

1. **Requirement Analysis**:
   - Understand the business needs and define the API's purpose.
   - Identify the resources and actions needed (e.g., CRUD operations).

2. **API Design**:
   - Define endpoints, HTTP methods (GET, POST, PUT, DELETE), and request/response formats.
   - Follow RESTful principles like statelessness and resource-based URLs.

3. **Framework and Tool Selection**:
   - Choose a suitable Java framework like Spring Boot, JAX-RS, or Jersey.
   - Use tools like Postman for testing and Swagger/OpenAPI for API documentation.

4. **Implementation**:
   - Set up the server-side application with Java frameworks.
   - Implement endpoints, request handling, and data processing logic.
   - Integrate with databases or other services as needed.

5. **Testing**:
   - Perform unit, integration, and system tests to ensure the API works as expected.
   - Validate edge cases and error handling.

6. **Deployment**:
   - Deploy the API to a production server or cloud platform.
   - Use containerization tools like Docker or Kubernetes for scalability and reliability.

7. **Monitoring and Maintenance**:
   - Monitor API performance using tools like Prometheus or New Relic.
   - Update and maintain the API as requirements evolve.
  
  
### **Technologies Commonly Used in Java REST API Development**

Java REST API development typically involves a combination of frameworks, libraries, tools, and infrastructure components. Below is an overview of the key technologies used:

### **1. Frameworks for Building APIs**
- **Spring Boot**:
  - A popular framework for creating standalone, production-ready REST APIs with minimal configuration.
  - Includes features like dependency injection, embedded servers, and integration with JPA and Hibernate.
- **JAX-RS** (Java API for RESTful Web Services):
  - A standard specification for building RESTful APIs in Java.
  - Implementations include:
    - **Jersey**: A reference implementation for JAX-RS.
    - **RESTEasy**: A JAX-RS implementation provided by Red Hat.
- **Micronaut**:
  - A lightweight framework optimized for microservices and serverless functions.
- **Quarkus**:
  - A Kubernetes-native framework optimized for Java REST APIs and cloud environments.

### **2. Tools for API Testing and Documentation**
- **Postman**:
  - A widely used tool for testing and debugging APIs.
- **Swagger/OpenAPI**:
  - A framework for designing, building, documenting, and consuming REST APIs.
  - Swagger annotations can be used with Java code to auto-generate API documentation.
- **JUnit**:
  - A testing framework for unit and integration tests.
- **Mockito**:
  - Used for mocking dependencies during testing.


### **3. Libraries and Utilities**
- **Jackson** or **Gson**:
  - Libraries for JSON processing (parsing, serialization, and deserialization).
- **Hibernate** or **JPA**:
  - ORM tools for managing database interactions.
- **Lombok**:
  - A library for reducing boilerplate code, such as getters and setters.
- **SLF4J and Logback**:
  - Libraries for logging.


### **4. Database and Storage**
- **Relational Databases**:
  - Examples: MySQL, PostgreSQL, Oracle, and SQL Server.
- **NoSQL Databases**:
  - Examples: MongoDB, Cassandra, and Redis.
- **Cloud Databases**:
  - Examples: Amazon RDS, Google Cloud Firestore.

### **5. Security Technologies**
- **Spring Security**:
  - Provides authentication and authorization for APIs.
- **JWT (JSON Web Tokens)**:
  - Used for securing API endpoints via token-based authentication.
- **OAuth2**:
  - An authorization framework for enabling secure access to APIs.
- **HTTPS and SSL/TLS**:
  - Protocols for encrypting API communications.

### **6. Deployment and Infrastructure**
- **Servers**:
  - Examples: Apache Tomcat, Jetty, and WildFly.
- **Containers and Orchestration**:
  - Docker for containerization and Kubernetes for orchestration.
- **Cloud Platforms**:
  - AWS (Elastic Beanstalk, Lambda), Google Cloud, Azure, or Heroku for deployment.
- **CI/CD Tools**:
  - Jenkins, GitHub Actions, or GitLab CI/CD for automating the build, test, and deployment pipelines.

### **7. Monitoring and Logging**
- **Prometheus and Grafana**:
  - For monitoring API performance.
- **ELK Stack (Elasticsearch, Logstash, Kibana)**:
  - For log aggregation and analysis.
- **Zipkin** or **Jaeger**:
  - For distributed tracing in microservices.


### **8. Modern Enhancements**
- **Reactive Programming**:
  - Frameworks like **Project Reactor** (used in Spring WebFlux) for building non-blocking REST APIs.
- **GraphQL**:
  - An alternative to REST for flexible querying, supported by Java libraries like **graphql-java**.
- **gRPC**:
  - A high-performance alternative to REST for communication between services.


### **Key Insights in Java REST API Development**

1. **REST Principles Matter**: Adhering to REST principles ensures consistency and ease of use for API consumers.
2. **Error Handling is Crucial**: Clear and descriptive error messages improve developer experience.
3. **Performance Optimization**: Use techniques like caching, pagination, and asynchronous processing for efficient APIs.
4. **Security is a Priority**: Implement security features like authentication (OAuth2, JWT), encryption (HTTPS), and rate limiting.
5. **Documentation is Essential**: Comprehensive API documentation (e.g., Swagger) reduces onboarding time for developers.
6. **Versioning for Stability**: API versioning ensures backward compatibility for clients.
7. **Testing Saves Time**: Automated tests reduce bugs and regression issues.
8. **Framework Benefits**: Modern frameworks like Spring Boot simplify development with built-in features like dependency injection, data binding, and request routing..

***DELIVERABLE: A JAVA PROGRAM THAT HANDLES HTTP REQUESTS AND PARSES JSON RESPONSES.***

 **Code Implementation**

//java
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;

public class RestApiHandler 
{
public static void main(String[] args) {
        // Replace with your API endpoint and key (if required)

      
   String city = "London"; // Example: Fetch weather for London
   
 String apiKey = "your_api_key"; // Replace with your API key
 
String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

   try {
             Step 1: Create an HTTP client
             
   HttpClient client = HttpClient.newHttpClient();

   Step 2: Create an HTTP request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .build();

  Step 3: Send the request and get the response
HttpResponse<String> response client.send(request,HttpResponse.BodyHandlers.ofString());

   Step 4: Parse JSON response
            if (response.statusCode() == 200) {
                String responseBody = response.body();
                JSONObject jsonResponse = new JSONObject(responseBody);

  Extract weather description
                JSONArray weatherArray = jsonResponse.getJSONArray("weather");
String weatherDescription = weatherArray.getJSONObject(0).getString("description");

  Extract temperature
                double tempCelsius = jsonResponse.getJSONObject("main").getDouble("temp");

   Display extracted data
                System.out.println("City: " + city);
                System.out.println("Weather: " + weatherDescription);
                System.out.println("Temperature: " + tempCelsius + "°C");
            } else {
                System.out.println("Failed to fetch data. HTTP status code: " + response.statusCode());
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}




### **Steps to Use This Program**

1. **Set Up Dependencies**:
   - Use the "org.json" library for JSON parsing. add it to your project as a dependency.
   - If using Maven, include this dependency in your "pom.xml":
   xml
     <dependency>
         <groupId>org.json</groupId>
         <artifactId>json</artifactId>
         <version>20230227</version>
     </dependency>
     

2. **Replace API Key**:
   - Register for an API key on OpenWeatherMap or another REST API service and replace the placeholder "your_api_key"in the program.

3. **Compile and Run**:
   - Compile: javac RestApiHandler.java
   - Run: java RestApiHandler

4. **Output Example**:

   City: London
   Weather: clear sky
   Temperature: 15.87°C

### **Customization**
- Replace "apiUrl" with the endpoint of your choice for different APIs.
- Enhance the program to accept user input for the city or other parameters.
- Add error handling for invalid API keys, network issues, or malformed responses.



