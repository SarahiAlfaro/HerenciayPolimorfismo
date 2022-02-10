package com.generation;

public abstract class FiguraGeometrica {
	
	//Clases abstractas.
	//no pueden crear objetos
	//Clases que pueden o no contener métodos abstractos
	//Método abstracto e sun método que te dice que hacer
	//pero no te dice como hacerlo
	

	private String nombre;
	private float alto;
	private float largo;
	
	//public FiguraGeometrica() {
		
	//}
	
	public FiguraGeometrica (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public float getAlto() {
		return alto;
	}



	public void setAlto(float alto) {
		this.alto = alto;
	}



	public float getLargo() {
		return largo;
	}



	public void setLargo(float largo) {
		this.largo = largo;
	}



	public abstract float calcularArea();
	public abstract float calcularPerimetro();
}
