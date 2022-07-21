package fraccion;

public class Principal {

	public static void main(String[] args) 
	{
		Fraccion f1 = new Fraccion(2,3);
		Fraccion f2 = new Fraccion(-1,5);
		Fraccion f3 = new Fraccion(1,4);
		Fraccion f4 = new Fraccion(7,4);
		Fraccion f5 = new Fraccion(6,4);
		Fraccion f6 = new Fraccion(3,5);
		Fraccion f7 = new Fraccion(2,4);
		Fraccion f8 = new Fraccion(5,1);
		
		f1.imprimir();
		f2.invertirSigno();
		f3.invertir();
 
		System.out.println("Conversion de numero racional a decimal: "+f4.aDouble());
		System.out.println("El producto de fracciones es: "+Fraccion.producto(f5, f6));
		System.out.println("La suma de fracciones es: "+Fraccion.suma(f7, f8));
	}
}
