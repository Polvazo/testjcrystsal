package controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import jcrystal.reflection.TipoRuta;
import jcrystal.reflection.annotations.PathMethod;

public class ManagerOperador {
	@PathMethod(TipoRuta.GET)
	public static ArrayList<String> operadores(){
		ArrayList<String> operadores = new ArrayList<String>();
		operadores.add("+");
		operadores.add("-");
		operadores.add("*");
		operadores.add("/");
		
		return operadores;
	}
	
	
	@PathMethod(TipoRuta.POST)
	public static Integer operadore(Integer numero1,Integer numero2, String operador){
		Integer response = -1;
		if (operador.equals("+")) {response =  numero1 + numero2; }
		else if (operador.equals("-")) {response =  Math.abs(numero1 - numero2);}
		else if (operador.equals("*")) {response =  numero1 * numero2;}
		else if (operador.equals("/")) {response =  numero1 / numero2;}
		return response;
	}
}
