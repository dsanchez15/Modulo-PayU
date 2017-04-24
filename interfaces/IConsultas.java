package co.weepa.smile.contabilidad.payu.interfaces;

import java.util.List;

import com.payu.sdk.model.Bank;
import com.payu.sdk.model.Order;
import com.payu.sdk.model.TransactionResponse;

import co.weepa.smile.contabilidad.util.exception.ExcepcionesPayU;

public interface IConsultas {
	public Order ordenXIdentificacion(String orderId) throws ExcepcionesPayU;

	public List<Order> ordenXReferencia(String referenceCode) throws ExcepcionesPayU;

	public TransactionResponse respuestaTransaccion(String transactionId) throws ExcepcionesPayU;

	public List<Bank> consultarListaBancosPayUPSE() throws ExcepcionesPayU;
}