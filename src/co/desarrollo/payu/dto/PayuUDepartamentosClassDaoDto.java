/**
 * 
 */
package co.desarrollo.payu.dto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 15 de jul. de 2016 15:39:22
 */
public class PayuUDepartamentosClassDaoDto {
	private Integer intIdDepartamento;
	private PayuPaisesClassDaoDto idPais;
	private String strNombreDepartamento;
	public Integer getIntIdDepartamento() {
		return intIdDepartamento;
	}
	public void setIntIdDepartamento(Integer intIdDepartamento) {
		this.intIdDepartamento = intIdDepartamento;
	}
	public PayuPaisesClassDaoDto getIdPais() {
		return idPais;
	}
	public void setIdPais(PayuPaisesClassDaoDto idPais) {
		this.idPais = idPais;
	}
	public String getStrNombreDepartamento() {
		return strNombreDepartamento;
	}
	public void setStrNombreDepartamento(String strNombreDepartamento) {
		this.strNombreDepartamento = strNombreDepartamento;
	}
	
	
}
