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
		// Ingresa aquí el número de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getStrInstallmentsNumber());
		// Ingresa aquí la cantidad de días de prueba
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getStrTrialDays());

		// -- Parámetros del cliente --
		// Ingresa aquí el nombre del cliente
		parameters.put(PayU.PARAMETERS.CUSTOMER_NAME, suscripcion.getStrCustomerName());
		// Ingresa aquí el email del cliente
		parameters.put(PayU.PARAMETERS.CUSTOMER_EMAIL, suscripcion.getStrCustomerEmail());

		// -- Parámetros de la tarjeta de crédito --
		// Ingresa aquí el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, suscripcion.getStrPayerName());
		// Ingresa aquí el número de la tarjeta de crédito
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, suscripcion.getStrCreditCardNumber());
		// Ingresa aquí la fecha de expiración de la tarjeta de crédito en formato AAAA/MM
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, suscripcion.getStrCreditCardExpirationDate());
		// Ingresa aquí el nombre de la franquicia de la tarjeta de crédito
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, suscripcion.getStrPaymentMethod());
		// Ingresa aquí el documento de identificación asociado a la tarjeta.
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_DOCUMENT, suscripcion.getStrCreditCardDocument());  
		// (OPCIONAL) Ingresa aquí el documento de identificación del pagador
		parameters.put(PayU.PARAMETERS.PAYER_DNI, suscripcion.getStrPayerDNI());
		// (OPCIONAL) Ingresa aquí la primera línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET, suscripcion.getStrPayerStreet());
		// (OPCIONAL) Ingresa aquí la segunda línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_2, suscripcion.getStrPayerStreet2());
		// (OPCIONAL) Ingresa aquí la tercera línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_3, suscripcion.getStrPayerStreet3());
		// (OPCIONAL) Ingresa aquí la ciudad de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_CITY, suscripcion.getStrCity());
		// (OPCIONAL) Ingresa aquí el estado o departamento de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STATE, suscripcion.getStrState());
		// (OPCIONAL) Ingresa aquí el código del país de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_COUNTRY, suscripcion.getStrCountry());
		// (OPCIONAL) Ingresa aquí el código postal de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, suscripcion.getStrPostalCode());
		// (OPCIONAL) Ingresa aquí el número telefónico del pagador
		parameters.put(PayU.PARAMETERS.PAYER_PHONE, suscripcion.getStrPayerPhone());

		// -- Parámetros del plan --
		// Ingresa aquí la descripción del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, suscripcion.getStrPlanDescription());
		// Ingresa aquí el código de identificación para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getStrPlanCode());
		// Ingresa aquí el intervalo del plan
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, suscripcion.getStrPlanInterval());
		// Ingresa aquí la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, suscripcion.getStrPlanIntervalCount());
		// Ingresa aquí la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, suscripcion.getStrPlanCurrency());
		// Ingresa aquí el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, suscripcion.getStrPlanValue());
		//(OPCIONAL) Ingresa aquí el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, suscripcion.getStrPlanTax());
		//(OPCIONAL) Ingresa aquí la base de devolución sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, suscripcion.getStrPlanTaxReturnBase());
		// Ingresa aquí la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, suscripcion.getStrAccountId());
		// Ingresa aquí el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, suscripcion.getStrPlanAttemptsDelay());
		// Ingresa aquí la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, suscripcion.getStrPlanMaxPayments());
		// Ingresa aquí la cantidad total de reintentos para cada pago rechazado de la suscripción
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENT_ATTEMPTS, suscripcion.getStrPlanMaxPaymentsAttempts());
		// Ingresa aquí la cantidad máxima de pagos pendientes que puede tener una suscripción antes de ser cancelada.
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
		// Ingresa aquí el código del plan a suscribirse.
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getStrPlanCode());
		// Ingresa aquí el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getStrCustomerId());
		// Ingresa aquí el identificador del token de la tarjeta.
		parameters.put(PayU.PARAMETERS.TOKEN_ID, suscripcion.getStrTokenId());
		// Ingresa aquí la cantidad de días de prueba de la suscripción.
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getStrTrialDays());
		// Ingresa aquí el número de cuotas a pagar.
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
		// Ingresa aquí la cantidad de días de prueba de la suscripción.
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getStrTrialDays());
		// Ingresa aquí el número de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getStrInstallmentsNumber());

		// Ingresa aquí el código del plan a suscribirse.
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getStrPlanCode());
		// Ingresa aquí el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getStrCustomerId());

		// -- Parámetros de la tarjeta de crédito --
		// Ingresa aquí el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, suscripcion.getStrPayerName());
		// Ingresa aquí el número de la tarjeta de crédito
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, suscripcion.getStrCreditCardNumber());
		// Ingresa aquí la fecha de expiración de la tarjeta de crédito en formato AAAA/MM
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, suscripcion.getStrCreditCardExpirationDate());
		// Ingresa aquí el nombre de la franquicia de la tarjeta de crédito
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, suscripcion.getStrPaymentMethod());
		// Ingresa aquí el documento de identificación asociado a la tarjeta.
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_DOCUMENT, suscripcion.getStrCreditCardDocument());  
		// (OPCIONAL) Ingresa aquí el documento de identificación del pagador
		parameters.put(PayU.PARAMETERS.PAYER_DNI, suscripcion.getStrPayerDNI());
		// (OPCIONAL) Ingresa aquí la primera línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET, suscripcion.getStrPayerStreet());
		// (OPCIONAL) Ingresa aquí la segunda línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_2, suscripcion.getStrPayerStreet2());
		// (OPCIONAL) Ingresa aquí la tercera línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_3, suscripcion.getStrPayerStreet3());
		// (OPCIONAL) Ingresa aquí la ciudad de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_CITY, suscripcion.getStrCity());
		// (OPCIONAL) Ingresa aquí el estado o departamento de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STATE, suscripcion.getStrState());
		// (OPCIONAL) Ingresa aquí el código del país de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_COUNTRY, suscripcion.getStrCountry());
		// (OPCIONAL) Ingresa aquí el código postal de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, suscripcion.getStrPostalCode());
		// (OPCIONAL) Ingresa aquí el número telefónico del pagador
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
		// Ingresa aquí el número de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getStrInstallmentsNumber());
		// Ingresa aquí la cantidad de días de prueba
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getStrTrialDays());

		// Ingresa aquí el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getStrCustomerId());
		// Ingresa aquí el identificador del token de la tarjeta.
		parameters.put(PayU.PARAMETERS.TOKEN_ID, suscripcion.getStrTokenId());

		// -- Parámetros del plan --
		// Ingresa aquí la descripción del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, suscripcion.getStrPlanDescription());
		// Ingresa aquí el código de identificación para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getStrPlanCode());
		// Ingresa aquí el intervalo del plan
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, suscripcion.getStrPlanInterval());
		// Ingresa aquí la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, suscripcion.getStrPlanIntervalCount());
		// Ingresa aquí la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, suscripcion.getStrPlanCurrency());
		// Ingresa aquí el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, suscripcion.getStrPlanValue());
		//(OPCIONAL) Ingresa aquí el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, suscripcion.getStrPlanTax());
		//(OPCIONAL) Ingresa aquí la base de devolución sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, suscripcion.getStrPlanTaxReturnBase());
		// Ingresa aquí la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, suscripcion.getStrAccountId());
		// Ingresa aquí el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, suscripcion.getStrPlanAttemptsDelay());
		// Ingresa aquí la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, suscripcion.getStrPlanMaxPayments());
		// Ingresa aquí la cantidad total de reintentos para cada pago rechazado de la suscripción
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENT_ATTEMPTS, suscripcion.getStrPlanMaxPaymentsAttempts());
		// Ingresa aquí la cantidad máxima de pagos pendientes que puede tener una suscripción antes de ser cancelada.
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
		// Ingresa aquí el ID de la suscripción.
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
		// Ingresa aquí el identifcador de la subscripción.
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
