package com.example.my_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class  faculty extends AppCompatActivity {
    EditText ename;
    EditText isbn;
    //EditText bookname;
    EditText booknumber;
    DataBaseHelper myDb;
    EditText yearofpublish;
    EditText author;
    Button save;
    String name;
    String number;
    String year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        ename=(EditText)findViewById(R.id.name);
        isbn=(EditText)findViewById(R.id.isbn);
        myDb=new DataBaseHelper(this);
        booknumber=(EditText)findViewById(R.id.booknumber);
        yearofpublish=(EditText)findViewById(R.id.yearofbook);
        author=(EditText)findViewById(R.id.Author);
        isbn=(EditText)findViewById(R.id.isbn);
        save=(Button)findViewById(R.id.fsaven);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=ename.getText().toString();
                number=isbn.getText().toString();
                year=yearofpublish.getText().toString();
                    Boolean result=myDb.insertData(name,number,year);
                if (result==true){
                    Toast.makeText(faculty.this, "Information is saved", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(faculty.this, "saving failed", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
