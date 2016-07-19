/**
 * 
 */
package co.desarrollo.payu.dto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 15 de jul. de 2016 15:41:15
 */
public class PayUCiudadesClassDaoDto {
	private Integer intIdCiudad;
	private PayuUDepartamentosClassDaoDto idDepartamentos;
	private String strNombreCiudad;
	public Integer getIntIdCiudad() {
		return intIdCiudad;
	}
	public void setIntIdCiudad(Integer intIdCiudad) {
		this.intIdCiudad = intIdCiudad;
	}
	public PayuUDepartamentosClassDaoDto getIdDepartamentos() {
		return idDepartamentos;
	}
	public void setIdDepartamentos(PayuUDepartamentosClassDaoDto idDepartamentos) {
		this.idDepartamentos = idDepartamentos;
	}
	public String getStrNombreCiudad() {
		return strNombreCiudad;
	}
	public void setStrNombreCiudad(String strNombreCiudad) {
		this.strNombreCiudad = strNombreCiudad;
	}
}
