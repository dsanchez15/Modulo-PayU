package co.payU;

import java.util.HashMap;
import java.util.Map;

import com.payu.sdk.PayU;
import com.payu.sdk.PayUPayments;
import com.payu.sdk.exceptions.ConnectionException;
import com.payu.sdk.exceptions.InvalidParametersException;
import com.payu.sdk.exceptions.PayUException;
import com.payu.sdk.model.TransactionResponse;

import co.excepciones.ExcepcionesPayU;
import co.payU.dto.PagoDto;
import co.payU.interfaces.IPagos;

/**
 * The Class PagosPayU.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 10:47:04
 */
public class PagosPayU implements IPagos {

	/* (non-Javadoc)
	 * @see co.payU.interfaces.IPagos#pagoXTarjetaCredito(co.payU.dto.PagoDto)
	 */
	@Override
	public TransactionResponse pagoXTarjetaCredito(PagoDto pago) throws ExcepcionesPayU {

		Map<String, String> parametros = new HashMap<String, String>();

		//Ingrese aquí el identificador de la cuenta.
		parametros.put(PayU.PARAMETERS.ACCOUNT_ID, pago.getDsAccountId());
		//Ingrese aquí el código de referencia.
		parametros.put(PayU.PARAMETERS.REFERENCE_CODE, pago.getDsReferenceCode());
		//Ingrese aquí la descripción.
		parametros.put(PayU.PARAMETERS.DESCRIPTION, pago.getDsDescription());
		//Ingrese aquí el idima de la orden.
		parametros.put(PayU.PARAMETERS.LANGUAGE, pago.getDsLanguage());

		// -- Valores --
		//Ingrese aquí el valor.
		parametros.put(PayU.PARAMETERS.VALUE, pago.getDsValue());	
		//Ingrese aquí la moneda.
		parametros.put(PayU.PARAMETERS.CURRENCY, pago.getDsCurrency());

		// -- Comprador --
		//Ingrese aquí el id del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_ID, pago.getDsBuyerId());
		//Ingrese aquí el nombre del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_NAME, pago.getDsBuyerName());
		//Ingrese aquí el email del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_EMAIL, pago.getDsBuyerEmail());
		//Ingrese aquí el teléfono de contacto del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_CONTACT_PHONE, pago.getDsBuyerContacPhone());	
		//Ingrese aquí el documento de contacto del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_DNI, pago.getDsBuyerDNI());	
		//Ingrese aquí la dirección del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_STREET, pago.getDsBuyerState());
		parametros.put(PayU.PARAMETERS.BUYER_STREET_2, pago.getDsBuyerSteet2());
		parametros.put(PayU.PARAMETERS.BUYER_CITY, pago.getDsBuyerCity());
		parametros.put(PayU.PARAMETERS.BUYER_STATE, pago.getDsBuyerState());
		parametros.put(PayU.PARAMETERS.BUYER_COUNTRY, pago.getDsBuyerCountry());
		parametros.put(PayU.PARAMETERS.BUYER_POSTAL_CODE, pago.getDsBuyerPostalCode());
		parametros.put(PayU.PARAMETERS.BUYER_PHONE, pago.getDsBuyerPhone());

		// -- Pagador --
		//Ingrese aquí el id del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_ID, pago.getDsPayerId());
		//Ingrese aquí el nombre del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_NAME, pago.getDsPayerName());
		//Ingrese aquí el email del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_EMAIL, pago.getDsPayerEmail());
		//Ingrese aquí el teléfono de contacto del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_CONTACT_PHONE, pago.getDsPayerContactPhone());	
		//Ingrese aquí el documento de contacto del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_DNI, pago.getDsPayerDNI());	
		//Ingrese aquí la dirección del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_STREET, pago.getDsBuyerStreet());
		parametros.put(PayU.PARAMETERS.PAYER_STREET_2, pago.getDsBuyerSteet2());
		parametros.put(PayU.PARAMETERS.PAYER_CITY, pago.getDsBuyerCity());
		parametros.put(PayU.PARAMETERS.PAYER_STATE, pago.getDsPayerState());
		parametros.put(PayU.PARAMETERS.PAYER_COUNTRY, pago.getDsPayerCountry());
		parametros.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, pago.getDsPayerPostalCode());
		parametros.put(PayU.PARAMETERS.PAYER_PHONE, pago.getDsPayerPhone());

		// -- Datos de la tarjeta de crédito -- 
		//Ingrese aquí el número de la tarjeta de crédito
		parametros.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, pago.getDsCreditCardNumber());
		//Ingrese aquí la fecha de vencimiento de la tarjeta de crédito
		parametros.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, pago.getDsCreditCardExpirationDate());
		//Ingrese aquí el código de seguridad de la tarjeta de crédito
		parametros.put(PayU.PARAMETERS.CREDIT_CARD_SECURITY_CODE, pago.getDsCreditCardSegurityCode());
		//Ingrese aquí el nombre de la tarjeta de crédito
		parametros.put(PayU.PARAMETERS.PAYMENT_METHOD, pago.getDsPaymentMethod());

		//Ingrese aquí el número de cuotas.
		parametros.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, pago.getDsInstallmentsNumber());
		//Ingrese aquí el nombre del pais.
		parametros.put(PayU.PARAMETERS.COUNTRY, pago.getDsCountry());

		//Session id del device.
		parametros.put(PayU.PARAMETERS.DEVICE_SESSION_ID, pago.getDsDeviceSessionId());
		//IP del pagadador
		parametros.put(PayU.PARAMETERS.IP_ADDRESS, pago.getDsIPAddress());
		//Cookie de la sesión actual.
		parametros.put(PayU.PARAMETERS.COOKIE, pago.getDsCookie());
		//Cookie de la sesión actual.
		parametros.put(PayU.PARAMETERS.USER_AGENT, pago.getDsUserAgent());

		//Solicitud de autorización y captura
		TransactionResponse response = null;
		try {
			response = PayUPayments.doAuthorizationAndCapture(parametros);
		} catch (PayUException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.IPagos#pagoXPSE(co.payU.dto.PagoDto)
	 */
	@Override
	public TransactionResponse pagoXPSE(PagoDto pago) throws ExcepcionesPayU {

		Map<String, String> parametros = new HashMap<String, String>();

		//Ingrese aquí el identificador de la cuenta.
		parametros.put(PayU.PARAMETERS.ACCOUNT_ID, pago.getDsAccountId());
		//Ingrese aquí el código de referencia.
		parametros.put(PayU.PARAMETERS.REFERENCE_CODE, pago.getDsReferenceCode());
		//Ingrese aquí la descripción.
		parametros.put(PayU.PARAMETERS.DESCRIPTION, pago.getDsDescription());
		//Ingrese aquí el idima de la orden.
		parametros.put(PayU.PARAMETERS.LANGUAGE, pago.getDsLanguage());

		// -- Valores --
		//Ingrese aquí el valor.
		parametros.put(PayU.PARAMETERS.VALUE, pago.getDsValue());	
		//Ingrese aquí la moneda.
		parametros.put(PayU.PARAMETERS.CURRENCY, pago.getDsCurrency());

		//Ingrese aquí el email del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_EMAIL, pago.getDsBuyerEmail());

		//Ingrese aquí el nombre del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_NAME, pago.getDsPayerName());

		//Ingrese aquí el nombre del medio de pago en efectivo
		parametros.put(PayU.PARAMETERS.PAYMENT_METHOD, pago.getDsPaymentMethod());

		//Ingrese aquí el nombre del pais.
		parametros.put(PayU.PARAMETERS.COUNTRY, pago.getDsCountry());

		//Ingrese aquí la fecha de expiración. 
		parametros.put(PayU.PARAMETERS.EXPIRATION_DATE,pago.getDsExpirationDate());

		//IP del pagadador
		parametros.put(PayU.PARAMETERS.IP_ADDRESS, pago.getDsIPAddress());

		TransactionResponse response = null;
		//Solicitud de autorización y captura
		try {
			response = PayUPayments.doAuthorizationAndCapture(parametros);
		} catch (PayUException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.IPagos#pagoXBalotoEfecty(co.payU.dto.PagoDto)
	 */
	@Override
	public TransactionResponse pagoXBalotoEfecty(PagoDto pago) throws ExcepcionesPayU {

		Map<String, String> parameters = new HashMap<String, String>();

		//Ingrese aquí el identificador de la cuenta.
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, pago.getDsAccountId());
		//Ingrese aquí el código de referencia.
		parameters.put(PayU.PARAMETERS.REFERENCE_CODE, pago.getDsReferenceCode());
		//Ingrese aquí la descripción.
		parameters.put(PayU.PARAMETERS.DESCRIPTION, pago.getDsDescription());
		//Ingrese aquí el idima de la orden.
		parameters.put(PayU.PARAMETERS.LANGUAGE, pago.getDsLanguage());

		// -- Valores --
		//Ingrese aquí el valor.
		parameters.put(PayU.PARAMETERS.VALUE, pago.getDsValue());	
		//Ingrese aquí la moneda.
		parameters.put(PayU.PARAMETERS.CURRENCY, pago.getDsCurrency());

		//Ingrese aquí el email del comprador.
		parameters.put(PayU.PARAMETERS.BUYER_EMAIL, pago.getDsBuyerEmail());

		// -- pagador --
		//Ingrese aquí el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, pago.getDsPayerName());
		//Ingrese aquí el email del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_EMAIL, pago.getDsPayerEmail());
		//Ingrese aquí el teléfono de contacto del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_CONTACT_PHONE, pago.getDsPayerContactPhone());	

		// -- infarmación obligatoria para PSE --
		//Ingrese aquí el código pse del banco.
		parameters.put(PayU.PARAMETERS.PSE_FINANCIAL_INSTITUTION_CODE, "1007");
		//Ingrese aquí el tipo de persona (natural o jurídica)
		parameters.put(PayU.PARAMETERS.PAYER_PERSON_TYPE, pago.getDsPayerPersonType() );	
		//o parameters.put(PayU.PARAMETERS.PAYER_PERSON_TYPE, PersonType.LEGAL.toString() );	
		//Ingrese aquí el documento de contacto del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_DNI, pago.getDsPayerDNI());	
		//Ingrese aquí el tipo de documento del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_DOCUMENT_TYPE, pago.getDsPayerDocumentType());
		//IP del pagadador
		parameters.put(PayU.PARAMETERS.IP_ADDRESS, pago.getDsIPAddress());

		//Ingrese aquí el nombre del medio de pago
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, pago.getDsPaymentMethod());

		//Ingrese aquí el nombre del pais.
		parameters.put(PayU.PARAMETERS.COUNTRY, pago.getDsCountry());

		//Cookie de la sesión actual.
		parameters.put(PayU.PARAMETERS.COOKIE, pago.getDsCookie());
		//Cookie de la sesión actual.
		parameters.put(PayU.PARAMETERS.USER_AGENT, pago.getDsUserAgent());

		//Página de respuesta a la cual será redirigido el pagador.
		parameters.put(PayU.PARAMETERS.RESPONSE_URL, pago.getDsResponseUrl());

		//Solicitud de autorización y captura
		TransactionResponse response = null;
		try {
			response = PayUPayments.doAuthorizationAndCapture(parameters);
		} catch (PayUException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;

	}

}
