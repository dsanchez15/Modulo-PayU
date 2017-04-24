/**
 *
 */
package co.weepa.smile.contabilidad.payu.interfaces;

import com.payu.sdk.paymentplan.model.SubscriptionPlan;

import co.weepa.smile.contabilidad.payu.dto.ObjPlanPayu;
import co.weepa.smile.contabilidad.util.exception.ExcepcionesPayU;

/**
 * The Interface IPlanes.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0 27 de jun. de 2016 14:05:39
 */
public interface IPlanes {
	/**
	 * Creates the plan.
	 *
	 * @param plan
	 *            the plan
	 * @return the subscription plan
	 * @throws ExcepcionesPayU
	 *             the excepciones pay U
	 */
	public SubscriptionPlan createPlan(ObjPlanPayu plan) throws ExcepcionesPayU;

	/**
	 * Update plan.
	 *
	 * @param plan
	 *            the plan
	 * @return the subscription plan
	 * @throws ExcepcionesPayU
	 *             the excepciones pay U
	 */
	// public SubscriptionPlan updatePlan(PlanDto plan) throws ExcepcionesPayU;
	/**
	 * See plan.
	 *
	 * @param planCode
	 *            the plan code
	 * @return the subscription plan
	 * @throws ExcepcionesPayU
	 *             the excepciones pay U
	 */
	public SubscriptionPlan seePlan(String planCode) throws ExcepcionesPayU;

	/**
	 * Delete plan.
	 *
	 * @param planCode
	 *            the plan code
	 * @return true, if successful
	 * @throws ExcepcionesPayU
	 *             the excepciones pay U
	 */
	public boolean deletePlan(String planCode) throws ExcepcionesPayU;
}
