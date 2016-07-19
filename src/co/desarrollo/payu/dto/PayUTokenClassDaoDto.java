/**
 * 
 */
package co.desarrollo.payu.dto;

import java.sql.Date;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 15 de jul. de 2016 18:14:27
 */
public class PayUTokenClassDaoDto {
	private Integer intIdToken;
	private PayUClienteClassDaoDto idCliente;
	private Integer intNumeroTarjeta;
	private String strToken;
	private String strFechaVencimiento;
	public Integer getIntIdToken() {
		return intIdToken;
	}
	public void setIntIdToken(Integer intIdToken) {
		this.intIdToken = intIdToken;
	}
	public PayUClienteClassDaoDto getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(PayUClienteClassDaoDto idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIntNumeroTarjeta() {
		return intNumeroTarjeta;
	}
	public void setIntNumeroTarjeta(Integer intNumeroTarjeta) {
		this.intNumeroTarjeta = intNumeroTarjeta;
	}
	public String getStrToken() {
		return strToken;
	}
	public void setStrToken(String strToken) {
		this.strToken = strToken;
	}
	public String getStrFechaVencimiento() {
		return strFechaVencimiento;
	}
	public void setStrFechaVencimiento(String strFechaVencimiento) {
		this.strFechaVencimiento = strFechaVencimiento;
	}
}
