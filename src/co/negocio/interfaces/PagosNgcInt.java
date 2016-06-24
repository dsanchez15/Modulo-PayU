package co.negocio.interfaces;

import com.payu.sdk.model.TransactionResponse;

import co.dto.Pago;
import co.excepciones.ExcepcionesPayU;

public interface PagosNgcInt {
	public TransactionResponse pagoXTarjetaCredito(Pago pago) throws ExcepcionesPayU;
	public void pagoXPSE(Pago pago) throws ExcepcionesPayU;
	public void pagoXBalotoEfecty(Pago pago) throws ExcepcionesPayU;
	
}
