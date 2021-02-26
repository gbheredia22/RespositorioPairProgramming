package modelo.mundo;
import java.util.ArrayList;
import java.util.List;
//Grupo 2
public class CalcularOperacionesFigura {

	public static void main(String[] args) {
		OperacionesFigura of = new Triangulo("Triangulo", "Blanco", 11.0, 2.0);
		OperacionesFigura of2 = new Circulo("Circulo", "Amarillo", 9.8);
		List<OperacionesFigura> lista = new ArrayList<OperacionesFigura>();
		lista.add(of);
		lista.add(of2);

		calcularArea(lista);

	}
	
	public static void calcularArea(List<OperacionesFigura> listaOperacionesFiguras) {
		for (OperacionesFigura of : listaOperacionesFiguras) {
	    
	    System.out.println("Nombre: " + of.figura().getNombre());
	    System.out.println("Area :  " + of.calcularArea());
		System.out.println("Color : " + of.figura().getColor());
		}
	}

}
