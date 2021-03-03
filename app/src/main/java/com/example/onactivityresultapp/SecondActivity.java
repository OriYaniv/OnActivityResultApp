package com.example.onactivityresultapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextOne;
    private Button buttonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initUI();
        initListeners();
    }

    private void initUI() {
        editTextOne = findViewById(R.id.editTextOne);
        buttonTwo = findViewById(R.id.buttonTwo);
    }

    private void initListeners() {
        buttonTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonTwo) {
            String number = editTextOne.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("number", number);
            setResult(2, intent);
            finish();
        }
    }

}
