package com.example.domenico.Zarathustra.backend.api;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {
    Context c;
    public static void set(String name, String value, Context c) {
        SharedPreferences sharedPref = context.getSharedPreferences(“utente", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("nome", utente.getNome());
        editor.putString("cognome", utente.getCognome());
        editor.putInt("altezza", utente.getAltezza());
        editor.putFloat("peso", utente.getPeso());
        editor.putBoolean("maggiorenne", utente.isMaggiorenne());
        editor.apply();
    }
    public static String get (String name){
        return null;
    }
}
