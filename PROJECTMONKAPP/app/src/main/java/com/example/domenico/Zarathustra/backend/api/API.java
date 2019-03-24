package com.example.domenico.Zarathustra.backend.api;

import android.content.Context;

import com.example.domenico.Zarathustra.backend.api.Connection.Request;
import com.example.domenico.Zarathustra.backend.api.Connection.RequestType;
import com.example.domenico.Zarathustra.backend.api.Connection.Response;
import com.example.domenico.Zarathustra.backend.server.tables.AlertPost;
import com.example.domenico.Zarathustra.backend.server.tables.Post;
import com.example.domenico.Zarathustra.backend.server.tables.PostDB;
import com.example.domenico.Zarathustra.backend.server.tables.user.User;
import com.example.domenico.Zarathustra.backend.server.tables.user.Password;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Arrays;

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

	public static void init(Context c){
		context=c;
		SharedPreferencesManager.init(c);
	}

	public boolean loginValidation(String user, String pw) {
		Socket client;
        ObjectOutputStream out;
        ObjectInputStream in;

        try{
            client = new Socket("192.168.3.248",1234);
            in = new ObjectInputStream(client.getInputStream());
            out = new ObjectOutputStream(client.getOutputStream());

            Request request = new Request(-1, RequestType.LOGIN,new Serializable[]{new User(-1,user,new Password(pw),null,null,0)});
            out.writeObject(request);

            Response response = ((Response)in.readObject());
            if(response.isError())return false;
            long sessionId = ((Long)response.getResponse()[0]).longValue();
            SharedPreferencesManager.set("sessionId",""+sessionId);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
	}

	public boolean isSessionAlreadyStarted() {
		return Long.parseLong(SharedPreferencesManager.get("sessionId","-1"))!=-1;
	}

	public void logout() {
		SharedPreferencesManager.set("sessionId", "-1");
	}

	public com.example.domenico.Zarathustra.backend.server.tables.User getUser(long id){
		return PostDB.getInstance(context).getUserDAO().getUser(id);
	}

	public Post[] getAlertAndEventPosts(){
		PostDB db = PostDB.getInstance(context);
        /*AlertPost[] alerts = Arrays.sort(db.getAlertPostDAO().getAlertPosts(), a ->{

        });*/
		Post[] arr = new Post[10];
		return arr;
	}


}