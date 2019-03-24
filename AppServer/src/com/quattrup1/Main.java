package com.quattrup1;

import com.quattrup1.db.User;
import com.quattrup1.socket.Response;
import com.quattrup1.socket.Server;
import com.quattrup1.socket.request.Request;
import com.quattrup1.usermanager.Sessions;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			new Server(1234).listen(Main::handle);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static Response handle(Request request) {
		switch (request.getType()) {
			case LOGIN:
				return new Response(false, new Serializable[] {Sessions.getInstance().login((User) request.getArg(0))});
			default:
				return new Response(true, new Serializable[] {"Unsupported method."});
		}
	}
	
}
