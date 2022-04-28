package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.nio.charset.StandardCharsets;

public class MainActivity8 extends AppCompatActivity {

    TextView name_t, surname_t, email_t, mobile_t, dob_t, course_t, school_t, year_t,
            company_t, job_t, descriptpion_t, year_a, skill_t1, skill_t2, skill_t3, skill_t4, github_t,
            linkedin_t, companyname_t, website_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
//
        name_t = findViewById(R.id.name_t);
        surname_t = findViewById(R.id.surname_t);
        email_t = findViewById(R.id.email_t);
        mobile_t = findViewById(R.id.mobile_t);
        dob_t = findViewById(R.id.Dob_t);
        course_t = findViewById(R.id.course_t);
        school_t = findViewById(R.id.school_t);
        year_t = findViewById(R.id.year_t);
        company_t = findViewById(R.id.company_t);
        job_t = findViewById(R.id.job_t);
        descriptpion_t = findViewById(R.id.descriptpion_t);
        year_a = findViewById(R.id.year_a);
        skill_t1 = findViewById(R.id.skill_t1);
        skill_t2 = findViewById(R.id.skill_t2);
        skill_t3 = findViewById(R.id.skill_t3);
        skill_t4 = findViewById(R.id.skill_t4);
        github_t = findViewById(R.id.github_t);
        linkedin_t = findViewById(R.id.linkedin_t);
        companyname_t = findViewById(R.id.companyname_t);
        website_t = findViewById(R.id.website_t);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");
        String Dob = getIntent().getStringExtra("Dob");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String year_t = getIntent().getStringExtra("year");
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
        String company = getIntent().getStringExtra("company");
        String website = getIntent().getStringExtra("website");


        name_t.setText("" + name);
        surname_t.setText("" + surname);
        mobile_t.setText("" + mobile);
        email_t.setText("" + email);
        dob_t.setText("" + Dob);
        course_t.setText("" + course);
        school_t.setText("" + school);
        year_a.setText("" + year);
        company_t.setText("" + company);
        job_t.setText("" + job);
        descriptpion_t.setText("" + descriptpion);
        year_a.setText("" + year);
        skill_t1.setText("" + skill1);
        skill_t2.setText("" + skill2);
        skill_t3.setText("" + skill3);
        skill_t4.setText("" + skill4);
        github_t.setText("" + github);
        linkedin_t.setText("" + link);
        companyname_t.setText("" + companyname);
        website_t.setText("" + website);


    }
}