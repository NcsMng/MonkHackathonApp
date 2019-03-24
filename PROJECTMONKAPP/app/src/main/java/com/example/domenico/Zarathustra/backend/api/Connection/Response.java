package com.example.domenico.Zarathustra.backend.api.Connection;

import java.io.Serializable;

public class Response implements Serializable {
	private static final long serialVersionUID = -626871523998701908L;
	private boolean isError;
	private Serializable[] response;
	
	public Response(boolean isError, Serializable[] response) {
		this.isError = isError;
		this.response = response;
	}
	public boolean isError() {
		return isError;
	}
	public Serializable[] getResponse() {
		return response;
	}
}
