package co.negocio.interfaces;

import co.dto.Pago;
import co.excepciones.ExcepcionesPayU;

public interface PagosNgcInt {
	public void pagoXTarjetaCredito(Pago pago) throws ExcepcionesPayU;
	public void pagoXPSE() throws ExcepcionesPayU;
	public void pagoXBalotoEfecty() throws ExcepcionesPayU;
	
}
