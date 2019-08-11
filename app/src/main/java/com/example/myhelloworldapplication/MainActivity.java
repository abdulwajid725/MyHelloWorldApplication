package com.example.myhelloworldapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  sendMessage(View view) {
        Log.d("aaa", "aasasa");
        EditText et = (EditText)findViewById(R.id.editText);
        String s = et.getText().toString();
        Intent newIntent = new Intent(this,Main2Activity.class);
        if(s.matches(""))
            s="ItWorks";
        newIntent.putExtra("str",s);
        startActivity(newIntent);
    }
}
