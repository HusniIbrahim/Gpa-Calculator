package com.example.katak.gpa_calculator;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;

    EditText msg1, msg2, msg3, msg4, msg5, msg6, msg7, msg8, msg9, msg10, msg11, msg12, msg13, msg14;
    TextView result;
    Button button;
    int G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,G11,G12;
    public static final String mypreference = "mypref";
    public static final String message1 = "msg1";
    public static final String message2 = "msg2";
    public static final String message3 = "msg3";
    public static final String message4 = "msg4";
    public static final String message5 = "msg5";
    public static final String message6 = "msg6";
    public static final String message7 = "msg7";
    public static final String message8 = "msg8";
    public static final String message9 = "msg9";
    public static final String message10 = "msg10";
    public static final String message11 = "msg11";
    public static final String message12 = "msg12";
    public static final String message13 = "msg13";
    public static final String message14 = "msg14";

   /* Intent intent =getIntent();
    final String A_solid= intent.getStringExtra("A_solid");
    final String A_minus= intent.getStringExtra("A_minus");
    final String B_plus= intent.getStringExtra("B_plus");
    final String B_solid= intent.getStringExtra("B_solid");
    final String B_minus= intent.getStringExtra("B_minus");
    final String C_plus= intent.getStringExtra("C_plus");
    final String C_solid= intent.getStringExtra("B_solid");
    final String C_minus= intent.getStringExtra("B_minus");
    final String D_plus= intent.getStringExtra("D_plus");
    final String D_solid= intent.getStringExtra("D_solid");
    final String D_minus= intent.getStringExtra("D_minus");
    final String E_solid= intent.getStringExtra("E_solid");
*/
    double totalMarks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //  G1=Integer.parseInt(g1);
       /* G2=Integer.parseInt(A_minus);
        G3=Integer.parseInt(B_plus);
        G4=Integer.parseInt(B_solid);
        G5=Integer.parseInt(B_minus);
        G6=Integer.parseInt(C_plus);
        G7=Integer.parseInt(C_solid);
        G8=Integer.parseInt(C_minus);
        G9=Integer.parseInt(D_plus);
        G10=Integer.parseInt(D_solid);
        G11=Integer.parseInt(D_minus);
        G12=Integer.parseInt(E_solid);
        */
        msg1 = (EditText) findViewById(R.id.editText1);
        msg2 = (EditText) findViewById(R.id.editText2);
        msg3 = (EditText) findViewById(R.id.editText3);
        msg4 = (EditText) findViewById(R.id.editText4);
        msg5 = (EditText) findViewById(R.id.editText5);
        msg6 = (EditText) findViewById(R.id.editText6);
        msg7 = (EditText) findViewById(R.id.editText7);
        msg8 = (EditText) findViewById(R.id.editText8);
        msg9 = (EditText) findViewById(R.id.editText9);
        msg10 = (EditText) findViewById(R.id.editText10);
        msg11 = (EditText) findViewById(R.id.editText11);
        msg12 = (EditText) findViewById(R.id.editText12);
        msg13 = (EditText) findViewById(R.id.editText13);
        msg14 = (EditText) findViewById(R.id.editText14);
        result = (TextView) findViewById(R.id.result);
        button=(Button)findViewById(R.id.button15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                totalMarks = (Check(msg5)+Check(msg12)+Check(msg8)+Check(msg14)+Check(msg6)+Check(msg7)+Check(msg11));

             /*   if ((totalMarks >= G1+1) && (totalMarks == 100))
                    result.setText("A+");
                else if (totalMarks >= G2+1 && totalMarks < G1)
                    result.setText(getResources().getString(R.string.A_SOLID));
                else if (totalMarks >= G3+1 && totalMarks < G2)
                    result.setText(getResources().getString(R.string.A_MINUS));
                else if (totalMarks >= G4+1 && totalMarks < G3)
                    result.setText(getResources().getString(R.string.B_PLUS));
                else if (totalMarks >= G5+1 && totalMarks < G4)
                    result.setText(getResources().getString(R.string.B_SOLID));
                else if (totalMarks >= G6+1 && totalMarks < G5)
                    result.setText(getResources().getString(R.string.B_MINUS));
                else if (totalMarks >= G7+1 && totalMarks < G6)
                    result.setText(getResources().getString(R.string.C_PLUS));
                else if (totalMarks >= G8+1 && totalMarks < G7)
                    result.setText(getResources().getString(R.string.C_SOLID));
                else if (totalMarks >= G9+1 && totalMarks < G8)
                    result.setText(getResources().getString(R.string.C_MINUS));
                else if (totalMarks >= G10+1 && totalMarks < G9)
                    result.setText(getResources().getString(R.string.D_PLUS));
                else if (totalMarks >= G11+1 && totalMarks < G10)
                    result.setText(getResources().getString(R.string.D_SOLID));
                else if (totalMarks >= G12+1 && totalMarks < G11)
                    result.setText(getResources().getString(R.string.D_MINUS));
                else if (totalMarks >= 0 && totalMarks < G12)
                    result.setText("E");

          */      if ((totalMarks >= 90) && (totalMarks == 100))
                    result.setText("A+");
                else if (totalMarks >= 80 && totalMarks < 90)
                    result.setText(getResources().getString(R.string.A_SOLID));
                else if (totalMarks >= 75 && totalMarks < 80)
                    result.setText(getResources().getString(R.string.A_MINUS));
                else if (totalMarks >= 70 && totalMarks < 75)
                    result.setText(getResources().getString(R.string.B_PLUS));
                else if (totalMarks >= 65 && totalMarks < 70)
                    result.setText(getResources().getString(R.string.B_SOLID));
                else if (totalMarks >= 60 && totalMarks < 65)
                    result.setText(getResources().getString(R.string.B_MINUS));
                else if (totalMarks >= 55 && totalMarks < 60)
                    result.setText(getResources().getString(R.string.C_PLUS));
                else if (totalMarks >= 50 && totalMarks < 55)
                    result.setText(getResources().getString(R.string.C_SOLID));
                else if (totalMarks >= 45 && totalMarks < 50)
                    result.setText(getResources().getString(R.string.C_MINUS));
                else if (totalMarks >= 40 && totalMarks < 45)
                    result.setText(getResources().getString(R.string.D_PLUS));
                else if (totalMarks >= 35 && totalMarks < 40)
                    result.setText(getResources().getString(R.string.D_SOLID));
                else if (totalMarks >= 30 && totalMarks < 34)
                    result.setText(getResources().getString(R.string.D_MINUS));
                else if (totalMarks >= 0 && totalMarks < 29)
                    result.setText("E");

            }
        });


        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(message1))   //get kan data
        {
            msg1.setText(sharedpreferences.getString(message1, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message2))   //get kan data
        {
            msg2.setText(sharedpreferences.getString(message2, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message3))   //get kan data
        {
            msg3.setText(sharedpreferences.getString(message3, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message4))   //get kan data
        {
            msg4.setText(sharedpreferences.getString(message4, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message5))   //get kan data
        {
            msg5.setText(sharedpreferences.getString(message5, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message6))   //get kan data
        {
            msg6.setText(sharedpreferences.getString(message6, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message7))   //get kan data
        {
            msg7.setText(sharedpreferences.getString(message7, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message8))   //get kan data
        {
            msg8.setText(sharedpreferences.getString(message8, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message9))   //get kan data
        {
            msg9.setText(sharedpreferences.getString(message9, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message10))   //get kan data
        {
            msg10.setText(sharedpreferences.getString(message10, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message11))   //get kan data
        {
            msg11.setText(sharedpreferences.getString(message11, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message12))   //get kan data
        {
            msg12.setText(sharedpreferences.getString(message12, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message13))   //get kan data
        {
            msg13.setText(sharedpreferences.getString(message13, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message14))   //get kan data
        {
            msg14.setText(sharedpreferences.getString(message14, "")); //bila kosong,diambil default value
        }

    }

    public void SAVE(View view) {
        String m1 = msg1.getText().toString();
        String m2 = msg2.getText().toString();
        String m3 = msg3.getText().toString();
        String m4 = msg4.getText().toString();
        String m5 = msg5.getText().toString();
        String m6 = msg6.getText().toString();
        String m7 = msg7.getText().toString();
        String m8 = msg8.getText().toString();
        String m9 = msg9.getText().toString();
        String m10 = msg10.getText().toString();
        String m11 = msg11.getText().toString();
        String m12 = msg12.getText().toString();
        String m13 = msg13.getText().toString();
        String m14 = msg14.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit(); //permission to edit data
        editor.putString(message1, m1); //put data to storage
        editor.putString(message2, m2);
        editor.putString(message3, m3);
        editor.putString(message4, m4);
        editor.putString(message5, m5);
        editor.putString(message6, m6);
        editor.putString(message7, m7);
        editor.putString(message8, m8);
        editor.putString(message9, m9);
        editor.putString(message10, m10);
        editor.putString(message11, m11);
        editor.putString(message12, m12);
        editor.putString(message13, m13);
        editor.putString(message14, m14);
        editor.commit(); //tak letak commit,dia tak simpan
        //editor.memory(); untuk clearkan memory
        Toast.makeText(getBaseContext(), "File saved successfully!",
                Toast.LENGTH_SHORT).show();
    }


    public void GET(View view) {

        msg1 = (EditText) findViewById(R.id.editText1);
        msg2 = (EditText) findViewById(R.id.editText2);
        msg3 = (EditText) findViewById(R.id.editText3);
        msg4 = (EditText) findViewById(R.id.editText4);
        msg5 = (EditText) findViewById(R.id.editText5);
        msg6 = (EditText) findViewById(R.id.editText6);
        msg7 = (EditText) findViewById(R.id.editText7);
        msg8 = (EditText) findViewById(R.id.editText8);
        msg9 = (EditText) findViewById(R.id.editText9);
        msg10 = (EditText) findViewById(R.id.editText10);
        msg11 = (EditText) findViewById(R.id.editText11);
        msg12 = (EditText) findViewById(R.id.editText12);
        msg13 = (EditText) findViewById(R.id.editText13);
        msg14 = (EditText) findViewById(R.id.editText14);

        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(message1)) {
            msg1.setText(sharedpreferences.getString(message1, ""));
        }
        if (sharedpreferences.contains(message2)) {
            msg2.setText(sharedpreferences.getString(message2, ""));
        }
        if (sharedpreferences.contains(message3)) {
            msg3.setText(sharedpreferences.getString(message3, ""));
        }
        if (sharedpreferences.contains(message4)) {
            msg4.setText(sharedpreferences.getString(message4, ""));
        }
        if (sharedpreferences.contains(message5)) {
            msg5.setText(sharedpreferences.getString(message5, ""));
        }
        if (sharedpreferences.contains(message6)) {
            msg6.setText(sharedpreferences.getString(message6, ""));
        }
        if (sharedpreferences.contains(message7)) {
            msg7.setText(sharedpreferences.getString(message7, ""));
        }
        if (sharedpreferences.contains(message8)) {
            msg8.setText(sharedpreferences.getString(message8, ""));
        }
        if (sharedpreferences.contains(message9)) {
            msg9.setText(sharedpreferences.getString(message9, ""));
        }
        if (sharedpreferences.contains(message10)) {
            msg10.setText(sharedpreferences.getString(message10, ""));
        }
        if (sharedpreferences.contains(message11)) {
            msg11.setText(sharedpreferences.getString(message11, ""));
        }
        if (sharedpreferences.contains(message12)) {
            msg12.setText(sharedpreferences.getString(message12, ""));
        }
        if (sharedpreferences.contains(message13)) {
            msg13.setText(sharedpreferences.getString(message13, ""));
        }
        if (sharedpreferences.contains(message14)) {
            msg14.setText(sharedpreferences.getString(message14, ""));
        }
    }

    public double Check (EditText editText) {
        double gg;
        if (editText.getText().toString().equals("")) {
            gg = 0;
            return gg;
        } else {
            gg = Integer.parseInt(editText.getText().toString());
            return gg;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.second_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_icon:

                Intent intent = new Intent(this, FirstActivity.class);
                startActivity(intent);
                return true;

            case R.id.item1:

                msg1.setText("");
                msg2.setText("");
                msg3.setText("");
                msg4.setText("");
                msg5.setText("");
                msg6.setText("");
                msg7.setText("");
                msg8.setText("");
                msg9.setText("");
                msg10.setText("");
                msg11.setText("");
                msg12.setText("");
                msg13.setText("");
                msg14.setText("");
                return true;

            case R.id.item2:

                Intent intent2 = new Intent(this, ThirdActivity.class);
                startActivity(intent2);
                return true;

            case R.id.item3:

                Intent intent3 = new Intent(this, ForthActivity.class);
                startActivity(intent3);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}