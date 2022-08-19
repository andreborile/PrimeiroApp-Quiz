package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class InitialPage extends AppCompatActivity {

    Button btnComecar;
    TextView tvInitPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_page);

        tvInitPage = findViewById(R.id.tvInitPage);
        tvInitPage.setText("Olá, seja muito bem vinda Carol!" +
                            "\nVamos agora à questões sobre:" +
                            "\nDireito Penal!");

        btnComecar = findViewById(R.id.btnComecar);
        btnComecar.setText("Clique aqui para começar!");

        btnComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela2 = new Intent(InitialPage.this, QuestionsPage.class);
                startActivity(tela2);
            }
        });

        }
    }
