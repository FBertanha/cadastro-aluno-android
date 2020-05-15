package com.felipebertanha.cadastro_aluno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nomeEditText;
    private EditText cursoEditText;
    private EditText mediaEditText;
    private Button salvarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEditText = findViewById(R.id.main_nome);
        cursoEditText = findViewById(R.id.main_curso);
        mediaEditText = findViewById(R.id.main_media);
        salvarButton = findViewById(R.id.main_salvar);

        salvarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = nomeEditText.getText().toString();
                String curso = cursoEditText.getText().toString();
                double media = Double.parseDouble(mediaEditText.getText().toString());

                //Cria aluno
                Aluno aluno = new Aluno(nome, curso, media);

                //Cria intenção
                Intent intentParaDetalhes = new Intent(MainActivity.this, DetalhesAlunoActivity.class);

                Bundle bundleAluno = new Bundle();

                //Coloca aluno no Bundle
                bundleAluno.putSerializable("extra_aluno", aluno);

                //Passa o bundle para intenção
                intentParaDetalhes.putExtras(bundleAluno);

                //Inicia a DetalhesActitivity
                startActivity(intentParaDetalhes);
            }
        });

    }
}
