/**
 * 
 */
package com.gwaedsoft.inventory.service;

import java.util.ArrayList;
import java.util.List;

import com.gwaedsoft.common.IService;
import com.gwaedsoft.inventory.Procedure;

/**
 * @author Pete
 *
 */
public class InventoryService implements IService<Procedure>
{

	private static List<Procedure> inventoryList = new ArrayList<Procedure>();
	private static InventoryService inventoryService = new InventoryService();
	
	public static InventoryService getInstance ()
	{
		return inventoryService;
	}
	
	private InventoryService ()
	{
		
		Procedure durham = new Procedure ("Durham", "A local RAL collection point", "3", "Waterview Court", null, null,
				"Durham", "Durham County", "USA", "27703");
		Procedure raleigh = new Procedure ("Raleigh", "A local DUR collection point", "3", "Waterview Court", null, null,
				"Raleigh", "Wake County", "USA", "27703");
		Procedure chapelHill = new Procedure ("Chapel Hill", "A local CH collection point", "3", "Waterview Court", null, null,
				"Chapel Hill", "Orange County", "USA", "27703");	
	
		inventoryList.add(durham);
		inventoryList.add(raleigh);
		inventoryList.add(chapelHill);
	}
	
	public Procedure add (Procedure inventory)
	{
		inventoryList.add(inventory);
		return inventory;
	}
	
	public void delete (Procedure inventory)
	{
		inventoryList.remove(inventory);
	}
	
	public List<Procedure> findAll ()
	{
		return inventoryList;
	}
	
}
