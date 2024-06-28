
package co.edu.uniminuto.entitys;

import co.edu.uniminuto.interfaces.FiguraGeometrica;
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base menor del trapecio: ");
                    double baseMenor = scanner.nextDouble();
                    System.out.print("Ingrese la base mayor del trapecio: ");
                    double baseMayor = scanner.nextDouble();
                    System.out.print("Ingrese la altura del trapecio: ");
                    double alturaTrapecio = scanner.nextDouble();
                    FiguraGeometrica trapecio = new Trapecio(baseMenor, baseMayor, alturaTrapecio) {};
                    System.out.println("Figura: " + trapecio.nombre() + ", Area: " + trapecio.calcularArea());
                    break;
                case 2:
                    System.out.print("Ingrese la diagonal mayor del rombo: ");
                    double diagonalMayor = scanner.nextDouble();
                    System.out.print("Ingrese la diagonal menor del rombo: ");
                    double diagonalMenor = scanner.nextDouble();
                    FiguraGeometrica rombo = new Rombo(diagonalMayor, diagonalMenor) {};
                    System.out.println("Figura: " + rombo.nombre() + ", Area: " + rombo.calcularArea());
                    break;
                case 3:
                    System.out.print("Ingrese la base del paralelogramo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del paralelogramo: ");
                    double alturaParalelogramo = scanner.nextDouble();
                    FiguraGeometrica paralelogramo = new Paralelogramo(base, alturaParalelogramo) {};
                    System.out.println("Figura: " + paralelogramo.nombre() + ", Area: " + paralelogramo.calcularArea());
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no válida, por favor intente nuevamente.");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("Seleccione la figura geometrica para calcular su area:");
        System.out.println("1. Trapecio");
        System.out.println("2. Rombo");
        System.out.println("3. Paralelogramo");
        System.out.println("4. Salir");
    }
}


