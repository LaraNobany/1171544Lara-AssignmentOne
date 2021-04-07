package com.example.cs.a1171544lara_assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String firstname = intent.getStringExtra("DATA");
        String lastname = intent.getStringExtra("DATA2");
        String addr = intent.getStringExtra("DATA3");
        String dateofbirth = intent.getStringExtra("DATA4");
        String mail = intent.getStringExtra("DATA5");
        String mobnum = intent.getStringExtra("DATA6");
        String gender = intent.getStringExtra("DATA7");
        String descr = intent.getStringExtra("DATA8");


        TextView txtData = findViewById(R.id.txtDisplayName);
        TextView txtData2 = findViewById(R.id.txtDisplayAddress);
        TextView txtData3 = findViewById(R.id.txtDisplayBOD);
        TextView txtData4 = findViewById(R.id.txtDisplayEmail);
        TextView txtData5 = findViewById(R.id.txtDisplayPhone);
        TextView txtData6 = findViewById(R.id.txtDisplayGender);
        TextView txtData7 = findViewById(R.id.txtDisplayDescription);
        txtData.setText("Hi "+ firstname + " "+ lastname + "Your register information is as following");
        txtData2.setText("Your Address is:"+addr);
        txtData3.setText("And your Date of Birth is:"+dateofbirth);
        txtData4.setText("And your email address is :"+mail);
        txtData5.setText("Your Mobile Number is "+ mobnum);
        txtData6.setText("And you are "+ gender);
        txtData7.setText("And your Description are"+descr);
    }

    public void save_OnClick(View view) {
        Toast.makeText(this, "Your Information was Save", Toast.LENGTH_SHORT).show();
    }
}