package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity6 extends AppCompatActivity {

    TextInputEditText company, website;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        company = findViewById(R.id.company);
        website = findViewById(R.id.website);
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
        String skill1 = getIntent().getStringExtra("skill1");
        String skill2 = getIntent().getStringExtra("skill2");
        String skill3 = getIntent().getStringExtra("skill3");
        String skill4 = getIntent().getStringExtra("skill4");
        String github = getIntent().getStringExtra("github");
        String link = getIntent().getStringExtra("link");


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String c = company.getText().toString();
                String w = website.getText().toString();


                Intent intent = new Intent(MainActivity6.this, MainActivity7.class);
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
                intent.putExtra("skill1", skill1);
                intent.putExtra("skill2", skill2);
                intent.putExtra("skill3", skill3);
                intent.putExtra("skill4", skill4);
                intent.putExtra("github", github);
                intent.putExtra("link", link);
                intent.putExtra("company", c);
                intent.putExtra("website", w);
                startActivity(intent);
            }
        });
    }
}