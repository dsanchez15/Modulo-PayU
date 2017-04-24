package co.weepa.smile.contabilidad.payu.dto;

import java.util.Date;

public class ObjPDFFacturaVentaPlan {
	private String nombreOrganizacion;
	private String direccionOrganizacion;
	private String ciudad;
	private Integer numeroTelefono;
	private String numeroNIT;
	private String referenciaPago;
	private Date fechaCompra;
	private String descripcion;
	private Integer tiempoMeses;
	private Integer valorCompra;
	private String nombreSmille;
	private Integer smilleNIT;
	private String direccionSmille;
	private String smillePBX;
	private String urlSmille;
	private String correoSmille;

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

	public Integer getTiempoMeses() {
		return tiempoMeses;
	}

	public void setTiempoMeses(Integer tiempoMeses) {
		this.tiempoMeses = tiempoMeses;
	}

	public Integer getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Integer valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getNombreSmille() {
		return nombreSmille;
	}

	public void setNombreSmille(String nombreSmille) {
		this.nombreSmille = nombreSmille;
	}

	public Integer getSmilleNIT() {
		return smilleNIT;
	}

	public void setSmilleNIT(Integer smilleNIT) {
		this.smilleNIT = smilleNIT;
	}

	public String getDireccionSmille() {
		return direccionSmille;
	}

	public void setDireccionSmille(String direccionSmille) {
		this.direccionSmille = direccionSmille;
	}

	public String getSmillePBX() {
		return smillePBX;
	}

	public void setSmillePBX(String smillePBX) {
		this.smillePBX = smillePBX;
	}

	public String getUrlSmille() {
		return urlSmille;
	}

	public void setUrlSmille(String urlSmille) {
		this.urlSmille = urlSmille;
	}

	public String getCorreoSmille() {
		return correoSmille;
	}

	public void setCorreoSmille(String correoSmille) {
		this.correoSmille = correoSmille;
	}
}
