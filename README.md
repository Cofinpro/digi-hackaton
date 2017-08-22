[![Build Status](https://travis-ci.org/Cofinpro/digi-hackaton.svg?branch=master)](https://travis-ci.org/Cofinpro/digi-hackaton)
# Repo zu unserem Digi-Hackaton
Repo für den Geno-Hackaton

## Questions

Ein Angular-Projekt, das die Fragestrecke abbildet. Wir haben es mit der Angular-Cli generiert:

```
npm install -g @angular/cli
ng new questions
```

Das Ausführen läuft über die Angular-CLI:

```
# Run
ng serve

# Test
ng test
```

## Registration

Eine Wildfly-Swarm app. Wir haben Sie über den Generator auf der Homepage angelegt: wildfly-swarm.io

Sie läuft über Maven:
```
mvn package
java -jar target demo.jar

# Alternativ
mvn wildfly-swarm:run
```
