package com.example.travelmantics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmailSignIn extends AppCompatActivity {
private Button emailButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_sign_in);

        emailButton = (Button) findViewById(R.id.Email_Button);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPasswordActivity();
            }
        });
    }

    private void openPasswordActivity(){
        Intent intent = new Intent(this,PasswordSignin.class);
        startActivity(intent);
    }
}
