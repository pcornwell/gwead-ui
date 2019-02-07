/**
 * 
 */
package com.gwaedsoft.apheresis.service;

import java.util.ArrayList;
import java.util.List;

import com.gwaedsoft.apheresis.Procedure;
import com.gwaedsoft.common.IService;
import com.vaadin.flow.router.Route;

/**
 * @author Pete
 *
 */
public class ProcedureService implements IService<Procedure>
{
	private static final ProcedureService procedureService = new ProcedureService();
	
	private List<Procedure> procedureList = new ArrayList<Procedure>();
	
	private ProcedureService ()
	{
		
	}
	
	public static ProcedureService getInstance ()
	{
		return procedureService;
	}

	/* (non-Javadoc)
	 * @see com.gwaedsoft.common.IService#findAll()
	 */
	@Override
	public List<Procedure> findAll() 
	{
		return this.procedureList;
	}

	/* (non-Javadoc)
	 * @see com.gwaedsoft.common.IService#add(java.lang.Object)
	 */
	@Override
	public Procedure add(Procedure instance) 
	{
		this.procedureList.add(instance);
		return instance;
	}

	/* (non-Javadoc)
	 * @see com.gwaedsoft.common.IService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Procedure instance) 
	{
		this.procedureList.remove(instance);		
	}
	
	
}
