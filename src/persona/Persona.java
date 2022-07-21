package persona;

public class Persona 
{
	String nombre;
	Fecha fecha_nacimiento;
	
	public Persona(String nombre, Fecha f_nac)
	{
		this.nombre = nombre;
		this.fecha_nacimiento = new Fecha(f_nac.dia, f_nac.mes, f_nac.anio);
	}
	
	public void imprimirPersona()
	{
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Fecha de nacimiento: "+this.fecha_nacimiento);
	}
	
	public boolean masJovenQue(Persona otro)
	{
		if(this.fecha_nacimiento.anio > otro.fecha_nacimiento.anio)
		{
			//LA INSTANCIA ES UNA PERSONA MAS JOVEN QUE OTRO
			return true;
		}
		else
		{
			if(this.fecha_nacimiento.anio == otro.fecha_nacimiento.anio)
			{
				if(this.fecha_nacimiento.mes > otro.fecha_nacimiento.mes)
				{
					//LA INSTANCIA ES UNA PERSONA MAS JOVEN QUE OTRO
					return true;
				}
			}
			else
			{
				if(this.fecha_nacimiento.mes == otro.fecha_nacimiento.mes)
				{
					if(this.fecha_nacimiento.dia > otro.fecha_nacimiento.dia)
					{
					//LA INSTANCIA ES UNA PERSONA MAS JOVEN QUE OTRO
					return true;
					}
					else return false;
				}
			}
		}
		//LA INSTANCIA NO ES UNA PERSONA MAS JOVEN QUE OTRO
		return false;
	}
	
	//INDICA SI LA INSTANCIA Y LA PERSONA PASADA COMO PARAMETRO TIENE EL MISMO NOMBRE
	public boolean tocayo(Persona otro)
	{
		if(this.nombre.equals(otro.nombre))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean mismaPersona(Persona otro)
	{
		if(this.nombre.equals(otro.nombre) && this.fecha_nacimiento.anio == otro.fecha_nacimiento.anio)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Persona masJoven(Persona[] grupo)
	 {
		Persona aux;
		 aux= grupo[0];
	
		  for(int i=1; i<grupo.length; i++)
		   {
			   if(grupo[i].masJovenQue(aux))
				
				    aux= grupo[i];
		    }
	 
		   return aux;
	  }
	
	public static Persona buscar(Persona[] grupo, String nombre)
	  {
		 Persona persona = null;
		 for(int i=0; i<grupo.length;i++)
		  {
			 if(grupo[i].nombre.equalsIgnoreCase(nombre))
			 {
				 return grupo[i];
			  }
		   }
		 return persona;
	   }
	
	public String toString()
	{
		return nombre;
	}
}
