package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        String userName = getIntent().getStringExtra("USER_NAME");
        String userEmail = getIntent().getStringExtra("USER_EMAIL");
        String userPhone = getIntent().getStringExtra("USER_PHONE");
        String userPassword = getIntent().getStringExtra("USER_PASSWORD");
        TextView textViewName = findViewById(R.id.textViewUserName);
        TextView textViewEmail = findViewById(R.id.textViewUserEmail);
        TextView textViewPhone = findViewById(R.id.textViewUserPhone);
        TextView textViewPassword = findViewById(R.id.textViewUserPassword);
        textViewName.setText(userName);
        textViewEmail.setText(userEmail);
        textViewPhone.setText(userPhone);
        textViewPassword.setText(userPassword);
    }
}
