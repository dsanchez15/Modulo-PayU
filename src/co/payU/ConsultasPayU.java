package co.payU;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.payu.sdk.PayU;
import com.payu.sdk.PayUReports;
import com.payu.sdk.exceptions.ConnectionException;
import com.payu.sdk.exceptions.InvalidParametersException;
import com.payu.sdk.exceptions.PayUException;
import com.payu.sdk.model.Order;
import com.payu.sdk.model.TransactionResponse;

import co.desarrollo.exception.ExceptionPayU;
import co.payU.interfaces.IConsultas;

/**
 * The Class ConsultasPayU.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0 27 de jun. de 2016 10:47:38
 * 
 */
public class ConsultasPayU implements IConsultas {

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.payU.interfaces.IConsultas#ordenXIdentificacion(java.lang.String)
	 */
	public Order ordenXIdentificacion(String orderId) throws ExceptionPayU {

		Map<String, String> parameters = new HashMap<String, String>();

		// Ingresa aquí el código de referencia de la orden.
		parameters.put(PayU.PARAMETERS.ORDER_ID, orderId);
		Order response = null;
		try {
			response = PayUReports.getOrderDetail(parameters);
		} catch (PayUException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.payU.interfaces.IConsultas#ordenXReferencia(java.lang.String)
	 */
	public List<Order> ordenXReferencia(String referenceCode) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();

		// Ingresa aquí el código de referencia de la orden.
		parameters.put(PayU.PARAMETERS.REFERENCE_CODE, referenceCode);

		List<Order> orders_response = null;
		try {
			orders_response = PayUReports.getOrderDetailByReferenceCode(parameters);
		} catch (PayUException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orders_response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.payU.interfaces.IConsultas#respuestaTransaccion(java.lang.String)
	 */
	public TransactionResponse respuestaTransaccion(String transactionId) throws ExceptionPayU {
		Map<String, String> parameters = new HashMap<String, String>();

		// Ingresa aquí el identificador de la transacción.
		parameters.put(PayU.PARAMETERS.TRANSACTION_ID, transactionId);

		TransactionResponse response = null;
		try {
			response = PayUReports.getTransactionResponse(parameters);
		} catch (PayUException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidParametersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
}
