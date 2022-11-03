package com.cursoandroid.ph.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewName;
    private TextView textViewAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewName = findViewById(R.id.textView);
        textViewAge = findViewById(R.id.textView2);

        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");
        textViewName.setText(nome);
        textViewAge.setText(String.valueOf(idade));
    }
}