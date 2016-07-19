/**
 * 
 */
package co.desarrollo.payu.dto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 15 de jul. de 2016 15:30:22
 */
public class PayUPlanesClassDaoDto {
	 private Integer intIdPlan;
	 private String strDescripcion;
	 private Integer intIntervaloCobro;
	 private Integer intValor;
	 private Integer intCantidadCobros;
	 
	public Integer getIntIdPlan() {
		return intIdPlan;
	}
	public void setIntIdPlan(Integer intIdPlan) {
		this.intIdPlan = intIdPlan;
	}
	public String getStrDescripcion() {
		return strDescripcion;
	}
	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
	public Integer getIntIntervaloCobro() {
		return intIntervaloCobro;
	}
	public void setIntIntervaloCobro(Integer intIntervaloCobro) {
		this.intIntervaloCobro = intIntervaloCobro;
	}
	public Integer getIntValor() {
		return intValor;
	}
	public void setIntValor(Integer intValor) {
		this.intValor = intValor;
	}
	public Integer getIntCantidadCobros() {
		return intCantidadCobros;
	}
	public void setIntCantidadCobros(Integer intCantidadCobros) {
		this.intCantidadCobros = intCantidadCobros;
	}
	 
}
