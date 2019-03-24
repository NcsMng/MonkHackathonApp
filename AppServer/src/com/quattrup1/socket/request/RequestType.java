package com.quattrup1.socket.request;

import java.io.Serializable;

public enum RequestType implements Serializable {
	LOGIN,
	GET_DB,
	UPDATE_DB;
	private static final long serialVersionUID = -7759509376536906193L;
}
