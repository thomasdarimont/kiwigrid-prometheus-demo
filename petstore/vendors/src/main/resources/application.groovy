micronaut.application.name="vendors"
micronaut.server.port=-1
consul.client.defaultZone='${CONSUL_HOST:localhost}:${CONSUL_PORT:8500}'
vendors.api.version="v1"
hibernate {
    hbm2ddl {
        auto = "create-drop"
    }
}
endpoints.all.path='/actuator'
endpoints.all.sensitive=false