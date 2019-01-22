package demand.service.domain.calculation;

import demand.service.products.PhysiologyVisitor
import grails.gorm.annotation.Entity

/**
 * this class calculate a moving average based on a period (in days)
 * typically associated with a product type
 * @author pete_
 *
 */

@Entity
public class MovingAverage
{
	/* the window will be based on Product x RhFactor X CMV */
    LinkedList window
	static hasMany = [window:Demand] 
	
	
    private final int period;
    private double sum;

    public MovingAverage(int period, List volumeList) {
        assert period > 0 : "Period must be a positive integer";
        this.period = period;
        volumeList.each {
            this.nextValue(it)
        }

    }

    public void nextValue(double num) {
        sum += num;
        window.add(num);
        if (window.size() > period) {
            sum -= window.remove();
        }
    }

    public double getAverage() {
        if (window.isEmpty()) {
            return 0.0
        }; // technically the average is undefined
        return sum / window.size();
    }

}
