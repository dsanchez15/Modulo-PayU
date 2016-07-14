/**
 * 
 */
package co.payU;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.payu.sdk.PayU;
import com.payu.sdk.PayUSubscription;
import com.payu.sdk.exceptions.ConnectionException;
import com.payu.sdk.exceptions.InvalidParametersException;
import com.payu.sdk.exceptions.PayUException;
import com.payu.sdk.paymentplan.model.Subscription;

import co.desarrollo.exception.ExceptionPayU;
import co.payU.dto.SuscripcionDto;
import co.payU.interfaces.ISuscripciones;

/**
 * The Class SuscripcionesPayU.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 29 de jun. de 2016 14:50:37
 */
public class SuscripcionesPayU implements ISuscripciones {

	/*
	 * (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#createSubscriptionAllNew(co.payU.dto.SuscripcionDto)
	 */
	public Subscription createSubscriptionAllNew(SuscripcionDto suscripcion) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		// Ingresa aquí el número de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getDsInstallmentsNumber());
		// Ingresa aquí la cantidad de días de prueba
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getDsTrialDays());

		// -- Parámetros del cliente --
		// Ingresa aquí el nombre del cliente
		parameters.put(PayU.PARAMETERS.CUSTOMER_NAME, suscripcion.getDsCustomerName());
		// Ingresa aquí el email del cliente
		parameters.put(PayU.PARAMETERS.CUSTOMER_EMAIL, suscripcion.getDsCustomerEmail());

		// -- Parámetros de la tarjeta de crédito --
		// Ingresa aquí el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, suscripcion.getDsPayerName());
		// Ingresa aquí el número de la tarjeta de crédito
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, suscripcion.getDsCreditCardNumber());
		// Ingresa aquí la fecha de expiración de la tarjeta de crédito en formato AAAA/MM
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, suscripcion.getDsCreditCardExpirationDate());
		// Ingresa aquí el nombre de la franquicia de la tarjeta de crédito
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, suscripcion.getDsPaymentMethod());
		// Ingresa aquí el documento de identificación asociado a la tarjeta.
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_DOCUMENT, suscripcion.getDsCreditCardDocument());  
		// (OPCIONAL) Ingresa aquí el documento de identificación del pagador
		parameters.put(PayU.PARAMETERS.PAYER_DNI, suscripcion.getDsPayerDNI());
		// (OPCIONAL) Ingresa aquí la primera línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET, suscripcion.getDsPayerStreet());
		// (OPCIONAL) Ingresa aquí la segunda línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_2, suscripcion.getDsPayerStreet2());
		// (OPCIONAL) Ingresa aquí la tercera línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_3, suscripcion.getDsPayerStreet3());
		// (OPCIONAL) Ingresa aquí la ciudad de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_CITY, suscripcion.getDsCity());
		// (OPCIONAL) Ingresa aquí el estado o departamento de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STATE, suscripcion.getDsState());
		// (OPCIONAL) Ingresa aquí el código del país de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_COUNTRY, suscripcion.getDsCountry());
		// (OPCIONAL) Ingresa aquí el código postal de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, suscripcion.getDsPostalCode());
		// (OPCIONAL) Ingresa aquí el número telefónico del pagador
		parameters.put(PayU.PARAMETERS.PAYER_PHONE, suscripcion.getDsPayerPhone());

		// -- Parámetros del plan --
		// Ingresa aquí la descripción del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, suscripcion.getDsPlanDescription());
		// Ingresa aquí el código de identificación para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getDsPlanCode());
		// Ingresa aquí el intervalo del plan
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, suscripcion.getDsPlanInterval());
		// Ingresa aquí la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, suscripcion.getDsPlanIntervalCount());
		// Ingresa aquí la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, suscripcion.getDsPlanCurrency());
		// Ingresa aquí el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, suscripcion.getDsPlanValue());
		//(OPCIONAL) Ingresa aquí el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, suscripcion.getDsPlanTax());
		//(OPCIONAL) Ingresa aquí la base de devolución sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, suscripcion.getDsPlanTaxReturnBase());
		// Ingresa aquí la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, suscripcion.getDsAccountId());
		// Ingresa aquí el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, suscripcion.getDsPlanAttemptsDelay());
		// Ingresa aquí la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, suscripcion.getDsPlanMaxPayments());
		// Ingresa aquí la cantidad total de reintentos para cada pago rechazado de la suscripción
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENT_ATTEMPTS, suscripcion.getDsPlanMaxPaymentsAttempts());
		// Ingresa aquí la cantidad máxima de pagos pendientes que puede tener una suscripción antes de ser cancelada.
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PENDING_PAYMENTS, suscripcion.getDsPlanMaxPendingPayments());

		Subscription response =null;
		try {
			response = PayUSubscription.create(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO: handle exception
		} catch (PayUException e) {
			// TODO: handle exception
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#createSubscriptionAllExists(co.payU.dto.SuscripcionDto)
	 */
	public Subscription createSubscriptionAllExists(SuscripcionDto suscripcion) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		// Ingresa aquí el código del plan a suscribirse.
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getDsPlanCode());
		// Ingresa aquí el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getDsCustomerId());
		// Ingresa aquí el identificador del token de la tarjeta.
		parameters.put(PayU.PARAMETERS.TOKEN_ID, suscripcion.getDsTokenId());
		// Ingresa aquí la cantidad de días de prueba de la suscripción.
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getDsTrialDays());
		// Ingresa aquí el número de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getDsInstallmentsNumber());
		Subscription response = null;
		try {
			response = PayUSubscription.create(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO: handle exception
		} catch (PayUException e) {
			// TODO: handle exception
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#createSubscriptionNewCreditCard(co.payU.dto.SuscripcionDto)
	 */
	public Subscription createSubscriptionNewCreditCard(SuscripcionDto suscripcion) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		// Ingresa aquí la cantidad de días de prueba de la suscripción.
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getDsTrialDays());
		// Ingresa aquí el número de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getDsInstallmentsNumber());

		// Ingresa aquí el código del plan a suscribirse.
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getDsPlanCode());
		// Ingresa aquí el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getDsCustomerId());

		// -- Parámetros de la tarjeta de crédito --
		// Ingresa aquí el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, suscripcion.getDsPayerName());
		// Ingresa aquí el número de la tarjeta de crédito
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, suscripcion.getDsCreditCardNumber());
		// Ingresa aquí la fecha de expiración de la tarjeta de crédito en formato AAAA/MM
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, suscripcion.getDsCreditCardExpirationDate());
		// Ingresa aquí el nombre de la franquicia de la tarjeta de crédito
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, suscripcion.getDsPaymentMethod());
		// Ingresa aquí el documento de identificación asociado a la tarjeta.
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_DOCUMENT, suscripcion.getDsCreditCardDocument());  
		// (OPCIONAL) Ingresa aquí el documento de identificación del pagador
		parameters.put(PayU.PARAMETERS.PAYER_DNI, suscripcion.getDsPayerDNI());
		// (OPCIONAL) Ingresa aquí la primera línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET, suscripcion.getDsPayerStreet());
		// (OPCIONAL) Ingresa aquí la segunda línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_2, suscripcion.getDsPayerStreet2());
		// (OPCIONAL) Ingresa aquí la tercera línea de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_3, suscripcion.getDsPayerStreet3());
		// (OPCIONAL) Ingresa aquí la ciudad de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_CITY, suscripcion.getDsCity());
		// (OPCIONAL) Ingresa aquí el estado o departamento de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STATE, suscripcion.getDsState());
		// (OPCIONAL) Ingresa aquí el código del país de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_COUNTRY, suscripcion.getDsCountry());
		// (OPCIONAL) Ingresa aquí el código postal de la dirección del pagador
		parameters.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, suscripcion.getDsPostalCode());
		// (OPCIONAL) Ingresa aquí el número telefónico del pagador
		parameters.put(PayU.PARAMETERS.PAYER_PHONE, suscripcion.getDsPayerPhone());

		Subscription response = null;
		try {
			response = PayUSubscription.create(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO: handle exception
		} catch (PayUException e) {
			// TODO: handle exception
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#createSubscriptionNewPlan(co.payU.dto.SuscripcionDto)
	 */
	public Subscription createSubscriptionNewPlan(SuscripcionDto suscripcion) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		// Ingresa aquí el número de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getDsInstallmentsNumber());
		// Ingresa aquí la cantidad de días de prueba
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getDsTrialDays());

		// Ingresa aquí el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getDsCustomerId());
		// Ingresa aquí el identificador del token de la tarjeta.
		parameters.put(PayU.PARAMETERS.TOKEN_ID, suscripcion.getDsTokenId());

		// -- Parámetros del plan --
		// Ingresa aquí la descripción del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, suscripcion.getDsPlanDescription());
		// Ingresa aquí el código de identificación para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getDsPlanCode());
		// Ingresa aquí el intervalo del plan
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, suscripcion.getDsPlanInterval());
		// Ingresa aquí la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, suscripcion.getDsPlanIntervalCount());
		// Ingresa aquí la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, suscripcion.getDsPlanCurrency());
		// Ingresa aquí el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, suscripcion.getDsPlanValue());
		//(OPCIONAL) Ingresa aquí el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, suscripcion.getDsPlanTax());
		//(OPCIONAL) Ingresa aquí la base de devolución sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, suscripcion.getDsPlanTaxReturnBase());
		// Ingresa aquí la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, suscripcion.getDsAccountId());
		// Ingresa aquí el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, suscripcion.getDsPlanAttemptsDelay());
		// Ingresa aquí la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, suscripcion.getDsPlanMaxPayments());
		// Ingresa aquí la cantidad total de reintentos para cada pago rechazado de la suscripción
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENT_ATTEMPTS, suscripcion.getDsPlanMaxPaymentsAttempts());
		// Ingresa aquí la cantidad máxima de pagos pendientes que puede tener una suscripción antes de ser cancelada.
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PENDING_PAYMENTS, suscripcion.getDsPlanMaxPendingPayments());

		Subscription response = null;
		try {
			response = PayUSubscription.create(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO: handle exception
		} catch (PayUException e) {
			// TODO: handle exception
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#updateSubscriptionCreditCard(co.payU.dto.SuscripcionDto)
	 */
	public Subscription updateSubscriptionCreditCard(SuscripcionDto suscripcion) throws ExceptionPayU {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#seeSubscription(java.lang.String)
	 */
	public Subscription seeSubscription(String subscriptionId) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		// Ingresa aquí el ID de la suscripción.
		parameters.put(PayU.PARAMETERS.SUBSCRIPTION_ID, subscriptionId);

		Subscription response = null;
		try {
			response = PayUSubscription.find(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO: handle exception
		} catch (PayUException e) {
			// TODO: handle exception
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#seeAllSubscriptions()
	 */
	public List<Subscription> seeAllSubscriptions() throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(PayU.PARAMETERS.SUBSCRIPTION_ID, "");

		List<Subscription> response = null;
		try {
			response = PayUSubscription.findList(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO: handle exception
		} catch (PayUException e) {
			// TODO: handle exception
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#seeAllSubscriptionByPlan(java.lang.String)
	 */
	public List<Subscription> seeAllSubscriptionByPlan(String planId) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(PayU.PARAMETERS.PLAN_ID, planId);

		List<Subscription> response = null;
		try {
			response = PayUSubscription.findList(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO: handle exception
		} catch (PayUException e) {
			// TODO: handle exception
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#seeAllSubscriptionByCustomer(java.lang.String)
	 */
	public List<Subscription> seeAllSubscriptionByCustomer(String customerId) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, customerId);

		List<Subscription> response = null;
		try {
			response = PayUSubscription.findList(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO: handle exception
		} catch (PayUException e) {
			// TODO: handle exception
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.ISuscripciones#deleteSubscription(java.lang.String)
	 */
	public boolean deleteSubscription(String subscriptionId) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		// Ingresa aquí el identifcador de la subscripción.
		parameters.put(PayU.PARAMETERS.SUBSCRIPTION_ID, subscriptionId);
		boolean response = false;
		try {
			response = PayUSubscription.cancel(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO: handle exception
		} catch (PayUException e) {
			// TODO: handle exception
		}
		return response;
	}

}
