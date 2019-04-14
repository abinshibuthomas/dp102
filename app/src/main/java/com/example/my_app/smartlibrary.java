package com.example.my_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class smartlibrary extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartlibrary);
        b1=(Button)findViewById(R.id.search_book);
        b2=(Button)findViewById(R.id.explore);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2p=new Intent(smartlibrary.this,searchbook.class);
                startActivity(intent2p);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(smartlibrary.this,expoAbin.class);
                startActivity(intent3);
            }
        });
    }
}
