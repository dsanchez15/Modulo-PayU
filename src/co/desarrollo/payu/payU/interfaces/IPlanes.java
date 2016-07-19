/**
 * 
 */
package co.desarrollo.payu.payU.interfaces;

import com.payu.sdk.paymentplan.model.SubscriptionPlan;

import co.desarrollo.payu.exception.ExceptionPayU;
import co.desarrollo.payu.payU.dto.PlanDto;

/**
 * The Interface IPlanes.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 14:05:39
 */
public interface IPlanes {

	/**
	 * Creates the plan.
	 *
	 * @param plan the plan
	 * @return the subscription plan
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public SubscriptionPlan  createPlan(PlanDto plan) throws ExceptionPayU;

	/**
	 * Update plan.
	 *
	 * @param plan the plan
	 * @return the subscription plan
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public SubscriptionPlan  updatePlan(PlanDto plan) throws ExceptionPayU;

	/**
	 * See plan.
	 *
	 * @param planCode the plan code
	 * @return the subscription plan
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public SubscriptionPlan  seePlan(String planCode) throws ExceptionPayU;

	/**
	 * Delete plan.
	 *
	 * @param planCode the plan code
	 * @return true, if successful
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public boolean deletePlan(String planCode) throws ExceptionPayU;
}
