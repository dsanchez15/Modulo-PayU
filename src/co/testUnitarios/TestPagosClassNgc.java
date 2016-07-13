package co.testUnitarios;

import static org.junit.Assert.*;

import org.junit.Test;

import co.negocio.PagosClassNgcImpl;

public class TestPagosClassNgc {

	PagosClassNgcImpl pd;
	
	@Test
	public void testCompraxTarjetaCredito() {
		
		pd = new PagosClassNgcImpl();
		assertFalse(pd.guardarPago());
	}

}
