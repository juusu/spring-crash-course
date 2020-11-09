FROM tomcat:9.0.39-jdk11-corretto

COPY target/scc.war /usr/local/tomcat/webapps

EXPOSE 8080