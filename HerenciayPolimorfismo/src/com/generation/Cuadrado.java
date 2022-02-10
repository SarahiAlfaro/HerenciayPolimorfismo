package com.generation;

public class Cuadrado extends FiguraGeometrica {

	public Cuadrado() {
		super("Cuadrado");  //accedemos al constructor del padre
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return getAlto()*getLargo();
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (getAlto()+getLargo())*2;
	}
}
