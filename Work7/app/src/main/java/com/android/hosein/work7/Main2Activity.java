package com.android.hosein.work7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtname2= (TextView) findViewById(R.id.txtname2);
        TextView txtfamily2= (TextView) findViewById(R.id.txtfamily2);
        TextView tage= (TextView) findViewById(R.id.hosein);
        TextView txtemail2= (TextView) findViewById(R.id.txtemail2);

        Intent intent2=getIntent();
       String sname= intent2.getStringExtra("Name");
        txtname2.setText(sname);
       String sfamily= intent2.getStringExtra("Family");
        txtfamily2.setText(sfamily);
       int  sageint= intent2.getIntExtra("A",0);
     tage.setText(String.valueOf(sageint));
        String semail=intent2.getStringExtra("Email");
        txtemail2.setText(semail);

    }
}
