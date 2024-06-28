
package co.edu.uniminuto.entitys;

import co.edu.uniminuto.interfaces.FiguraGeometrica;

public abstract class Paralelogramo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Paralelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public String nombre() {
        return "Paralelogramo";
    }
}
