package co.excepciones;

import org.apache.log4j.Logger;
/**
 * @author Duvan A. Sanchez
 * @version 1.0.0
 * 27 de jun. de 2016 16:37:00
 */
public class ExcepcionesPayU extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String mensajeTecnico;
	private String mensajeUsuario;
	private Exception origen;
	private Logger log = Logger.getRootLogger();
	
	public ExcepcionesPayU() {
	}

	public ExcepcionesPayU(String message) {
		log.debug(message);
	}

	public ExcepcionesPayU(Throwable cause) {
		log.debug(cause.getLocalizedMessage(), cause);
	}

	public ExcepcionesPayU(String message, Throwable cause) {
		log.debug(message, cause);
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
