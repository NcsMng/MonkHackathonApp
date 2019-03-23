package com.example.domenico.Zarathustra;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.domenico.Zarathustra.backend.server.Post;

import java.util.List;


public class PostsAdapter extends RecyclerView.Adapter<PostsViewHolder> {
    private List<Post> posts;
    private LayoutInflater inflater;
    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View myView = inflater.inflate(R.layout.PostsRecycleViewRow, viewGroup, false);
        return new PostsViewHolder(myView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder PostsViewHolder, int i) {
        // recupera i dati per quella posizione
        String title = posts.get(i).getTitle();
        String description = posts.get(i).getContent();
        String author = posts.get(i).getAuthor();
        PostsViewHolder.homepage.setText(marca);
        PostsViewHolder.colore.setBackgroundResource(colore);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
