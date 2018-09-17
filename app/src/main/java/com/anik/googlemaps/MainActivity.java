package com.anik.googlemaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMap,btnDhaka,btnRajshahi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMap=findViewById(R.id.btn_map);

        btnDhaka=findViewById(R.id.btn_dhaka);
        btnRajshahi=findViewById(R.id.btn_rajshahi);

        btnDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MapsActivity.class);
                intent.putExtra("latitude",23.810332);
                intent.putExtra("longitude",90.412518);
                intent.putExtra("name","Dhaka");
                startActivity(intent);
            }
        });

        btnRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MapsActivity.class);
                intent.putExtra("latitude",24.363589);
                intent.putExtra("longitude",88.624135);
                intent.putExtra("name","Rajshahi");
                startActivity(intent);
            }
        });

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MapsActivity.class);
                intent.putExtra("latitude",22.356851);
                intent.putExtra("longitude",91.783182);
                intent.putExtra("name","Chittagong");
                startActivity(intent);
            }
        });


    }
}
