package br.com.ifsp.cafeteria.infra;


public class CafeNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CafeNotFoundException(String message) {
        super(message);
    }
	
}
