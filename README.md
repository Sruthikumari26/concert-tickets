🎟️ ConcertTix
A modern, lightweight web application for booking concert tickets, built with Java 17 and Spring Boot. It features a sleek dark-themed interface, a simple in-memory database for demonstration, and is fully containerized for DevOps deployment.

✨ Features
🎸 Browse Concerts — View upcoming concerts, artists, and ticket availability.

🎫 Instant Booking — Enter your name and instantly purchase available tickets.

💾 In-Memory Storage — Lightning-fast data access (resets on container restart).

🎨 Modern Dark UI — Responsive, sleek design using HTML, CSS, and Thymeleaf.

🐳 Dockerized — Fully containerized with a multi-stage Dockerfile and Docker Compose.

🚀 CI/CD Ready — Includes a complete Jenkinsfile for automated build, test, and deployment.

🛠️ Tech Stack
Layer	Technology
Language	Java 17
Framework	Spring Boot 3
Frontend	HTML, CSS, Thymeleaf
Database	In-Memory (Java Collections)
Build Tool	Maven
Code Quality	SonarQube
Containerization	Docker & Docker Compose
CI/CD	Jenkins
⚙️ Getting Started
Prerequisites
Java JDK 17 or higher

Maven

Docker & Docker Compose (optional, for containerized deployment)

Installation (Local)
Clone the repository

bash
git clone https://github.com/YOUR_USERNAME/concert-tix.git
cd concert-tix
Run the app

bash
mvn spring-boot:run
The application will start on http://localhost:8080.

Installation (Docker)
Build and start the containers

bash
docker compose up -d --build
Access the app
Open your browser and go to http://localhost:8081.

// 📂 Project Structure
text
concert-tix/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/concerttix/App.java
│   └── main/
│       └── resources/
│           └── templates/index.html
├── pom.xml
├── Dockerfile
├── docker-compose.yml
├── Jenkinsfile
└── README.md
🚀 CI/CD Pipeline
The project uses Jenkins to automate the software delivery process:

Checkout: Pull the latest code from GitHub.

Build: Compile the Spring Boot application and run tests using Maven.

SonarQube Analysis: Analyze code quality and security vulnerabilities.

Quality Gate: Verify that the code passes the SonarQube quality gate.

Docker Build: Create a Docker image of the application.

Smoke Test: Automatically curl the deployed container to ensure it responds with HTTP 200.

Deploy: Use Docker Compose to deploy the application.

🗺️ Roadmap
☑ Browse available concerts
☑ Purchase tickets with instant confirmation
☑ Dark themed UI
☑ Dockerized deployment
□ User authentication (login/register)
□ Admin dashboard for managing concerts
□ Database persistence (MySQL)
□ QR code generation for digital tickets
👤 Author
Your Name

GitHub: @Sruthikumari26

Email: sruthikumari92@gmail.com

⭐ If you like this project, please give it a star!
