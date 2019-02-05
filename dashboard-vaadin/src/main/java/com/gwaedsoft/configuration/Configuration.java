/**
 * 
 */
package com.gwaedsoft.configuration;


import java.math.BigDecimal;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
/**
 * @author Pete
 *
 */
public class Configuration 
{
	@NotNull
	private String name;
	
	@NotNull
	@Min (1)
	private int rbcInventoryDays;
	
	@NotNull
	@Min (1)
	private int plasmaInventoryDays;
	
	@NotNull
	@Min (1)
	private int sdpInventoryDays;
	
	@NotNull
	@Min (1)
	@Max (23)
	private int reportingHour = 1;
	
	@NotNull
	@Min (1)
	@Max (60)
	private int periodicityInMinutes = 60;
	
	@NotNull
	private boolean usePooledPlatelets = false;
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.00")
	private BigDecimal wholeBloodCollectionPercentage = new BigDecimal(0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	private BigDecimal wholeBloodCollectionLoss= new BigDecimal(0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	private BigDecimal apheresisCollectionLoss= new BigDecimal(0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	private BigDecimal rbcWholeBloodManufacturingLoss = new BigDecimal(0.0);	
	
	@NotNull
	@DecimalMin ("0.00")
	private BigDecimal plasmaWholeBloodCollectionLoss = new BigDecimal(0.0);	
	
	@DecimalMin ("0.00")
	private BigDecimal pooledPlateletholeBloodCollectionLoss = new BigDecimal(0.0);	
	
	@NotNull 	
	@DecimalMin ("0.00")
	private BigDecimal pooledPlateletCollectionPercentage = new BigDecimal(0.0);	
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.00")
	private BigDecimal apheresisCollectionPercentage = new BigDecimal(0.0);

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rbcInventoryDays
	 */
	public int getRbcInventoryDays() {
		return rbcInventoryDays;
	}

	/**
	 * @param rbcInventoryDays the rbcInventoryDays to set
	 */
	public void setRbcInventoryDays(int rbcInventoryDays) {
		this.rbcInventoryDays = rbcInventoryDays;
	}

	/**
	 * @return the plasmaInventoryDays
	 */
	public int getPlasmaInventoryDays() {
		return plasmaInventoryDays;
	}

	/**
	 * @param plasmaInventoryDays the plasmaInventoryDays to set
	 */
	public void setPlasmaInventoryDays(int plasmaInventoryDays) {
		this.plasmaInventoryDays = plasmaInventoryDays;
	}

	/**
	 * @return the sdpInventoryDays
	 */
	public int getSdpInventoryDays() {
		return sdpInventoryDays;
	}

	/**
	 * @param sdpInventoryDays the sdpInventoryDays to set
	 */
	public void setSdpInventoryDays(int sdpInventoryDays) {
		this.sdpInventoryDays = sdpInventoryDays;
	}

	/**
	 * @return the reportingHour
	 */
	public int getReportingHour() {
		return reportingHour;
	}

	/**
	 * @param reportingHour the reportingHour to set
	 */
	public void setReportingHour(int reportingHour) {
		this.reportingHour = reportingHour;
	}

	/**
	 * @return the periodicityInMinutes
	 */
	public int getPeriodicityInMinutes() {
		return periodicityInMinutes;
	}

	/**
	 * @param periodicityInMinutes the periodicityInMinutes to set
	 */
	public void setPeriodicityInMinutes(int periodicityInMinutes) {
		this.periodicityInMinutes = periodicityInMinutes;
	}

	/**
	 * @return the wholeBloodCollectionPercentage
	 */
	public BigDecimal getWholeBloodCollectionPercentage() {
		return wholeBloodCollectionPercentage;
	}

	/**
	 * @param wholeBloodCollectionPercentage the wholeBloodCollectionPercentage to set
	 */
	public void setWholeBloodCollectionPercentage(BigDecimal wholeBloodCollectionPercentage) {
		this.wholeBloodCollectionPercentage = wholeBloodCollectionPercentage;
	}

	/**
	 * @return the wholeBloodCollectionLoss
	 */
	public BigDecimal getWholeBloodCollectionLoss() {
		return wholeBloodCollectionLoss;
	}

	/**
	 * @param wholeBloodCollectionLoss the wholeBloodCollectionLoss to set
	 */
	public void setWholeBloodCollectionLoss(BigDecimal wholeBloodCollectionLoss) {
		this.wholeBloodCollectionLoss = wholeBloodCollectionLoss;
	}

	/**
	 * @return the apheresisCollectionLoss
	 */
	public BigDecimal getApheresisCollectionLoss() {
		return apheresisCollectionLoss;
	}

	/**
	 * @param apheresisCollectionLoss the apheresisCollectionLoss to set
	 */
	public void setApheresisCollectionLoss(BigDecimal apheresisCollectionLoss) {
		this.apheresisCollectionLoss = apheresisCollectionLoss;
	}

	/**
	 * @return the rbcWholeBloodManufacturingLoss
	 */
	public BigDecimal getRbcWholeBloodManufacturingLoss() {
		return rbcWholeBloodManufacturingLoss;
	}

	/**
	 * @param rbcWholeBloodManufacturingLoss the rbcWholeBloodManufacturingLoss to set
	 */
	public void setRbcWholeBloodManufacturingLoss(BigDecimal rbcWholeBloodManufacturingLoss) {
		this.rbcWholeBloodManufacturingLoss = rbcWholeBloodManufacturingLoss;
	}

	/**
	 * @return the plasmaWholeBloodCollectionLoss
	 */
	public BigDecimal getPlasmaWholeBloodCollectionLoss() {
		return plasmaWholeBloodCollectionLoss;
	}

	/**
	 * @param plasmaWholeBloodCollectionLoss the plasmaWholeBloodCollectionLoss to set
	 */
	public void setPlasmaWholeBloodCollectionLoss(BigDecimal plasmaWholeBloodCollectionLoss) {
		this.plasmaWholeBloodCollectionLoss = plasmaWholeBloodCollectionLoss;
	}

	/**
	 * @return the pooledPlateletholeBloodCollectionLoss
	 */
	public BigDecimal getPooledPlateletholeBloodCollectionLoss() {
		return pooledPlateletholeBloodCollectionLoss;
	}

	/**
	 * @param pooledPlateletholeBloodCollectionLoss the pooledPlateletholeBloodCollectionLoss to set
	 */
	public void setPooledPlateletholeBloodCollectionLoss(BigDecimal pooledPlateletholeBloodCollectionLoss) {
		this.pooledPlateletholeBloodCollectionLoss = pooledPlateletholeBloodCollectionLoss;
	}

	/**
	 * @return the usePooledPlatelets
	 */
	public boolean isUsePooledPlatelets() {
		return usePooledPlatelets;
	}

	/**
	 * @param usePooledPlatelets the usePooledPlatelets to set
	 */
	public void setUsePooledPlatelets(boolean usePooledPlatelets) {
		this.usePooledPlatelets = usePooledPlatelets;
	}

	/**
	 * @return the pooledPlateletCollectionPercentage
	 */
	public BigDecimal getPooledPlateletCollectionPercentage() {
		return pooledPlateletCollectionPercentage;
	}

	/**
	 * @param pooledPlateletCollectionPercentage the pooledPlateletCollectionPercentage to set
	 */
	public void setPooledPlateletCollectionPercentage(BigDecimal pooledPlateletCollectionPercentage) {
		this.pooledPlateletCollectionPercentage = pooledPlateletCollectionPercentage;
	}

	/**
	 * @return the apheresisCollectionPercentage
	 */
	public BigDecimal getApheresisCollectionPercentage() {
		return apheresisCollectionPercentage;
	}

	/**
	 * @param apheresisCollectionPercentage the apheresisCollectionPercentage to set
	 */
	public void setApheresisCollectionPercentage(BigDecimal apheresisCollectionPercentage) {
		this.apheresisCollectionPercentage = apheresisCollectionPercentage;
	}
	
	

	
}
