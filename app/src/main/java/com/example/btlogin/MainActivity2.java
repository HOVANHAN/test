package com.example.btlogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvMsg = findViewById(R.id.tvMsg);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("username");
        tvMsg.setText(msg);
//        tvMsg.setText("Hello" +msg);

    }

}