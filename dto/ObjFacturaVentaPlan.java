package co.weepa.smile.contabilidad.payu.dto;

import java.util.Date;

public class ObjFacturaVentaPlan {
	private String nombreOrganizacion;
	private String direccionOrganizacion;
	private String ciudad;
	private Integer numeroTelefono;
	private String numeroNIT;
	private String referenciaPago;
	private Date fechaCompra;
	/*
	 * Modificar los siguientes atributos cuando se pongan los descuentos junto
	 * al plan
	 */
	private String descripcion;
	private Integer intervalo;
	private Integer cobros;
	private Integer valorCompra;

	public String getNombreOrganizacion() {
		return nombreOrganizacion;
	}

	public void setNombreOrganizacion(String nombreOrganizacion) {
		this.nombreOrganizacion = nombreOrganizacion;
	}

	public String getDireccionOrganizacion() {
		return direccionOrganizacion;
	}

	public void setDireccionOrganizacion(String direccionOrganizacion) {
		this.direccionOrganizacion = direccionOrganizacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(Integer numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getNumeroNIT() {
		return numeroNIT;
	}

	public void setNumeroNIT(String numeroNIT) {
		this.numeroNIT = numeroNIT;
	}

	public String getReferenciaPago() {
		return referenciaPago;
	}

	public void setReferenciaPago(String referenciaPago) {
		this.referenciaPago = referenciaPago;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(Integer intervalo) {
		this.intervalo = intervalo;
	}

	public Integer getCobros() {
		return cobros;
	}

	public void setCobros(Integer cobros) {
		this.cobros = cobros;
	}

	public Integer getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Integer valorCompra) {
		this.valorCompra = valorCompra;
	}
}
