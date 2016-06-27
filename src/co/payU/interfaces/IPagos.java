package co.payU.interfaces;

import com.payu.sdk.model.TransactionResponse;

import co.dto.PagoDto;
import co.excepciones.ExcepcionesPayU;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 10:46:21
 */
public interface IPagos {
	public TransactionResponse pagoXTarjetaCredito(PagoDto pago) throws ExcepcionesPayU;
	public TransactionResponse pagoXPSE(PagoDto pago) throws ExcepcionesPayU;
	public TransactionResponse pagoXBalotoEfecty(PagoDto pago) throws ExcepcionesPayU;
}
