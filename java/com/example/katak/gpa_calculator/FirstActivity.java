package com.example.katak.gpa_calculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.valueOf;

public class FirstActivity extends AppCompatActivity {


    SharedPreferences sharedpreferences;
    EditText num1, num2, num3, num4, num5, g1, g2, g3, g4, g5, cor1, cor2, cor3, cor4, cor5;
    Button gpa;
    TextView result;
    //Double a1, a2, a3, a4, a5;

    public static final String mypreference = "mypref";
    public static final String message1 = "msg1a";
    public static final String message2 = "msg2a";
    public static final String message3 = "msg3a";
    public static final String message4 = "msg4a";
    public static final String message5 = "msg5a";
    public static final String message6 = "msg6a";
    public static final String message7 = "msg7a";
    public static final String message8 = "msg8a";
    public static final String message9 = "msg9a";
    public static final String message10 = "msg10a";
    public static final String message11 = "msg11a";
    public static final String message12 = "msg12a";
    public static final String message13 = "msg13a";
    public static final String message14 = "msg14a";
    public static final String message15 = "msg15a";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        cor1 = (EditText) findViewById(R.id.editText1);
        cor2 = (EditText) findViewById(R.id.editText2);
        cor3 = (EditText) findViewById(R.id.editText3);
        cor4 = (EditText) findViewById(R.id.editText4);
        cor5 = (EditText) findViewById(R.id.editText5);
        num1 = (EditText) findViewById(R.id.editText6);
        num2 = (EditText) findViewById(R.id.editText7);
        num3 = (EditText) findViewById(R.id.editText8);
        num4 = (EditText) findViewById(R.id.editText9);
        num5 = (EditText) findViewById(R.id.editText10);
        g1 = (EditText) findViewById(R.id.editText11);
        g2 = (EditText) findViewById(R.id.editText12);
        g3 = (EditText) findViewById(R.id.editText13);
        g4 = (EditText) findViewById(R.id.editText14);
        g5 = (EditText) findViewById(R.id.editText15);
        result = (TextView) findViewById(R.id.result);
        gpa = (Button) findViewById(R.id.save);



        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(message1))   //get kan data
        {
            num1.setText(sharedpreferences.getString(message1, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message2))   //get kan data
        {
            num2.setText(sharedpreferences.getString(message2, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message3))   //get kan data
        {
            num3.setText(sharedpreferences.getString(message3, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message4))   //get kan data
        {
            num4.setText(sharedpreferences.getString(message4, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message5))   //get kan data
        {
            num5.setText(sharedpreferences.getString(message5, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message6))   //get kan data
        {
            g1.setText(sharedpreferences.getString(message6, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message7))   //get kan data
        {
            g2.setText(sharedpreferences.getString(message7, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message8))   //get kan data
        {
            g3.setText(sharedpreferences.getString(message8, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message9))   //get kan data
        {
            g4.setText(sharedpreferences.getString(message9, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message10))   //get kan data
        {
            g5.setText(sharedpreferences.getString(message10, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message11))   //get kan data
        {
            cor1.setText(sharedpreferences.getString(message11, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message12))   //get kan data
        {
            cor2.setText(sharedpreferences.getString(message12, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message13))   //get kan data
        {
            cor3.setText(sharedpreferences.getString(message13, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message14))   //get kan data
        {
            cor4.setText(sharedpreferences.getString(message14, "")); //bila kosong,diambil default value
        }
        if (sharedpreferences.contains(message15))   //get kan data
        {
            cor5.setText(sharedpreferences.getString(message15, "")); //bila kosong,diambil default value
        }
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total;
                double gpa;
                total = (check(num1,g1) + check(num2,g2) + check(num3,g3) + check(num4,g4) + check(num5,g5));
                gpa = (grade(g1, num1) + grade(g2, num2) + grade(g3, num3) + grade(g4, num4) + grade(g5, num5)) / total;
                result.setText(Double.toString(gpa));
                if (((num1.getText().toString()).equals("")&& !g1.getText().toString().equals(""))||((g1.getText().toString()).equals("")&& !num1.getText().toString().equals("")))
                {
                    Toast.makeText(getBaseContext(), "Please fill up complete data",
                            Toast.LENGTH_SHORT).show();

                }
                else if (((num2.getText().toString()).equals("")&& !g2.getText().toString().equals(""))||((g2.getText().toString()).equals("")&& !num2.getText().toString().equals("")))
                {
                    Toast.makeText(getBaseContext(), "Please fill up complete data",
                            Toast.LENGTH_SHORT).show();
                }
                else if (((num3.getText().toString()).equals("")&& !g3.getText().toString().equals(""))||((g3.getText().toString()).equals("")&& !num3.getText().toString().equals("")))
                {
                    Toast.makeText(getBaseContext(), "Please fill up complete data",
                            Toast.LENGTH_SHORT).show();
                }
                else if (((num4.getText().toString()).equals("")&& !g4.getText().toString().equals(""))||((g4.getText().toString()).equals("")&& !num4.getText().toString().equals("")))
                {
                    Toast.makeText(getBaseContext(), "Please fill up complete data",
                            Toast.LENGTH_SHORT).show();
                }
                else if (((num5.getText().toString()).equals("")&& !g5.getText().toString().equals(""))||((g5.getText().toString()).equals("")&& !num5.getText().toString().equals("")))
                {
                    Toast.makeText(getBaseContext(), "Please fill up complete data",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

    }




    public double grade(EditText editText, EditText editText2) {
        double grade;
        int row=0;
        if   (editText2.getText().toString().equals(""))
            grade=0;

        else if    ((editText.getText().toString()).equals("A+"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;

            }
            else {
                grade = 4.0 * Double.parseDouble(editText2.getText().toString());
                row++;
            }
        else if ((editText.getText().toString()).equals("A"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 4.0 * Double.parseDouble(editText2.getText().toString());
                row++;
            }

        else if ((editText.getText().toString()).equals("A-"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 3.67 * Double.parseDouble(editText2.getText().toString());
                row++;
            }

        else if ((editText.getText().toString()).equals("B+"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 3.33 * Double.parseDouble(editText2.getText().toString());
                row++;
            }

        else if ((editText.getText().toString()).equals("B"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 3.0 * Double.parseDouble(editText2.getText().toString());
                row++;
            }

        else if ((editText.getText().toString()).equals("B-"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 2.67 * Double.parseDouble(editText2.getText().toString());
                row++;
            }
        else if ((editText.getText().toString()).equals("C+"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 2.33 * Double.parseDouble(editText2.getText().toString());
                row++;
            }
        else if ((editText.getText().toString()).equals("C"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 2.0 * Double.parseDouble(editText2.getText().toString());
                row++;
            }

        else if ((editText.getText().toString()).equals("C-"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 1.67 * Double.parseDouble(editText2.getText().toString());
                row++;
            }

        else if ((editText.getText().toString()).equals("D+"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 1.33 * Double.parseDouble(editText2.getText().toString());
                row++;
            }
        else if ((editText.getText().toString()).equals("D"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 1.0 * Double.parseDouble(editText2.getText().toString());
                row++;
            }
        else if ((editText.getText().toString()).equals("D-"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 0.67 * Double.parseDouble(editText2.getText().toString());
                row++;
            }

        else if ((editText.getText().toString()).equals("E"))
            if ((editText2.getText().toString()).equals(""))
            {
                grade=0;
                row++;
            }
            else {
                grade = 0.33 * Double.parseDouble(editText2.getText().toString());
                row++;
            }

        else
            grade = 0;
        row++;
        return grade;
    }

    public double check(EditText editText, EditText editText2) {
        double gg;

        if  (editText.getText().toString().equals(""))
        {
            gg=0;
            return gg;
        }
        else if

                (editText.getText().toString().equals("1") && (!editText2.getText().toString().equals("")))
        {
            gg=1;
            return gg;
        }
        else if (editText.getText().toString().equals("2")&& (!editText2.getText().toString().equals("")))
        {
            gg = 2;
            return gg;
        }
        else if (editText.getText().toString().equals("3")&& (!editText2.getText().toString().equals("")))
        {
            gg = 3;
            return gg;
        }
        else if (editText.getText().toString().equals("4")&& (!editText2.getText().toString().equals("")))
        {
            gg = 4;
            return gg;
        }
        else if (editText.getText().toString().equals("5")&& (!editText2.getText().toString().equals("")))
        {
            gg = 5;
            return gg;
        }
        else if (editText.getText().toString().equals("6")&& (!editText2.getText().toString().equals("")))
        {
            gg = 6;
            return gg;
        }
        else if (editText.getText().toString().equals("7")&& (!editText2.getText().toString().equals("")))
        {
            gg = 7;
            return gg;
        }
        else if (editText.getText().toString().equals("8")&& (!editText2.getText().toString().equals("")))
        {
            gg = 8;
            return gg;
        } else if (editText.getText().toString().equals("9")&& (!editText2.getText().toString().equals("")))
        {
            gg = 9;
            return gg;
        } else if (editText.getText().toString().equals("10")&& (!editText2.getText().toString().equals("")))
        {
            gg = 10;
            return gg;
        }

        else {
            gg=0;
            //gg = Integer.parseInt(editText.getText().toString());
            return gg;
        }

    }

    public void SAVE_file(View view) {
        String m1 = num1.getText().toString();
        String m2 = num2.getText().toString();
        String m3 = num3.getText().toString();
        String m4 = num4.getText().toString();
        String m5 = num5.getText().toString();
        String m6 = g1.getText().toString();
        String m7 = g2.getText().toString();
        String m8 = g3.getText().toString();
        String m9 = g4.getText().toString();
        String m10 = g5.getText().toString();
        String m11 = cor1.getText().toString();
        String m12 = cor2.getText().toString();
        String m13 = cor3.getText().toString();
        String m14 = cor4.getText().toString();
        String m15 = cor5.getText().toString();
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
        editor.putString(message15, m15);
        editor.commit(); //tak letak commit,dia tak simpan
        //editor.memory(); untuk clearkan memory
        Toast.makeText(getBaseContext(), "File saved successfully!",
                Toast.LENGTH_SHORT).show();
    }


    public void GET_file(View view) {

        cor1 = (EditText) findViewById(R.id.editText1);
        cor2 = (EditText) findViewById(R.id.editText2);
        cor3 = (EditText) findViewById(R.id.editText3);
        cor4 = (EditText) findViewById(R.id.editText4);
        cor5 = (EditText) findViewById(R.id.editText5);
        num1 = (EditText) findViewById(R.id.editText6);
        num2 = (EditText) findViewById(R.id.editText7);
        num3 = (EditText) findViewById(R.id.editText8);
        num4 = (EditText) findViewById(R.id.editText9);
        num5 = (EditText) findViewById(R.id.editText10);
        g1 = (EditText) findViewById(R.id.editText11);
        g2 = (EditText) findViewById(R.id.editText12);
        g3 = (EditText) findViewById(R.id.editText13);
        g4 = (EditText) findViewById(R.id.editText14);
        g5 = (EditText) findViewById(R.id.editText15);


        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(message1)) {
            num1.setText(sharedpreferences.getString(message1, ""));
        }
        if (sharedpreferences.contains(message2)) {
            num2.setText(sharedpreferences.getString(message2, ""));
        }
        if (sharedpreferences.contains(message3)) {
            num3.setText(sharedpreferences.getString(message3, ""));
        }
        if (sharedpreferences.contains(message4)) {
            num4.setText(sharedpreferences.getString(message4, ""));
        }
        if (sharedpreferences.contains(message5)) {
            num5.setText(sharedpreferences.getString(message5, ""));
        }
        if (sharedpreferences.contains(message6)) {
            g1.setText(sharedpreferences.getString(message6, ""));
        }
        if (sharedpreferences.contains(message7)) {
            g2.setText(sharedpreferences.getString(message7, ""));
        }
        if (sharedpreferences.contains(message8)) {
            g3.setText(sharedpreferences.getString(message8, ""));
        }
        if (sharedpreferences.contains(message9)) {
            g4.setText(sharedpreferences.getString(message9, ""));
        }
        if (sharedpreferences.contains(message10)) {
            g5.setText(sharedpreferences.getString(message10, ""));
        }
        if (sharedpreferences.contains(message11)) {
            cor1.setText(sharedpreferences.getString(message11, ""));
        }
        if (sharedpreferences.contains(message12)) {
            cor2.setText(sharedpreferences.getString(message12, ""));
        }
        if (sharedpreferences.contains(message13)) {
            cor3.setText(sharedpreferences.getString(message13, ""));
        }
        if (sharedpreferences.contains(message14)) {
            cor4.setText(sharedpreferences.getString(message14, ""));
        }
        if (sharedpreferences.contains(message15)) {
            cor5.setText(sharedpreferences.getString(message14, ""));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_icon:

                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                return true;


            case R.id.item1:

                cor1.setText("");
                cor2.setText("");
                cor3.setText("");
                cor4.setText("");
                cor5.setText("");
                num1.setText("");
                num2.setText("");
                num3.setText("");
                num4.setText("");
                num5.setText("");
                g1.setText("");
                g2.setText("");
                g3.setText("");
                g4.setText("");
                g5.setText("");
                return true;

            case R.id.item2:

                Intent intent2 = new Intent(this, SixthActivity.class);
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
