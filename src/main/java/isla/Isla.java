package isla;

import aves.Ave;

import java.util.ArrayList;

public class Isla {
    private ArrayList<Ave> aves = new ArrayList<>();
    private int cantidadAlpiste = 10;
    private int cantidadMaiz = 10;

    public void agregarAve(Ave ave) {
        this.aves.add(ave);
    }

    public ArrayList<Ave> getAvesDebiles() {
        ArrayList<Ave> avesDebiles = new ArrayList<>();
        for (Ave ave : aves) {
            if (ave.getFuerza() < 1000) {
                avesDebiles.add(ave);
            }
        }
        return avesDebiles;
    }

    public int getFuerzaTotal() {
        int fuerzaTotal = 0;
        for (Ave ave : aves) {
            fuerzaTotal += ave.getFuerza();
        }
        return fuerzaTotal;
    }

    public boolean esRobusta() {
        for (Ave ave : aves) {
            if (ave.getFuerza() < 300) {
                return false;
            }
        }
        return true;
    }

    public void terremoto() {
        for (Ave ave : aves) {
            ave.recibeDisgusto();
        }

    }

    public void tormenta() {
        for (Ave ave : this.getAvesDebiles()) {
            ave.recibeDisgusto();
        }

    }

    public Ave getAveCapitana() {
        int fuerzaMax = 0;
        Ave aveCapitana = null;
        for (Ave ave : this.aves) {
            if (ave.getFuerza() >= 1000 && ave.getFuerza() <= 3000) {
                if (ave.getFuerza() > fuerzaMax) {
                    fuerzaMax = ave.getFuerza();
                    aveCapitana = ave;
                }
            }
        }
        return aveCapitana;
    }

    public void sesionRelax() {
        for (Ave ave : this.aves) {
            ave.relajar();
        }
    }

    public boolean estaEnPaz() {
        for (Ave ave : this.aves) {
            if (!ave.estaConforme(this)) {
                return false;
            }
        }
        return true;
    }


    public void alimentar() {
        for (Ave ave : this.aves) {
            ave.alimentarse(this);
        }
    }

    public ArrayList<Ave> getAves() {
        return this.aves;
    }

    public int getCantidadAlpiste() {
        return this.cantidadAlpiste;
    }

    public int getCantidadMaiz() {
        return this.cantidadMaiz;
    }

    public void setCantidadAlpiste(int cantidadAlpiste) {
        this.cantidadAlpiste = cantidadAlpiste;
    }

    public void setCantidadMaiz(int cantidadMaiz) {
        this.cantidadMaiz = cantidadMaiz;
    }


}
