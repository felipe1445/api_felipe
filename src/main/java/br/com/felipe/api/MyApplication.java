package br.com.felipe.api;


import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class MyApplication extends ResourceConfig{
	
	public MyApplication() {
		
	}

}