FROM tomcat:8.5.40
WORKDIR /usr/local/tomcat
RUN rm -rf ./webapps/ROOT
COPY ./tomcat-conf/libs/* ./lib/

COPY ./NeqSimServer.war ./webapps/
RUN unzip ./webapps/NeqSimServer.war -d ./webapps/ROOT
RUN rm -rf ./webapps/NeqSimServer.war

CMD /usr/local/tomcat/bin/catalina.sh start && tail -f /usr/local/tomcat/logs/*