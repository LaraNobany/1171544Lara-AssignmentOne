package com.example.cs.a1171544lara_assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText fname;
    private EditText lname;
    private EditText address;
    private EditText BOD;
    private EditText email;
    private EditText mobilenum;
    private EditText desc;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = findViewById(R.id.Fname);
        lname = findViewById(R.id.Lname);
        address = findViewById(R.id.address_txt);
        BOD = findViewById(R.id.dof_txt);
        email = findViewById(R.id.email_txt);
        mobilenum = findViewById(R.id.mobilenum_txt);
        spinner = findViewById(R.id.spngender);
        popspinner();
        desc = findViewById(R.id.description_txt);
    }

    private void popspinner() {
        ArrayList<String> gndr = new ArrayList<>();
        gndr.add("Male");
        gndr.add("Female");
        ArrayAdapter<String> adapter = new ArrayAdapter <>(this, android.R.layout.simple_spinner_item, gndr);
        spinner.setAdapter(adapter);
    }

    public void send_OnClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String firstname = fname.getText().toString();
        String lastname = lname.getText().toString();
        String addr = address.getText().toString();
        String dateofbirth = BOD.getText().toString();
        String mail = email.getText().toString();
        String mobnum = mobilenum.getText().toString();
        String gnder = spinner.getSelectedItem().toString();
        String descr = desc.getText().toString();
        intent.putExtra("DATA", firstname);
        intent.putExtra("DATA2", lastname);
        intent.putExtra("DATA3", addr);
        intent.putExtra("DATA4", dateofbirth);
        intent.putExtra("DATA5", mail);
        intent.putExtra("DATA6", mobnum);
        intent.putExtra("DATA7", gnder);
        intent.putExtra("DATA8", descr);
        startActivity(intent);

        InputMethodManager m = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        m.hideSoftInputFromWindow(view.getWindowToken(),0);
    }
}