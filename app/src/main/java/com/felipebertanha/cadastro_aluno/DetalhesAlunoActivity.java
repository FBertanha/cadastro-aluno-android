package com.felipebertanha.cadastro_aluno;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class DetalhesAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_aluno);

        TextView nomeTextView = findViewById(R.id.detalhes_aluno_nome);
        TextView cursoTextView = findViewById(R.id.detalhes_aluno_curso);
        TextView mediaTextView = findViewById(R.id.detalhes_aluno_media);

        //Pega o aluno
        Aluno aluno = (Aluno) getIntent().getSerializableExtra("extra_aluno");

        //Seta dados na View
        nomeTextView.setText(aluno.getNome());
        cursoTextView.setText(aluno.getCurso());
        mediaTextView.setText(String.valueOf(aluno.getMedia()));
    }
}
