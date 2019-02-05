/**
 * 
 */
package com.gwaedsoft.inventory;

import javax.validation.constraints.NotNull;

/**
 * @author Pete
 *
 */
public class Inventory 
{
	@NotNull
	private String name;
	
	@NotNull
	private String description;
	
	@NotNull
	private String number;
	
	@NotNull
	private String street1;
	
	private String street2;
	
	private String street3;
	
	@NotNull
	private String city;
	
	@NotNull
	private String county;
	
	@NotNull
	private String country;
	
	@NotNull
	private String postCode;
	
	/**
	 * 
	 */
	public Inventory() {
		super();
	}

	/**
	 * @param name
	 * @param description
	 * @param number
	 * @param street1
	 * @param street2
	 * @param street3
	 * @param city
	 * @param county
	 * @param country
	 * @param postCode
	 */
	public Inventory(@NotNull String name, @NotNull String description, @NotNull String number, @NotNull String street1,
			String street2, String street3, @NotNull String city, @NotNull String county, @NotNull String country,
			@NotNull String postCode) {
		super();
		this.name = name;
		this.description = description;
		this.number = number;
		this.street1 = street1;
		this.street2 = street2;
		this.street3 = street3;
		this.city = city;
		this.county = county;
		this.country = country;
		this.postCode = postCode;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the street1
	 */
	public String getStreet1() {
		return street1;
	}

	/**
	 * @param street1 the street1 to set
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	/**
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}

	/**
	 * @param street2 the street2 to set
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	/**
	 * @return the street3
	 */
	public String getStreet3() {
		return street3;
	}

	/**
	 * @param street3 the street3 to set
	 */
	public void setStreet3(String street3) {
		this.street3 = street3;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}


	
}
