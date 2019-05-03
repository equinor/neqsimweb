#! /bin/bash
DOMAIN_XML=/home/glassfish/glassfish5/glassfish/domains/domain1/config/domain.xml
ESCAPED_URL="$(echo "$MYSQL_URL" | sed 's|\/|\\\/|g')"
# Configure glassfish server
sed -i 's/name="user"\ value="placeholder"/name="user"\ value="'"$MYSQL_USER"'"/g' $DOMAIN_XML
sed -i 's/name="Password"\ value="placeholder"/name="Password"\ value="'"$MYSQL_PASSWORD"'"/g' $DOMAIN_XML
sed -i 's/name="URL"\ value="placeholder"/name="URL"\ value="'"$ESCAPED_URL"'"/g' $DOMAIN_XML

# Run server with terminal
/home/glassfish/glassfish5/glassfish/bin/asadmin start-domain -v