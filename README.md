# Prometheus Demo

This repo contains a prometheus demo setup with [Docker Compose](https://docs.docker.com/compose/) and includes following components:

* [Prometheus](https://prometheus.io)
* [Grafana](https://grafana.com)
* [Micronaut Petstore](https://github.com/micronaut-projects/micronaut-examples)
* [Traefik](https://traefik.io)

## Usage

Start setup

```bash
docker-compose up -d
```

* Micronaut Petstore Storefront: <http://localhost:8080>
* Micronaut Petstore Frontend: <http://localhost:3000>
* Grafana (Login admin/admin): <http://localhost:3001>
* Prometheus: <http://localhost:9090>
* Traefik: <http://localhost:8086/>

Stop

```bash
docker-compose down
```
