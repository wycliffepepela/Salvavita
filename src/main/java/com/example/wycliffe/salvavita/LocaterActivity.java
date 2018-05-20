package com.example.wycliffe.salvavita;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LocaterActivity extends AppCompatActivity {
    Button  mDisplayMyLocation,mDisplayNearEmergence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locater);
        mDisplayMyLocation= findViewById(R.id.btnMyloc);
        mDisplayNearEmergence=findViewById(R.id.btnNearE);

        mDisplayMyLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri address =Uri.parse("geo:0,0?q=");
                Intent displayAddress = new Intent(Intent.ACTION_VIEW,address);
                //Check if there is an activity to handel the impact intent and activity
                if (displayAddress.resolveActivity(getPackageManager()) !=null){
                    startActivity(displayAddress);
                }else{
                    Toast.makeText(LocaterActivity.this,"Am sorry the app installed can not handelby the intent",Toast.LENGTH_SHORT).show();
                }
            }
        });
        mDisplayNearEmergence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri address =Uri.parse("geo:0,0?q="+"Nearby Hospital");
                Intent displayAddress = new Intent(Intent.ACTION_VIEW,address);
                //Check if there is an activity to handel the impact intent and activity
                if (displayAddress.resolveActivity(getPackageManager()) !=null){
                    startActivity(displayAddress);
                }else{
                    Toast.makeText(LocaterActivity.this,"Am sorry the app installed can not handelby the intent",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
