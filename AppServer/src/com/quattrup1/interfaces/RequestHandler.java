package com.quattrup1.interfaces;

import com.quattrup1.socket.Response;
import com.quattrup1.socket.request.Request;

@FunctionalInterface
public interface RequestHandler {
	Response compute(Request request);
}
