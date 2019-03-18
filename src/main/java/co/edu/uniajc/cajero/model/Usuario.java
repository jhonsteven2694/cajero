package co.edu.uniajc.cajero.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Steven Ordoñez
 *
 */
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int identificacion;
	
	private String nombre;
	
	private String apellido;
	
	private String direccion;
	
	private int telefono;
	
	private String email;
	
	private String empresa;
	
	private String tipoContrato;
	
	private Date fechaRegistro;
	
	public Usuario() {
		
	}
	

	public Usuario(int identificacion, String nombre, String apellido, String direccion, int telefono, String email,
			String empresa, String tipoContrato, Date fechaRegistro) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.empresa = empresa;
		this.tipoContrato = tipoContrato;
		this.fechaRegistro = fechaRegistro;
	}



	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
