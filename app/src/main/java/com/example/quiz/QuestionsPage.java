package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public final class QuestionsPage extends AppCompatActivity implements Serializable {

    TextView tvQuestion, tvTxtInf;
    RadioGroup rdGroup;
    RadioButton rdBtn1, rdBtn2, rdBtn3, rdBtn4;
    Button btnResp, btnParar, btnPular;
    DataBase accDB = new DataBase();

    private static int count;
    private static int countOp;
    private static int score;
    private static Character choice;
    private static int jump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_page);

        Intent tela3 = new Intent(QuestionsPage.this, ResultsPage.class);
        tela3.putExtra("intCount", getCount());

        loadNewQuestion();
        incrementaComparador();
        unCheck();

        // ACAO BOTAO RESPONDER
        btnResp = findViewById(R.id.btnResp);
        btnResp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementaComparador();
                if (getChoice() == ' ') {
                    Toast.makeText(QuestionsPage.this, "Por favor, escolha uma alternativa! Score: " +getScore(), Toast.LENGTH_SHORT).show();
                } else {
                    if (getChoice() == accDB.getAnswers(getCount())) {
                        setScore(getScore() + 1);
                    }
                    setCount(getCount()+1);
                    setCountOp(getCountOp()+4);
                    if (getCount() == accDB.getQuestionsSize()) {
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
                setJump(getJump()+1);
                setCount(getCount()+1);
                setCountOp(getCountOp()+4);
                if (getCount() == accDB.getQuestionsSize()) {
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

        // CAMPO TESTE
        tvTxtInf = findViewById(R.id.tvTxtInf);
        //tvTxtInf.setText("teste " + getScore());
    }

    // MÉTODOS PRIVADOS

    private void unCheck() {
        RadioGroup rdGroupX = findViewById(R.id.rdGroup);
        rdGroupX.clearCheck();
    }

    private void incrementaComparador() {
        if (rdBtn1.isChecked()) {
            setChoice('A');
        } else if (rdBtn2.isChecked()) {
            setChoice('B');
        } else if (rdBtn3.isChecked()) {
            setChoice('C');
        } else if (rdBtn4.isChecked()){
            setChoice('D');
        } else {
            setChoice(' ');
        }
    }

    private void loadNewQuestion() {
        tvQuestion = findViewById(R.id.tvQuestion);
        rdGroup = findViewById(R.id.rdGroup);
        rdBtn1 = findViewById(R.id.rdBtn1);
        rdBtn2 = findViewById(R.id.rdBtn2);
        rdBtn3 = findViewById(R.id.rdBtn3);
        rdBtn4 = findViewById(R.id.rdBtn4);

        // set text
        tvQuestion.setText(accDB.getQuestions(count));
        rdBtn1.setText(accDB.getOptions(countOp));
        rdBtn2.setText(accDB.getOptions(countOp + 1));
        rdBtn3.setText(accDB.getOptions(countOp + 2));
        rdBtn4.setText(accDB.getOptions(countOp + 3));
    }

    // GETTERS AND SETTERS
    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getJump() {
        return this.jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public void setChoice(Character choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }

    public int getCountOp() {
        return countOp;
    }

    public void setCountOp(int countOp) {
        this.countOp = countOp;
    }
}