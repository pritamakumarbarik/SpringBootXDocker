# SpringBootXDocker

A demonstration of containerizing a Spring Boot application using Docker. This project shows how to package a Java backend into a lightweight Docker image for consistent deployment across different environments.

## 🚀 Features

* **Spring Boot 3.x**: RESTful API or backend service.
* **Docker Integration**: Multi-stage Dockerfile for optimized builds.
* **Maven/Gradle**: Dependency management and build automation.

## 📋 Prerequisites

Before you begin, ensure you have the following installed:
* [JDK 17 or higher](https://www.oracle.com/java/technologies/downloads/)
* [Docker Desktop](https://www.docker.com/products/docker-desktop/)
* [Maven](https://maven.apache.org/download.cgi) (or use the provided `./mvnw`)

## 🛠️ Getting Started

To consolidate all microservices within a single Git repository, first create a repository. Within this repository, a pom.xml file should be created; on macOS, this can be done using the touch pom.xml command. This pom.xml file should then be defined as a Maven parent project.

Eg.
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
   <modelVersion>4.0.0</modelVersion>
   <groupId>com.learn.docker</groupId>
   <artifactId>microservices-parent</artifactId>
   <version>1.0.0</version>
   <packaging>pom</packaging>
   <modules>
       <module>api-gateway</module>
       <module>user-service</module>
       <module>payment-service</module>
   </modules>
</project>


my-microservices-repo/
├── api-gateway/             # Routing and entry point
├── user-service/            # Independent microservice 1
├── payment-service/         # Independent microservice 2
├── shared-core/             # Shared DTOs, utilities, and exceptions
├── frontend-client/         # Frontend web application
├── docker-compose.yml       # For local deployment of all services
├── README.md                
└── pom.xml / build.gradle   # Root build file


### 1. Clone the repository
```bash
git clone [https://github.com/pritamakumarbarik/SpringBootXDocker.git](https://github.com/pritamakumarbarik/SpringBootXDocker.git)
cd SpringBootXDocker



