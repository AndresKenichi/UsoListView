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

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1ListView extends AppCompatActivity {
    private ListView lvlValores;
    private ArrayList<String> ListaCarreras;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo1_list_view);

        lvlValores=findViewById(R.id.lvlValores);
        btnRegresar=findViewById(R.id.btnRegresar);

        //Creando la lista de valores
        ListaCarreras=new ArrayList<>();
        ListaCarreras.add("Derecho");
        ListaCarreras.add("Ingenieria");
        ListaCarreras.add("Licenciatura");
        ListaCarreras.add("Medicina");
        ListaCarreras.add("Psicologia");
        ListaCarreras.add("Comunicaciones");
        ListaCarreras.add("Turismo");
        ListaCarreras.add("Docencia");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ListaCarreras);
        lvlValores.setAdapter(adapter);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Ejemplo1ListView.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Desplegando el valor seleccionado por el usuario
        lvlValores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Ejemplo1ListView.this,"Carrera Seleccionada: "+ListaCarreras.get(i),Toast.LENGTH_LONG).show();
            }
        });



    }
}