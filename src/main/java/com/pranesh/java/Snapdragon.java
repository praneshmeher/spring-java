package com.pranesh.java;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements Processor {

	@Override
	public void getConfig() {
		System.out.println("Snapdragon");
	}

	
}
