package com.example.my_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class searchbook extends AppCompatActivity {
    ImageButton se;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchbook);
        se=(ImageButton)findViewById(R.id.search);
        ed=(EditText)findViewById(R.id.ed1);

        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st=ed.getText().toString();
                if (st.equals("001")){
                    Intent intent4 = new Intent(searchbook.this, availablebook.class);
                    startActivity(intent4);}else {
                    Intent intent5=new Intent(searchbook.this,unavailable.class);
                    startActivity(intent5);
                }
            }
        });

    }
}
