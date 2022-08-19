package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class ResultsPage extends AppCompatActivity {

    TextView tvFimScore, tvFimProg;
    Button btnVoltarPagInic;
    final QuestionsPage accQP = new QuestionsPage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_page);

        // declaracoes
        tvFimProg = findViewById(R.id.tvFimProg);
        tvFimScore = findViewById(R.id.tvFimScore);

        // setar textos
        tvFimProg.setText("Parabéns!\nVocê chegou ao fim do quiz!");
        tvFimScore.setText( "Total de questões: " + accQP.getCount() +
                            "\nRespostas certas: " + accQP.getScore() +
                            "\nRespostas Erradas: " + (accQP.getCount() - accQP.getScore() - accQP.getJump()) +
                            "\nPulos: " + accQP.getJump());

        // zerar argumentos
        zeraArgumentos();

        // botao tela inicial
        btnVoltarPagInic = findViewById(R.id.btnVoltarPagInic);
        Intent initPage = new Intent(this, InitialPage.class);
        btnVoltarPagInic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(initPage);
            }
        });

    }

        private void zeraArgumentos() {
        accQP.setScore(0);
        accQP.setCount(0);
        accQP.setJump(0);
        accQP.setChoice(' ');
        accQP.setCountOp(0);
    }

}