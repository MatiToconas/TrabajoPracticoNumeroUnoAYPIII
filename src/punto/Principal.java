package punto;

public class Principal {

	public static void main(String[] args) 
	{
		Punto p1 = new Punto();
		Punto p2 = new Punto(1,2);
		
		System.out.println("Objeto p1");
		p1.imprimir();
		System.out.println("Objeto p1 desplazado");
		p1.desplazar(3, 4);
		p1.imprimir();
		
		System.out.println("\nObjeto p2");
		p2.imprimir();
		System.out.println("Objeto p2 desplazado");
		p2.desplazar(1, 3);
		p2.imprimir();
		
		System.out.println("\nDistancia entre los dos puntos: "+Punto.distancia(p1, p2));
	}

}
