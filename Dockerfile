FROM tomcat:8.5.40
WORKDIR /usr/local/tomcat
COPY ./tomcat-conf/libs/* ./lib/


COPY ./NeqSimServer3.war ./webapps/
RUN unzip ./webapps/NeqSimServer3.war -d ./webapps/NeqSimServer3
RUN rm -rf ./webapps/NeqSimServer3.war
# COPY ./tomcat-conf/tomcat-users.xml ./conf/
# COPY ./tomcat-conf/server.xml ./conf/
#COPY ./tomcat-conf/logging.properties ./conf/
# COPY ./tomcat-conf/context.xml ./webapps/manager/META-INF/
# COPY ./tomcat-conf/context.xml /temporary/


CMD /usr/local/tomcat/bin/catalina.sh start && tail -f /usr/local/tomcat/logs/*