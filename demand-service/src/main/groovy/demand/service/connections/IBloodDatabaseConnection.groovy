/**
 * 
 */
package demand.service.connections;

import demand.service.domain.calculation.Demand
import demand.service.products.CmvStatus
import demand.service.products.Product
import demand.service.products.RhFactor

/**
 * @author pete_
 *
 */
public interface IBloodDatabaseConnection 
{
	/**
	 * gets a list of all outgoing products
	 * @param currentDate
	 * @return
	 */
	List<Demand> getDemandByDate (Date currentDate);
	
	/**
	 * gets the stock in volume by date and physiology
	 * @param currentDate
	 * @param product
	 * @param rhFactor
	 * @param cmvStatus
	 * @return
	 */
	double getInventoryStockByDateAndPhysiology  (Date currentDate, Product product, RhFactor rhFactor,
		CmvStatus cmvStatus);

}
