package ceups.jsfexamples.utils;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NavigatorUtil {
	
	public static void redireccionarAUrl(String url) throws ServletException, IOException{
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();

		context.redirect(url);
		
	}	
}
