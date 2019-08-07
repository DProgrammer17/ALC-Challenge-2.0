package com.example.travelmantics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PasswordSignin extends AppCompatActivity {
private Button passwordButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_signin);


        passwordButton = (Button) findViewById(R.id.Password_Button);
        passwordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVacationActivity();
            }
        });
    }

    private void openVacationActivity(){
        Intent intent = new Intent(this,VacationList.class);
        startActivity(intent);
    }
}
