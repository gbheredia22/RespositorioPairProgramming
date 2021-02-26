package modelo.mundo;
//Grupo 2
public class Triangulo  extends Figura implements OperacionesFigura{

	private double base;

	private double altura;

	public Triangulo(String nombre, String color, double base, double altura) {

	super(nombre, color);

	this.base = base;

	this.altura = altura;

	}

	@Override

	public double calcularArea() {

	return (base*altura)/2;

	}

	public double getBase() {

	return base;

	}

	public void setBase(double base) {

	this.base = base;

	}

	public double getAltura() {

	return altura;

	}

	public void setAltura(double altura) {

	this.altura = altura;

	}

	@Override

	public Figura figura() {

	return new Figura(getNombre(), getColor());

	}
}
