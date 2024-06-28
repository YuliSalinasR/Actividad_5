
package co.edu.uniminuto.entitys;

import co.edu.uniminuto.interfaces.FiguraGeometrica;

public abstract class Trapecio extends FiguraGeometrica {
    private double baseMenor;
    private double baseMayor;
    private double altura;

    public Trapecio(double baseMenor, double baseMayor, double altura) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
    }

    public double calcularArea() {
        return ((baseMenor + baseMayor) * altura) / 2;
    }

    public String nombre() {
        return "Trapecio";
    }
}