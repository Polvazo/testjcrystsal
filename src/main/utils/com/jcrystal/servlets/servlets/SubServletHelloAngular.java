package com.jcrystal.servlets.servlets;
import org.json.JSONObject;
import org.json.JSONTokener;
import jcrystal.utils.InternalException;
import jcrystal.utils.ValidationException;
import jcrystal.datetime.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jcrystal.utils.ServletUtils.*;
@SuppressWarnings("unused")
@javax.servlet.annotation.WebServlet(name = "SubServletHelloAngular",urlPatterns = {"/api/helloAngular/helloWorldAngular"})
public class SubServletHelloAngular extends AbsSubServlet{
	private static final long serialVersionUID = 1L;
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SubServletHelloAngular.class.getName());
	public void doGet(String path, HttpServletRequest req, HttpServletResponse resp) throws Exception{
		switch(path){
			case "/api/helloAngular/helloWorldAngular":{
				controllers_ManagerHelloAngular_helloWorldAngular(req, resp);
				break;
			}
			default: send404(resp);break;
		}
	}
	static void controllers_ManagerHelloAngular_helloWorldAngular(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		String $salida = jcrystal.JSONUtils.jsonQuote(controllers.ManagerHelloAngular.helloWorldAngular());
		resp.getWriter().print("{\"success\":1,\"r\":"+$salida+"}");
	}
}
