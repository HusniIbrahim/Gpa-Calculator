package com.example.katak.gpa_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;

public class SixthActivity extends AppCompatActivity {

    EditText A_solid,A_minus,B_plus,B_solid,B_minus,C_plus,C_solid,C_minus,D_plus,D_solid,D_minus,E_solid;
    Button save;
    final Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

       A_solid=(EditText)findViewById(R.id.A_solid);
    /*    A_minus=(EditText)findViewById(R.id.A_minus);
        B_plus=(EditText)findViewById(R.id.B_plus);
        B_solid=(EditText)findViewById(R.id.B_solid);
        B_minus=(EditText)findViewById(R.id.B_minus);
        C_plus=(EditText)findViewById(R.id.C_plus);
        C_solid=(EditText)findViewById(R.id.C_solid);
        C_minus=(EditText)findViewById(R.id.C_minus);
        D_plus=(EditText)findViewById(R.id.D_plus);
        D_solid=(EditText)findViewById(R.id.D_solid);
        D_minus=(EditText)findViewById(R.id.D_minus);
        E_solid=(EditText)findViewById(R.id.E_solid); */
      //  String a_solid=A_solid.getText().toString();
      //  String a_minus=A_minus.getText().toString();
       //int A_so = Integer.parseInt(A_sid);
     //   int A_minus = Integer.parseInt(a_minus);
        save=(Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

       open();
            }
        });
    }
    public  void open()
    {


   /*     if (A_solid.getText().toString().equals("")&&A_minus.getText().toString().equals("")&&B_plus.getText().toString().equals("")&&
                B_solid.getText().toString().equals("")&&B_minus.getText().toString().equals("")&&C_plus.getText().toString().equals("")&&
                C_solid.getText().toString().equals("")&&C_minus.getText().toString().equals("")&&D_plus.getText().toString().equals("")&&
                D_solid.getText().toString().equals("")&&D_minus.getText().toString().equals("")&&E_solid.getText().toString().equals(""))
        {
            Toast.makeText(getBaseContext(), "Insufficient data",
                    Toast.LENGTH_SHORT).show();
          /*  A_solid.setText("90");
            A_minus.setText("80");
            B_plus.setText("75");
            B_solid.setText("70");
            B_minus.setText("65");
            C_plus.setText("60");
            C_solid.setText("55");
            C_minus.setText("50");
            D_plus.setText("45");
            D_solid.setText("40");
            D_minus.setText("35");
            E_solid.setText("29");
            Intent intent=new Intent(context,SecondActivity.class);
            intent.putExtra("A_solid", A_solid.getText().toString());
            intent.putExtra("A_minus", A_minus.getText().toString());
            intent.putExtra("B_plus", B_plus.getText().toString());
            intent.putExtra("B_solid", B_solid.getText().toString());
            intent.putExtra("B_minus", B_minus.getText().toString());
            intent.putExtra("C_plus", C_plus.getText().toString());
            intent.putExtra("C_solid", C_solid.getText().toString());
            intent.putExtra("C_minus", C_minus.getText().toString());
            intent.putExtra("D_plus", D_plus.getText().toString());
            intent.putExtra("D_solid", D_solid.getText().toString());
            intent.putExtra("D_minus", D_minus.getText().toString());
            intent.putExtra("E_solid", E_solid.getText().toString());
        }
        else { */

            Intent intent=new Intent(this,SecondActivity.class);
            String g1=A_solid.getText().toString();
            intent.putExtra("ans1",g1);
           /* intent.putExtra("A_minus", A_minus.getText().toString());
            intent.putExtra("B_plus", B_plus.getText().toString());
            intent.putExtra("B_solid", B_solid.getText().toString());
            intent.putExtra("B_minus", B_minus.getText().toString());
            intent.putExtra("C_plus", C_plus.getText().toString());
            intent.putExtra("C_solid", C_solid.getText().toString());
            intent.putExtra("C_minus", C_minus.getText().toString());
            intent.putExtra("D_plus", D_plus.getText().toString());
            intent.putExtra("D_solid", D_solid.getText().toString());
            intent.putExtra("D_minus", D_minus.getText().toString());
            intent.putExtra("E_solid", E_solid.getText().toString());
            */
            startActivity(intent);
        }
    }

