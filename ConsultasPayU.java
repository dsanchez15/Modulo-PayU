package co.weepa.smile.contabilidad.payu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.payu.sdk.PayU;
import com.payu.sdk.PayUPayments;
import com.payu.sdk.PayUReports;
import com.payu.sdk.exceptions.ConnectionException;
import com.payu.sdk.exceptions.InvalidParametersException;
import com.payu.sdk.exceptions.PayUException;
import com.payu.sdk.model.Bank;
import com.payu.sdk.model.Order;
import com.payu.sdk.model.PaymentCountry;
import com.payu.sdk.model.TransactionResponse;

import co.weepa.smile.contabilidad.payu.interfaces.IConsultas;
import co.weepa.smile.contabilidad.util.exception.ExcepcionesPayU;

public class ConsultasPayU implements IConsultas {
	@Override
	public Order ordenXIdentificacion(String orderId) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aqui el codigo de referencia de la orden.
		parameters.put(PayU.PARAMETERS.ORDER_ID, orderId);
		Order response = null;
		try {
			response = PayUReports.getOrderDetail(parameters);
		} catch (PayUException | ConnectionException | InvalidParametersException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	@Override
	public List<Order> ordenXReferencia(String referenceCode) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aqui el codigo de referencia de la orden.
		parameters.put(PayU.PARAMETERS.REFERENCE_CODE, referenceCode);
		List<Order> ordersResponse = null;
		try {
			ordersResponse = PayUReports.getOrderDetailByReferenceCode(parameters);
		} catch (PayUException | ConnectionException | InvalidParametersException e) {
			throw new ExcepcionesPayU(e);
		}
		return ordersResponse;
	}

	@Override
	public TransactionResponse respuestaTransaccion(String transactionId) throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		// Ingresa aqui el identificador de la transaccion.
		parameters.put(PayU.PARAMETERS.TRANSACTION_ID, transactionId);
		TransactionResponse response = null;
		try {
			response = PayUReports.getTransactionResponse(parameters);
		} catch (PayUException | ConnectionException | InvalidParametersException e) {
			throw new ExcepcionesPayU(e);
		}
		return response;
	}

	@Override
	public List<Bank> consultarListaBancosPayUPSE() throws ExcepcionesPayU {
		Map<String, String> parameters = new HashMap<>();
		parameters.put(PayU.PARAMETERS.PAYMENT_METHOD, "PSE");
		parameters.put(PayU.PARAMETERS.COUNTRY, PaymentCountry.CO.name());
		List<Bank> banks = null;
		try {
			banks = PayUPayments.getPSEBanks(parameters);
		} catch (PayUException | InvalidParametersException | ConnectionException e) {
			throw new ExcepcionesPayU(e);
		}
		return banks;
	}
}