package com.example.domenico.Zarathustra.backend.api;

import android.content.Context;
import com.example.domenico.Zarathustra.backend.server.tables.Post;
import com.example.domenico.Zarathustra.backend.server.tables.PostDB;
import com.example.domenico.Zarathustra.backend.server.tables.User;

public class API {
	private static API instance;
	static Context context;
	//private BackEndMap backEndMap;

	private API() {
	}

	public static API getInstance() {
		if (instance == null) {
			if(context != null) {
				instance = new API();
			}else{
				throw new RuntimeException("The API has not been initialized yet, use init before getting an instance");
			}
		}
		return instance;
	}

	public void init(Context c){
		context=c;
	}

	public boolean loginValidation(String user, String pw) {
		if (user.equals("admin") && pw.equals("admin")) {
			SharedPreferencesManager.set("LoggedIn", "True");
			return true;
		}
		return false;
	}

	public boolean isSessionAlreadyStarted() {
		return "True".equals(SharedPreferencesManager.get("LoggedIn"));
	}

	public void logout() {
		SharedPreferencesManager.set("LoggedIn", "False");
	}

	public User getUser(long id){
		return PostDB.getInstance(context).getUserDAO().getUser(id);
	}

	public Post[] getPosts(){
		//Alert
		Post[] arr = new Post[10];
		return arr;
	}


}