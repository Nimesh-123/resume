package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity3 extends AppCompatActivity {

    TextInputEditText companyname, job, descriptpion, year;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        companyname = findViewById(R.id.companyname);
        job = findViewById(R.id.job);
        descriptpion = findViewById(R.id.descriptpion);
        year = findViewById(R.id.year);
        next = findViewById(R.id.next);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");
        String Dob = getIntent().getStringExtra("Dob");
//        String coding = getIntent().getStringExtra("coding");
//        String haking = getIntent().getStringExtra("haking");
        String course = getIntent().getStringExtra("course");
//        String writing = getIntent().getStringExtra("writing");
        String school = getIntent().getStringExtra("school");
//        String gread = getIntent().getStringExtra("grade");
        String year_e = getIntent().getStringExtra("year");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String C = companyname.getText().toString();
                String j = job.getText().toString();
                String d = descriptpion.getText().toString();
                String y = year.getText().toString();


                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("name",name);
                intent.putExtra("name",name);
                intent.putExtra("surname", surname);
                intent.putExtra("email", email);
                intent.putExtra("mobile", mobile);
                intent.putExtra("Dob", Dob);
//                intent.putExtra("coding", coding);
//                intent.putExtra("haking", haking);
//                intent.putExtra("writing", writing);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
//                intent.putExtra("grade", gread);
                intent.putExtra("year", y);
                intent.putExtra("companyname", C);
                intent.putExtra("job", j);
                intent.putExtra("descriptpion", d);
                intent.putExtra("year", y);
                startActivity(intent);
            }
        });
    }
}