/**
 * 
 */
package co.desarrollo.payu.dto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0 14 de jul. de 2016 11:47:21
 */
public class PayUTransaccionClassDaoDto {
	private String strIdTransaccion;
	private String strOrderIdPayU;
	private String strTransaccionIdPayu;
	private String strEstado;

	public String getStrIdTransaccion() {
		return strIdTransaccion;
	}

	public void setStrIdTransaccion(String strIdTransaccion) {
		this.strIdTransaccion = strIdTransaccion;
	}

	public String getStrOrderIdPayU() {
		return strOrderIdPayU;
	}

	public void setStrOrderIdPayU(String strOrderIdPayU) {
		this.strOrderIdPayU = strOrderIdPayU;
	}

	public String getStrTransaccionIdPayu() {
		return strTransaccionIdPayu;
	}

	public void setStrTransaccionIdPayu(String strTransaccionIdPayu) {
		this.strTransaccionIdPayu = strTransaccionIdPayu;
	}

	public String getStrEstado() {
		return strEstado;
	}

	public void setStrEstado(String strEstado) {
		this.strEstado = strEstado;
	}
}
