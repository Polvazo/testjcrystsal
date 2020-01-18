package controllers;

import jcrystal.clients.ClientAngular;
import jcrystal.clients.ClientWeb;

public class ManagerHello {
	
	@ClientAngular
	public static String helloworld(){
		return "Hello World from jCrystal!";
	}
}
