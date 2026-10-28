# ---------- Stage 1: Build ----------
FROM maven:3.9-eclipse-temurin-17 AS build-env

WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# ---------- Stage 2: Runtime ----------
FROM eclipse-temurin:17-jre-jammy AS runtime-env

WORKDIR /app

EXPOSE 8083

# Copy only the executable JAR
COPY --from=build-env /app/target/my-app.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
