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
@javax.servlet.annotation.WebServlet(name = "SubServletGreetings",urlPatterns = {"/api/greetings/greetings"})
public class SubServletGreetings extends AbsSubServlet{
	private static final long serialVersionUID = 1L;
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SubServletGreetings.class.getName());
	public void doPost(String path, HttpServletRequest req, HttpServletResponse resp) throws Exception{
		switch(path){
			case "/api/greetings/greetings":{
				controllers_ManagerGreetings_greetings(req, resp);
				break;
			}
			default: send404(resp);break;
		}
	}
	static void controllers_ManagerGreetings_greetings(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		JSONObject $body = new JSONObject(new JSONTokener(req.getCharacterEncoding()==null?new java.io.InputStreamReader(req.getInputStream()):new java.io.InputStreamReader(req.getInputStream(), req.getCharacterEncoding())));
		String nombreUsuario = $body.optString("nombreUsuario");
		String $salida = jcrystal.JSONUtils.jsonQuote(controllers.ManagerGreetings.greetings(nombreUsuario));
		resp.getWriter().print("{\"success\":1,\"r\":"+$salida+"}");
	}
}
