package com.example.usolistview;

public class csEstudiante {

    //Declaracion de variables
    private String nombre;
    private char office;

    //Comentario para verlo en Git

    //Creamo un constructor para asignarle valores  a las variables
    public csEstudiante(String nombre, char office){
        this.nombre=nombre;
        this.office=office;
    }

    //Metodos de tipo get para retornar el valor ingresado..
    public String getNombre(){
        return nombre;
    }

    public char getOffice(){
        return office;
    }



}
