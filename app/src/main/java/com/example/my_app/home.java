package com.example.my_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
        Button s,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        s=(Button)findViewById(R.id.student);
        f=(Button)findViewById(R.id.faculty);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home.this,smartlibrary.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents=new Intent(home.this,faculty.class);
                startActivity(intents);
            }
        });
        Button gh=findViewById(R.id.gh);
        gh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this,faculty.class));
            }
        });
    }
}
