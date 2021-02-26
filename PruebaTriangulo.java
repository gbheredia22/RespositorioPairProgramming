package Abstraccion;

import java.util.Scanner;

public class PruebaTriangulo
{
    public static void main(String[] args)
    {
        String colorDelTriangulo;
        double baseDelTriangulo;
        double alturaDelTriangulo;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el color del triángulo: ");
        colorDelTriangulo = teclado.nextLine();

        System.out.print("Introduzca la base del triángulo: ");
        baseDelTriangulo = teclado.nextDouble();

        System.out.print("Introduzca la altura del triángulo: ");
        alturaDelTriangulo = teclado.nextDouble();

        Triangulo triangulo1 = new Triangulo(colorDelTriangulo, baseDelTriangulo, alturaDelTriangulo);

        System.out.printf("El área del triángulo %s es: %f", triangulo1.getColor(), triangulo1.calcularArea());
    }
}