/**
 * 
 */
package co.weepa.smile.contabilidad.payu.dto;

/**
 * ObjPagoSimple.java
 * 
 * @author Duvan A. Sanchez 2 de ago. de 2016 12:42:35
 * @version 1.0.0 Modificaciones: (Descripcion, Fecha)
 */
public class ObjPagoSimple {
	private String buyerId;

	private String pseFinancialInstitutionCode;
	private String creditCardNumber;
	private String creditCardExpirationDate;
	private String creditCardSegurityCode;
	private String paymentMethod;
	private String installmentsNumber;
	private String idPlanPagado;
	private String payerPersonType;
	private String cookie;
	private String deviceSessionId;
	private String iPAddress;
	private String userAgent;
	private String codigoDescuento;
	private String idPromocion;
	private int codigoReferido;

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getPseFinancialInstitutionCode() {
		return pseFinancialInstitutionCode;
	}

	public void setPseFinancialInstitutionCode(String pseFinancialInstitutionCode) {
		this.pseFinancialInstitutionCode = pseFinancialInstitutionCode;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardExpirationDate() {
		return creditCardExpirationDate;
	}

	public void setCreditCardExpirationDate(String creditCardExpirationDate) {
		this.creditCardExpirationDate = creditCardExpirationDate;
	}

	public String getCreditCardSegurityCode() {
		return creditCardSegurityCode;
	}

	public void setCreditCardSegurityCode(String creditCardSegurityCode) {
		this.creditCardSegurityCode = creditCardSegurityCode;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getInstallmentsNumber() {
		return installmentsNumber;
	}

	public void setInstallmentsNumber(String installmentsNumber) {
		this.installmentsNumber = installmentsNumber;
	}

	public String getIdPlanPagado() {
		return idPlanPagado;
	}

	public void setIdPlanPagado(String idPlanPagado) {
		this.idPlanPagado = idPlanPagado;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getDeviceSessionId() {
		return deviceSessionId;
	}

	public void setDeviceSessionId(String deviceSessionId) {
		this.deviceSessionId = deviceSessionId;
	}

	public String getiPAddress() {
		return iPAddress;
	}

	public void setiPAddress(String iPAddress) {
		this.iPAddress = iPAddress;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	public String getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(String idPromocion) {
		this.idPromocion = idPromocion;
	}

	public int getCodigoReferido() {
		return codigoReferido;
	}

	public void setCodigoReferido(int codigoReferido) {
		this.codigoReferido = codigoReferido;
	}

	public String getPayerPersonType() {
		return payerPersonType;
	}

	public void setPayerPersonType(String payerPersonType) {
		this.payerPersonType = payerPersonType;
	}
}
