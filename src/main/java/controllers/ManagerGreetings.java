package controllers;

import java.time.DayOfWeek;
import java.time.LocalDate;

import jcrystal.clients.ClientAngular;
import jcrystal.reflection.TipoRuta;
import jcrystal.reflection.annotations.PathMethod;

public class ManagerGreetings {
	@ClientAngular
	@PathMethod(TipoRuta.POST)
	public static String greetings(String nombreUsuario){
		LocalDate date = LocalDate.now();
		String response = "";
		if (date.getDayOfWeek().getValue() == 6 || date.getDayOfWeek().getValue() == 7 ) {
			response =  "¡Hello, " + nombreUsuario + "! Wish you have a good day :)";
		} else {
			response =  "¡Hello, " + nombreUsuario + "! Welcome to your best calculator :)";

		}
		
		return response;
	}
}
