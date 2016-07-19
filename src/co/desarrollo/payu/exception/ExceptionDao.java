package co.desarrollo.payu.exception;

import org.apache.log4j.Logger;

public class ExceptionDao extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2983718523241045370L;
	private Logger logPayU = Logger.getLogger("LoggerPayU");

	public ExceptionDao() {
	}

	public ExceptionDao(String arg0) {
		super(arg0);
	}

	public ExceptionDao(Throwable arg0) {
		super(arg0);
	}

	public ExceptionDao(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ExceptionDao(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}
	public void errorPayU(Throwable error){
		error.printStackTrace();
		
		logPayU.info("Error proveniente del modulo PayU, codigo: " + codigoError(error.hashCode()));
	}
	public static Integer codigoError(Integer hashCode){
		System.out.println(hashCode);
		return hashCode;
	}
}
