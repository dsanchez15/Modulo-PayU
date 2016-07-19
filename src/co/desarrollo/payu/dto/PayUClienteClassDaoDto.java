/**
 * 
 */
package co.desarrollo.payu.dto;

/**
 * @author Duvan A. Sanchez
 * @version 1.0.0 14 de jul. de 2016 11:14:56
 */
public class PayUClienteClassDaoDto {
	private Integer intIdCliente;
	private PayUTipoDocumentoClassDaoDto idTipoDocumento;
	private Integer intDNI;
	private String strNombre;
	private String strApellidos;
	private String strEmail;
	private String strTelefonoContacto;
	private String strDireccion1;
	private String strDireccion2;
	private PayUCiudadesClassDaoDto ciudad;
	private Integer strTelefono;
	private String strCodigoPostal;
	private String strTipoCliente;
	public Integer getIntIdCliente() {
		return intIdCliente;
	}
	public void setIntIdCliente(Integer intIdCliente) {
		this.intIdCliente = intIdCliente;
	}
	public PayUTipoDocumentoClassDaoDto getIdTipoDocumento() {
		return idTipoDocumento;
	}
	public void setIdTipoDocumento(PayUTipoDocumentoClassDaoDto idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	public Integer getIntDNI() {
		return intDNI;
	}
	public void setIntDNI(Integer intDNI) {
		this.intDNI = intDNI;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	public String getStrApellidos() {
		return strApellidos;
	}
	public void setStrApellidos(String strApellidos) {
		this.strApellidos = strApellidos;
	}
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	public String getStrTelefonoContacto() {
		return strTelefonoContacto;
	}
	public void setStrTelefonoContacto(String strTelefonoContacto) {
		this.strTelefonoContacto = strTelefonoContacto;
	}
	public String getStrDireccion1() {
		return strDireccion1;
	}
	public void setStrDireccion1(String strDireccion1) {
		this.strDireccion1 = strDireccion1;
	}
	public String getStrDireccion2() {
		return strDireccion2;
	}
	public void setStrDireccion2(String strDireccion2) {
		this.strDireccion2 = strDireccion2;
	}
	public PayUCiudadesClassDaoDto getCiudad() {
		return ciudad;
	}
	public void setCiudad(PayUCiudadesClassDaoDto ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getStrTelefono() {
		return strTelefono;
	}
	public void setStrTelefono(Integer strTelefono) {
		this.strTelefono = strTelefono;
	}
	public String getStrCodigoPostal() {
		return strCodigoPostal;
	}
	public void setStrCodigoPostal(String strCodigoPostal) {
		this.strCodigoPostal = strCodigoPostal;
	}
	public String getStrTipoCliente() {
		return strTipoCliente;
	}
	public void setStrTipoCliente(String strTipoCliente) {
		this.strTipoCliente = strTipoCliente;
	}
}
