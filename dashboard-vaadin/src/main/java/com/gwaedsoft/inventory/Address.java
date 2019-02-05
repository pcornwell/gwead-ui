/**
 * 
 */
package com.gwaedsoft.inventory;

/**
 * @author Pete
 *
 */
public class Address 
{
	private String number;
	private String street1;
	private String street2;
	private String street3;
	private String city;
	private String county;
	private String country;
	private String postCode;

	
	/**
	 * @param number
	 * @param street1
	 * @param street2
	 * @param street3
	 * @param city
	 * @param county
	 * @param country
	 * @param postCode
	 */
	public Address(String number, String street1, String street2, String street3, String city, String county,
			String country, String postCode) {
		super();
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
