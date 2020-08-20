package aves;

import isla.Isla;

public class Albatros extends Ave {
    private int peso = 4000;

    private int masaMuscular = 600;

    @Override
    public void recibeDisgusto() {
        this.peso += 800;
    }

    @Override
    public int getFuerza() {
        if (this.peso < 6000) {
            return this.masaMuscular;
        } else {
            return this.masaMuscular / 2;
        }
    }

    @Override
    public boolean estaConforme(Isla isla) {
        int avesFuertes = 0;
        for (Ave ave : isla.getAves()) {
            if (!ave.equals(this)) {
                if (ave.getFuerza() > this.getFuerza()) {
                    avesFuertes++;
                }
            }
        }
        return avesFuertes >= 2;
    }

    @Override
    public void alimentarse(Isla isla) {
        isla.setCantidadMaiz(isla.getCantidadMaiz() - 4);
        this.setMasaMuscular(this.getMasaMuscular() + 700);
        this.setPeso(this.getPeso() + 700);
    }

    @Override
    public void relajar() {
        this.setPeso(this.getPeso() - 300);

    }

    public void irAlGym() {
        this.peso += 500;
        this.masaMuscular += 500;
    }


    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    public int getMasaMuscular() {
        return masaMuscular;
    }

    public void setMasaMuscular(int masaMuscular) {
        this.masaMuscular = masaMuscular;
    }
}
