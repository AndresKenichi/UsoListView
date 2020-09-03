package com.example.usolistview;

public class csEstudiante {

    //Declaracion de variables
    private String nombre;
    private char office;

    //Comentario para verlo en Git
    //Otro comentario para ver un pull de los cambios generados por los demas companieros

    //Creamo un constructor para asignarle valores  a las variables
    public csEstudiante(String nombre, char office){
        this.nombre=nombre;
        this.office=office;
    }

    //Metodos de tipo get para retornar el valor ingresado..
    public String getNombre(){
        return nombre;
    }

    //Creamos un metodo get ... Douglas
    public char getOffice(){
        return office;
    }



}
