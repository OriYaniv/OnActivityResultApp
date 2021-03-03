package com.example.onactivityresultapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewOne;
    private Button buttonOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initListeners();
    }

    private void initUI() {
        textViewOne = findViewById(R.id.textViewOne);
        buttonOne = findViewById(R.id.buttonOne);
    }

    private void initListeners() {
        buttonOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonOne) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivityForResult(intent, 2);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            String message = data.getStringExtra("number");
            textViewOne.setText(message);
        }
    }

}
