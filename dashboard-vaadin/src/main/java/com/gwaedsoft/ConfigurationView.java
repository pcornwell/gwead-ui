/**
 * 
 */
package com.gwaedsoft;

import org.vaadin.crudui.crud.CrudOperation;
import org.vaadin.crudui.crud.impl.GridCrud;
import org.vaadin.crudui.form.impl.field.provider.CheckBoxGroupProvider;
import org.vaadin.crudui.form.impl.form.factory.DefaultCrudFormFactory;

import com.gwaedsoft.configuration.Configuration;
import com.gwaedsoft.configuration.service.ConfigurationService;
import com.gwaedsoft.inventory.service.InventoryService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
/**
 * @author Pete
 *
 */
@Route("configuration")
public class ConfigurationView extends VerticalLayout 
{

	private static final long serialVersionUID = 3422323663L; 
	
	private InventoryService inventoryService = InventoryService.getInstance();
	private ConfigurationService configurationService = ConfigurationService.getInstance();
	
	private Grid<Configuration> inventoryGrid = new Grid<>();
	
	public ConfigurationView ()
	{
		setSizeFull();
    	
    	GridCrud<Configuration> crud = new GridCrud<>(Configuration.class);
    	crud.setFindAllOperation(() -> configurationService.getAllConfigurations());
    	crud.setAddOperation(configurationService::add);
    	crud.setDeleteOperation(configurationService::delete);
    	crud.getCrudFormFactory().setUseBeanValidation(true);
    	
    	crud.getGrid().setColumns("name", "rbcInventoryDays", "plasmaInventoryDays", "sdpInventoryDays");
    	
    	/* set row caption on refresh */
    	crud.setRowCountCaption("%d Configurations found");
    	
    	/* set the form factory */
    	DefaultCrudFormFactory<Configuration> formFactory = new DefaultCrudFormFactory<Configuration>(Configuration.class);
    	crud.setCrudFormFactory(formFactory);
    	
        crud.getCrudFormFactory().setFieldProvider("inventories", new CheckBoxGroupProvider<>(inventoryService.getAllInventories()));
    	
    	/* add operations */
    	formFactory.setButtonCaption(CrudOperation.ADD, "Add new configuration");
    	
    	formFactory.setVisibleProperties("name","rbcInventoryDays", "plasmaInventoryDays", "sdpInventoryDays", "reportingHour", "periodicityInMinutes", "usePooledPlatelets", "wholeBloodCollectionPercentage", "wholeBloodCollectionLoss", "apheresisCollectionLoss",
    			"rbcWholeBloodManufacturingLoss", "plasmaWholeBloodCollectionLoss", "pooledPlateletWholeBloodCollectionLoss", "pooledPlateletCollectionPercentage", "apheresisCollectionPercentage", "inventories");
    	
    	crud.getGrid().setVisible(true);

    	add(crud);		
	}
}
