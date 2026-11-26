# 🎟️ ConcertTix

A modern, lightweight web application for booking concert tickets, built with **Java 17 and Spring Boot**. It features a sleek dark-themed interface, a simple in-memory database for demonstration, and is fully containerized for DevOps deployment.

---

## ✨ Features

- 🎸 **Browse Concerts** — View upcoming concerts, artists, and ticket availability.
- 🎫 **Instant Booking** — Enter your name and instantly purchase available tickets.
- 💾 **In-Memory Storage** — Lightning-fast data access (resets on container restart).
- 🎨 **Modern Dark UI** — Responsive, sleek design using HTML, CSS, and Thymeleaf.
- 🐳 **Dockerized** — Fully containerized with a multi-stage Dockerfile and Docker Compose.
- 🚀 **CI/CD Ready** — Includes a complete Jenkinsfile for automated build, test, and deployment.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 3 |
| Frontend | HTML, CSS, Thymeleaf |
| Database | In-Memory (Java Collections) |
| Build Tool | Maven |
| Code Quality | SonarQube |
| Containerization | Docker & Docker Compose |
| CI/CD | Jenkins |

---

## 📂 Project Structure

The project follows a standard Maven and Spring Boot directory structure:

```text
concert-tix/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/concerttix/
│   │   │       └── App.java          # Main Spring Boot Application & Controllers
│   │   └── resources/
│   │       └── templates/
│   │           └── index.html        # Frontend UI (Thymeleaf)
├── pom.xml                           # Maven dependencies and build configuration
├── Dockerfile                        # Multi-stage Docker build instructions
├── docker-compose.yml                # Orchestration for local deployment
├── Jenkinsfile                       # CI/CD Pipeline definitions
└── README.md                         # Project documentation

🚀 CI/CD Pipeline
The project uses Jenkins to automate the software delivery process. The pipeline is defined in the Jenkinsfile and executes the following stages:

Checkout: Pull the latest code from the GitHub repository.

Build: Compile the Spring Boot application and run any tests using Maven (mvn clean package).

SonarQube Analysis: Analyze the code for bugs, code smells, and security vulnerabilities.

Quality Gate: Pause the pipeline and wait for SonarQube to confirm the code passes the Quality Gate.

Docker Build: Create a Docker image of the application and tag it with the Jenkins build number.

Smoke Test: Automatically start the container, use curl to verify it responds with an HTTP 200 status, and then stop the container to ensure the image is healthy.

Deploy: Use docker compose up -d to deploy the application into the production environment.

(Note: Make sure your Jenkins server has the necessary plugins installed for SonarQube and Docker, and that the swarm agent has Docker installed.)

🗺️ Roadmap
Here is the future development plan for ConcertTix:

☑ Browse available concerts with artist and ticket details
☑ Purchase tickets with instant confirmation
☑ Dark themed, responsive UI
☑ Dockerized deployment
☑ Automated CI/CD pipeline with Jenkins and SonarQube
□ User authentication (login/register)
□ Admin dashboard for managing concerts and viewing bookings
□ Database persistence (replace in-memory with MySQL/PostgreSQL)
□ QR code generation for digital tickets
□ Integration with a payment gateway (e.g., Stripe)

⚙️ Getting Started
Prerequisites
Java JDK 17 or higher
Maven
Docker & Docker Compose (optional, for containerized deployment)
Installation (Local)

Clone the repository
bash
git clone https://github.com/Sruthikumari92/concert-tix.git
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

👤 Author
Madupathi Sruthi
GitHub: @Sruthikumari26
Email: sruthikumari92@gmail.com

⭐ If you like this project, please give it a star!

