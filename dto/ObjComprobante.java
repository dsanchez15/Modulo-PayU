package co.weepa.smile.contabilidad.payu.dto;

import java.util.Date;

public class ObjComprobante {
	private String nombreEmpresa;
	private String numeroNIT;
	private Date fechaTransaccion;
	private String estadoTransaccion;
	private String referenciaPedido;
	private String referenciaTransaccion;
	private String numeroTransaccion;
	private String banco;
	private Integer valorTransaccion;
	private String moneda;
	private String descripcion;
	private String iPOrigen;
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getNumeroNIT() {
		return numeroNIT;
	}
	public void setNumeroNIT(String numeroNIT) {
		this.numeroNIT = numeroNIT;
	}
	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}
	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}
	public String getEstadoTransaccion() {
		return estadoTransaccion;
	}
	public void setEstadoTransaccion(String estadoTransaccion) {
		this.estadoTransaccion = estadoTransaccion;
	}
	public String getReferenciaPedido() {
		return referenciaPedido;
	}
	public void setReferenciaPedido(String referenciaPedido) {
		this.referenciaPedido = referenciaPedido;
	}
	public String getReferenciaTransaccion() {
		return referenciaTransaccion;
	}
	public void setReferenciaTransaccion(String referenciaTransaccion) {
		this.referenciaTransaccion = referenciaTransaccion;
	}
	public String getNumeroTransaccion() {
		return numeroTransaccion;
	}
	public void setNumeroTransaccion(String numeroTransaccion) {
		this.numeroTransaccion = numeroTransaccion;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Integer getValorTransaccion() {
		return valorTransaccion;
	}
	public void setValorTransaccion(Integer valorTransaccion) {
		this.valorTransaccion = valorTransaccion;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getiPOrigen() {
		return iPOrigen;
	}
	public void setiPOrigen(String iPOrigen) {
		this.iPOrigen = iPOrigen;
	}
}
