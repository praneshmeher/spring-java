package com.pranesh.java;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements Processor {

	@Override
	public void getConfig() {
		System.out.println("MediaTek");
	}

}
