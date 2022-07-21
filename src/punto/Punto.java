package punto;

public class Punto 
{
	double x;
	double y;

	public Punto()
	{
		x = 0;
		y = 0;
	}

	public Punto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public void imprimir()
	{
		System.out.println("Valor del punto: ("+this.x+";"+this.y+")");
	}

	public void desplazar(double desp_x, double desp_y)
	{
		this.x = this.x + desp_x;
		this.y = this.y + desp_y;
	}	

	public static double distancia(Punto p1, Punto p2)
	{
		return (Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2)));
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return  x+";"+ y;
	}
	
	
	
}