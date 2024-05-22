FROM openjdk:17

WORKDIR /app

COPY target/mspr_kawa_db.jar /app/mspr_kawa_db.jar

EXPOSE 8077:8077

CMD ["java", "-jar", "mspr_kawa_db.jar"]
