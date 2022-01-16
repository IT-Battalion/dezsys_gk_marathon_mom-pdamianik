# Middleware Engineering "*Message Oriented Middleware*"

## Aufgabenstellung
Die detaillierte [Aufgabenstellung](TASK.md) beschreibt die notwendigen Schritte zur Realisierung.

# Abhängigkeiten
 - Docker
 - Gradle (optional)

## Ausführen
Falls `Gradle` installiert ist:

```shell
gradle bootBuildImage
docker-compose up -d
```

ansonsten:

```shell
./gradlew bootBuildImage
docker-compose up -d
```

Danach sind die folgenden Application verfügbar:
 - Apache Mq auf http://localhost:8161/
 - Eine Control Station (Section 1) auf http://localhost:8080/
 - Vier Timing Stations (Section 1, Station 1-4) auf http://localhost:8081/ bis http://localhost:8084/