package actividad_3;

public class circulo {
	float x;
	
	public circulo(float x)
	{
		this.x = x;
	}
		
	public double calcularCircunferencia() 
	{
		return 2*(3.1416)*(x);
	}
		
	public double calcularArea() 
	{
		return 3.1416*(x*x);
	}
		
	public void cambiaLongitud(float y) 
	{
		x = y;
	}

}
