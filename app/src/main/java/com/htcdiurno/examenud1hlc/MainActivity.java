package com.htcdiurno.examenud1hlc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAct2 = (Button)findViewById(R.id. button2);
        Button btAct3 = (Button)findViewById(R.id. button3);



        btAct2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("geo:36.850544, -2.465207"));
                startActivity (intent);
            }
        });

        btAct3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=i.e.s.+al-%C3%A1ndalus"));
                startActivity (intent);
            }
        });

    }

    public void muestraSaludame(View view){

        Intent intent=new Intent(this, Saludame.class);
        startActivity(intent);

    }
}