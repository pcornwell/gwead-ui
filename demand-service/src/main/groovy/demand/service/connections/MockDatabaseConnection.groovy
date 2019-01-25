/**
 * 
 */
package demand.service.connections;

import demand.service.domain.calculation.Demand;
import demand.service.products.CmvStatus;
import demand.service.products.Product;
import demand.service.products.RhFactor;
import io.micronaut.context.annotation.Primary

/**
 * @author Pete
 *
 */
@Primary
@Singleton
public class MockDatabaseConnection implements IBloodDatabaseConnection 
{

	/* (non-Javadoc)
	 * @see demand.service.connections.IBloodDatabaseConnection#getDemandByDate(java.util.Date)
	 */
	@Override
	public List<Demand> getDemandByDate(Date currentDate) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see demand.service.connections.IBloodDatabaseConnection#getInventoryStockByDateAndPhysiology(java.util.Date, demand.service.products.Product, demand.service.products.RhFactor, demand.service.products.CmvStatus)
	 */
	@Override
	public double getInventoryStockByDateAndPhysiology(Date currentDate, Product product, RhFactor rhFactor,
			CmvStatus cmvStatus) 
	{
			// TODO Auto-generated method stub
		return 0.0;
	}

}
