/**
 * 
 */
package co.weepa.smile.contabilidad.payu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.payu.sdk.PayU;
import com.payu.sdk.PayUSubscription;
import com.payu.sdk.exceptions.ConnectionException;
import com.payu.sdk.exceptions.InvalidParametersException;
import com.payu.sdk.exceptions.PayUException;
import com.payu.sdk.paymentplan.model.Subscription;

import co.weepa.smile.contabilidad.payu.dto.ObjPayuSuscripcion;
import co.weepa.smile.contabilidad.payu.interfaces.ISuscripciones;
import co.weepa.smile.contabilidad.util.exception.ExcepcionesPayU;



public class SuscripcionesPayU implements ISuscripciones {

	
	public Subscription createSubscriptionAllNew(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aqu� el n�mero de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getStrInstallmentsNumber());
		// Ingresa aqu� la cantidad de d�as de prueba
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getStrTrialDays());

		// -- Par�metros del cliente --
		// Ingresa aqu� el nombre del cliente
		parameters.put(PayU.PARAMETERS.CUSTOMER_NAME, suscripcion.getStrCustomerName());
		// Ingresa aqu� el email del cliente
		parameters.put(PayU.PARAMETERS.CUSTOMER_EMAIL, suscripcion.getStrCustomerEmail());

		// -- Par�metros de la tarjeta de cr�dito --
		// Ingresa aqu� el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, suscripcion.getStrPayerName());
		// Ingresa aqu� el n�mero de la tarjeta de cr�dito
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, suscripcion.getStrCreditCardNumber());
		// Ingresa aqu� la fecha de expiraci�n de la tarjeta de cr�dito en formato AAAA/MM
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, suscripcion.getStrCreditCardExpirationDate());
		// Ingresa aqu� el nombre de la franquicia de la tarjeta de cr�dito
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, suscripcion.getStrPaymentMethod());
		// Ingresa aqu� el documento de identificaci�n asociado a la tarjeta.
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_DOCUMENT, suscripcion.getStrCreditCardDocument());  
		// (OPCIONAL) Ingresa aqu� el documento de identificaci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_DNI, suscripcion.getStrPayerDNI());
		// (OPCIONAL) Ingresa aqu� la primera l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET, suscripcion.getStrPayerStreet());
		// (OPCIONAL) Ingresa aqu� la segunda l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_2, suscripcion.getStrPayerStreet2());
		// (OPCIONAL) Ingresa aqu� la tercera l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_3, suscripcion.getStrPayerStreet3());
		// (OPCIONAL) Ingresa aqu� la ciudad de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_CITY, suscripcion.getStrCity());
		// (OPCIONAL) Ingresa aqu� el estado o departamento de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STATE, suscripcion.getStrState());
		// (OPCIONAL) Ingresa aqu� el c�digo del pa�s de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_COUNTRY, suscripcion.getStrCountry());
		// (OPCIONAL) Ingresa aqu� el c�digo postal de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, suscripcion.getStrPostalCode());
		// (OPCIONAL) Ingresa aqu� el n�mero telef�nico del pagador
		parameters.put(PayU.PARAMETERS.PAYER_PHONE, suscripcion.getStrPayerPhone());

		// -- Par�metros del plan --
		// Ingresa aqu� la descripci�n del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, suscripcion.getStrPlanDescription());
		// Ingresa aqu� el c�digo de identificaci�n para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getStrPlanCode());
		// Ingresa aqu� el intervalo del plan
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, suscripcion.getStrPlanInterval());
		// Ingresa aqu� la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, suscripcion.getStrPlanIntervalCount());
		// Ingresa aqu� la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, suscripcion.getStrPlanCurrency());
		// Ingresa aqu� el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, suscripcion.getStrPlanValue());
		//(OPCIONAL) Ingresa aqu� el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, suscripcion.getStrPlanTax());
		//(OPCIONAL) Ingresa aqu� la base de devoluci�n sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, suscripcion.getStrPlanTaxReturnBase());
		// Ingresa aqu� la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, suscripcion.getStrAccountId());
		// Ingresa aqu� el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, suscripcion.getStrPlanAttemptsDelay());
		// Ingresa aqu� la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, suscripcion.getStrPlanMaxPayments());
		// Ingresa aqu� la cantidad total de reintentos para cada pago rechazado de la suscripci�n
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENT_ATTEMPTS, suscripcion.getStrPlanMaxPaymentsAttempts());
		// Ingresa aqu� la cantidad m�xima de pagos pendientes que puede tener una suscripci�n antes de ser cancelada.
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PENDING_PAYMENTS, suscripcion.getStrPlanMaxPendingPayments());

		Subscription response =null;
		try {
			response = PayUSubscription.create(parameters);
		} catch (InvalidParametersException e) {
			
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	
	public Subscription createSubscriptionAllExists(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aqu� el c�digo del plan a suscribirse.
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getStrPlanCode());
		// Ingresa aqu� el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getStrCustomerId());
		// Ingresa aqu� el identificador del token de la tarjeta.
		parameters.put(PayU.PARAMETERS.TOKEN_ID, suscripcion.getStrTokenId());
		// Ingresa aqu� la cantidad de d�as de prueba de la suscripci�n.
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getStrTrialDays());
		// Ingresa aqu� el n�mero de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getStrInstallmentsNumber());
		Subscription response = null;
		try {
			response = PayUSubscription.create(parameters);
		} catch (InvalidParametersException e) {
			
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	
	public Subscription createSubscriptionNewCreditCard(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aqu� la cantidad de d�as de prueba de la suscripci�n.
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getStrTrialDays());
		// Ingresa aqu� el n�mero de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getStrInstallmentsNumber());

		// Ingresa aqu� el c�digo del plan a suscribirse.
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getStrPlanCode());
		// Ingresa aqu� el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getStrCustomerId());

		// -- Par�metros de la tarjeta de cr�dito --
		// Ingresa aqu� el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, suscripcion.getStrPayerName());
		// Ingresa aqu� el n�mero de la tarjeta de cr�dito
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, suscripcion.getStrCreditCardNumber());
		// Ingresa aqu� la fecha de expiraci�n de la tarjeta de cr�dito en formato AAAA/MM
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, suscripcion.getStrCreditCardExpirationDate());
		// Ingresa aqu� el nombre de la franquicia de la tarjeta de cr�dito
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, suscripcion.getStrPaymentMethod());
		// Ingresa aqu� el documento de identificaci�n asociado a la tarjeta.
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_DOCUMENT, suscripcion.getStrCreditCardDocument());  
		// (OPCIONAL) Ingresa aqu� el documento de identificaci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_DNI, suscripcion.getStrPayerDNI());
		// (OPCIONAL) Ingresa aqu� la primera l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET, suscripcion.getStrPayerStreet());
		// (OPCIONAL) Ingresa aqu� la segunda l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_2, suscripcion.getStrPayerStreet2());
		// (OPCIONAL) Ingresa aqu� la tercera l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_3, suscripcion.getStrPayerStreet3());
		// (OPCIONAL) Ingresa aqu� la ciudad de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_CITY, suscripcion.getStrCity());
		// (OPCIONAL) Ingresa aqu� el estado o departamento de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STATE, suscripcion.getStrState());
		// (OPCIONAL) Ingresa aqu� el c�digo del pa�s de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_COUNTRY, suscripcion.getStrCountry());
		// (OPCIONAL) Ingresa aqu� el c�digo postal de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, suscripcion.getStrPostalCode());
		// (OPCIONAL) Ingresa aqu� el n�mero telef�nico del pagador
		parameters.put(PayU.PARAMETERS.PAYER_PHONE, suscripcion.getStrPayerPhone());

		Subscription response = null;
		try {
			response = PayUSubscription.create(parameters);
		} catch (InvalidParametersException e) {
			
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	public Subscription createSubscriptionNewPlan(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aqu� el n�mero de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getStrInstallmentsNumber());
		// Ingresa aqu� la cantidad de d�as de prueba
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getStrTrialDays());

		// Ingresa aqu� el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getStrCustomerId());
		// Ingresa aqu� el identificador del token de la tarjeta.
		parameters.put(PayU.PARAMETERS.TOKEN_ID, suscripcion.getStrTokenId());

		// -- Par�metros del plan --
		// Ingresa aqu� la descripci�n del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, suscripcion.getStrPlanDescription());
		// Ingresa aqu� el c�digo de identificaci�n para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getStrPlanCode());
		// Ingresa aqu� el intervalo del plan
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, suscripcion.getStrPlanInterval());
		// Ingresa aqu� la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, suscripcion.getStrPlanIntervalCount());
		// Ingresa aqu� la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, suscripcion.getStrPlanCurrency());
		// Ingresa aqu� el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, suscripcion.getStrPlanValue());
		//(OPCIONAL) Ingresa aqu� el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, suscripcion.getStrPlanTax());
		//(OPCIONAL) Ingresa aqu� la base de devoluci�n sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, suscripcion.getStrPlanTaxReturnBase());
		// Ingresa aqu� la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, suscripcion.getStrAccountId());
		// Ingresa aqu� el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, suscripcion.getStrPlanAttemptsDelay());
		// Ingresa aqu� la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, suscripcion.getStrPlanMaxPayments());
		// Ingresa aqu� la cantidad total de reintentos para cada pago rechazado de la suscripci�n
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENT_ATTEMPTS, suscripcion.getStrPlanMaxPaymentsAttempts());
		// Ingresa aqu� la cantidad m�xima de pagos pendientes que puede tener una suscripci�n antes de ser cancelada.
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PENDING_PAYMENTS, suscripcion.getStrPlanMaxPendingPayments());

		Subscription response = null;
		try {
			response = PayUSubscription.create(parameters);
		} catch (InvalidParametersException e) {
			
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	public Subscription updateSubscriptionCreditCard(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU {

		return null;
	}

	
	public Subscription seeSubscription(String subscriptionId) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aqu� el ID de la suscripci�n.
		parameters.put(PayU.PARAMETERS.SUBSCRIPTION_ID, subscriptionId);

		Subscription response = null;
		try {
			response = PayUSubscription.find(parameters);
		} catch (InvalidParametersException e) {
			
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	public List<Subscription> seeAllSubscriptions() throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		parameters.put(PayU.PARAMETERS.SUBSCRIPTION_ID, "");

		List<Subscription> response = null;
		try {
			response = PayUSubscription.findList(parameters);
		} catch (InvalidParametersException e) {
			
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}


	public List<Subscription> seeAllSubscriptionByPlan(String planId) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		parameters.put(PayU.PARAMETERS.PLAN_ID, planId);

		List<Subscription> response = null;
		try {
			response = PayUSubscription.findList(parameters);
		} catch (InvalidParametersException e) {
			
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}


	public List<Subscription> seeAllSubscriptionByCustomer(String customerId) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, customerId);

		List<Subscription> response = null;
		try {
			response = PayUSubscription.findList(parameters);
		} catch (InvalidParametersException e) {
			
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}


	public boolean deleteSubscription(String subscriptionId) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aqu� el identifcador de la subscripci�n.
		parameters.put(PayU.PARAMETERS.SUBSCRIPTION_ID, subscriptionId);
		boolean response = false;
		try {
			response = PayUSubscription.cancel(parameters);
		} catch (InvalidParametersException e) {
			
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

}
