/**
 * 
 */
package co.payU.interfaces;

import com.payu.sdk.paymentplan.model.SubscriptionPlan;

import co.dto.PlanDto;
import co.excepciones.ExcepcionesPayU;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 14:05:39
 */
public interface IPlanes {
	public SubscriptionPlan  createPlan(PlanDto plan) throws ExcepcionesPayU;
	public SubscriptionPlan  updatePlan(PlanDto plan) throws ExcepcionesPayU;
	public SubscriptionPlan  seePlan(String planCode) throws ExcepcionesPayU;
	public boolean deletePlan(String planCode) throws ExcepcionesPayU;
}
