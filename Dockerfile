FROM openjdk:11-jre-slim

ARG JAR_FILE=mock-envoy*.jar
RUN apt-get update
RUN apt-get -yq clean
RUN groupadd -g 989 mock-envoy && \
    useradd -r -u 989 -g mock-envoy mock-envoy
USER mock-envoy
COPY target/$JAR_FILE /opt/mock-envoy.jar

ENTRYPOINT [ "java", "-jar", "/opt/mock-envoy.jar" ]
