package modelo.mundo;
import static java.lang.Math.*;
//Grupo 2
public class Circulo  extends Figura implements OperacionesFigura {
	private double radio;

	public Circulo(String nombre, String color, double radio) {

	super(nombre, color);

	this.radio = radio;
	}
	@Override
	public double calcularArea() {

	return PI * pow(radio, 2);
	}
	public double getRadio() {

	return radio;
	}
	public void setRadio(double radio) {
	this.radio = radio;
	}
	@Override
	public Figura figura() {

	return new Figura(getNombre(), getColor());
	}
}
