/**
 * 
 */
package co.payU.dto;

/**
 * The Class PlanDto.
 *
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 14:13:19
 */
public class PlanDto {

	/** The str account id. */
	// Obligatorio create
	private String strAccountId;

	/** The str plan attempsts delay. */
	// Obligatorio create y update
	private String strPlanAttempstsDelay;

	/** The str plan code. */
	// Obligatorio create, inalterable update
	private String strPlanCode;

	/** The str plan currency. */
	// Obligatorio create y update
	private String strPlanCurrency;

	/** The str plan description. */
	// Obligatorio create y update
	private String strPlanDescription;

	/** The str plan interval. */
	// Obligatorio create
	private String strPlanInterval;

	/** The str plan interval count. */
	// Obligatorio create
	private String strPlanIntervalCount;

	/** The str plan max payments. */
	// Obligatorio create
	private String strPlanMaxPayments;

	/** The str plan tax. */
	// Opcional
	private String strPlanTax;

	/** The str plan tax return base. */
	// Opcional
	private String strPlanTaxReturnBase;

	/** The str plan value. */
	// Obligatorio create y update
	private String strPlanValue;

	/**
	 * Gets the str account id.
	 *
	 * @return the str account id
	 */
	public String getDsAccountId() {
		return strAccountId;
	}

	/**
	 * Sets the str account id.
	 *
	 * @param strAccountId the new str account id
	 */
	public void setDsAccountId(String strAccountId) {
		this.strAccountId = strAccountId;
	}

	/**
	 * Gets the str plan attempsts delay.
	 *
	 * @return the str plan attempsts delay
	 */
	public String getDsPlanAttempstsDelay() {
		return strPlanAttempstsDelay;
	}

	/**
	 * Sets the str plan attempsts delay.
	 *
	 * @param strPlanAttempstsDelay the new str plan attempsts delay
	 */
	public void setDsPlanAttempstsDelay(String strPlanAttempstsDelay) {
		this.strPlanAttempstsDelay = strPlanAttempstsDelay;
	}

	/**
	 * Gets the str plan code.
	 *
	 * @return the str plan code
	 */
	public String getDsPlanCode() {
		return strPlanCode;
	}

	/**
	 * Sets the str plan code.
	 *
	 * @param strPlanCode the new str plan code
	 */
	public void setDsPlanCode(String strPlanCode) {
		this.strPlanCode = strPlanCode;
	}

	/**
	 * Gets the str plan currency.
	 *
	 * @return the str plan currency
	 */
	public String getDsPlanCurrency() {
		return strPlanCurrency;
	}

	/**
	 * Sets the str plan currency.
	 *
	 * @param strPlanCurrency the new str plan currency
	 */
	public void setDsPlanCurrency(String strPlanCurrency) {
		this.strPlanCurrency = strPlanCurrency;
	}

	/**
	 * Gets the str plan description.
	 *
	 * @return the str plan description
	 */
	public String getDsPlanDescription() {
		return strPlanDescription;
	}

	/**
	 * Sets the str plan description.
	 *
	 * @param strPlanDescription the new str plan description
	 */
	public void setDsPlanDescription(String strPlanDescription) {
		this.strPlanDescription = strPlanDescription;
	}

	/**
	 * Gets the str plan interval.
	 *
	 * @return the str plan interval
	 */
	public String getDsPlanInterval() {
		return strPlanInterval;
	}

	/**
	 * Sets the str plan interval.
	 *
	 * @param strPlanInterval the new str plan interval
	 */
	public void setDsPlanInterval(String strPlanInterval) {
		this.strPlanInterval = strPlanInterval;
	}

	/**
	 * Gets the str plan interval count.
	 *
	 * @return the str plan interval count
	 */
	public String getDsPlanIntervalCount() {
		return strPlanIntervalCount;
	}

	/**
	 * Sets the str plan interval count.
	 *
	 * @param strPlanIntervalCount the new str plan interval count
	 */
	public void setDsPlanIntervalCount(String strPlanIntervalCount) {
		this.strPlanIntervalCount = strPlanIntervalCount;
	}

	/**
	 * Gets the str plan max payments.
	 *
	 * @return the str plan max payments
	 */
	public String getDsPlanMaxPayments() {
		return strPlanMaxPayments;
	}

	/**
	 * Sets the str plan max payments.
	 *
	 * @param strPlanMaxPayments the new str plan max payments
	 */
	public void setDsPlanMaxPayments(String strPlanMaxPayments) {
		this.strPlanMaxPayments = strPlanMaxPayments;
	}

	/**
	 * Gets the str plan tax.
	 *
	 * @return the str plan tax
	 */
	public String getDsPlanTax() {
		return strPlanTax;
	}

	/**
	 * Sets the str plan tax.
	 *
	 * @param strPlanTax the new str plan tax
	 */
	public void setDsPlanTax(String strPlanTax) {
		this.strPlanTax = strPlanTax;
	}

	/**
	 * Gets the str plan tax return base.
	 *
	 * @return the str plan tax return base
	 */
	public String getDsPlanTaxReturnBase() {
		return strPlanTaxReturnBase;
	}

	/**
	 * Sets the str plan tax return base.
	 *
	 * @param strPlanTaxReturnBase the new str plan tax return base
	 */
	public void setDsPlanTaxReturnBase(String strPlanTaxReturnBase) {
		this.strPlanTaxReturnBase = strPlanTaxReturnBase;
	}

	/**
	 * Gets the str plan value.
	 *
	 * @return the str plan value
	 */
	public String getDsPlanValue() {
		return strPlanValue;
	}

	/**
	 * Sets the str plan value.
	 *
	 * @param strPlanValue the new str plan value
	 */
	public void setDsPlanValue(String strPlanValue) {
		this.strPlanValue = strPlanValue;
	}
}
