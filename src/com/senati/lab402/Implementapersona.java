package com.senati.lab402;

public class Implementapersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona policia = new Persona();
		policia.id=01;
		policia.nombre="Roberto Carlos";
		policia.apellido="Gonzales";
		policia.sexo=true;
		policia.ecivil= 'S';
		
		Persona usuario = new Persona();
		usuario.id=02;
		usuario.nombre="Diego";
		usuario.apellido="Caro";
		usuario.sexo=false;
		usuario.ecivil= 'C';
		
		Persona alguien = new Persona();
		
		
		System.out.println(policia.toString());
		System.out.println(usuario.toString());
		System.out.println(alguien.toString());

	}

}
