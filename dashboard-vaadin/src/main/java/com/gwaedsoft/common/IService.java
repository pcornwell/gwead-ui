/**
 * 
 */
package com.gwaedsoft.common;

import java.util.List;

/**
 * @author Pete
 *
 */
public interface IService <T> 
{
	public List<T> findAll ();
	
	public T add (T instance);
	
	public void delete (T instance);
}
