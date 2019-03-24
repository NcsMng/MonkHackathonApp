package com.example.domenico.Zarathustra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.domenico.Zarathustra.backend.api.API;

public class Footer extends AppCompatActivity {
    ImageButton home, mappa, forum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monk_footer);
        home = findViewById(R.id.homeButton);
        mappa= findViewById(R.id.mappaButton);
        forum= findViewById(R.id.forumButton);

    }
}