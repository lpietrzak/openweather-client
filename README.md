# Openweather-client

Recruitment task

### Prerequisites

To build and run this project you need to have:
 * Java 8 JDK (for build and run) 
 * Gradle 4.4.1. If you don't have don't worry it will install automatically.
 
## Build and running

Build application 
```
gradlew clean build bootJar
```

Run project you can use:
 * gradle (gradle bootRun)
 * java -jar build/libs/openweather-client-0.0.1-SNAPSHOT.jar
 
After successful start please open webbrowser and paste this link http://localhost:8080/report?city=Warsaw&countryCode=PL 