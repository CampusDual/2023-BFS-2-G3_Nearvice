FROM  eclipse-temurin:11

ENV PORT 8080
ENV CLASSPATH /opt/lib
EXPOSE 8080

# Copy jar file
COPY ./cd2023bfs2g3-boot/target/cd2023bfs2g3-boot.jar /opt/cd2023bfs2g3-boot.jar
WORKDIR /opt
CMD ["/bin/bash", "-c", "case $ENVIRONMENT_PROFILE in 'production') java $JVM_OPTIONS -jar cd2023bfs2g3-boot.jar --spring.profiles.active=production;; *) java $JVM_OPTIONS -jar cd2023bfs2g3-boot.jar --spring.profiles.active=staging;; esac;"]
