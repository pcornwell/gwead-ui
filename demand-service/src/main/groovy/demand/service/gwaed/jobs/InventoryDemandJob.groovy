package demand.service.gwaed.jobs;

import org.quartz.DisallowConcurrentExecution
import org.quartz.Job
import org.quartz.JobExecutionContext
import org.quartz.JobExecutionException
import org.quartz.PersistJobDataAfterExecution

import demand.service.IBloodDatabaseConnection
import demand.service.products.PhysiologyVisitor

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class InventoryDemandJob implements Job, PhysiologyVisitor
{

	Long inventoryId = 0
	Long configurationId = 0
	String connectionString = ""
	IBloodDatabaseConnection connection = null
	
	
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException 
	{
		/* the job requires the inventory id, configuration id, and a proxy to talk to the database */
		
	}

}
