# Docker Container bauen und ausführen
* Ins Frontend-Projekt navigieren (`cd ....`)
* Frontend-Projekt bauen (mit `ng build`), sodass der `dist`-Ordner im `docker/`-Ordner erstellt wird
* Docker-Image bauen: `docker build -t "IMAGE-NAME"`
* Docker Container ausführen: `docker run --name "CONTAINERNAME" -d -p 5000:80 IMAGE-NAME`
b
