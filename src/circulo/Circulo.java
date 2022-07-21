package circulo;
import punto.Punto;

public class Circulo 
{
	double radio;
	Punto centro;
	
	public Circulo(double centro_x, double centro_y, double radio)
	{
		this.radio = radio;
		centro = new Punto(centro_x,centro_y);
	}
	
	public void imprimir() 
	{
		System.out.println("Valores del circulo");
		System.out.println("Valor del radio: "+this.radio);
		System.out.println("Valor del centro (x): "+centro.getX());
		System.out.println("Valor del centro (y): "+centro.getY());
	}
	
	public double perimetro()
	{
		return Math.PI * 2*(this.radio);
	}
	
	public double superficie()
	{
		return Math.PI * Math.pow(this.radio, 2); 
	}
	
	public void escalar(double factor)
	{
		this.radio = factor;
	}
	
	public void desplazar(double desp_x, double desp_y)
	{
		centro.setX(centro.getX() + desp_x);
		centro.setY(centro.getY() + desp_y);
	}
	
	public static double distancia(Circulo c1, Circulo c2)
	{
		double dist;
		dist = Punto.distancia(c1.centro, c2.centro);
		return dist - (c1.radio + c2.radio);
	}
	
	public static boolean seTocan(Circulo c1, Circulo c2)
	{
		if (distancia(c1 , c2) <= 0)
		{
			return true;
		}
		else 
		{	
			return false;
		}
	}
	
	public boolean laContiene(Circulo Otro)
	{
		if (this.radio >= distancia(this,Otro) + Otro.radio)
		{	
			return true;
		}
		else 
		{
			return false;
		}
	}

	@Override
	public String toString() {
		return " ["+radio+";"+centro+"] ";
	}
	
	
}

