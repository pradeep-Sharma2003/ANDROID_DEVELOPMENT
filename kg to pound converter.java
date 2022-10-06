KG TO POUND CONVERTOR

                              JAVA.MAIN FILE

package com.example.pradeepkgtopoundconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private EditText myEdiText;
  private TextView myTextView;
  private Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEdiText = findViewById(R.id.editTextNumber);
        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = myEdiText.getText().toString();
                double d = Double.parseDouble(s);
                double pound = d * 2.205;
                myTextView.setText("pound = "+pound);
            }
        });
    }
}
