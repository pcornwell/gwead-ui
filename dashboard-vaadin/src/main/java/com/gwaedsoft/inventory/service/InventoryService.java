/**
 * 
 */
package com.gwaedsoft.inventory.service;

import java.util.ArrayList;
import java.util.List;

import com.gwaedsoft.inventory.Address;
import com.gwaedsoft.inventory.Inventory;

/**
 * @author Pete
 *
 */
public class InventoryService 
{

	private static List<Inventory> inventoryList = new ArrayList<Inventory>();
	private static InventoryService inventoryService = new InventoryService();
	
	public static InventoryService getInstance ()
	{
		return inventoryService;
	}
	
	private InventoryService ()
	{
		/* address */
		Address mockAddress = new Address ("3", "Waterview Court", null, null,
				"Durham", "Durham County", "USA", "27703");
		
		Inventory durham = new Inventory ("Durham", "A local RAL collection point");
		Inventory raleigh = new Inventory ("Raleigh", "A local DUR collection point");
		Inventory chapelHill = new Inventory ("Chapel Hill", "A local CH collection point");	
	
		inventoryList.add(durham);
		inventoryList.add(raleigh);
		inventoryList.add(chapelHill);
	}
	
	public Inventory add (Inventory inventory)
	{
		inventoryList.add(inventory);
		return inventory;
	}
	
	public List<Inventory> getAllInventories ()
	{
		
		return inventoryList;
	}
	
}
