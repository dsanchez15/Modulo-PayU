/**
 * 
 */
package co.desarrollo.payu.payU;

import java.util.HashMap;
import java.util.Map;

import com.payu.sdk.PayU;
import com.payu.sdk.PayUPlans;
import com.payu.sdk.exceptions.ConnectionException;
import com.payu.sdk.exceptions.InvalidParametersException;
import com.payu.sdk.exceptions.PayUException;
import com.payu.sdk.paymentplan.model.SubscriptionPlan;

import co.desarrollo.payu.exception.ExceptionPayU;
import co.desarrollo.payu.payU.dto.PlanDto;
import co.desarrollo.payu.payU.interfaces.IPlanes;

/**
 * The Class PlanesPayu.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 14:31:31
 */
public class PlanesPayu implements IPlanes {

	/* (non-Javadoc)
	 * @see co.payU.interfaces.IPlanes#createPlan(co.dto.PlanDto)
	 */
	
	public SubscriptionPlan createPlan(PlanDto plan) throws ExceptionPayU {

		Map<String, String> parameters = new HashMap<String, String>();
		// Ingresa aqu� la descripci�n del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, plan.getDsPlanDescription());
		// Ingresa aqu� el c�digo de identificaci�n para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, plan.getDsPlanCode());
		// Ingresa aqu� el intervalo del plan
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, plan.getDsPlanInterval());
		// Ingresa aqu� la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, plan.getDsPlanIntervalCount());
		// Ingresa aqu� la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, plan.getDsPlanCurrency());
		// Ingresa aqu� el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, plan.getDsPlanValue());
		//(OPCIONAL) Ingresa aqu� el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, plan.getDsPlanTax());
		//(OPCIONAL) Ingresa aqu� la base de devoluci�n sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, plan.getDsPlanTaxReturnBase());
		// Ingresa aqu� la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, plan.getDsAccountId());
		// Ingresa aqu� el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, plan.getDsPlanAttempstsDelay());
		// Ingresa aqu� la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, plan.getDsPlanMaxPayments());
		SubscriptionPlan response = null;
		try {
			response = PayUPlans.create(parameters);
		} catch (PayUException e) {
			throw new ExceptionPayU("Error proveniente de PayUException: "+e.getMessage());
		} catch (InvalidParametersException e) {
			throw new ExceptionPayU(e.getStackTrace().toString());
		} catch (ConnectionException e) {
			throw new ExceptionPayU(e.getMessage(), e.fillInStackTrace());
		}
		return response;
	}

	/* (non-Javadoc)
	 * @see co.payU.interfaces.IPlanes#updatePlan(co.dto.PlanDto)
	 */
	
	public SubscriptionPlan updatePlan(PlanDto plan) throws ExceptionPayU {

		Map<String, String> parameters = new HashMap<String, String>();
		// Ingrese aqu� la nueva descripci�n para el plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, plan.getDsPlanDescription());
		// Ingrese aqu� el c�digo del plan (Debe ser un c�digo de plan existente)
		parameters.put(PayU.PARAMETERS.PLAN_CODE, plan.getDsPlanCode());
		// Ingrese aqu� la moneda del plan (Debe ser el mismo que fue usado cuando el plan fue creado)
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, plan.getDsPlanCurrency());
		// Ingrese aqu� el nuevo valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, plan.getDsPlanValue());
		//(OPCIONAL) Ingrese aqu� el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, plan.getDsPlanTax());
		//(OPCIONAL) Ingrese aqu� base de devoluci�n del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, plan.getDsPlanTaxReturnBase());
		// Ingrese aqu� la cantidad de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, plan.getDsPlanAttempstsDelay());
		SubscriptionPlan response = null;
		try {
			response = PayUPlans.update(parameters);
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
	 * @see co.payU.interfaces.IPlanes#seePlan(java.lang.String)
	 */
	
	public SubscriptionPlan seePlan(String planCode) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		//Ingrese aqu� el c�digo del plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, planCode);
		SubscriptionPlan response = null;
		try {
			response = PayUPlans.find(parameters);
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
	 * @see co.payU.interfaces.IPlanes#deletePlan(java.lang.String)
	 */
	
	public boolean deletePlan(String planCode) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();
		// Ingrese aqu� el c�digo del plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, planCode);
		boolean response = false;
		try {
			response = PayUPlans.delete(parameters);
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PayUException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
}
