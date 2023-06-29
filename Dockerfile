FROM amazoncorretto:8 
MAINTAINER juanmolmos 
COPY target\PortfolioPersonal-0.0.1-SNAPSHOT.jar PortfolioPersonal-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/PortfolioPersonal-0.0.1-SNAPSHOT.jar"]
