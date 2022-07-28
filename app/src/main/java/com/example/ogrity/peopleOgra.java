package com.example.ogrity;

import static com.example.ogrity.MainActivity.ogra;
import static com.example.ogrity.MainActivity.peoplenum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class peopleOgra extends AppCompatActivity {
    public static List<EditText> ograArray=new ArrayList<>();
    public static ArrayList<Double>ogras=new ArrayList<>();
    public static ArrayList<Double>change=new ArrayList<>();
    public static double changeNum;
    LinearLayout linearLayout;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_ogra);
        linearLayout=findViewById(R.id.linearLayout);
        for(int i=0;i<peoplenum;i++){
            editText=new EditText(this);
            editText.setHeight(200);
            editText.setInputType(InputType.TYPE_CLASS_NUMBER);
            ograArray.add(editText);
            linearLayout.addView(editText);
        }
    }

    public void getChange(View view){
        for(int i=0;i<ograArray.size();i++){
            if(ograArray.get(i).getText().toString().equals("")) {
                Toast.makeText(this, "you can't leave empty cells", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        change.clear();
        for(int i=0;i<ograArray.size();i++){
                ogras.add(Double.parseDouble(ograArray.get(i).getText().toString()));
                changeNum = ogras.get(i) - ogra;
                change.add(changeNum);
        }
        Intent intent=new Intent(this,change_Activity.class);
        startActivity(intent);
    }
}