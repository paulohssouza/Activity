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
        User user = (User) dados.getSerializable("object");
        int idade = dados.getInt("idade");
        textViewName.setText(user.getName());
        textViewAge.setText(String.valueOf(user.getEmail()));
    }
}