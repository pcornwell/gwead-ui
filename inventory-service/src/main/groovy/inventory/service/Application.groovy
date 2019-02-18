package inventory.service

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import inventory.service.Application

@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application)
    }
}