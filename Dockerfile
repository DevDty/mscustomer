FROM openjdk:11
COPY "./target/mscustomer-0.0.1-SNAPSHOT.jar" "mscustomer.jar"
EXPOSE 8184
ENTRYPOINT ["java","-jar","mscustomer.jar"]