package com.example.usolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLisView1,btnLisView2,btnLisView3,btnLisView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnLisView1=findViewById(R.id.btnLisView1);
        btnLisView2=findViewById(R.id.btnLisView2);
        btnLisView3=findViewById(R.id.btnLisView3);
        btnLisView4=findViewById(R.id.btnLisView3);

        btnLisView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Ejemplo1ListView.class);
                startActivity(intent);
            }
        });

        btnLisView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Ejemplo2ListView.class);
                startActivity(intent);
            }
        });

        btnLisView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Ejemplo3ListView.class);
                startActivity(intent);
            }
        });




    }
}