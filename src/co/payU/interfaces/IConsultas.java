package co.payU.interfaces;

import java.util.List;

import com.payu.sdk.model.Order;
import com.payu.sdk.model.TransactionResponse;
import co.excepciones.ExcepcionesPayU;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 10:46:46
 */
public interface IConsultas {
	public Order ordenXIdentificacion(String orderId) throws ExcepcionesPayU;
	public List<Order> ordenXReferencia(String referenceCode) throws ExcepcionesPayU;
	public TransactionResponse respuestaTransaccion(String transactionId) throws ExcepcionesPayU;	
}
