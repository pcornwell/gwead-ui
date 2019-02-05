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
		
		Inventory durham = new Inventory ("Durham", "A local RAL collection point", "3", "Waterview Court", null, null,
				"Durham", "Durham County", "USA", "27703");
		Inventory raleigh = new Inventory ("Raleigh", "A local DUR collection point", "3", "Waterview Court", null, null,
				"Raleigh", "Wake County", "USA", "27703");
		Inventory chapelHill = new Inventory ("Chapel Hill", "A local CH collection point", "3", "Waterview Court", null, null,
				"Chapel Hill", "Orange County", "USA", "27703");	
	
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
