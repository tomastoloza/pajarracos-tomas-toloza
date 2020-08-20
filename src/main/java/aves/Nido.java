package aves;

public class Nido {
    private int grosor = 5;
    private int resistenciaMaterial = 3;

    public int getResistenciaMaterial() {
        return resistenciaMaterial;
    }

    public void setResistenciaMaterial(int resistenciaMaterial) {
        this.resistenciaMaterial = resistenciaMaterial;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    public int getPotencia() {
        return (this.getGrosor() * this.getResistenciaMaterial()) + 20;
    }
}
