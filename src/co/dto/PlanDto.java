/**
 * 
 */
package co.dto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 14:13:19
 */
public class PlanDto {
	
	// Obligatorio create
	private String dsAccountId;
	// Obligatorio create y update
	private String dsPlanAttempstsDelay;
	// Obligatorio create, inalterable update
	private String dsPlanCode;
	// Obligatorio create y update
	private String dsPlanCurrency;
	// Obligatorio create y update
	private String dsPlanDescription;
	// Obligatorio create
	private String dsPlanInterval;
	// Obligatorio create
	private String dsPlanIntervalCount;
	// Obligatorio create
	private String dsPlanMaxPayments;
	// Opcional
	private String dsPlanTax;
	// Opcional
	private String dsPlanTaxReturnBase;
	// Obligatorio create y update
	private String dsPlanValue;
	
	public String getDsAccountId() {
		return dsAccountId;
	}
	public void setDsAccountId(String dsAccountId) {
		this.dsAccountId = dsAccountId;
	}
	public String getDsPlanAttempstsDelay() {
		return dsPlanAttempstsDelay;
	}
	public void setDsPlanAttempstsDelay(String dsPlanAttempstsDelay) {
		this.dsPlanAttempstsDelay = dsPlanAttempstsDelay;
	}
	public String getDsPlanCode() {
		return dsPlanCode;
	}
	public void setDsPlanCode(String dsPlanCode) {
		this.dsPlanCode = dsPlanCode;
	}
	public String getDsPlanCurrency() {
		return dsPlanCurrency;
	}
	public void setDsPlanCurrency(String dsPlanCurrency) {
		this.dsPlanCurrency = dsPlanCurrency;
	}
	public String getDsPlanDescription() {
		return dsPlanDescription;
	}
	public void setDsPlanDescription(String dsPlanDescription) {
		this.dsPlanDescription = dsPlanDescription;
	}
	public String getDsPlanInterval() {
		return dsPlanInterval;
	}
	public void setDsPlanInterval(String dsPlanInterval) {
		this.dsPlanInterval = dsPlanInterval;
	}
	public String getDsPlanIntervalCount() {
		return dsPlanIntervalCount;
	}
	public void setDsPlanIntervalCount(String dsPlanIntervalCount) {
		this.dsPlanIntervalCount = dsPlanIntervalCount;
	}
	public String getDsPlanMaxPayments() {
		return dsPlanMaxPayments;
	}
	public void setDsPlanMaxPayments(String dsPlanMaxPayments) {
		this.dsPlanMaxPayments = dsPlanMaxPayments;
	}
	public String getDsPlanTax() {
		return dsPlanTax;
	}
	public void setDsPlanTax(String dsPlanTax) {
		this.dsPlanTax = dsPlanTax;
	}
	public String getDsPlanTaxReturnBase() {
		return dsPlanTaxReturnBase;
	}
	public void setDsPlanTaxReturnBase(String dsPlanTaxReturnBase) {
		this.dsPlanTaxReturnBase = dsPlanTaxReturnBase;
	}
	public String getDsPlanValue() {
		return dsPlanValue;
	}
	public void setDsPlanValue(String dsPlanValue) {
		this.dsPlanValue = dsPlanValue;
	}
}
