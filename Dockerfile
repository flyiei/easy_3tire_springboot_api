FROM openjdk:17-jdk-slim as development

WORKDIR /app

# Copy gradle files first for better caching
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# Make gradlew executable
RUN chmod +x ./gradlew

# Download dependencies
RUN ./gradlew dependencies

# Copy source code
COPY src src

# Expose the port
EXPOSE 8080

# Start the application in development mode with live reload
CMD ["./gradlew", "bootRun", "--no-daemon"] 