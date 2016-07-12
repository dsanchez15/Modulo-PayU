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
	
	
	private String strCustomerID;
	private String strCreditCardNumber;
	private String strCreedirtCardExpirationDate;
	private String strPaymentMethod;
	private PersonaDto PayerUser;

	public String getDsCustomerID() {
		return strCustomerID;
	}

	public void setDsCustomerID(String strCustomerID) {
		this.strCustomerID = strCustomerID;
	}

	public String getDsCreditCardNumber() {
		return strCreditCardNumber;
	}

	public void setDsCreditCardNumber(String strCreditCardNumber) {
		this.strCreditCardNumber = strCreditCardNumber;
	}

	public String getDsCreedirtCardExpirationDate() {
		return strCreedirtCardExpirationDate;
	}

	public void setDsCreedirtCardExpirationDate(String strCreedirtCardExpirationDate) {
		this.strCreedirtCardExpirationDate = strCreedirtCardExpirationDate;
	}

	public String getDSPaymentMethod() {
		return strPaymentMethod;
	}

	public void setDSPaymentMethod(String paymentMethod) {
		strPaymentMethod = paymentMethod;
	}

	public PersonaDto getPayerUser() {
		return PayerUser;
	}

	public void setPayerUser(PersonaDto payerUser) {
		PayerUser = payerUser;
	}
}
