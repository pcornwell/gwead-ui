package inventory.service.gwaed.controller.test


import grails.gorm.transactions.Transactional
import inventory.service.gwead.domain.test.Test
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces


@Controller("/hello")
class HelloController {
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String index() {

        Test test = new Test(name:"Pete")
        test.save(flush:true)

        return "Hello World test id is ${test.id}";
    }
}