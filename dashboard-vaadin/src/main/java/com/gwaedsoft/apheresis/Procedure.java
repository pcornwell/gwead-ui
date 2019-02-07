/**
 * 
 */
package com.gwaedsoft.apheresis;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

/**
 * @author Pete
 *
 */
public class Procedure 
{
	@NotNull
	private String name;
	
	@NotNull
	@DecimalMin ("0.00")
	private BigDecimal redBloodCells = new BigDecimal (0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	private BigDecimal plasma = new BigDecimal (0.0);	
	
	@NotNull
	@DecimalMin ("0.00")
	private BigDecimal singleDonorPlatelets = new BigDecimal (0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	private BigDecimal marginalContribution = new BigDecimal (0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.0")
	private BigDecimal oPositiveDonorEligibilityPercentage = new BigDecimal (0.0);	
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.0")
	private BigDecimal oNegativeDonorEligibilityPercentage = new BigDecimal (0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.0")
	private BigDecimal aPositiveDonorEligibilityPercentage = new BigDecimal (0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.0")
	private BigDecimal aNegativeDonorEligibilityPercentage = new BigDecimal (0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.0")
	private BigDecimal bPositiveDonorEligibilityPercentage = new BigDecimal (0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.0")
	private BigDecimal bNegativeDonorEligibilityPercentage = new BigDecimal (0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.0")
	private BigDecimal aBPositiveDonorEligibilityPercentage = new BigDecimal (0.0);
	
	@NotNull
	@DecimalMin ("0.00")
	@DecimalMax ("100.0")
	private BigDecimal aBNegativeDonorEligibilityPercentage = new BigDecimal (0.0);

	
	
	
	/**
	 * 
	 */
	public Procedure() {
		super();
	}

	/**
	 * @param name
	 * @param redBloodCells
	 * @param plasma
	 * @param singleDonorPlatelets
	 * @param marginalContribution
	 * @param oPositiveDonorEligibilityPercentage
	 * @param oNegativeDonorEligibilityPercentage
	 * @param aPositiveDonorEligibilityPercentage
	 * @param aNegativeDonorEligibilityPercentage
	 * @param bPositiveDonorEligibilityPercentage
	 * @param bNegativeDonorEligibilityPercentage
	 * @param aBPositiveDonorEligibilityPercentage
	 * @param aBNegativeDonorEligibilityPercentage
	 */
	public Procedure(@NotNull String name, @NotNull @DecimalMin("0.00") BigDecimal redBloodCells,
			@NotNull @DecimalMin("0.00") BigDecimal plasma,
			@NotNull @DecimalMin("0.00") BigDecimal singleDonorPlatelets,
			@NotNull @DecimalMin("0.00") BigDecimal marginalContribution,
			@NotNull @DecimalMin("0.00") @DecimalMax("100.0") BigDecimal oPositiveDonorEligibilityPercentage,
			@NotNull @DecimalMin("0.00") @DecimalMax("100.0") BigDecimal oNegativeDonorEligibilityPercentage,
			@NotNull @DecimalMin("0.00") @DecimalMax("100.0") BigDecimal aPositiveDonorEligibilityPercentage,
			@NotNull @DecimalMin("0.00") @DecimalMax("100.0") BigDecimal aNegativeDonorEligibilityPercentage,
			@NotNull @DecimalMin("0.00") @DecimalMax("100.0") BigDecimal bPositiveDonorEligibilityPercentage,
			@NotNull @DecimalMin("0.00") @DecimalMax("100.0") BigDecimal bNegativeDonorEligibilityPercentage,
			@NotNull @DecimalMin("0.00") @DecimalMax("100.0") BigDecimal aBPositiveDonorEligibilityPercentage,
			@NotNull @DecimalMin("0.00") @DecimalMax("100.0") BigDecimal aBNegativeDonorEligibilityPercentage) {
		super();
		this.name = name;
		this.redBloodCells = redBloodCells;
		this.plasma = plasma;
		this.singleDonorPlatelets = singleDonorPlatelets;
		this.marginalContribution = marginalContribution;
		this.oPositiveDonorEligibilityPercentage = oPositiveDonorEligibilityPercentage;
		this.oNegativeDonorEligibilityPercentage = oNegativeDonorEligibilityPercentage;
		this.aPositiveDonorEligibilityPercentage = aPositiveDonorEligibilityPercentage;
		this.aNegativeDonorEligibilityPercentage = aNegativeDonorEligibilityPercentage;
		this.bPositiveDonorEligibilityPercentage = bPositiveDonorEligibilityPercentage;
		this.bNegativeDonorEligibilityPercentage = bNegativeDonorEligibilityPercentage;
		this.aBPositiveDonorEligibilityPercentage = aBPositiveDonorEligibilityPercentage;
		this.aBNegativeDonorEligibilityPercentage = aBNegativeDonorEligibilityPercentage;
	}

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
	 * @return the redBloodCells
	 */
	public BigDecimal getRedBloodCells() {
		return redBloodCells;
	}

	/**
	 * @param redBloodCells the redBloodCells to set
	 */
	public void setRedBloodCells(BigDecimal redBloodCells) {
		this.redBloodCells = redBloodCells;
	}

	/**
	 * @return the plasma
	 */
	public BigDecimal getPlasma() {
		return plasma;
	}

	/**
	 * @param plasma the plasma to set
	 */
	public void setPlasma(BigDecimal plasma) {
		this.plasma = plasma;
	}

	/**
	 * @return the singleDonorPlatelets
	 */
	public BigDecimal getSingleDonorPlatelets() {
		return singleDonorPlatelets;
	}

	/**
	 * @param singleDonorPlatelets the singleDonorPlatelets to set
	 */
	public void setSingleDonorPlatelets(BigDecimal singleDonorPlatelets) {
		this.singleDonorPlatelets = singleDonorPlatelets;
	}

	/**
	 * @return the marginalContribution
	 */
	public BigDecimal getMarginalContribution() {
		return marginalContribution;
	}

	/**
	 * @param marginalContribution the marginalContribution to set
	 */
	public void setMarginalContribution(BigDecimal marginalContribution) {
		this.marginalContribution = marginalContribution;
	}

	/**
	 * @return the oPositiveDonorEligibilityPercentage
	 */
	public BigDecimal getoPositiveDonorEligibilityPercentage() {
		return oPositiveDonorEligibilityPercentage;
	}

	/**
	 * @param oPositiveDonorEligibilityPercentage the oPositiveDonorEligibilityPercentage to set
	 */
	public void setoPositiveDonorEligibilityPercentage(BigDecimal oPositiveDonorEligibilityPercentage) {
		this.oPositiveDonorEligibilityPercentage = oPositiveDonorEligibilityPercentage;
	}

	/**
	 * @return the oNegativeDonorEligibilityPercentage
	 */
	public BigDecimal getoNegativeDonorEligibilityPercentage() {
		return oNegativeDonorEligibilityPercentage;
	}

	/**
	 * @param oNegativeDonorEligibilityPercentage the oNegativeDonorEligibilityPercentage to set
	 */
	public void setoNegativeDonorEligibilityPercentage(BigDecimal oNegativeDonorEligibilityPercentage) {
		this.oNegativeDonorEligibilityPercentage = oNegativeDonorEligibilityPercentage;
	}

	/**
	 * @return the aPositiveDonorEligibilityPercentage
	 */
	public BigDecimal getaPositiveDonorEligibilityPercentage() {
		return aPositiveDonorEligibilityPercentage;
	}

	/**
	 * @param aPositiveDonorEligibilityPercentage the aPositiveDonorEligibilityPercentage to set
	 */
	public void setaPositiveDonorEligibilityPercentage(BigDecimal aPositiveDonorEligibilityPercentage) {
		this.aPositiveDonorEligibilityPercentage = aPositiveDonorEligibilityPercentage;
	}

	/**
	 * @return the aNegativeDonorEligibilityPercentage
	 */
	public BigDecimal getaNegativeDonorEligibilityPercentage() {
		return aNegativeDonorEligibilityPercentage;
	}

	/**
	 * @param aNegativeDonorEligibilityPercentage the aNegativeDonorEligibilityPercentage to set
	 */
	public void setaNegativeDonorEligibilityPercentage(BigDecimal aNegativeDonorEligibilityPercentage) {
		this.aNegativeDonorEligibilityPercentage = aNegativeDonorEligibilityPercentage;
	}

	/**
	 * @return the bPositiveDonorEligibilityPercentage
	 */
	public BigDecimal getbPositiveDonorEligibilityPercentage() {
		return bPositiveDonorEligibilityPercentage;
	}

	/**
	 * @param bPositiveDonorEligibilityPercentage the bPositiveDonorEligibilityPercentage to set
	 */
	public void setbPositiveDonorEligibilityPercentage(BigDecimal bPositiveDonorEligibilityPercentage) {
		this.bPositiveDonorEligibilityPercentage = bPositiveDonorEligibilityPercentage;
	}

	/**
	 * @return the bNegativeDonorEligibilityPercentage
	 */
	public BigDecimal getbNegativeDonorEligibilityPercentage() {
		return bNegativeDonorEligibilityPercentage;
	}

	/**
	 * @param bNegativeDonorEligibilityPercentage the bNegativeDonorEligibilityPercentage to set
	 */
	public void setbNegativeDonorEligibilityPercentage(BigDecimal bNegativeDonorEligibilityPercentage) {
		this.bNegativeDonorEligibilityPercentage = bNegativeDonorEligibilityPercentage;
	}

	/**
	 * @return the aBPositiveDonorEligibilityPercentage
	 */
	public BigDecimal getaBPositiveDonorEligibilityPercentage() {
		return aBPositiveDonorEligibilityPercentage;
	}

	/**
	 * @param aBPositiveDonorEligibilityPercentage the aBPositiveDonorEligibilityPercentage to set
	 */
	public void setaBPositiveDonorEligibilityPercentage(BigDecimal aBPositiveDonorEligibilityPercentage) {
		this.aBPositiveDonorEligibilityPercentage = aBPositiveDonorEligibilityPercentage;
	}

	/**
	 * @return the aBNegativeDonorEligibilityPercentage
	 */
	public BigDecimal getaBNegativeDonorEligibilityPercentage() {
		return aBNegativeDonorEligibilityPercentage;
	}

	/**
	 * @param aBNegativeDonorEligibilityPercentage the aBNegativeDonorEligibilityPercentage to set
	 */
	public void setaBNegativeDonorEligibilityPercentage(BigDecimal aBNegativeDonorEligibilityPercentage) {
		this.aBNegativeDonorEligibilityPercentage = aBNegativeDonorEligibilityPercentage;
	}
	
	
}
