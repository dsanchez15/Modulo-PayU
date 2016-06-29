package co.payU.interfaces;

import java.util.List;

import com.payu.sdk.model.Order;
import com.payu.sdk.model.TransactionResponse;
import co.excepciones.ExcepcionesPayU;

/**
 * The Interface IConsultas.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 10:46:46
 */
public interface IConsultas {

	/**
	 * Orden X identificacion.
	 *
	 * @param orderId the order id
	 * @return the order
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public Order ordenXIdentificacion(String orderId) throws ExcepcionesPayU;

	/**
	 * Orden X referencia.
	 *
	 * @param referenceCode the reference code
	 * @return the list
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public List<Order> ordenXReferencia(String referenceCode) throws ExcepcionesPayU;

	/**
	 * Respuesta transaccion.
	 *
	 * @param transactionId the transaction id
	 * @return the transaction response
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public TransactionResponse respuestaTransaccion(String transactionId) throws ExcepcionesPayU;	
}
