package com.example.simone.provadbroom;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int i = 1;
    User u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(v->{
            u = new User(1,0,"Simone.logging", "pw","simone", "basile");
            PostDB.getInstance(this).getUserDAO().insert(u);
            try {
                PostDB.getInstance(this).getTextPostDAO().insert(new TextPost("Titolo" + i, u.getId(), "provaMiao", Calendar.getInstance().getTime().getTime()));
                PostDB.getInstance(this).getAlertPostDAO().insert(new AlertPost("TitoloAlert" + i, u.getId(), "ContentAlert", Calendar.getInstance().getTime().getTime()));
                PostDB.getInstance(this).getEventPostDao().insert(new EventPost("TitoloEvent" + i, u.getId(), "ContentEvent", Calendar.getInstance().getTime().getTime(), Calendar.getInstance().getTime().getTime()));
                PostDB.getInstance(this).getSuggestionPostDAO().insert(new SuggestionPost("TitoloSuggestion" + i++, u.getId(), "ContentSuggestion", Calendar.getInstance().getTime().getTime()));
            }catch(Exception e){
                Log.e("Erroreppi",e.toString());
            }
        });

        ((Button)findViewById(R.id.bottone)).setOnClickListener(v->{
            try{
            Post[] sugg= PostDB.getInstance(this).getSuggestionPostDAO().getSuggestionPosts();
            Post[] text= PostDB.getInstance(this).getTextPostDAO().getTextPosts();
            Post[] alert= PostDB.getInstance(this).getAlertPostDAO().getAlertPosts();
            Post[] event= PostDB.getInstance(this).getEventPostDao().getEventPosts();
            Log.i("Avanzamento", "Superato recuper da db");
                int i = sugg.length+text.length+alert.length+event.length;
                Post[] posts = new Post[i];
                int j = 0;
                for(Post c:sugg){
                    posts[j++]=c;
                }
                for(Post c:text){
                    posts[j++]=c;
                }
                for(Post c:alert){
                    posts[j++]=c;
                }
                for(Post c:event){
                    posts[j++]=c;
                }
                for(Post p:posts){
                    Log.i("POST:",p.getTitle()+"/"+p.getContent()+"/"+PostDB.getInstance(this).getUserDAO().getUser(p.getAuthorId()).getFullName());
                }
            }catch(Exception e){
                Log.e("Erroreppi","Pulsante centrale: "+e.toString());
            }
        });




    }

}
