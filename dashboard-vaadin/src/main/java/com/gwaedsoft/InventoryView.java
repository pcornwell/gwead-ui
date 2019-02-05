package com.gwaedsoft;

import org.vaadin.crudui.crud.impl.GridCrud;

import com.gwaedsoft.inventory.Inventory;
import com.gwaedsoft.inventory.service.InventoryService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class InventoryView extends VerticalLayout 
{

	private InventoryService inventoryService = InventoryService.getInstance();
	
	private Grid<Inventory> inventoryGrid = new Grid<>();
	
    public InventoryView() {
//        Button button = new Button("Click me",
//                event -> Notification.show("Clicked!"));
//        add(button);
//        this.setSizeFull();
//    	inventoryGrid.setSizeFull();
//    	
//    	inventoryGrid.addColumn(Inventory::getName).setHeader("Name");
//    	inventoryGrid.addColumn(Inventory::getDescription).setHeader("Description");  	
//    	inventoryGrid.setHeight("100vh");
//    	
//    	this.inventoryGrid.setItems(inventoryService.getAllInventories());
    	
    
    	setSizeFull();
    	
    	GridCrud<Inventory> crud = new GridCrud<>(Inventory.class);
    	crud.setFindAllOperation(() -> inventoryService.getAllInventories());
    	crud.setAddOperation(inventoryService::add);
    	crud.getCrudFormFactory().setUseBeanValidation(true);
    	
    	crud.getGrid().setColumns("name", "description");
    	crud.getGrid().setVisible(true);
    	
    	
    	
    	add(crud);
    }
}
