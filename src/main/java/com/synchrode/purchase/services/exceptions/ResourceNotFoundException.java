package com.synchrode.purchase.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) { // id do objeto a ser encontrado
		super("Resource not found. Id: " + id);
	}
	
}
