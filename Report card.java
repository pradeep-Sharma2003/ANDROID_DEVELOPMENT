REPORT CARD

                        JAVA.MAIN FILE

package com.example.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mytextview1,mytextview2,mytextview3,mytextview4,mytextview5,mytextview6,mytextview7,mytextview8,mytextview9,mytextview10;
    EditText myedittext1,myedittext2,myedittext3,myedittext4;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mytextview1 = findViewById(R.id.textView2);
        mytextview2 = findViewById(R.id.textView3);
        mytextview3 = findViewById(R.id.textView4);
        mytextview4 = findViewById(R.id.textView5);
        mytextview5 = findViewById(R.id.textView);
        mytextview6 = findViewById(R.id.textView11);
        mytextview7 = findViewById(R.id.textView6);
        mytextview8 = findViewById(R.id.textView8);
        mytextview9 = findViewById(R.id.textView9);
        mytextview10 = findViewById(R.id.textView10);
        myedittext1 = findViewById(R.id.editTextNumber);
        myedittext2 = findViewById(R.id.editTextNumber2);
        myedittext3 = findViewById(R.id.editTextNumber3);
        myedittext4 = findViewById(R.id.editTextNumber4);
        mybutton = findViewById(R.id.button);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float f = Float.parseFloat(myedittext1.getText().toString());
                if(f>90){
                    mytextview7.setText("A");
                }
                else if(f>80)
                {
                    mytextview7.setText("B");
                }
                else if(f>70)
                {
                    mytextview7.setText("C");
                }
                else if(f>60)
                {
                    mytextview7.setText("D");
                }
                else
                {
                    mytextview7.setText("E");
                }
                float f1 = Float.parseFloat(myedittext2.getText().toString());
                if(f1>90){
                    mytextview8.setText("A");
                }
                else if(f1>80)
                {
                    mytextview8.setText("B");
                }
                else if(f1>70)
                {
                    mytextview8.setText("C");
                }
                else if(f1>60)
                {
                    mytextview8.setText("D");
                }
                else
                {
                    mytextview8.setText("E");
                }
                float f2 = Float.parseFloat(myedittext3.getText().toString());
                if(f2>90){
                    mytextview9.setText("A");
                }
                else if(f2>80)
                {
                    mytextview9.setText("B");
                }
                else if(f2>70)
                {
                    mytextview9.setText("C");
                }
                else if(f2>60)
                {
                    mytextview9.setText("D");
                }
                else
                {
                    mytextview9.setText("E");
                }
                float f3 = Float.parseFloat(myedittext4.getText().toString());
                if(f3>90){
                    mytextview10.setText("A");
                }
                else if(f3>80)
                {
                    mytextview10.setText("B");
                }
                else if(f3>70)
                {
                    mytextview10.setText("C");
                }
                else if(f3>60)
                {
                    mytextview10.setText("D");
                }
                else
                {
                    mytextview10.setText("E");
                }
                float total = f+f1+f2+f3;
                float percent = total/4;
                if( f>35 && f1>35 && f2>35 && f3>35) {
                    int pass;
                    mytextview5.setText("            PASS \n MARKS GOT =" + total +"percent= "+percent);
                }
                else
                {
                    int fail;
                    mytextview5.setText("            FAIL\n MARKS GOT =" + total +"percent= "+percent);

                }
                mytextview6.setText("MARKS GOT = " +total+" OUT OF 400 and percent= "+percent+"%");
            }
        });
    }
}

                            
