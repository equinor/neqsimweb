FROM openjdk:8-jdk-slim-stretch
WORKDIR /home/glassfish/
RUN apt-get -y update && apt-get -y install wget unzip
RUN wget http://ftp.halifax.rwth-aachen.de/eclipse//glassfish/glassfish-5.1.0.zip && \
    unzip glassfish-5.1.0.zip && rm -rf glassfish-5.1.0.zip
WORKDIR /home/glassfish/glassfish5/glassfish
COPY ./lib/mysql-connector-java-8.0.11.jar ./lib/
COPY ./domain.xml ./domains/domain1/config/domain.xml 
COPY ./NeqSimServer.war ./domains/domain1/autodeploy/
# COPY ./NeqSimServer.war /temp/

# # If you need the Glassfish admin-gui, uncomment this.
# RUN echo 'AS_ADMIN_PASSWORD=\n\
# AS_ADMIN_NEWPASSWORD='admin'\n\
# EOF\n'\
# >> /opt/tmpfile
# RUN echo 'AS_ADMIN_PASSWORD='admin'\n\
# EOF\n'\
# >> /opt/pwdfile
# RUN \
#  ./bin/asadmin start-domain && \
#  ./bin/asadmin --user admin --passwordfile=/opt/tmpfile change-admin-password && \
#  ./bin/asadmin --user admin --passwordfile=/opt/pwdfile enable-secure-admin && \
#  ./bin/asadmin restart-domain
# RUN rm /opt/tmpfile
# RUN ./bin/asadmin stop-domain

CMD ./bin/asadmin start-domain -v
# CMD ./bin/asadmin start-domain && \
# ./bin/asadmin deploy --contextroot "/" /temp/NeqSimServer.war && \
# tail -f ./domains/domain1/logs/server.log