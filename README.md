- mvn clean install package
- cp target/UDFKSQL-XML-TO-JSON-1.0-SNAPSHOT.jar ~/library/confluent-ksqldb-0.29.0/ext
- vim etc/ksqldb/ksql-server.properties
- ksql.extension.dir=/home/adi/library/confluent-ksqldb-0.29.0/ext/