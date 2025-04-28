FROM gradle:7.6.3-jdk17

WORKDIR /app

# Copy build files
COPY build.gradle settings.gradle ./
COPY src ./src

# Expose the port
EXPOSE 8080

# Start in development mode
CMD ["gradle", "bootRun", "--no-daemon"] 