package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private EditText  editText, editText1, editText2, editText3;
  private TextView textView, textView1;
  private Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        textView1 = findViewById(R.id.textView1);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);




        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(editText.getText().toString());
                int number2 = Integer.parseInt(editText1.getText().toString());
                int number3 = Integer.parseInt(editText2.getText().toString());
                int number4 = Integer.parseInt(editText3.getText().toString());
                //try🦧
                System.out.println("🐹");
                //Calculate btn
                int  calculate = number1 + number2 + number3 + number4;
                textView1.setText(String.valueOf(calculate));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //try🦦
                System.out.println("🐭");
                //Resat btn
                editText.setText(null);
                editText1.setText(null);
                editText2.setText(null);
                editText3.setText(null);
                textView1.setText(null);
            }
        });

    }
}