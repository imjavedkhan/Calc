package com.predator.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add,sub,mul,div;
    Double num1,num2,sum,diff,multi,divi;

    EditText ed1,ed2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        res = (TextView) findViewById(R.id.res);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
              num1 = Double.parseDouble(ed1.getText().toString());
              num2 = Double.parseDouble(ed2.getText().toString());
                sum = num1+num2;
                res.setText(" "+sum);
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Double.parseDouble(ed1.getText().toString());
                num2 = Double.parseDouble(ed2.getText().toString());
                diff = num1-num2;
                res.setText(" "+diff);
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Double.parseDouble(ed1.getText().toString());
                num2 = Double.parseDouble(ed2.getText().toString());
                multi = num1*num2;
                res.setText(" "+multi);
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                num1 = Double.parseDouble(ed1.getText().toString());
                num2 = Double.parseDouble(ed2.getText().toString());
                divi = (num1/num2);
                res.setText(" "+divi);
            }
        });

    }
}
