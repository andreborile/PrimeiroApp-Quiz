package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Timer;

public class QuestionsPage extends AppCompatActivity {

    // acessar classe Questions
    Questions accQuestions = new Questions();
    TextView tvQuestion, tvTxtInf;
    RadioGroup rdGroup;
    RadioButton rdBtn1, rdBtn2, rdBtn3, rdBtn4;
    Button btnResp, btnParar, btnPular;

    Timer timer;

    public static int count = 0;
    public static int score = 0;
    public static int aux = 0;
    public static int escolha = 0;
    public static int jump = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_page);

        // declaracoes ID
        tvQuestion = findViewById(R.id.tvQuestion);
        rdGroup = findViewById(R.id.rdGroup);
        rdBtn1 = findViewById(R.id.rdBtn1);
        rdBtn2 = findViewById(R.id.rdBtn2);
        rdBtn3 = findViewById(R.id.rdBtn3);
        rdBtn4 = findViewById(R.id.rdBtn4);
        tvTxtInf = findViewById(R.id.tvTxtInf);

        Intent tela3 = new Intent(this, ResultsPage.class);

        incrementaComparador();
        loadNewQuestion();
        unCheck();


        // ACAO BOTAO RESPONDER
        btnResp = findViewById(R.id.btnResp);
        btnResp.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               incrementaComparador();
               if (escolha == 0) {
                   tvTxtInf.setText("Por favor, escolha uma alternativa!");
               } else {
                   if (escolha == accQuestions.getAnswers()[count]) {
                       setScore(getScore() + 1);
                   }
                   count++;
                   if (count == accQuestions.getQuestions().length) {
                       finish();
                       startActivity(tela3);
                   } else {
                       loadNewQuestion();
                       unCheck();
                   }
               }
           }
        });


        // ACAO BOTAO PULAR
        btnPular = findViewById(R.id.btnPular);
        btnPular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                incrementaComparador();
                jump++;
                count++;
                if (count == accQuestions.getQuestions().length) {
                    finish();
                    startActivity(tela3);
                } else {
                    loadNewQuestion();
                    unCheck();
                }
            }
        });


        // ACAO BOTAO PARAR
        btnParar = findViewById(R.id.btnParar);
        btnParar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(tela3);
            }
        });

    }

    private void unCheck() {
        RadioGroup rdGroupX = findViewById(R.id.rdGroup);
        rdGroupX.clearCheck();
    }

    private void incrementaComparador() {
        if (rdBtn1.isChecked()) {
            escolha = aux + 1;
        } else if (rdBtn2.isChecked()) {
            escolha = aux + 2;
        } else if (rdBtn3.isChecked()) {
            escolha = aux + 3;
        } else if (rdBtn4.isChecked()){
            escolha = aux + 4;
        } else {
            escolha = 0;
        }
    }

    private void loadNewQuestion() {
        tvQuestion.setText(accQuestions.getQuestions()[count]);
        rdBtn1.setText(accQuestions.getOptions()[count][0]);
        rdBtn2.setText(accQuestions.getOptions()[count][1]);
        rdBtn3.setText(accQuestions.getOptions()[count][2]);
        rdBtn4.setText(accQuestions.getOptions()[count][3]);
    }

    // GETTERS AND SETTERS
    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}