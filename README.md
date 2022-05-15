# Basic Spring Application with Kafka

This project's aim is to send data to Kafka from a Spring application.

I used Docker to launch Kafka. Go to casestudy/src/main/resources and run docker-compose up -d.

Then open casestudy/src/main/resources/package-data.json and populate it with the data as you like.

Adjust casestudy/src/main/resources/application.yml file to configure Kafka properties such as port numbers.

Finally, run casestudy/src/main/java/com/sh/casestudy/CaseStudyApplication.java

This project uses openapi so you can try endpoints on Swagger UI. (It is running on localhost:8080 but you can change it on application.yml)
