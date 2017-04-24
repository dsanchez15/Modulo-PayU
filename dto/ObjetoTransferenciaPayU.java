/**
 * 
 */
package co.weepa.smile.contabilidad.payu.dto;

import java.util.Date;

import org.hibernate.mapping.Map;

/**
 * ObjetoTransferenciaPayU.java
 * @author Duvan A. Sanchez
 * 26 de jul. de 2016 14:04:49
 * @version 1.0.0
 * Modificaciones: (Descripcion, Fecha)
 */
public class ObjetoTransferenciaPayU {
	private String strAuthorizationCode;
	private String strPaymentNetworkResponseCode;
	private String strPaymentNetworkResponseErrorMessage;
	private String strResponseMessage;
	private String strTransactionDate;
	private String strTransactionId;
	private String strTransactionTime;
	private String strTrazabilityCode;
	private Integer intOrderId;
	private String strErrorCode;
	private Map mapExtraParameters;
	private Date dteOperationDate;
	private String strPendingReason;
	private String strResponseCode;
	private String strState;
	
	public String getStrAuthorizationCode() {
		return strAuthorizationCode;
	}
	public void setStrAuthorizationCode(String strAuthorizationCode) {
		this.strAuthorizationCode = strAuthorizationCode;
	}
	public String getStrPaymentNetworkResponseCode() {
		return strPaymentNetworkResponseCode;
	}
	public void setStrPaymentNetworkResponseCode(String strPaymentNetworkResponseCode) {
		this.strPaymentNetworkResponseCode = strPaymentNetworkResponseCode;
	}
	public String getStrPaymentNetworkResponseErrorMessage() {
		return strPaymentNetworkResponseErrorMessage;
	}
	public void setStrPaymentNetworkResponseErrorMessage(String strPaymentNetworkResponseErrorMessage) {
		this.strPaymentNetworkResponseErrorMessage = strPaymentNetworkResponseErrorMessage;
	}
	public String getStrResponseMessage() {
		return strResponseMessage;
	}
	public void setStrResponseMessage(String strResponseMessage) {
		this.strResponseMessage = strResponseMessage;
	}
	public String getStrTransactionDate() {
		return strTransactionDate;
	}
	public void setStrTransactionDate(String strTransactionDate) {
		this.strTransactionDate = strTransactionDate;
	}
	public String getStrTransactionId() {
		return strTransactionId;
	}
	public void setStrTransactionId(String strTransactionId) {
		this.strTransactionId = strTransactionId;
	}
	public String getStrTransactionTime() {
		return strTransactionTime;
	}
	public void setStrTransactionTime(String strTransactionTime) {
		this.strTransactionTime = strTransactionTime;
	}
	public String getStrTrazabilityCode() {
		return strTrazabilityCode;
	}
	public void setStrTrazabilityCode(String strTrazabilityCode) {
		this.strTrazabilityCode = strTrazabilityCode;
	}
	public Integer getIntOrderId() {
		return intOrderId;
	}
	public void setIntOrderId(Integer intOrderId) {
		this.intOrderId = intOrderId;
	}
	public String getStrErrorCode() {
		return strErrorCode;
	}
	public void setStrErrorCode(String strErrorCode) {
		this.strErrorCode = strErrorCode;
	}
	public Map getMapExtraParameters() {
		return mapExtraParameters;
	}
	public void setMapExtraParameters(Map mapExtraParameters) {
		this.mapExtraParameters = mapExtraParameters;
	}
	public Date getDteOperationDate() {
		return dteOperationDate;
	}
	public void setDteOperationDate(Date dteOperationDate) {
		this.dteOperationDate = dteOperationDate;
	}
	public String getStrPendingReason() {
		return strPendingReason;
	}
	public void setStrPendingReason(String strPendingReason) {
		this.strPendingReason = strPendingReason;
	}
	public String getStrResponseCode() {
		return strResponseCode;
	}
	public void setStrResponseCode(String strResponseCode) {
		this.strResponseCode = strResponseCode;
	}
	public String getStrState() {
		return strState;
	}
	public void setStrState(String strState) {
		this.strState = strState;
	}
}
