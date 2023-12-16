FROM amazoncorretto:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Gradle build files to the container
COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY gradle ./gradle
COPY gradlew .

# Copy the source code to the container
COPY src ./src

# Build the application using Gradle
RUN ./gradlew bootJar

# Copy the JAR file into the container
COPY build/libs/*.jar app.jar

# Expose the port that the application will run on
EXPOSE 8080

# Specify the command to run on container startup
CMD ["java", "-jar", "app.jar"]