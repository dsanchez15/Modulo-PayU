/**
 * 
 */
package co.desarrollo.payu.dto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 15 de jul. de 2016 18:17:10
 */
public class PayUSuscripcionesClassDaoDto {
	private Integer intIdSuscripciones;
	private PayUClienteClassDaoDto idCliente;
	private PayUTokenClassDaoDto idToken;
	private String strIdSuscripcion;
	private PayUPlanesClassDaoDto idPlan;
	public Integer getIntIdSuscripciones() {
		return intIdSuscripciones;
	}
	public void setIntIdSuscripciones(Integer intIdSuscripciones) {
		this.intIdSuscripciones = intIdSuscripciones;
	}
	public PayUClienteClassDaoDto getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(PayUClienteClassDaoDto idCliente) {
		this.idCliente = idCliente;
	}
	public PayUTokenClassDaoDto getIdToken() {
		return idToken;
	}
	public void setIdToken(PayUTokenClassDaoDto idToken) {
		this.idToken = idToken;
	}
	public String getStrIdSuscripcion() {
		return strIdSuscripcion;
	}
	public void setStrIdSuscripcion(String strIdSuscripcion) {
		this.strIdSuscripcion = strIdSuscripcion;
	}
	public PayUPlanesClassDaoDto getIdPlan() {
		return idPlan;
	}
	public void setIdPlan(PayUPlanesClassDaoDto idPlan) {
		this.idPlan = idPlan;
	}
}
