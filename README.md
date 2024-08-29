# EventLogger

A Java-based event logging system that captures and logs events to a MySQL database.

## Overview

This project provides a Java application to log various events (like system errors, user actions) and store them in a MySQL database. It includes a simple UI for viewing logged events.

## Components

- **`EventLogger.java`**: Logs events to the MySQL database.
- **`LogViewer.java`**: (Optional) Provides a simple UI to view logs.

## Prerequisites

- Java 8 or higher
- MySQL database
- MySQL Connector JAR (`mysql-connector-java-x.x.x.jar`)

## Setup

1. **Database Setup**:
   - Create a MySQL database and table using the following SQL commands:
     ```sql
     CREATE DATABASE event_db;

     USE event_db;

     CREATE TABLE events (
         id INT AUTO_INCREMENT PRIMARY KEY,
         timestamp DATETIME NOT NULL,
         event_description VARCHAR(255) NOT NULL
     );
     ```

2. **Download MySQL Connector**:
   - Download the MySQL Connector JAR from [MySQL's official website](https://dev.mysql.com/downloads/connector/j/).
   - Add the JAR to your Java project's build path.

3. **Update Configuration**:
   - Replace placeholders in `EventLogger.java` and `LogViewer.java` with your MySQL database credentials and URL.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/EventLogger.git
   cd EventLogger

2. **Compile the Java Files**:
   ```bash
   javac -cp .:path/to/mysql-connector-java-x.x.x.jar src/EventLogger.java src/LogViewer.java




