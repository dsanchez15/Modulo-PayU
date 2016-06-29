package co.payU.interfaces;

import com.payu.sdk.model.TransactionResponse;

import co.excepciones.ExcepcionesPayU;
import co.payU.dto.PagoDto;

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
	public TransactionResponse pagoXTarjetaCredito(PagoDto pago) throws ExcepcionesPayU;

	/**
	 * Pago XPSE.
	 *
	 * @param pago the pago
	 * @return the transaction response
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public TransactionResponse pagoXPSE(PagoDto pago) throws ExcepcionesPayU;

	/**
	 * Pago X baloto efecty.
	 *
	 * @param pago the pago
	 * @return the transaction response
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public TransactionResponse pagoXBalotoEfecty(PagoDto pago) throws ExcepcionesPayU;
}
