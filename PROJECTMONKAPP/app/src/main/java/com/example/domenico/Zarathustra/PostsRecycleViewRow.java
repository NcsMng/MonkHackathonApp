package com.example.domenico.Zarathustra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class PostsRecycleViewRow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_recycle_view_row);
        TextView txt = findViewById(R.id.descrizione);
        txt.setMovementMethod(new ScrollingMovementMethod());
        TextView titolo = findViewById(R.id.title);
    }
}
