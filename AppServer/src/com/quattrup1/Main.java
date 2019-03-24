package com.quattrup1;

import com.quattrup1.db.DB;
import com.quattrup1.db.User;
import com.quattrup1.socket.Response;
import com.quattrup1.socket.Server;
import com.quattrup1.socket.request.Request;
import com.quattrup1.usermanager.Sessions;

import java.io.*;

public class Main {
	public static DB runningDB;
	public static void main(String[] args) {
		 runningDB = new DB();
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
			case GET_DB:
				return new Response(false, new Serializable[]{runningDB});
			case UPDATE_DB:
				runningDB = (DB)request.getArg(0);
				return new Response(false, null);
			default:
				return new Response(true, new Serializable[] {"Unsupported method."});
		}
	}
	
}
