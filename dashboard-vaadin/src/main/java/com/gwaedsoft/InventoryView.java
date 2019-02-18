package com.gwaedsoft;

import org.vaadin.crudui.crud.CrudOperation;
import org.vaadin.crudui.crud.impl.GridCrud;
import org.vaadin.crudui.form.impl.form.factory.DefaultCrudFormFactory;

import com.gwaedsoft.inventory.Inventory;
import com.gwaedsoft.inventory.service.InventoryService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.TextRenderer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
	 * 
	 */
	
/**
 * The main view contains a button and a click listener.
 */
@Route("inventory")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class InventoryView extends VerticalLayout 
{

	private static final long serialVersionUID = 98765663663L; 
	
	private InventoryService inventoryService = InventoryService.getInstance();
	
	private Grid<Inventory> inventoryGrid = new Grid<>();
	
    public InventoryView() 
    {
    
    	setSizeFull();
    	
    	GridCrud<Inventory> crud = new GridCrud<>(Inventory.class);
    	crud.setFindAllOperation(() -> inventoryService.findAll());
    	crud.setAddOperation(inventoryService::add);
    	crud.setDeleteOperation(inventoryService::delete);
    	crud.getCrudFormFactory().setUseBeanValidation(true);
    	
    	crud.getGrid().setColumns("name", "description", "county", "city");
    	
    	/* set row caption on refresh */
    	crud.setRowCountCaption("%d Inventories found");
    	
    	/* set the form factory */
    	DefaultCrudFormFactory<Inventory> formFactory = new DefaultCrudFormFactory<Inventory>(Inventory.class);
    	crud.setCrudFormFactory(formFactory);
    	
    	/* add operations */
    	formFactory.setButtonCaption(CrudOperation.ADD, "Add new inventory");
    	formFactory.setVisibleProperties("name","description", "number", "street1", "street2", "street3", "city", "county", "country", "postCode");
    	
    	crud.getGrid().setVisible(true);

    	add(crud);
    }
}
