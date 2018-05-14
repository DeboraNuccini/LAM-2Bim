package com.example.alunos.exemplorecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.alunos.exemplorecyclerview.R;

public class LivroViewHolder extends RecyclerView.ViewHolder {
    final TextView titulo;
    final TextView autor;
    final TextView descricao;

    public LivroViewHolder(View itemView){
        super(itemView);
        titulo = itemView.findViewById(R.id.txt_Titulo);
        autor = itemView.findViewById(R.id.txt_Autor);
        descricao = itemView.findViewById(R.id.txt_Descricao);
    }

}
