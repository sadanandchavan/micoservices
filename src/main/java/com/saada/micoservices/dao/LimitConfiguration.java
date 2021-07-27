
package com.saada.micoservices.dao;
/**
 * @author sadanand
 *
 * Apr 1, 2020 8:08:56 PM
 */

public class LimitConfiguration {
	
	private int maximum;  
	private int minimum;
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	} 

	//genetrating constructor using fields  
	public LimitConfiguration(int maximum, int minimum){  
		super();  
		this.maximum = maximum;  
		this.minimum = minimum;  
	}  

}

