package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsPage extends AppCompatActivity {

    TextView tvFimScore, tvFimProg;
    Button btnVoltarPagInic;
    Questions accQuestions;
    int respondidas = QuestionsPage.count - QuestionsPage.jump;
    float scoref = QuestionsPage.score;
    int erradasf = respondidas - QuestionsPage.score;
    float countf = QuestionsPage.count;
    float aprov =  (scoref/respondidas)*100;
    String fmtAprov = String.format("%.0f", aprov);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_page);

        // declaracoes
        tvFimProg = findViewById(R.id.tvFimProg);
        tvFimScore = findViewById(R.id.tvFimScore);

        // setar textos
        tvFimProg.setText("Parabéns!\nVocê chegou ao fim do quiz!");
        tvFimScore.setText("Questões respondidas: " + respondidas +
                            "\nCertas: " + QuestionsPage.score +
                            "\nErradas: " + erradasf +
                            "\nNão respondidas: " + QuestionsPage.jump +
                            "\nAproveitamento: " + fmtAprov + "%");

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
        QuestionsPage.score = 0;
        QuestionsPage.count = 0;
        QuestionsPage.jump = 0;
        QuestionsPage.escolha = 0;

    }

}