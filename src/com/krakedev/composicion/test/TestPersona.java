package com.krakedev.composicion.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// Instanciamos una personas
		Persona p1 = new Persona();
		p1.setNombre("Romario");
		p1.setApellido("Meneses");
		
		// Creo una direccion
		Direccion dir = new Direccion();
		dir.setCallePrincipal("Avn siempre viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-47");
		p1.setDireccion(dir);
		
		
		// REcuperar los datos
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		
		// Imprimimr
		System.out.println("Nombre: " + nombre);
		// d1 esta null, y trato de invocar a un metodo con esa varibales
		System.out.println(d1.getCallePrincipal());
		
		p1.imprimir();
		
		Persona p2 = new Persona();
		Direccion de = new Direccion("Avn shyris", "Eloy alfaro", "S/N");
		p2.setNombre("Wilson");
		p2.setDireccion(dir);
		p2.imprimir();
		
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("xxx", "Yyy", "S/N"));
		p3.imprimir();
		
		System.out.println("Fin");
		
		

	}

}
