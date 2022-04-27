package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    TextInputEditText name, surname, email, mobile, Dob;
//    TextView hobby;
//    CheckBox coding, haking, writing;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        email = findViewById(R.id.email);
        mobile = findViewById(R.id.mobile);
        Dob = findViewById(R.id.Dob);
//        hobby = findViewById(R.id.hobby);
//        coding = findViewById(R.id.coding);
//        haking = findViewById(R.id.haking);
//        writing = findViewById(R.id.writing);
        next = findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String n = name.getText().toString();
                String s = surname.getText().toString();
                String e = email.getText().toString();
                String m = mobile.getText().toString();
                String D = Dob.getText().toString();



//                String hobby = "";
//
//                hobby += "";
//
//                if (coding.isChecked()) {
//                    hobby += "coding";
//                }
//                if (haking.isChecked()) {
//                    hobby += "haking";
//                }
//                if (writing.isChecked()) {
//                    hobby += "writing";
//                }


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", n);
                intent.putExtra("surname", s);
                intent.putExtra("email", e);
                intent.putExtra("mobile", m);
                intent.putExtra("Dob", D);
//                intent.putExtra("coding", c);
//                intent.putExtra("haking", h);
//                intent.putExtra("writing", w);
                startActivity(intent);
            }
            });
        }
    }
