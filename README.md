# resteasy-arquillian-test

Proyecto mínimo funcionando con:
* jaxrs (resteasy)
* arquillian
* wildfly en sobre docker

Wildfly remoto funcionado sobre Docker


### Imagen Docker de WildFly para tests

* Build:

```
cd docker
docker build --tag=wildfly-tests .
```

* Run:

```
docker run -it -p 8080:8080 -p 9990:9990 --name wildfly-tests wildfly-tests
```

Administración de WildFly en http://localhost:9990.


### Tests con Arquillian

Simplemente:

```
mvn clean test -Parq-wildfly-remote
```

@jose_carmona
