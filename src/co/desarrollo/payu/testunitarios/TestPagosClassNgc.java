package co.desarrollo.payu.testunitarios;

import static org.junit.Assert.*;

import org.junit.Test;

import co.desarrollo.payu.negocio.PagosClassNgcImpl;

public class TestPagosClassNgc {

	PagosClassNgcImpl pd;
	
	@Test
	public void testCompraxTarjetaCredito() {
		
		pd = new PagosClassNgcImpl();
		assertFalse(pd.guardarPago());
	}
}
