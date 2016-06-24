package co.excepciones;

public class ExcepcionesPayU extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensajeTecnico;
	private String mensajeUsuario;
	private Exception origen;
	
	public ExcepcionesPayU() {
	}

	public ExcepcionesPayU(String message) {
		super(message);
	}

	public ExcepcionesPayU(Throwable cause) {
		super(cause);
	}

	public ExcepcionesPayU(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionesPayU(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public String getMensajeTecnico() {
		return mensajeTecnico;
	}

	public void setMensajeTecnico(String mensajeTecnico) {
		this.mensajeTecnico = mensajeTecnico;
	}

	public String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}

	public Exception getOrigen() {
		return origen;
	}

	public void setOrigen(Exception origen) {
		this.origen = origen;
	}

}
