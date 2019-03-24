package com.example.domenico.Zarathustra.backend.server;

import com.example.domenico.Zarathustra.backend.server.tables.user.AlertPost;
import com.example.domenico.Zarathustra.backend.server.tables.user.EventPost;
import com.example.domenico.Zarathustra.backend.server.tables.user.Password;
import com.example.domenico.Zarathustra.backend.server.tables.user.SuggestionPost;
import com.example.domenico.Zarathustra.backend.server.tables.user.TextPost;
import com.example.domenico.Zarathustra.backend.server.tables.user.User;
import com.quattrup1.db.tables.AlertPost;
import com.quattrup1.db.tables.EventPost;
import com.quattrup1.db.tables.SuggestionPost;
import com.quattrup1.db.tables.TextPost;
import com.quattrup1.usermanager.Password;

import java.io.Serializable;
import java.util.ArrayList;

public class DB implements Serializable {

	private static final long serialVersionUID = 5185343382628581119L;

	static public ArrayList<AlertPost> tableAlertPost = new ArrayList<>();
	static public ArrayList<TextPost> tableTextPost = new ArrayList<>();
	static public ArrayList<SuggestionPost> tableSuggestionPost = new ArrayList<>();
	static public ArrayList<EventPost> tableEventPost = new ArrayList<>();
	static public ArrayList<User> tableUser = new ArrayList<>();

	public static void add (AlertPost alertPost) {
		tableAlertPost.add(alertPost);
	}
	public static void add (TextPost TextPost) {
		tableTextPost.add(TextPost);
	}

	public static void add (SuggestionPost suggestionPost) {
		tableSuggestionPost.add(suggestionPost);
	}

	public static void add(EventPost eventPost) {
		tableEventPost.add(eventPost);
	}
	public static void add(User user) {
		tableUser.add(user);
	}



	public static final User[] users = {new User(-1 , "admin", new Password("password"), "Ciao Ciao", null, 0)};
	
}
