package com.example.domenico.Zarathustra;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PostsAdapter extends RecyclerView.Adapter<PostsViewHolder> {
    private List<Post> posts;
    private LayoutInflater inflater;
    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View myView = inflater.inflate(R.layout.row, viewGroup, false);
        return new PostsViewHolder(myView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder PostsViewHolder, int i) {
        // recupera i dati per quella posizione
        String marca = posts.get(i).g;
        int colore = posts.get(i).getColore();
        PostsViewHolder.homepage.setText(marca);
        PostsViewHolder.colore.setBackgroundResource(colore);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
