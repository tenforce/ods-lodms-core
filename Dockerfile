FROM mbentley/ubuntu-tomcat7
ADD pom.xml lodms-spi lodms-web-integration lodms-web ods-lodms-plugins /tmp/lodms
RUN apt-get install maven && rm -rf /opt/tomcat/webapps/docs /opt/tomcat/webapps/examples /opt/tomcat/webapps/ROOT && cd /tmp/lodms && mvn package && mv /tmp/lodms/lodms-web/target/lodms.war /opt/tomcat/webapps/ROOT.war && rm -R /tmp/lodms && 
