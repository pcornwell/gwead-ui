package demand.service.domain.calculation;

import demand.service.products.CmvStatus
import demand.service.products.Product
import demand.service.products.RhFactor
import grails.gorm.annotation.Entity;

@Entity
public class Demand 
{
	Date demandDate
	double volume
	Product product
	RhFactor rhFactor
	CmvStatus cmvStatus
	
	static constraints = {
		cmvStatus nullable : true
	}

}
