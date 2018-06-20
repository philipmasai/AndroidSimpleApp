package com.philip.ph;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView tvresults;
EditText edtAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvresults=findViewById(R.id.results);
        edtAge=findViewById(R.id.age);
    }

    public void show_toast(View view) {
        Toast.makeText(this, "showing some text after clicking a button", Toast.LENGTH_SHORT).show();
    }

    public void click_Me(View view) {
        tvresults.setText("This text was set by me");

    }

    public void show_some(View view) {
        tvresults.setTextColor(Color.GREEN);
        String age=edtAge.getText().toString();
        tvresults.setText(age);
    }
}
