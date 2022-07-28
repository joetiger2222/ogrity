package com.example.ogrity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ograId,peopleNumId;
    public static double ogra,peoplenum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ograId=findViewById(R.id.ograId);
        peopleNumId=findViewById(R.id.peopleNumId);
    }
    public void getOgraInput(View view){
        ogra=Double.parseDouble(ograId.getText().toString());
        peoplenum=Integer.parseInt(peopleNumId.getText().toString());
        Intent intent=new Intent(this,peopleOgra.class);
        startActivity(intent);
    }
}