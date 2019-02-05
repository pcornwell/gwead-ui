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
	
	/**
	 * 
	 */
	public Inventory() {
		super();
	}
	/**
	 * @param name
	 * @param description
	 * @param address
	 */
	public Inventory(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		
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
	
	
	
	
}
