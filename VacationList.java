package com.example.travelmantics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VacationList extends AppCompatActivity {
private Button carrebianButton, romeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacation_list);

        carrebianButton = (Button) findViewById(R.id.Carrebian_Proceed_Button);
        carrebianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCarrebianActivity();
            }
        });

        romeButton = (Button) findViewById(R.id.Rome_Proceed_Button);
        romeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRomeActivity();
            }
        });
    }

    private void openCarrebianActivity(){
        Intent intent = new Intent(this,CarrabienCruise.class);
        startActivity(intent);
    }

    private void openRomeActivity(){
        Intent intent = new Intent(this,RomeWeekend.class);
        startActivity(intent);
    }
}
