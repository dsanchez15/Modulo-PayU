/**
 * 
 */
package co.weepa.smile.contabilidad.payu.interfaces;

import java.util.List;

import com.payu.sdk.paymentplan.model.Subscription;

import co.weepa.smile.contabilidad.payu.dto.ObjPayuCliente;
import co.weepa.smile.contabilidad.payu.dto.ObjPayuSuscripcion;
import co.weepa.smile.contabilidad.util.exception.ExcepcionesPayU;

/**
 * The Interface ISuscripciones.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 29 de jun. de 2016 10:35:05
 */
public interface IPagosRecurrentes {

	/**
	 * Creates the subscription all new.
	 *
	 * @param suscripcion the suscripcion
	 * @return Respuesta de PayU con la verificación de la suscripcion del cliente.
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public Subscription createSubscriptionAllNew(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU;

	/**
	 * Creates the subscription all exists.
	 *
	 * @param suscripcion the suscripcion
	 * @return the subscription
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public Subscription createSubscriptionAllExists(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU;

	/**
	 * Creates the subscription new credit card.
	 *
	 * @param suscripcion the suscripcion
	 * @return the subscription
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public Subscription createSubscriptionNewCreditCard(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU;

	/**
	 * Creates the subscription new plan.
	 *
	 * @param suscripcion the suscripcion
	 * @return the subscription
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public Subscription createSubscriptionNewPlan(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU;

	// Que otras actualizaciones se pueden hacer y de que forma??
	/**
	 * Update subscription credit card.
	 *
	 * @param suscripcion the suscripcion
	 * @return the subscription
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public Subscription updateSubscriptionCreditCard(ObjPayuSuscripcion suscripcion) throws ExcepcionesPayU;

	/**
	 * See subscription.
	 *
	 * @param subscriptionId the subscription id
	 * @return the subscription
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public Subscription seeSubscription(String subscriptionId) throws ExcepcionesPayU;
	//Ojo con esta puede no funcionar correctamente hay que comprobarla que si liste todo lo propio.
	/**
	 * See all subscriptions.
	 *
	 * @return the list
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public List<Subscription> seeAllSubscriptions() throws ExcepcionesPayU;

	/**
	 * See all subscription by plan.
	 *
	 * @param planId the plan id
	 * @return the list
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public List<Subscription> seeAllSubscriptionByPlan(String planId) throws ExcepcionesPayU;

	/**
	 * See all subscription by customer.
	 *
	 * @param customerId the customer id
	 * @return the list
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public List<Subscription> seeAllSubscriptionByCustomer(String customerId) throws ExcepcionesPayU;

	/**
	 * Delete subscription.
	 *
	 * @param subscriptionId the subscription id
	 * @return true, if successful
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public boolean deleteSubscription(String subscriptionId) throws ExcepcionesPayU;
	
	public String agregarCliente(ObjPayuCliente cliente) throws ExcepcionesPayU;
	
	public boolean verificarUsusarioInscrito(String idCliente)throws ExcepcionesPayU;
}
