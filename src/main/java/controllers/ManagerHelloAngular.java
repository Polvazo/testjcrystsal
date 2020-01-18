package controllers;

import jcrystal.clients.ClientAngular;
import jcrystal.clients.ClientWeb;

public class ManagerHelloAngular {
	@ClientWeb
    public static String helloWorldAngular(){
        return "Hello World to Angular from jCrystal!";
    }
}
