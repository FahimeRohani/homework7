package com.android.hosein.work7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText txtname,txtfamily,txtage1,txtemail;
    Button btnsubmit;
    int age1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname= (EditText) findViewById(R.id.txtname);
        txtfamily= (EditText) findViewById(R.id.txtfamily);
        txtage1= (EditText) findViewById(R.id.txtage);
        txtemail= (EditText) findViewById(R.id.txtemail);
        btnsubmit= (Button) findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sname= txtname.getText().toString();
                String sfamily=txtfamily.getText().toString();
                String sage=txtage1.getText().toString();
                String semail=txtemail.getText().toString();
                if (!sage.equals(null)){

                     age1 = Integer.parseInt(sage);

                }

                if (!sname.equals(null) && !sfamily.equals(null) && !semail.equals(null)&& age1>5 && age1<=100 ) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("Name", sname);
                    intent.putExtra("Family", sfamily);
                    intent.putExtra("A", sage);
                    intent.putExtra("Email", semail);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"please Enter Your Information",Toast.LENGTH_SHORT ).show();

                }
            }
        });
    }
}
