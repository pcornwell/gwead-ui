/**
 * 
 */
package demand.service.gwaed.service;

import demand.service.connections.IBloodDatabaseConnection
import demand.service.connections.MockDatabaseConnection
import demand.service.domain.calculation.Demand
import demand.service.products.PhysiologyVisitor
import grails.gorm.transactions.Transactional;

/**
 * @author Pete
 *
 */
public class DemandService implements PhysiologyVisitor 
{
	/* inject the database connection */
	IBloodDatabaseConnection connection = new MockDatabaseConnection();
	
	
	/*
	 * 
	 */
	@Transactional
	def calculateDemand (Date currentDate)
	{
		/* pull the demand list from the connection */
		List<Demand> currentDemand = connection.getDemandByDate(currentDate)
		
		/* calculate moving average for each Product x RH x CMV */
		
		/* return data structure */
	}
}
