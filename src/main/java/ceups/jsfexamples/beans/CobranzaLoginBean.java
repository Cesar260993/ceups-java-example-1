package ceups.jsfexamples.beans;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;

import ceups.jsfexamples.model.UserCobranza;
import ceups.jsfexamples.utils.NavigatorUtil;

@ManagedBean(name="loginBean")  
@SessionScoped
public class CobranzaLoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserCobranza usuario;
	
	public CobranzaLoginBean(){
		usuario = new UserCobranza();		
	}
	
	public void login(){
		
		try {
		
			if(usuario.getUsername().equals("admin") && usuario.getPassword().equals("admin")){
				
				/*FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Aviso", "Sus credenciales son correctas.");
				
				FacesContext.getCurrentInstance().addMessage(null, message);*/	
				
				
					NavigatorUtil.redireccionarAUrl("../pf/inicio.xhtml");
				 	
				
			}else{
				
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN,"Aviso", "Sus credenciales no son correctas.");
				
				FacesContext.getCurrentInstance().addMessage(null, message);
				
			}	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

	public UserCobranza getUsuario() {
		return usuario;
	}

	public void setUsuario(UserCobranza usuario) {
		this.usuario = usuario;
	}	

}
