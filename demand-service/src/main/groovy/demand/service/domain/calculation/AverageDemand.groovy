/**
 * 
 */
package demand.service.domain.calculation;

import demand.service.products.CmvStatus;
import demand.service.products.Product;
import demand.service.products.RhFactor;
import grails.gorm.annotation.Entity;

/**
 * @author Pete
 *
 */
@Entity
public class AverageDemand 
{
	double volume
	Product product
	RhFactor rhFactor
	CmvStatus cmvStatus
}
