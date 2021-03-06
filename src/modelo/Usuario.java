package modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	private String usuario;
	private String clave;
	private String nombre;
	private String direccion;
	private String telefono;
	private String correo;
	
	
	public Usuario() {
		
		
	}
	
	


	public Usuario(String usuario, String clave, String nombre, String direccion, String telefono, String correo) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}

//metodos get y set


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
