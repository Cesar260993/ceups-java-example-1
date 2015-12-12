package ceups.jsfexamples.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ceups.jsfexamples.model.Usuario;

@ManagedBean(name="userdatabean")  
@SessionScoped
public class UserDataBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	
	
	public UserDataBean(){		
		usuario = new Usuario();
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void guardarEnSession (){		
		System.out.println("login");
	}	

}
