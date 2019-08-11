package com.example.myhelloworldapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
//        Bundle bd = intent.getExtras();
        String data = intent.getStringExtra("str");
//        String data = (String)bd.get("str");
        TextView tv = (TextView)findViewById(R.id.textView2);
        tv.setText(data);
    }

    public void goBack(View view) {
        Intent newIntent = new Intent(this,MainActivity.class);

        startActivity(newIntent);
    }
}
