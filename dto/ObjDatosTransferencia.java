package co.weepa.smile.contabilidad.payu.dto;

import java.util.Date;

public class ObjDatosTransferencia {
	private Date fechaCompra;
	private String referenciaPago;
	private String descripcion;
	private Integer intervalo;
	private Integer cantidad;
	private Integer valorCompra;
	private String referenciaTransaccion;
	private Integer meses;

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getReferenciaPago() {
		return referenciaPago;
	}

	public void setReferenciaPago(String referenciaPago) {
		this.referenciaPago = referenciaPago;
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

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Integer valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getReferenciaTransaccion() {
		return referenciaTransaccion;
	}

	public void setReferenciaTransaccion(String referenciaTransaccion) {
		this.referenciaTransaccion = referenciaTransaccion;
	}

	public Integer getMeses() {
		return meses;
	}

	public void setMeses(Integer meses) {
		this.meses = meses;
	}
}
