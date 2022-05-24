FROM openjdk:18.0-jdk
WORKDIR /home/glassfish/
# Update and install dependencies
RUN apt-get -y update && \
    apt-get -y install \
    wget \
    unzip \
    xvfb \
    libxext6 \
    libxrender1 \
    libxtst6 \
    libxi6 \
    libfontconfig1
RUN wget http://ftp.halifax.rwth-aachen.de/eclipse//glassfish/glassfish-5.1.0.zip && \
    unzip glassfish-5.1.0.zip && rm -rf glassfish-5.1.0.zip
ENV DISPLAY :0
# Copy over libs, config, app, and run-script.
WORKDIR /home/glassfish/glassfish5/glassfish
COPY ./lib/mysql-connector-java-8.0.11.jar ./lib/
COPY ./domain.xml ./domains/domain1/config/domain.xml
COPY ./entrypoint.sh ./
COPY ./NeqSimServer.war ./domains/domain1/autodeploy/
# Run server on container start
ENTRYPOINT [ "./entrypoint.sh" ]
