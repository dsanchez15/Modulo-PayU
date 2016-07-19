/**
 * 
 */
package co.desarrollo.payu.negocio;

import com.payu.sdk.model.TransactionResponse;

import co.desarrollo.payu.payU.PagosPayU;
import co.desarrollo.payu.payU.dto.PagoDto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 13 de jul. de 2016 14:35:59
 */
public class PagosClassNgcImpl implements co.desarrollo.payu.negocio.interfaces.PagosClassNgc {
	
	private PagosPayU PagosPayU = new PagosPayU();
	private PagoDto pd = new PagoDto();
	
	
	public boolean guardarPago() {
		/*
		 * Se asume que un usuario esta inscrito en el sistema asi que habran varios datos que no se pediran a nadie mas.
		 */
		
		pd.setDsAccountId("512321");
		pd.setDsReferenceCode("PagoPrueba002");
		pd.setDsValue("10000");
		pd.setDsDescription("Pago de prueba 002");
		pd.setDsLanguage("Language.es");
		pd.setDsCurrency("COP");
		pd.setDsBuyerDNI("1037613239");
		pd.setDsPayerId("U001PL1");
		pd.setDsPayerName("Rosa Melano");
		pd.setDsPayerDNI("1037613240");
		pd.setDsCreditCardNumber("4727786966713206");
		pd.setDsCreditCardExpirationDate("2017/09");
		pd.setDsCreditCardSegurityCode("913");
		pd.setDsPaymentMethod("VISA");
		pd.setDsInstallmentsNumber("1");
		pd.setDsCountry("CO");
		TransactionResponse response = null;
		try {
			
			response = PagosPayU.pagoXTarjetaCredito(pd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		System.out.println(response.getState().equals("PENDING"));
		return response.getState().equals("PENDING");
	}

}
