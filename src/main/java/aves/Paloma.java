package aves;

import isla.Isla;

public class Paloma extends Ave {

    private int ira = 200;


    @Override
    public void recibeDisgusto() {
        this.ira += 300;
    }

    @Override
    public int getFuerza() {
        return this.ira * 2;
    }

    @Override
    public boolean estaConforme(Isla isla) {
        return isla.getAvesDebiles().size() > 1;
    }

    @Override
    public void alimentarse(Isla isla) {

    }

    @Override
    public void relajar() {
        this.setIra(this.getIra() - 50);
    }

    public int getIra() {
        return this.ira;
    }

    public void setIra(int ira) {
        this.ira = ira;
    }

    public void equilibrar() {
        if (this.getFuerza() > 700) {
            this.relajar();
        } else {
            this.recibeDisgusto();
        }
    }


}
