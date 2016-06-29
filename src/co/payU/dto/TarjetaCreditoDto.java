/**
 * 
 */
package co.payU.dto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 29 de jun. de 2016 16:16:51
 */
public class TarjetaCreditoDto {
	
	private String customerID;
	private String creditCardNumber;
	private String creedirtCardExpirationDate;
	private String PaymentMethod;
	private PersonaDto PayerUser;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreedirtCardExpirationDate() {
		return creedirtCardExpirationDate;
	}

	public void setCreedirtCardExpirationDate(String creedirtCardExpirationDate) {
		this.creedirtCardExpirationDate = creedirtCardExpirationDate;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public PersonaDto getPayerUser() {
		return PayerUser;
	}

	public void setPayerUser(PersonaDto payerUser) {
		PayerUser = payerUser;
	}
}
