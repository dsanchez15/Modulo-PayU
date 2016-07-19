/**
 * 
 */
package co.desarrollo.payu.dto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 15 de jul. de 2016 18:06:30
 */
public class PayUTipoDocumentoClassDaoDto {
	private Integer intIdDocumento;
	private String strIso;
	private String strDescripcion;
	public Integer getIntIdDocumento() {
		return intIdDocumento;
	}
	public void setIntIdDocumento(Integer intIdDocumento) {
		this.intIdDocumento = intIdDocumento;
	}
	public String getStrIso() {
		return strIso;
	}
	public void setStrIso(String strIso) {
		this.strIso = strIso;
	}
	public String getStrDescripcion() {
		return strDescripcion;
	}
	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

}
