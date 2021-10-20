package com.sistema.web.exception;

public class NegocioException extends RuntimeException {


	private static final long serialVersionUID = -7579118257861080765L;
	
	public NegocioException(String mensagem) {
		super(mensagem);
	}

	public NegocioException(String message, Throwable cause) {
		super(message, cause);
	}
	
  

}
