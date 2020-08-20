package aves;

import isla.Isla;

public class Aguilucho extends Ave {

    private int velocidad = 20;

    @Override
    public void recibeDisgusto() {
        this.velocidad = this.velocidad * 2;
    }

    @Override
    public int getFuerza() {
        if (this.getVelocidad() <= 60) {
            return 180;
        } else {
            return this.velocidad * 3;
        }
    }

    @Override
    public boolean estaConforme(Isla isla) {
        return isla.getCantidadAlpiste() >= 8;
    }

    @Override
    public void alimentarse(Isla isla) {
        isla.setCantidadAlpiste(isla.getCantidadAlpiste() - 3);
        this.setVelocidad(this.getVelocidad() + 15);
    }

    @Override
    public void relajar() {
        this.setVelocidad(this.getVelocidad() - 10);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


}
