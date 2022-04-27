package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {
    TextInputEditText course, school, grade, year;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        course = findViewById(R.id.course);
        school = findViewById(R.id.school);
//        grade = findViewById(R.id.gread);
        year = findViewById(R.id.year);
        next = findViewById(R.id.next);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");
        String Dob = getIntent().getStringExtra("Dob");
//        String coding = getIntent().getStringExtra("coding");
//        String haking = getIntent().getStringExtra("haking");
//        String writing = getIntent().getStringExtra("writing");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String c = course.getText().toString();
                String s = school.getText().toString();
//                String g = grade.getText().toString();
                String y = year.getText().toString();

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("name",name);
                intent.putExtra("surname", surname);
                intent.putExtra("email", email);
                intent.putExtra("mobile", mobile);
                intent.putExtra("Dob", Dob);
//                intent.putExtra("coding", coding);
//                intent.putExtra("haking", haking);
//                intent.putExtra("writing", writing);
                intent.putExtra("course", c);
                intent.putExtra("school", s);
//                intent.putExtra("grade", g);
                intent.putExtra("year", y);
                startActivity(intent);
            }
        });
    }
}