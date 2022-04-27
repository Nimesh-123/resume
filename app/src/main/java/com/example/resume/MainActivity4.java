package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity4 extends AppCompatActivity {
    TextInputEditText skill1, skill2, skill3, skill4;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        skill1 = findViewById(R.id.skill1);
        skill2 = findViewById(R.id.skill2);
        skill3 = findViewById(R.id.skill3);
        skill4 = findViewById(R.id.skill4);
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
//        String gread = getIntent().getStringExtra("gread");
        String year_e = getIntent().getStringExtra("year");
        String companyname = getIntent().getStringExtra("companyname");
        String job = getIntent().getStringExtra("job");
        String descriptpion = getIntent().getStringExtra("descriptpion");
        String year = getIntent().getStringExtra("year");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = skill1.getText().toString();
                String s2 = skill2.getText().toString();
                String s3 = skill3.getText().toString();
                String s4 = skill4.getText().toString();

                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                intent.putExtra("name",name);
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
                intent.putExtra("year", year_e);
                intent.putExtra("companyname", companyname);
                intent.putExtra("job", job);
                intent.putExtra("descriptpion", descriptpion);
                intent.putExtra("year", year);
                intent.putExtra("skill1", s1);
                intent.putExtra("skill2", s2);
                intent.putExtra("skill3", s3);
                intent.putExtra("skill4", s4);
                startActivity(intent);

            }
        });

    }
}