/**
 * 
 */
package com.gwaedsoft;

import org.vaadin.crudui.crud.CrudOperation;
import org.vaadin.crudui.crud.impl.GridCrud;
import org.vaadin.crudui.form.impl.form.factory.DefaultCrudFormFactory;

import com.gwaedsoft.apheresis.Procedure;
import com.gwaedsoft.apheresis.service.ProcedureService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author Pete
 *
 */
@Route("procedures")
public class ProcedureView extends VerticalLayout 
{

	private static final long serialVersionUID = 3226354732L;
	
	private ProcedureService procedureService = ProcedureService.getInstance();
	private Grid<Procedure> procedureGrid = new Grid<>();
	
	public ProcedureView ()
	{
    	setSizeFull();
    	
    	GridCrud<Procedure> crud = new GridCrud<>(Procedure.class);
    	crud.setFindAllOperation(() -> procedureService.findAll());
    	crud.setAddOperation(procedureService::add);
    	crud.setDeleteOperation(procedureService::delete);
    	crud.getCrudFormFactory().setUseBeanValidation(true);
    	
    	crud.getGrid().setColumns("name", "redBloodCells", "plasma", "singleDonorPlatelets");
    	
    	/* set row caption on refresh */
    	crud.setRowCountCaption("%d Procedures found");
    	
    	/* set the form factory */
    	DefaultCrudFormFactory<Procedure> formFactory = new DefaultCrudFormFactory<Procedure>(Procedure.class);
    	crud.setCrudFormFactory(formFactory);
    	
    	/* add operations */
    	formFactory.setButtonCaption(CrudOperation.ADD, "Add new procedure");

    	formFactory.setVisibleProperties("name","redBloodCells", "plasma", "singleDonorPlatelets", "marginalContribution", "oPositiveDonorEligibilityPercentage", "oNegativeDonorEligibilityPercentage", 
    			"aPositiveDonorEligibilityPercentage", "aNegativeDonorEligibilityPercentage", "bPositiveDonorEligibilityPercentage",
    			"bNegativeDonorEligibilityPercentage", "aBPositiveDonorEligibilityPercentage", "aBNegativeDonorEligibilityPercentage");
    	
    	crud.getGrid().setVisible(true);

    	add(crud);		
	}
}
