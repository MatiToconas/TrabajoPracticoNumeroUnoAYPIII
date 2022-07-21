package agenda;

import persona.Fecha;
import persona.Persona;

public class Principal 
{

	public static void main(String[] args) 
	{
		Agenda ag= new Agenda(4);
		
		String nombre1 = "NOELIA";
		Fecha f1 = new Fecha (8,11,1995);
		
		String nombre2 = "Matias";
		Fecha f2 = new Fecha (9,12,1995);
		
		String nombre3 = "Elias";
		Fecha f3 = new Fecha (20,10,1980);
		
		String nombre4 = "Fernando";
		Fecha f4 = new Fecha (12,03,1983);
		
		//Persona p;
		//Persona p0;
		
		Persona p1 = new Persona (nombre1,f1);
		
		Persona p2 = new Persona (nombre2,f2);
		
		Persona p3 = new Persona (nombre3,f3);
		
		Persona p4 = new Persona (nombre4,f4);
		
		ag.guardar(p1, "12345");
		ag.guardar(p2, "12345");
		ag.guardar(p3, "12345");
		ag.guardar(p4, "12345");
		ag.imprimir();
		System.out.println();
		ag.eliminar(p1);
		ag.imprimir();
		if(ag.pertenece(p1))
			System.out.println("Pertenece ");
		else
			System.out.println("No pertenece");
	
	}

}
