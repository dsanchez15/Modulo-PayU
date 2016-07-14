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
		// Ingresa aqu� el n�mero de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getDsInstallmentsNumber());
		// Ingresa aqu� la cantidad de d�as de prueba
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getDsTrialDays());

		// -- Par�metros del cliente --
		// Ingresa aqu� el nombre del cliente
		parameters.put(PayU.PARAMETERS.CUSTOMER_NAME, suscripcion.getDsCustomerName());
		// Ingresa aqu� el email del cliente
		parameters.put(PayU.PARAMETERS.CUSTOMER_EMAIL, suscripcion.getDsCustomerEmail());

		// -- Par�metros de la tarjeta de cr�dito --
		// Ingresa aqu� el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, suscripcion.getDsPayerName());
		// Ingresa aqu� el n�mero de la tarjeta de cr�dito
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, suscripcion.getDsCreditCardNumber());
		// Ingresa aqu� la fecha de expiraci�n de la tarjeta de cr�dito en formato AAAA/MM
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, suscripcion.getDsCreditCardExpirationDate());
		// Ingresa aqu� el nombre de la franquicia de la tarjeta de cr�dito
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, suscripcion.getDsPaymentMethod());
		// Ingresa aqu� el documento de identificaci�n asociado a la tarjeta.
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_DOCUMENT, suscripcion.getDsCreditCardDocument());  
		// (OPCIONAL) Ingresa aqu� el documento de identificaci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_DNI, suscripcion.getDsPayerDNI());
		// (OPCIONAL) Ingresa aqu� la primera l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET, suscripcion.getDsPayerStreet());
		// (OPCIONAL) Ingresa aqu� la segunda l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_2, suscripcion.getDsPayerStreet2());
		// (OPCIONAL) Ingresa aqu� la tercera l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_3, suscripcion.getDsPayerStreet3());
		// (OPCIONAL) Ingresa aqu� la ciudad de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_CITY, suscripcion.getDsCity());
		// (OPCIONAL) Ingresa aqu� el estado o departamento de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STATE, suscripcion.getDsState());
		// (OPCIONAL) Ingresa aqu� el c�digo del pa�s de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_COUNTRY, suscripcion.getDsCountry());
		// (OPCIONAL) Ingresa aqu� el c�digo postal de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, suscripcion.getDsPostalCode());
		// (OPCIONAL) Ingresa aqu� el n�mero telef�nico del pagador
		parameters.put(PayU.PARAMETERS.PAYER_PHONE, suscripcion.getDsPayerPhone());

		// -- Par�metros del plan --
		// Ingresa aqu� la descripci�n del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, suscripcion.getDsPlanDescription());
		// Ingresa aqu� el c�digo de identificaci�n para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getDsPlanCode());
		// Ingresa aqu� el intervalo del plan
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, suscripcion.getDsPlanInterval());
		// Ingresa aqu� la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, suscripcion.getDsPlanIntervalCount());
		// Ingresa aqu� la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, suscripcion.getDsPlanCurrency());
		// Ingresa aqu� el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, suscripcion.getDsPlanValue());
		//(OPCIONAL) Ingresa aqu� el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, suscripcion.getDsPlanTax());
		//(OPCIONAL) Ingresa aqu� la base de devoluci�n sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, suscripcion.getDsPlanTaxReturnBase());
		// Ingresa aqu� la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, suscripcion.getDsAccountId());
		// Ingresa aqu� el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, suscripcion.getDsPlanAttemptsDelay());
		// Ingresa aqu� la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, suscripcion.getDsPlanMaxPayments());
		// Ingresa aqu� la cantidad total de reintentos para cada pago rechazado de la suscripci�n
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENT_ATTEMPTS, suscripcion.getDsPlanMaxPaymentsAttempts());
		// Ingresa aqu� la cantidad m�xima de pagos pendientes que puede tener una suscripci�n antes de ser cancelada.
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
		// Ingresa aqu� el c�digo del plan a suscribirse.
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getDsPlanCode());
		// Ingresa aqu� el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getDsCustomerId());
		// Ingresa aqu� el identificador del token de la tarjeta.
		parameters.put(PayU.PARAMETERS.TOKEN_ID, suscripcion.getDsTokenId());
		// Ingresa aqu� la cantidad de d�as de prueba de la suscripci�n.
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getDsTrialDays());
		// Ingresa aqu� el n�mero de cuotas a pagar.
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
		// Ingresa aqu� la cantidad de d�as de prueba de la suscripci�n.
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getDsTrialDays());
		// Ingresa aqu� el n�mero de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getDsInstallmentsNumber());

		// Ingresa aqu� el c�digo del plan a suscribirse.
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getDsPlanCode());
		// Ingresa aqu� el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getDsCustomerId());

		// -- Par�metros de la tarjeta de cr�dito --
		// Ingresa aqu� el nombre del pagador.
		parameters.put(PayU.PARAMETERS.PAYER_NAME, suscripcion.getDsPayerName());
		// Ingresa aqu� el n�mero de la tarjeta de cr�dito
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_NUMBER, suscripcion.getDsCreditCardNumber());
		// Ingresa aqu� la fecha de expiraci�n de la tarjeta de cr�dito en formato AAAA/MM
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_EXPIRATION_DATE, suscripcion.getDsCreditCardExpirationDate());
		// Ingresa aqu� el nombre de la franquicia de la tarjeta de cr�dito
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, suscripcion.getDsPaymentMethod());
		// Ingresa aqu� el documento de identificaci�n asociado a la tarjeta.
		parameters.put(PayU.PARAMETERS.CREDIT_CARD_DOCUMENT, suscripcion.getDsCreditCardDocument());  
		// (OPCIONAL) Ingresa aqu� el documento de identificaci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_DNI, suscripcion.getDsPayerDNI());
		// (OPCIONAL) Ingresa aqu� la primera l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET, suscripcion.getDsPayerStreet());
		// (OPCIONAL) Ingresa aqu� la segunda l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_2, suscripcion.getDsPayerStreet2());
		// (OPCIONAL) Ingresa aqu� la tercera l�nea de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STREET_3, suscripcion.getDsPayerStreet3());
		// (OPCIONAL) Ingresa aqu� la ciudad de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_CITY, suscripcion.getDsCity());
		// (OPCIONAL) Ingresa aqu� el estado o departamento de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_STATE, suscripcion.getDsState());
		// (OPCIONAL) Ingresa aqu� el c�digo del pa�s de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_COUNTRY, suscripcion.getDsCountry());
		// (OPCIONAL) Ingresa aqu� el c�digo postal de la direcci�n del pagador
		parameters.put(PayU.PARAMETERS.PAYER_POSTAL_CODE, suscripcion.getDsPostalCode());
		// (OPCIONAL) Ingresa aqu� el n�mero telef�nico del pagador
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
		// Ingresa aqu� el n�mero de cuotas a pagar.
		parameters.put(PayU.PARAMETERS.INSTALLMENTS_NUMBER, suscripcion.getDsInstallmentsNumber());
		// Ingresa aqu� la cantidad de d�as de prueba
		parameters.put(PayU.PARAMETERS.TRIAL_DAYS, suscripcion.getDsTrialDays());

		// Ingresa aqu� el identificador del pagador.
		parameters.put(PayU.PARAMETERS.CUSTOMER_ID, suscripcion.getDsCustomerId());
		// Ingresa aqu� el identificador del token de la tarjeta.
		parameters.put(PayU.PARAMETERS.TOKEN_ID, suscripcion.getDsTokenId());

		// -- Par�metros del plan --
		// Ingresa aqu� la descripci�n del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, suscripcion.getDsPlanDescription());
		// Ingresa aqu� el c�digo de identificaci�n para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, suscripcion.getDsPlanCode());
		// Ingresa aqu� el intervalo del plan
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, suscripcion.getDsPlanInterval());
		// Ingresa aqu� la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, suscripcion.getDsPlanIntervalCount());
		// Ingresa aqu� la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, suscripcion.getDsPlanCurrency());
		// Ingresa aqu� el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, suscripcion.getDsPlanValue());
		//(OPCIONAL) Ingresa aqu� el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, suscripcion.getDsPlanTax());
		//(OPCIONAL) Ingresa aqu� la base de devoluci�n sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, suscripcion.getDsPlanTaxReturnBase());
		// Ingresa aqu� la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, suscripcion.getDsAccountId());
		// Ingresa aqu� el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, suscripcion.getDsPlanAttemptsDelay());
		// Ingresa aqu� la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, suscripcion.getDsPlanMaxPayments());
		// Ingresa aqu� la cantidad total de reintentos para cada pago rechazado de la suscripci�n
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENT_ATTEMPTS, suscripcion.getDsPlanMaxPaymentsAttempts());
		// Ingresa aqu� la cantidad m�xima de pagos pendientes que puede tener una suscripci�n antes de ser cancelada.
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
		// Ingresa aqu� el ID de la suscripci�n.
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
		// Ingresa aqu� el identifcador de la subscripci�n.
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
