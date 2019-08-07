package com.example.travelmantics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signin_activity extends AppCompatActivity {
private Button emailSigninButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_activity);

        emailSigninButton = (Button) findViewById(R.id.Email_Signin_Button);
        emailSigninButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmailSigninActivity();

            }
        });
    }

    private void openEmailSigninActivity(){
        Intent intent = new Intent(this, EmailSignIn.class);
        startActivity(intent);
    }
}
