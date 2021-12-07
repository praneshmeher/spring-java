package com.pranesh.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sam")
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTek")
	private Processor pname;
	
	public void getConfig() {
		System.out.println("Samsung config");
		pname.getConfig();
	}
}
