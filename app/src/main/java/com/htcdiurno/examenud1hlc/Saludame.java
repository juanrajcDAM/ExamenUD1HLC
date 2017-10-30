package com.htcdiurno.examenud1hlc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by juanrajc on 30/10/2017.
 */

public class Saludame extends AppCompatActivity {

    private static int CODIGO=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludame);

    }

    public void muestraPregunta(View view){

        EditText etNombre = (EditText)findViewById(R.id. editText);
        String nombre = etNombre.getText().toString();

        Intent intent= new Intent (this, Pregunta. class);
        Bundle bundle = new Bundle();
        bundle.putString( "NOMBRE", nombre);
        intent.putExtras(bundle);
        startActivityForResult(intent, CODIGO);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CODIGO && resultCode == RESULT_OK) {

            TextView txtMensaje = (TextView)findViewById(R.id.texto);
            String res = data.getExtras().getString("OPCION");
            txtMensaje.setText(res);

        }

    }

}