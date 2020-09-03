package com.example.usolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Ejemplo3ListView extends AppCompatActivity {

    private ListView lvLista;
    private Button btnRegresar;
    private ArrayList<csEstudiante> listapersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo3_list_view);


        btnRegresar=findViewById(R.id.btnRegresar);
        lvLista=findViewById(R.id.lvlVistas);

        valoresLista();

        AdaptadorPersonas adaptador=new AdaptadorPersonas(this);
        ListView lv1=findViewById(R.id.lvlVistas);
        lv1.setAdapter(adaptador);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Ejemplo3ListView.this, MainActivity.class);
                startActivity(intent);

            }
        });

        //Desplegando el valor seleccionado por el usuario
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int j, long l) {

                Toast.makeText(Ejemplo3ListView.this,listapersonas.get(j).getNombre(), Toast.LENGTH_LONG).show();
            //  Toast.makeText(listview3.this,listaPersonas.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });








    }



    private void valoresLista() {

        listapersonas=new ArrayList<csEstudiante>();
        listapersonas.add(new csEstudiante("Juan",'W'));
        listapersonas.add(new csEstudiante("Pedro",'W'));
        listapersonas.add(new csEstudiante("Luis",'E'));
        listapersonas.add(new csEstudiante("Ana",'P'));
        listapersonas.add(new csEstudiante("Carla",'E'));
        listapersonas.add(new csEstudiante("Maria",'P'));
        listapersonas.add(new csEstudiante("Gustavo",'W'));
        listapersonas.add(new csEstudiante("Teresa",'E'));
        listapersonas.add(new csEstudiante("Marta",'W'));
        listapersonas.add(new csEstudiante("Luisa",'P'));
        listapersonas.add(new csEstudiante("Fernanda",'W'));

    }

    class AdaptadorPersonas extends ArrayAdapter<csEstudiante>{
        AppCompatActivity appCompatActivity;

        AdaptadorPersonas(AppCompatActivity context){
            super(context, R.layout.estudiante, listapersonas);
            appCompatActivity=context;
        }

        public View getView(int position, View convertView, ViewGroup parent){

            LayoutInflater inflater=appCompatActivity.getLayoutInflater();
            View item=inflater.inflate(R.layout.estudiante, null);

            TextView textView1=item.findViewById(R.id.txtNombre);
            textView1.setText(listapersonas.get(position).getNombre());

            ImageView imageView1 =item.findViewById(R.id.imgOffice);
            if(listapersonas.get(position).getOffice()=='W'){
                imageView1.setImageResource(R.mipmap.word);
            }
            if(listapersonas.get(position).getOffice()=='E'){
                imageView1.setImageResource(R.mipmap.excel);
            }
            if(listapersonas.get(position).getOffice()=='P'){
                imageView1.setImageResource(R.mipmap.power);
            }

            return (item);
        }



    }















}