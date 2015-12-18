Keep adding your services in the com.amithkoujalgi.service package.
OR
Add them in your own package, but don't forget to register them in JerseyConfig.

Run:

```sh
mvn clean package
java -jar ./target/springboot-jersey-1.0-SNAPSHOT.jar
```