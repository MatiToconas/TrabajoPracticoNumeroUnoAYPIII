package circulo;

public class Principal {

	public static void main(String[] args) 
	{
		Circulo c1 = new Circulo(1,5,8);
		Circulo c2 = new Circulo(2,6,4);
		Circulo c3 = new Circulo(3,7,2);
		Circulo c4 = new Circulo(4,9,5);
		
		c1.imprimir();
		
		System.out.println("\nPerimetro del circulo: "+c1.perimetro());
		System.out.println("Superficie del circulo: "+c1.superficie());
		
		System.out.println("\nModificacion del radio");
		c1.escalar(6);
		c1.imprimir();
		
		System.out.println("\nDesplazamiento del circulo");
		c1.desplazar(2, 1);
		c1.imprimir();
		
		System.out.println("\nDistancia entre el circulo 1 y 2: "+Circulo.distancia(c1, c2));
		
		if (Circulo.seTocan(c1, c2)== true)
		{
			System.out.println("\nLos circulos"+c1+"y"+c2+"se tocan");
		}
		else
		{
			System.out.println("Los circulos"+c1+"y"+c2+"no se tocan");
		}
		
		if (c3.laContiene(c4)== true)
		{
			System.out.println("\nLo contiene");
		}
		else
		{
			System.out.println("No lo contiene");
		}	
	}
}
