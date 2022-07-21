package persona;

public class Principal {

	public static void main(String[] args)
	{
		String nombre1 = "Matias";
		Fecha f1 = new Fecha(30,7,1996);
		Persona p1 = new Persona(nombre1, f1);
		p1.imprimirPersona();
		
		String nombreotro= "Noelia";
		Fecha fotro = new Fecha(9,12,1995);
		Persona otro = new Persona(nombreotro, fotro);
		otro.imprimirPersona();
		
		String nombre2 = "Juan Carlos";
		Fecha f2 = new Fecha(16,6,1956);
		Persona p2 = new Persona(nombre2, f2);
		p2.imprimirPersona();
		
		String nombre3 = "Francisca";
		Fecha f3 = new Fecha(20,9,1955);
		Persona p3 = new Persona(nombre3, f3);
		p1.imprimirPersona();
		
		String nombre4 = "Agustin";
		Fecha f4 = new Fecha(30,07,2000);
		Persona p4 = new Persona(nombre4, f4);
		p4.imprimirPersona();
		
		if(p1.masJovenQue(otro))
		{
			System.out.println(p1+" ES MAS JOVEN QUE "+otro);
		}
		else
		{
			System.out.println(p1+" NO ES MAS JOVEN QUE "+otro);
		}
		
		if(p1.tocayo(otro))
		{
			System.out.println("TIENEN EL MISMO NOMBRE");
		}
		else
		{
			System.out.println("NO TIENEN EL MISMO NOMBRE");
		}
		
		if(p1.mismaPersona(otro))
		{
			System.out.println("SON LA MISMA PERSONA");
		}
		else
		{
			System.out.println("NO SON LA MISMA PERSONA");
		}
//--------------------------------------------------------------------------
//Ejercicios 6. Punto A Y B.
		
		Persona personas[] = new Persona [] { p1,p2,p3,p4};
		Persona p0;
		
		System.out.println("La persona mas joven es: " +Persona.masJoven(personas));

		p0=Persona.buscar(personas, "Matias");
		if(p0 != null)
			System.out.println("Se encontro la persona " +p0);
		else
			System.out.println("No se encontro la persona");
	
		System.out.println();
	}	
}