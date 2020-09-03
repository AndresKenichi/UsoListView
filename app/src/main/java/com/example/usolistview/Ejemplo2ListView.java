package com.example.usolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Ejemplo2ListView extends AppCompatActivity {

    private ListView lvLista;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo2_list_view);

        btnRegresar=findViewById(R.id.btnRegresar);
        lvLista=findViewById(R.id.lvlVistas);

        final String[] valoresLista=new String[]{"Derecho","Licenciatrua","Ingenieria","Medicina","Comunicacion","Turismo","Docencia"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, valoresLista);
        lvLista.setAdapter(adapter);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Ejemplo2ListView.this, MainActivity.class);
                startActivity(intent);

            }
        });

        //Desplegando el valor seleccionado por el usuario
        lvLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int j, long l) {

                //Toast.makeText(Ejemplo2ListView.this,"Carrera Seleccionada: "+lvLista.get(j),Toast.LENGTH_LONG).show();
            }
        });

    }
}