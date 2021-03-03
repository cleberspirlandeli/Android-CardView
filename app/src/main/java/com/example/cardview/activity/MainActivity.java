package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        // Define Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        // LATERAL
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        // MOSTRAR VARIOS NO MESMO ESPAÇO
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerPostagem.setLayoutManager(layoutManager);

        // Define Adapter
        this.PostagemGerador();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void PostagemGerador() {
        Postagem postagem = new Postagem("Cleber Rezende", "Aleluia #viagem #ferias", R.drawable.imagem1);
        postagens.add(postagem);

        postagem = new Postagem("Thamires Ferreira", "Curtir com o mozao #viagem #ferias", R.drawable.imagem4);
        postagens.add(postagem);

        postagem = new Postagem("Joao", "Ih tempo fechou aqui", R.drawable.imagem2);
        postagens.add(postagem);

        postagem = new Postagem("Thamires Ferreira", "Demorou mais chegou #paris #torre", R.drawable.imagem3);
        postagens.add(postagem);
    }
}