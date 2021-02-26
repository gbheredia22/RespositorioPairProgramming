package modelo.mundo;
//Grupo 2
public class Figura {

	private String nombre;

	private String color;

	public Figura(String nombre) {

	super();

	this.nombre = nombre;

	}

	public Figura(String nombre, String color) {

	super();

	this.nombre = nombre;

	this.color = color;

	}

	public String getNombre() {

	return nombre;

	}

	public void setNombre(String nombre) {

	this.nombre = nombre;

	}

	public String getColor() {

	return color;

	}

	public void setColor(String color) {

	this.color = color;

	}
}
