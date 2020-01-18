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
@javax.servlet.annotation.WebServlet(name = "SubServletOperador",urlPatterns = {"/api/operador/operadore", "/api/operador/operadores"})
public class SubServletOperador extends AbsSubServlet{
	private static final long serialVersionUID = 1L;
	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(SubServletOperador.class.getName());
	public void doGet(String path, HttpServletRequest req, HttpServletResponse resp) throws Exception{
		switch(path){
			case "/api/operador/operadores":{
				controllers_ManagerOperador_operadores(req, resp);
				break;
			}
			default: send404(resp);break;
		}
	}
	public void doPost(String path, HttpServletRequest req, HttpServletResponse resp) throws Exception{
		switch(path){
			case "/api/operador/operadore":{
				controllers_ManagerOperador_operadore(req, resp);
				break;
			}
			default: send404(resp);break;
		}
	}
	static void controllers_ManagerOperador_operadore(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		JSONObject $body = new JSONObject(new JSONTokener(req.getCharacterEncoding()==null?new java.io.InputStreamReader(req.getInputStream()):new java.io.InputStreamReader(req.getInputStream(), req.getCharacterEncoding())));
		Integer numero1 = $body.has("numero1")?$body.optInt("numero1", 0):null;
		Integer numero2 = $body.has("numero2")?$body.optInt("numero2", 0):null;
		String operador = $body.optString("operador");
		Integer $salida = controllers.ManagerOperador.operadore(numero1,numero2,operador);
		resp.getWriter().print("{\"success\":1,\"r\":"+$salida+"}");
	}
	static void controllers_ManagerOperador_operadores(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		java.util.ArrayList<java.lang.String> $salida = controllers.ManagerOperador.operadores();
		java.io.PrintWriter _pw = resp.getWriter();
		_pw.print("{\"success\":1, \"r\":");
		jcrystal.JSONUtils.jsonQuoteString(_pw, $salida);
		_pw.print("}");
	}
}
