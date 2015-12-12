package ceups.jsfexamples.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ceups.jsfexamples.model.Usuario;

@ManagedBean(name="vista1bean")  
@ViewScoped  
public class Vista1Bean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;

	private String respuestaAUsuario;
	
	
	public Vista1Bean(){
		usuario = new Usuario();
		usuario.setNombreCompleto("");
		usuario.setNombreDeUsuario("");
	}
	
	
	public void guardarNombreDeUsuario(){
		System.out.println("Llegue");
		System.out.println(usuario.getNombreCompleto());
		
		respuestaAUsuario = "Hola " + usuario.getNombreCompleto();
	}


	public String getRespuestaAUsuario() {
		return respuestaAUsuario;
	}


	public void setRespuestaAUsuario(String respuestaAUsuario) {
		this.respuestaAUsuario = respuestaAUsuario;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
