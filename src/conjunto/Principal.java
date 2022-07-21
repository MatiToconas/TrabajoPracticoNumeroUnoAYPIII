package conjunto;

public class Principal {

	public static void main(String[] args) 
	{
		Conjunto c1 = new Conjunto();
		Conjunto c2 = new Conjunto();
		c1.agregar(2);
		c1.agregar(6);
		c1.agregar(3);
		c2.agregar(4);
		c2.agregar(2);
		c2.agregar(9);
		
		System.out.println("Conjunto 1");
		c1.imprimir();
		System.out.println();
		System.out.println("Conjunto 2");
		c2.imprimir();
		System.out.println();
		
		System.out.println("Union:");
		Conjunto union = Conjunto.union(c1, c2);
		union.imprimir();
		System.out.println();
		System.out.println("Interseccion:");
		Conjunto interseccion = Conjunto.interseccion(c1, c2);
		interseccion.imprimir();
		System.out.println();
		System.out.println("Resta de 2 conjuntos:");
		Conjunto resta = Conjunto.resta(c1, c2);
		resta.imprimir();
		System.out.println();
		System.out.println("Resta:");
		c1.restar(c2);
		c1.imprimir();
	}

}
