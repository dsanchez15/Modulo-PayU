package co.weepa.smile.contabilidad.payu;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import com.payu.sdk.PayU;
import com.payu.sdk.PayUPayments;
import com.payu.sdk.exceptions.ConnectionException;
import com.payu.sdk.exceptions.InvalidParametersException;
import com.payu.sdk.exceptions.PayUException;
import com.payu.sdk.model.Language;
import com.payu.sdk.model.TransactionResponse;
import com.payu.sdk.utils.LoggerUtil;

import co.weepa.smile.contabilidad.payu.dto.ObjPagoPayU;
import co.weepa.smile.contabilidad.payu.interfaces.IPagos;
import co.weepa.smile.contabilidad.util.exception.ExcepcionesPayU;

/**
 * The Class PagosPayU.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0 27 de jun. de 2016 10:47:04
 */
public class PagosPayU implements IPagos {
	
	public PagosPayU() {
		
		PayU.paymentsUrl = "https://sandbox.api.payulatam.com/payments-api/";
		PayU.reportsUrl = "https://sandbox.api.payulatam.com/reports-api/";
		PayU.apiKey = "4Vj8eK4rloUd272L48hsrarnUA";
		PayU.apiLogin = "pRRXKOl8ikMmt9u"; 
		PayU.language = Language.es;
		LoggerUtil.setLogLevel(Level.ALL); 
		PayU.merchantId = "508029";
	}

	@Override
	public TransactionResponse pagoXTarjetaCredito(ObjPagoPayU pago) throws ExcepcionesPayU {
		Map<String, String> parametros = new HashMap<>();
		parametros.put(PayU.PARAMETERS.ACCOUNT_ID, pago.getStrAccountId());
		parametros.put(PayU.PARAMETERS.REFERENCE_CODE, pago.getStrReferenceCode());
		parametros.put(PayU.PARAMETERS.DESCRIPTION, pago.getStrDescription());
		parametros.put(PayU.PARAMETERS.LANGUAGE, pago.getStrLanguage());
		parametros.put(PayU.PARAMETERS.VALUE, pago.getStrValue());
		parametros.put(PayU.PARAMETERS.CURRENCY, pago.getStrCurrency());
		parametros.put(PayU.PARAMETERS.BUYER_ID, pago.getStrBuyerId());
		parametros.put(PayU.PARAMETERS.BUYER_NAME, pago.getStrBuyerName());
		parametros.put(PayU.PARAMETERS.BUYER_EMAIL, pago.getStrBuyerEmail());
		parametros.put(PayU.PARAMETERS.BUYER_CONTACT_PHONE, pago.getStrBuyerContacPhone());
		parametros.put(PayU.PARAMETERS.BUYER_DNI, pago.getStrBuyerDNI());
		parametros.put(PayU.PARAMETERS.BUYER_STREET, pago.getStrBuyerState());
		parametros.put(PayU.PARAMETERS.BUYER_STREET_2, pago.getStrBuyerSteet2());
		parametros.put(PayU.PARAMETERS.BUYER_CITY, pago.getStrBuyerCity());
		parametros.put(PayU.PARAMETERS.BUYER_STATE, pago.getStrBuyerState());
		parametros.put(PayU.PARAMETERS.BUYER_COUNTRY, pago.getStrBuyerCountry());
		parametros.put(PayU.PARAMETERS.BUYER_POSTAL_CODE, pago.getStrBuyerPostalCode());
		parametros.put(PayU.PARAMETERS.BUYER_PHONE, pago.getStrBuyerPhone());
		parametros.put(PayU.PARAMETERS.PAYER_ID, pago.getStrPayerId());
		parametros.put(PayU.PARAMETERS.PAYER_NAME, pago.getStrPayerName());
		parametros.put(PayU.PARAMETERS.PAYER_EMAIL, pago.getStrPayerEmail());
		parametros.put(PayU.PARAMETERS.PAYER_CONTACT_PHONE, pago.getStrPayerContactPhone());
		parametros.put(PayU.PARAMETERS.PAYER_DNI, pago.getStrPayerDNI());
		parametros.put(PayU.PARAMETERS.PAYER_STREET, pago.getStrBuyerStreet());
		parametros.put(PayU.PARAMETERS.PAYER_STREET_2, pago.getStrBuyerSteet2());
		parametros.put(PayU.PARAMETERS.PAYER_CITY, pago.getStrBuyerCity());
		parametros.put(PayU.PARAMETERS.PAYER_STATE, pago.getStrPayerState());
		parametros.put(PayU.PARAMETERS.PAYER_COUNTRY, pago.getStrPayerCountry());
		parametros.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, pago.getStrPayerPostalCode());
		parametros.put(PayU.PARAMETERS.PAYER_PHONE, pago.getStrPayerPhone());
		parametros.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, pago.getStrCreditCardNumber());
		parametros.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, pago.getStrCreditCardExpirationDate());
		parametros.put(PayU.PARAMETERS.CREDIT_CARD_SECURITY_CODE, pago.getStrCreditCardSegurityCode());
		parametros.put(PayU.PARAMETERS.PAYMENT_METHOD, pago.getStrPaymentMethod());
		parametros.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, pago.getStrInstallmentsNumber());
		parametros.put(PayU.PARAMETERS.COUNTRY, pago.getStrCountry());
		parametros.put(PayU.PARAMETERS.DEVICE_SESSION_ID, pago.getStrDeviceSessionId());
		parametros.put(PayU.PARAMETERS.IP_ADDRESS, pago.getStrIPAddress());
		parametros.put(PayU.PARAMETERS.COOKIE, pago.getStrCookie());
		parametros.put(PayU.PARAMETERS.USER_AGENT, pago.getStrUserAgent());
		TransactionResponse response = null;
		try {
			response = PayUPayments.doAuthorizationAndCapture(parametros);
		} catch (PayUException | InvalidParametersException | ConnectionException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	@Override
	public TransactionResponse pagoXBalotoEfecty(ObjPagoPayU pago) throws ExcepcionesPayU {
		Map<String, String> parametros = new HashMap<>();
		// Ingrese aqu� el identificador de la cuenta.
		parametros.put(PayU.PARAMETERS.ACCOUNT_ID, pago.getStrAccountId());
		// Ingrese aqu� el c�digo de referencia.
		parametros.put(PayU.PARAMETERS.REFERENCE_CODE, pago.getStrReferenceCode());
		// Ingrese aqu� la descripci�n.
		parametros.put(PayU.PARAMETERS.DESCRIPTION, pago.getStrDescription());
		// Ingrese aqu� el idima de la orden.
		parametros.put(PayU.PARAMETERS.LANGUAGE, pago.getStrLanguage());
		// -- Valores --
		// Ingrese aqu� el valor.
		parametros.put(PayU.PARAMETERS.VALUE, pago.getStrValue());
		// Ingrese aqu� la moneda.
		parametros.put(PayU.PARAMETERS.CURRENCY, pago.getStrCurrency());
		// Ingrese aqu� el email del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_EMAIL, pago.getStrBuyerEmail());
		// Ingrese aqu� el nombre del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_NAME, pago.getStrPayerName());
		// Ingrese aqu� el nombre del medio de pago en efectivo
		parametros.put(PayU.PARAMETERS.PAYMENT_METHOD, pago.getStrPaymentMethod());
		// Ingrese aqu� el nombre del pais.
		parametros.put(PayU.PARAMETERS.COUNTRY, pago.getStrCountry());
		// Ingrese aqu� la fecha de expiraci�n.
		parametros.put(PayU.PARAMETERS.EXPIRATION_DATE, pago.getStrExpirationDate());
		// IP del pagadador
		parametros.put(PayU.PARAMETERS.IP_ADDRESS, pago.getStrIPAddress());
		TransactionResponse response = null;
		// Solicitud de autorizaci�n y captura
		try {
			response = PayUPayments.doAuthorizationAndCapture(parametros);
		} catch (PayUException | InvalidParametersException | ConnectionException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	@Override
	public TransactionResponse pagoXPSE(ObjPagoPayU pago) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingrese aqu� el identificador de la cuenta.
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, pago.getStrAccountId());
		// Ingrese aqu� el c�digo de referencia.
		parameters.put(PayU.PARAMETERS.REFERENCE_CODE, pago.getStrReferenceCode());
		// Ingrese aqu� la descripci�n.
		parameters.put(PayU.PARAMETERS.DESCRIPTION, pago.getStrDescription());
		// Ingrese aqu� el idima de la orden.
		parameters.put(PayU.PARAMETERS.LANGUAGE, pago.getStrLanguage());
		// -- Valores --
		// Ingrese aqu� el valor.
		parameters.put(PayU.PARAMETERS.VALUE, pago.getStrValue());
		// Ingrese aqu� la moneda.
		parameters.put(PayU.PARAMETERS.CURRENCY, pago.getStrCurrency());
		// Ingrese aqu� el email del comprador.
		parameters.put(PayU.PARAMETERS.BUYER_EMAIL, pago.getStrBuyerEmail());
		// -- pagador --
		// Ingrese aqu� el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, pago.getStrPayerName());
		// Ingrese aqu� el email del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_EMAIL, pago.getStrPayerEmail());
		// Ingrese aqu� el tel�fono de contacto del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_CONTACT_PHONE, pago.getStrPayerContactPhone());
		// -- infarmaci�n obligatoria para PSE --
		// Ingrese aqu� el c�digo pse del banco.
		parameters.put(PayU.PARAMETERS.PSE_FINANCIAL_INSTITUTION_CODE, pago.getPseFinancialInstitutionCode());
		// Ingrese aqu� el tipo de persona (natural o jur�dica)
		parameters.put(PayU.PARAMETERS.PAYER_PERSON_TYPE, pago.getStrPayerPersonType());
		// Ingrese aqu� el documento de contacto del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_DNI, pago.getStrPayerDNI());
		// Ingrese aqu� el tipo de documento del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_DOCUMENT_TYPE, pago.getStrPayerDocumentType());
		// IP del pagadador
		parameters.put(PayU.PARAMETERS.IP_ADDRESS, pago.getStrIPAddress());
		// Ingrese aqu� el nombre del medio de pago
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, pago.getStrPaymentMethod());
		// Ingrese aqu� el nombre del pais.
		parameters.put(PayU.PARAMETERS.COUNTRY, pago.getStrCountry());
		// Cookie de la sesi�n actual.
		parameters.put(PayU.PARAMETERS.COOKIE, pago.getStrCookie());
		// Cookie de la sesi�n actual.
		parameters.put(PayU.PARAMETERS.USER_AGENT, pago.getStrUserAgent());
		// P�gina de respuesta a la cual ser� redirigido el pagador.
		parameters.put(PayU.PARAMETERS.RESPONSE_URL, pago.getStrResponseUrl());
		// Solicitud de autorizaci�n y captura
		TransactionResponse response = null;
		try {
			response = PayUPayments.doAuthorizationAndCapture(parameters);
		} catch (PayUException | InvalidParametersException | ConnectionException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		}
		return response;
	}
}
