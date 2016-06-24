package co.payU;

import java.util.HashMap;
import java.util.Map;

import com.payu.sdk.PayU;
import com.payu.sdk.PayUPayments;
import com.payu.sdk.exceptions.ConnectionException;
import com.payu.sdk.exceptions.InvalidParametersException;
import com.payu.sdk.exceptions.PayUException;
import com.payu.sdk.model.TransactionResponse;

import co.dto.Pago;
import co.excepciones.ExcepcionesPayU;
import co.negocio.interfaces.PagosNgcInt;

public class Pagos implements PagosNgcInt {

	@Override
	public TransactionResponse pagoXTarjetaCredito(Pago pago) throws ExcepcionesPayU {

		Map<String, String> parametros = new HashMap<String, String>();

		//Ingrese aqu� el identificador de la cuenta.
		parametros.put(PayU.PARAMETERS.ACCOUNT_ID, pago.getDsAccountId());
		//Ingrese aqu� el c�digo de referencia.
		parametros.put(PayU.PARAMETERS.REFERENCE_CODE, pago.getDsReferenceCode());
		//Ingrese aqu� la descripci�n.
		parametros.put(PayU.PARAMETERS.DESCRIPTION, pago.getDsDescription());
		//Ingrese aqu� el idima de la orden.
		parametros.put(PayU.PARAMETERS.LANGUAGE, pago.getDsLanguage());

		// -- Valores --
		//Ingrese aqu� el valor.
		parametros.put(PayU.PARAMETERS.VALUE, pago.getDsValue());	
		//Ingrese aqu� la moneda.
		parametros.put(PayU.PARAMETERS.CURRENCY, pago.getDsCurrency());

		// -- Comprador --
		//Ingrese aqu� el id del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_ID, pago.getDsBuyerId());
		//Ingrese aqu� el nombre del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_NAME, pago.getDsBuyerName());
		//Ingrese aqu� el email del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_EMAIL, pago.getDsBuyerEmail());
		//Ingrese aqu� el tel�fono de contacto del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_CONTACT_PHONE, pago.getDsBuyerContacPhone());	
		//Ingrese aqu� el documento de contacto del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_DNI, pago.getDsBuyerDNI());	
		//Ingrese aqu� la direcci�n del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_STREET, pago.getDsBuyerState());
		parametros.put(PayU.PARAMETERS.BUYER_STREET_2, pago.getDsBuyerSteet2());
		parametros.put(PayU.PARAMETERS.BUYER_CITY, pago.getDsBuyerCity());
		parametros.put(PayU.PARAMETERS.BUYER_STATE, pago.getDsBuyerState());
		parametros.put(PayU.PARAMETERS.BUYER_COUNTRY, pago.getDsBuyerCountry());
		parametros.put(PayU.PARAMETERS.BUYER_POSTAL_CODE, pago.getDsBuyerPostalCode());
		parametros.put(PayU.PARAMETERS.BUYER_PHONE, pago.getDsBuyerPhone());

		// -- Pagador --
		//Ingrese aqu� el id del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_ID, pago.getDsPayerId());
		//Ingrese aqu� el nombre del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_NAME, pago.getDsPayerName());
		//Ingrese aqu� el email del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_EMAIL, pago.getDsPayerEmail());
		//Ingrese aqu� el tel�fono de contacto del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_CONTACT_PHONE, pago.getDsPayerContactPhone());	
		//Ingrese aqu� el documento de contacto del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_DNI, pago.getDsPayerDNI());	
		//Ingrese aqu� la direcci�n del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_STREET, pago.getDsBuyerStreet());
		parametros.put(PayU.PARAMETERS.PAYER_STREET_2, pago.getDsBuyerSteet2());
		parametros.put(PayU.PARAMETERS.PAYER_CITY, pago.getDsBuyerCity());
		parametros.put(PayU.PARAMETERS.PAYER_STATE, pago.getDsPayerState());
		parametros.put(PayU.PARAMETERS.PAYER_COUNTRY, pago.getDsPayerCountry());
		parametros.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, pago.getDsPayerPostalCode());
		parametros.put(PayU.PARAMETERS.PAYER_PHONE, pago.getDsPayerPhone());

		// -- Datos de la tarjeta de cr�dito -- 
		//Ingrese aqu� el n�mero de la tarjeta de cr�dito
		parametros.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, pago.getDsCreditCardNumber());
		//Ingrese aqu� la fecha de vencimiento de la tarjeta de cr�dito
		parametros.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, pago.getDsCreditCardExpirationDate());
		//Ingrese aqu� el c�digo de seguridad de la tarjeta de cr�dito
		parametros.put(PayU.PARAMETERS.CREDIT_CARD_SECURITY_CODE, pago.getDsCreditCardSegurityCode());
		//Ingrese aqu� el nombre de la tarjeta de cr�dito
		parametros.put(PayU.PARAMETERS.PAYMENT_METHOD, pago.getDsPaymentMethod());

		//Ingrese aqu� el n�mero de cuotas.
		parametros.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, pago.getDsInstallmentsNumber());
		//Ingrese aqu� el nombre del pais.
		parametros.put(PayU.PARAMETERS.COUNTRY, pago.getDsCountry());

		//Session id del device.
		parametros.put(PayU.PARAMETERS.DEVICE_SESSION_ID, pago.getDsDeviceSessionId());
		//IP del pagadador
		parametros.put(PayU.PARAMETERS.IP_ADDRESS, pago.getDsIPAddress());
		//Cookie de la sesi�n actual.
		parametros.put(PayU.PARAMETERS.COOKIE, pago.getDsCookie());
		//Cookie de la sesi�n actual.
		parametros.put(PayU.PARAMETERS.USER_AGENT, pago.getDsUserAgent());

		//Solicitud de autorizaci�n y captura
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

	@Override
	public void pagoXPSE(Pago pago) throws ExcepcionesPayU {
		
		Map<String, String> parametros = new HashMap<String, String>();

		//Ingrese aqu� el identificador de la cuenta.
		parametros.put(PayU.PARAMETERS.ACCOUNT_ID, pago.getDsAccountId());
		//Ingrese aqu� el c�digo de referencia.
		parametros.put(PayU.PARAMETERS.REFERENCE_CODE, pago.getDsReferenceCode());
		//Ingrese aqu� la descripci�n.
		parametros.put(PayU.PARAMETERS.DESCRIPTION, pago.getDsDescription());
		//Ingrese aqu� el idima de la orden.
		parametros.put(PayU.PARAMETERS.LANGUAGE, pago.getDsLanguage());

		// -- Valores --
		//Ingrese aqu� el valor.
		parametros.put(PayU.PARAMETERS.VALUE, pago.getDsValue());	
		//Ingrese aqu� la moneda.
		parametros.put(PayU.PARAMETERS.CURRENCY, pago.getDsCurrency());

		//Ingrese aqu� el email del comprador.
		parametros.put(PayU.PARAMETERS.BUYER_EMAIL, pago.getDsBuyerEmail());

		//Ingrese aqu� el nombre del pagador.
		parametros.put(PayU.PARAMETERS.PAYER_NAME, pago.getDsPayerName());
			
		//Ingrese aqu� el nombre del medio de pago en efectivo
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, "BALOTO");

		//Ingrese aqu� el nombre del pais.
		parametros.put(PayU.PARAMETERS.COUNTRY, pago.getDsCountry());

		//Ingrese aqu� la fecha de expiraci�n. 
		parameters.put(PayU.PARAMETERS.EXPIRATION_DATE,"2014-05-20T00:00:00");

		//IP del pagadador
		parametros.put(PayU.PARAMETERS.IP_ADDRESS, pago.getDsIPAddress());

		//Solicitud de autorizaci�n y captura
		TransactionResponse response = PayUPayments.doAuthorizationAndCapture(parametros);
	}

	@Override
	public void pagoXBalotoEfecty(Pago pago) throws ExcepcionesPayU {
		
		Map<String, String> parameters = new HashMap<String, String>();

		//Ingrese aqu� el identificador de la cuenta.
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, "512321");
		//Ingrese aqu� el c�digo de referencia.
		parameters.put(PayU.PARAMETERS.REFERENCE_CODE, ""+reference);
		//Ingrese aqu� la descripci�n.
		parameters.put(PayU.PARAMETERS.DESCRIPTION, "payment test");
		//Ingrese aqu� el idima de la orden.
		parameters.put(PayU.PARAMETERS.LANGUAGE, "Language.es");

		// -- Valores --
		//Ingrese aqu� el valor.
		parameters.put(PayU.PARAMETERS.VALUE, ""+value);	
		//Ingrese aqu� la moneda.
		parameters.put(PayU.PARAMETERS.CURRENCY, ""+Currency.COP.name());

		//Ingrese aqu� el email del comprador.
		parameters.put(PayU.PARAMETERS.BUYER_EMAIL, "buyer_test@test.com");

		// -- pagador --
		//Ingrese aqu� el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, "First name and second payer name");
		//Ingrese aqu� el email del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_EMAIL, "payer_test@test.com");
		//Ingrese aqu� el tel�fono de contacto del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_CONTACT_PHONE, "7563126");	

		// -- infarmaci�n obligatoria para PSE --
		//Ingrese aqu� el c�digo pse del banco.
		parameters.put(PayU.PARAMETERS.PSE_FINANCIAL_INSTITUTION_CODE, "1007");
		//Ingrese aqu� el tipo de persona (natural o jur�dica)
		parameters.put(PayU.PARAMETERS.PAYER_PERSON_TYPE, PersonType.NATURAL.toString() );	
		//o parameters.put(PayU.PARAMETERS.PAYER_PERSON_TYPE, PersonType.LEGAL.toString() );	
		//Ingrese aqu� el documento de contacto del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_DNI, "123456789");	
		//Ingrese aqu� el tipo de documento del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_DOCUMENT_TYPE, DocumentType.CC.toString());
		//IP del pagadador
		parameters.put(PayU.PARAMETERS.IP_ADDRESS, "127.0.0.1");

		//Ingrese aqu� el nombre del medio de pago
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, "PSE");

		//Ingrese aqu� el nombre del pais.
		parameters.put(PayU.PARAMETERS.COUNTRY, PaymentCountry.CO.name());

		//Cookie de la sesi�n actual.
		parameters.put(PayU.PARAMETERS.COOKIE, "pt1t38347bs6jc9ruv2ecpv7o2");
		//Cookie de la sesi�n actual.
		parameters.put(PayU.PARAMETERS.USER_AGENT, "Mozilla/5.0 (Windows NT 5.1; rv:18.0) Gecko/20100101 Firefox/18.0");

		//P�gina de respuesta a la cual ser� redirigido el pagador.
		parameters.put(PayU.PARAMETERS.RESPONSE_URL, "http://www.test.com/response");

		//Solicitud de autorizaci�n y captura
		TransactionResponse response = PayUPayments.doAuthorizationAndCapture(parameters);

		//Respuesta
		if(response != null){
			response.getOrderId();
			response.getTransactionId();
			response.getState();
			if(response.getState().equals(TransactionState.PENDING)){
				response.getPendingReason();	
				Map extraParameters = response.getExtraParameters();
				
				//obtener la url del banco
				String url=(String)extraParameters.get("BANK_URL");
							
			}
			response.getPaymentNetworkResponseCode();
			response.getPaymentNetworkResponseErrorMessage();
			response.getTrazabilityCode();
			response.getResponseCode();
			response.getResponseMessage();
		}
	}

}
