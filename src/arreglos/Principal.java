package arreglos;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) 
	{
		int [] arreglo1 = {1,5,7,8,8,3,4};
		int [] arreglo2 = {2,4,7,5,1,6,4};
		int [] arreglo3 = {1,2,3,4,5,6,7};
		
		int [] nuevoArreglo1 = new int [arreglo1.length+arreglo2.length];
		
		int elemento=5;
		int [] nuevoArreglo2 = new int [arreglo1.length+1];
		 
		int [] nuevoArreglo3 = new int [arreglo1.length];

		if(Arreglos.esSinRepetidos(arreglo1) == false)
		{
			System.out.println("EL ARREGLO "+Arrays.toString(arreglo1)+" NO CONTIENE ELEMENTOS REPETIDOS");
		}
		else
		{
			System.out.println("EL ARREGLO "+Arrays.toString(arreglo1)+"CONTIENE ELEMENTOS REPETIDOS ");
		}	
		
		if(Arreglos.esSinRepetidos(arreglo2) == true)
		{
			System.out.println("EL ARREGLO "+Arrays.toString(arreglo2)+"NO CONTIENE ELEMENTOS REPETIDOS");
		}
		else
		{
			System.out.println("EL ARREGLO "+Arrays.toString(arreglo2)+" CONTIENE ELEMENTOS REPETIDOS ");
		}	
		
		nuevoArreglo1=Arreglos.pegar(arreglo1, arreglo2);
		System.out.println("NUEVO ARREGLO COMO RESULTADO DE DOS ARREGLOS CONCATENADOS "+Arrays.toString(nuevoArreglo1));
		
		nuevoArreglo2=Arreglos.agregarAlFinal(arreglo1, elemento);
		System.out.println("ARREGLO CON EL ELEMENTO NUMERO "+elemento+" AGREGADO AL FINAL DEL VECTOR "+Arrays.toString(nuevoArreglo2));

		nuevoArreglo3=Arreglos.sinRepetidos(arreglo1);
		System.out.println("NUEVO ARREGLO SIN REPETICIONES DE ELEMENTOS"+Arrays.toString(nuevoArreglo3));
		
		System.out.print("ARREGLO SIN INVERTIR: ");
		Arreglos.imprimir(arreglo3);
		System.out.println();
		System.out.print("ARREGLO INVERTIDO: ");
		Arreglos.invertir(arreglo3);
	}

}
