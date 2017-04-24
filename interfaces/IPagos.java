package co.weepa.smile.contabilidad.payu.interfaces;

import com.payu.sdk.model.TransactionResponse;

import co.weepa.smile.contabilidad.payu.dto.ObjPagoPayU;
import co.weepa.smile.contabilidad.util.exception.ExcepcionesPayU;

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
	public TransactionResponse pagoXTarjetaCredito(ObjPagoPayU pago) throws ExcepcionesPayU;

	/**
	 * Pago XPSE.
	 *
	 * @param pago the pago
	 * @return the transaction response
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public TransactionResponse pagoXPSE(ObjPagoPayU pago) throws ExcepcionesPayU;

	/**
	 * Pago X baloto efecty.
	 *
	 * @param pago the pago
	 * @return the transaction response
	 * @throws ExcepcionesPayU the excepciones pay U
	 */
	public TransactionResponse pagoXBalotoEfecty(ObjPagoPayU pago) throws ExcepcionesPayU;
}
