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

	/** The ds account id. */
	// Obligatorio create
	private String dsAccountId;

	/** The ds plan attempsts delay. */
	// Obligatorio create y update
	private String dsPlanAttempstsDelay;

	/** The ds plan code. */
	// Obligatorio create, inalterable update
	private String dsPlanCode;

	/** The ds plan currency. */
	// Obligatorio create y update
	private String dsPlanCurrency;

	/** The ds plan description. */
	// Obligatorio create y update
	private String dsPlanDescription;

	/** The ds plan interval. */
	// Obligatorio create
	private String dsPlanInterval;

	/** The ds plan interval count. */
	// Obligatorio create
	private String dsPlanIntervalCount;

	/** The ds plan max payments. */
	// Obligatorio create
	private String dsPlanMaxPayments;

	/** The ds plan tax. */
	// Opcional
	private String dsPlanTax;

	/** The ds plan tax return base. */
	// Opcional
	private String dsPlanTaxReturnBase;

	/** The ds plan value. */
	// Obligatorio create y update
	private String dsPlanValue;

	/**
	 * Gets the ds account id.
	 *
	 * @return the ds account id
	 */
	public String getDsAccountId() {
		return dsAccountId;
	}

	/**
	 * Sets the ds account id.
	 *
	 * @param dsAccountId the new ds account id
	 */
	public void setDsAccountId(String dsAccountId) {
		this.dsAccountId = dsAccountId;
	}

	/**
	 * Gets the ds plan attempsts delay.
	 *
	 * @return the ds plan attempsts delay
	 */
	public String getDsPlanAttempstsDelay() {
		return dsPlanAttempstsDelay;
	}

	/**
	 * Sets the ds plan attempsts delay.
	 *
	 * @param dsPlanAttempstsDelay the new ds plan attempsts delay
	 */
	public void setDsPlanAttempstsDelay(String dsPlanAttempstsDelay) {
		this.dsPlanAttempstsDelay = dsPlanAttempstsDelay;
	}

	/**
	 * Gets the ds plan code.
	 *
	 * @return the ds plan code
	 */
	public String getDsPlanCode() {
		return dsPlanCode;
	}

	/**
	 * Sets the ds plan code.
	 *
	 * @param dsPlanCode the new ds plan code
	 */
	public void setDsPlanCode(String dsPlanCode) {
		this.dsPlanCode = dsPlanCode;
	}

	/**
	 * Gets the ds plan currency.
	 *
	 * @return the ds plan currency
	 */
	public String getDsPlanCurrency() {
		return dsPlanCurrency;
	}

	/**
	 * Sets the ds plan currency.
	 *
	 * @param dsPlanCurrency the new ds plan currency
	 */
	public void setDsPlanCurrency(String dsPlanCurrency) {
		this.dsPlanCurrency = dsPlanCurrency;
	}

	/**
	 * Gets the ds plan description.
	 *
	 * @return the ds plan description
	 */
	public String getDsPlanDescription() {
		return dsPlanDescription;
	}

	/**
	 * Sets the ds plan description.
	 *
	 * @param dsPlanDescription the new ds plan description
	 */
	public void setDsPlanDescription(String dsPlanDescription) {
		this.dsPlanDescription = dsPlanDescription;
	}

	/**
	 * Gets the ds plan interval.
	 *
	 * @return the ds plan interval
	 */
	public String getDsPlanInterval() {
		return dsPlanInterval;
	}

	/**
	 * Sets the ds plan interval.
	 *
	 * @param dsPlanInterval the new ds plan interval
	 */
	public void setDsPlanInterval(String dsPlanInterval) {
		this.dsPlanInterval = dsPlanInterval;
	}

	/**
	 * Gets the ds plan interval count.
	 *
	 * @return the ds plan interval count
	 */
	public String getDsPlanIntervalCount() {
		return dsPlanIntervalCount;
	}

	/**
	 * Sets the ds plan interval count.
	 *
	 * @param dsPlanIntervalCount the new ds plan interval count
	 */
	public void setDsPlanIntervalCount(String dsPlanIntervalCount) {
		this.dsPlanIntervalCount = dsPlanIntervalCount;
	}

	/**
	 * Gets the ds plan max payments.
	 *
	 * @return the ds plan max payments
	 */
	public String getDsPlanMaxPayments() {
		return dsPlanMaxPayments;
	}

	/**
	 * Sets the ds plan max payments.
	 *
	 * @param dsPlanMaxPayments the new ds plan max payments
	 */
	public void setDsPlanMaxPayments(String dsPlanMaxPayments) {
		this.dsPlanMaxPayments = dsPlanMaxPayments;
	}

	/**
	 * Gets the ds plan tax.
	 *
	 * @return the ds plan tax
	 */
	public String getDsPlanTax() {
		return dsPlanTax;
	}

	/**
	 * Sets the ds plan tax.
	 *
	 * @param dsPlanTax the new ds plan tax
	 */
	public void setDsPlanTax(String dsPlanTax) {
		this.dsPlanTax = dsPlanTax;
	}

	/**
	 * Gets the ds plan tax return base.
	 *
	 * @return the ds plan tax return base
	 */
	public String getDsPlanTaxReturnBase() {
		return dsPlanTaxReturnBase;
	}

	/**
	 * Sets the ds plan tax return base.
	 *
	 * @param dsPlanTaxReturnBase the new ds plan tax return base
	 */
	public void setDsPlanTaxReturnBase(String dsPlanTaxReturnBase) {
		this.dsPlanTaxReturnBase = dsPlanTaxReturnBase;
	}

	/**
	 * Gets the ds plan value.
	 *
	 * @return the ds plan value
	 */
	public String getDsPlanValue() {
		return dsPlanValue;
	}

	/**
	 * Sets the ds plan value.
	 *
	 * @param dsPlanValue the new ds plan value
	 */
	public void setDsPlanValue(String dsPlanValue) {
		this.dsPlanValue = dsPlanValue;
	}
}
