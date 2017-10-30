package com.htcdiurno.examenud1hlc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by juanrajc on 30/10/2017.
 */

public class Pregunta extends AppCompatActivity {

    private static int CODIGO = 0;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta);

        TextView txtMensaje =(TextView)findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras();
        txtMensaje.setText( "Hola "+ bundle.getString("NOMBRE")+
                ", esto es muy fácil, pero date prisa!!");

        Button btAct4 = (Button)findViewById(R.id. button4);
        btAct4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=true;
                volverMain(flag);
            }
        });

        Button btAct5 = (Button)findViewById(R.id. button5);
        btAct5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=false;
                volverMain(flag);
            }
        });
    }

    public void volverMain(boolean flag){

        Intent intent= new Intent (this, Saludame. class);
        Bundle bundle = new Bundle();


        if (flag)
            bundle.putString("OPCION", "Eres muy amable.");
        else
            bundle.putString("OPCION", "Recuerdame que no vuelva a saludarte.");


        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);
        finish();

    }


}