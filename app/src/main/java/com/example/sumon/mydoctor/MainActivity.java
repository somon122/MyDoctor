package com.example.sumon.mydoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView addDoctor,showDoctor,updateDoctor,addhistory,showHistory;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addDoctor = findViewById(R.id.addDoctorCardViewId);
        updateDoctor = findViewById(R.id.updateCardViewId);
        showDoctor = findViewById(R.id.showDoctorCardViewId);
        addhistory = findViewById(R.id.addHistoryCardViewId);
        showHistory = findViewById(R.id.showDoctorCardViewId);

        addDoctor.setOnClickListener(this);
        updateDoctor.setOnClickListener(this);
        showDoctor.setOnClickListener(this);
        addhistory.setOnClickListener(this);
        showHistory.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){

            case R.id.addDoctorCardViewId:{
                intent = new Intent(this,AddDoctorActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.showDoctorCardViewId:{
                intent = new Intent(this,ShowAllDoctorActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.updateCardViewId:{
                intent = new Intent(this,UpadateActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.addHistoryCardViewId:{
                intent = new Intent(this,AddMedicalHistoryActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.showMedicalCardViewId:{
                intent = new Intent(this,ShowMedicalHistoryActivity.class);
                startActivity(intent);
                break;
            }
        }

    }


}
