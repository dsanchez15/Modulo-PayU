package co.desarrollo.payu.payU.interfaces;

import com.payu.sdk.model.TransactionResponse;

import co.desarrollo.payu.exception.ExceptionPayU;
import co.desarrollo.payu.payU.dto.PagoDto;

/**
 * The Interface IPagos.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 10:46:21
 */
public interface IPagos {

	/**
	 * Pago X tarjeta credito.
	 *
	 * @param pago the pago
	 * @return the transaction response
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public TransactionResponse pagoXTarjetaCredito(PagoDto pago) throws ExceptionPayU;

	/**
	 * Pago XPSE.
	 *
	 * @param pago the pago
	 * @return the transaction response
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public TransactionResponse pagoXPSE(PagoDto pago) throws ExceptionPayU;

	/**
	 * Pago X baloto efecty.
	 *
	 * @param pago the pago
	 * @return the transaction response
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public TransactionResponse pagoXBalotoEfecty(PagoDto pago) throws ExceptionPayU;
}
