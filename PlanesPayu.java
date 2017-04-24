package co.weepa.smile.contabilidad.payu;

import java.util.HashMap;
import java.util.Map;

import com.payu.sdk.PayU;
import com.payu.sdk.PayUPlans;
import com.payu.sdk.exceptions.ConnectionException;
import com.payu.sdk.exceptions.InvalidParametersException;
import com.payu.sdk.exceptions.PayUException;
import com.payu.sdk.paymentplan.model.SubscriptionPlan;

import co.weepa.smile.contabilidad.payu.dto.ObjPlanPayu;
import co.weepa.smile.contabilidad.payu.interfaces.IPlanes;
import co.weepa.smile.contabilidad.util.exception.ExcepcionesPayU;

/**
 * The Class PlanesPayu.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0 27 de jun. de 2016 14:31:31
 */
public class PlanesPayu implements IPlanes {
	private SubscriptionPlan response = null;

	@Override
	public SubscriptionPlan createPlan(ObjPlanPayu plan) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aquí la descripción del plan
		parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION, plan.getStrPlanDescription());
		// Ingresa aquí el código de identificación para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CODE, plan.getStrPlanCode());
		// Ingresa aquí el intervalo del plan
		// interval: Esta propiedad sólo acepta: DAY, WEEK, MONTH, YEAR.
		// </description>
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL, plan.getStrPlanInterval());
		// Ingresa aquí la cantidad de intervalos
		parameters.put(PayU.PARAMETERS.PLAN_INTERVAL_COUNT, plan.getStrPlanIntervalCount());
		// Ingresa aquí la moneda para el plan
		parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, plan.getStrPlanCurrency());
		// Ingresa aquí el valor del plan
		parameters.put(PayU.PARAMETERS.PLAN_VALUE, plan.getStrPlanValue());
		// (OPCIONAL) Ingresa aquí el valor del impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX, plan.getStrPlanTax());
		// (OPCIONAL) Ingresa aquí la base de devolución sobre el impuesto
		parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE, plan.getStrPlanTaxReturnBase());
		// Ingresa aquí la cuenta Id del plan
		parameters.put(PayU.PARAMETERS.ACCOUNT_ID, plan.getStrAccountId());
		// Ingresa aquí el intervalo de reintentos
		parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY, plan.getStrPlanAttempstsDelay());
		// Ingresa aquí la cantidad de cobros que componen el plan
		parameters.put(PayU.PARAMETERS.PLAN_MAX_PAYMENTS, plan.getStrPlanMaxPayments());
		try {
			response = PayUPlans.create(parameters);
		} catch (PayUException e) {
			response.setDescription("Error");
			throw new ExcepcionesPayU("Error proveniente de PayUException: " + e.getMessage(), e);
		} catch (InvalidParametersException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e.getStackTrace().toString(), e);
		} catch (ConnectionException e) {
			throw new ExcepcionesPayU("Error proveniente de PayUException: " + e.getMessage(), e);
		}
		return response;
	}

	// public SubscriptionPlan updatePlan(PlanDto plan) throws ExcepcionesPayU {
	//
	// Map<String, String> parameters = new HashMap<>();
	// // Ingrese aquí la nueva descripción para el plan
	// parameters.put(PayU.PARAMETERS.PLAN_DESCRIPTION,
	// plan.getDsPlanDescription());
	// // Ingrese aquí el código del plan (Debe ser un código de plan existente)
	// parameters.put(PayU.PARAMETERS.PLAN_CODE, plan.getDsPlanCode());
	// // Ingrese aquí la moneda del plan (Debe ser el mismo que fue usado
	// cuando el plan fue creado)
	// parameters.put(PayU.PARAMETERS.PLAN_CURRENCY, plan.getDsPlanCurrency());
	// // Ingrese aquí el nuevo valor del plan
	// parameters.put(PayU.PARAMETERS.PLAN_VALUE, plan.getDsPlanValue());
	// //(OPCIONAL) Ingrese aquí el valor del impuesto
	// parameters.put(PayU.PARAMETERS.PLAN_TAX, plan.getDsPlanTax());
	// //(OPCIONAL) Ingrese aquí base de devolución del impuesto
	// parameters.put(PayU.PARAMETERS.PLAN_TAX_RETURN_BASE,
	// plan.getDsPlanTaxReturnBase());
	// // Ingrese aquí la cantidad de reintentos
	// parameters.put(PayU.PARAMETERS.PLAN_ATTEMPTS_DELAY,
	// plan.getDsPlanAttempstsDelay());
	// SubscriptionPlan response = null;
	// try {
	// response = PayUPlans.update(parameters);
	// } catch (PayUException e) {
	//
	// e.printStackTrace();
	// throw new ExcepcionesPayU(e);
	// } catch (InvalidParametersException e) {
	//
	// e.printStackTrace();
	// throw new ExcepcionesPayU(e);
	// } catch (ConnectionException e) {
	//
	// e.printStackTrace();
	// throw new ExcepcionesPayU(e);
	// }
	// return response;
	// }
	@Override
	public SubscriptionPlan seePlan(String planCode) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		parameters.put(PayU.PARAMETERS.PLAN_CODE, planCode);
		SubscriptionPlan response = null;
		try {
			response = PayUPlans.find(parameters);
		} catch (PayUException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (InvalidParametersException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	@Override
	public boolean deletePlan(String planCode) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		parameters.put(PayU.PARAMETERS.PLAN_CODE, planCode);
		boolean response = false;
		try {
			response = PayUPlans.delete(parameters);
		} catch (InvalidParametersException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (ConnectionException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		} catch (PayUException e) {
			e.printStackTrace();
			throw new ExcepcionesPayU(e);
		}
		return response;
	}
}
