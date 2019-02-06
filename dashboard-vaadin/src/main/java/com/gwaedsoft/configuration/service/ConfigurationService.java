/**
 * 
 */
package com.gwaedsoft.configuration.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.gwaedsoft.configuration.Configuration;

/**
 * @author Pete
 *
 */
public class ConfigurationService 
{
	private List<Configuration> configurationList = new ArrayList<Configuration>();
	private static ConfigurationService configurationService = new ConfigurationService();
	
	public static ConfigurationService getInstance ()
	{
		return configurationService;
	}
	
	private ConfigurationService ()
	{
		Configuration configuration = new Configuration ("Default", 10, 28, 5, 1, 60, false, new BigDecimal (90.0), new BigDecimal (0.03), 
				new BigDecimal (0.03), new BigDecimal (0.03),new BigDecimal (0.03), new BigDecimal (0.0), new BigDecimal (0.0), new BigDecimal (10.00));
		this.configurationList.add(configuration);
	}
	
	public List<Configuration> getAllConfigurations ()
	{
		return this.configurationList;
	}
	
	public Configuration add (Configuration configuration)
	{
		configurationList.add(configuration);
		return configuration;
	}
	
	public void delete (Configuration configuration)
	{
		configurationList.remove(configuration);
	}	
}
