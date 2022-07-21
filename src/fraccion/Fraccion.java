package fraccion;

public class Fraccion {

	int numerador;
	int denominador;

	public Fraccion(int numerador, int denominador)
	{
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	public void imprimir()
	{
		System.out.println("Fraccion:  " +numerador+ "/" +denominador);
	}
	
	public void invertirSigno()
	{
		numerador = numerador * -1;
		denominador = denominador * -1;
		System.out.println("Fraccion Signo Invertido: " +numerador+ "/" +denominador);
	}
	
	public void invertir()
	{
		int temporal;
		temporal=numerador;
		numerador=denominador;
		denominador=temporal;
		System.out.println("Fraccion invertida: " +numerador+ "/" +denominador);
	}
	
	public double aDouble()
	{
		double resultado;
		resultado=(double)numerador/denominador; 
		return resultado; 
	}
	
	public static Fraccion producto(Fraccion q1, Fraccion q2)
	{
		Fraccion fraccion = new Fraccion(q1.numerador * q2.numerador , q1.denominador * q2.denominador);
		return fraccion;
	}
	
	public static Fraccion suma(Fraccion q1, Fraccion q2)
	{
		Fraccion fraccion = new Fraccion(q1.numerador + q2.numerador, q1.denominador + q2.denominador);
		return fraccion;
	}

	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
	
}