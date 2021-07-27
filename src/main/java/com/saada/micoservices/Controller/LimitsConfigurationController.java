
package com.saada.micoservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saada.micoservices.dao.Configuration;
import com.saada.micoservices.dao.LimitConfiguration;

/**
 * @author sadanand
 *
 * Apr 1, 2020 8:06:24 PM
 */
@RestController
public class LimitsConfigurationController {
	@Autowired    
	private Configuration configuration;   
	
	
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
		//return new LimitConfiguration(1000, 1);
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMaximum());  
	}  

}

