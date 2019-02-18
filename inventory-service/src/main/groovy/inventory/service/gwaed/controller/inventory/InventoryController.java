/**
 * 
 */
package inventory.service.gwaed.controller.inventory;

import grails.gorm.transactions.Transactional;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

/**
 * @author Pete
 *
 */
@Controller("/inventory")
public class InventoryController {
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String list() {

        return "listing Inventory";
    }
}
