package com.example.arkloreguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    // public void onClick(View view) {
    //startActivity(new Intent(MainActivity.this,MainActivity2.class));
    //toastMsg ("going to page 2");
    //}
    public void onClick(View view) {
        EditText editPassword = findViewById(R.id.editTextPassword);
        TextView textPassword = findViewById(R.id.textView3);
        String content = editPassword.getText().toString();

        if(content.equals("Password")) {
            startActivity(new Intent(MainActivity.this,MainActivity2.class));
        }else{
            toastMsg("Wrong PW burv haha funny moment!");
        }
    }
}