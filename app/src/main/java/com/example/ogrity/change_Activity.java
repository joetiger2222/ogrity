package com.example.ogrity;

import static com.example.ogrity.peopleOgra.change;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.ClientInfoStatus;

public class change_Activity extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        linearLayout=findViewById(R.id.changeLinearLayout);
        for(int i=0;i<change.size();i++){
            textView=new TextView(this);
            double num=change.get(i);
            textView.setText(String.valueOf(i+1)+") "+String.valueOf(num));
            textView.setTextColor(Color.BLACK);
            textView.setTextSize(40);
            textView.setHeight(200);
            linearLayout.addView(textView);
        }
    }
}