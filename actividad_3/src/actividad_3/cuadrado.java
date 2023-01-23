package actividad_3;

public class cuadrado {
	
	public float x;
	
	public cuadrado() {
		this (171822);
	}
	
	public cuadrado (float y) {
		x = y;
	}
	
	public float calculaPerimetro() {
		return x*4;
	}
	
	public float calcularArea() {
		return x*x;
	}
	
	public double calcularDiagonal() {
		return Math.sqrt((x*x)+(x*x));
	}
	
	public void cambiaLongitud(float y) {
		x = y;
	}
	
}
