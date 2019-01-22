package demand.service

import org.quartz.Scheduler
import org.quartz.impl.StdSchedulerFactory

import groovy.transform.CompileStatic
import io.micronaut.runtime.Micronaut



@CompileStatic
class Application {
    static void main(String[] args) {
		
		// Grab the Scheduler instance from the Factory
		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

		// and start it off
		scheduler.start();

		//scheduler.shutdown();
		
        Micronaut.run(Application)
    }
}