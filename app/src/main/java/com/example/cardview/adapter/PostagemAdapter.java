package com.example.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.text.BreakIterator;
import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemViewHolder> {

    private List<Postagem> posts;

    public PostagemAdapter(List<Postagem> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public PostagemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_postagem,
                        parent,
                        false);

        return new PostagemViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull PostagemViewHolder holder, int position) {
        Postagem post = posts.get(position);

        holder.nome.setText(post.getNome());
        holder.descricao.setText(post.getDescricao());
        holder.imagemPost.setImageResource(post.getImagem());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}


class PostagemViewHolder extends  RecyclerView.ViewHolder {
     TextView nome, descricao;
     ImageView imagemPost;

    public PostagemViewHolder(@NonNull View itemView) {
        super(itemView);

        nome = itemView.findViewById(R.id.txtNome);
        descricao = itemView.findViewById(R.id.txtDescricao);
        imagemPost = itemView.findViewById(R.id.imagemPost);
    }
}
