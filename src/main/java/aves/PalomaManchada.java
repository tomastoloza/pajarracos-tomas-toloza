package aves;

import java.util.ArrayList;

public class PalomaManchada extends Paloma {
    private ArrayList<Nido> nidos = new ArrayList<Nido>();

    @Override
    public void recibeDisgusto() {
        super.recibeDisgusto();
        this.agregarNido(new Nido());
    }

    @Override
    public void relajar() {
        if (this.getNidos().size() > 2) {
            for (Nido nido : this.getNidos()) {
                nido.setGrosor(nido.getGrosor() + 1);
            }
        } else {
            super.relajar();
        }
    }

    @Override
    public int getIra() {
        int potenciaNidos = 0;
        for (Nido nido : this.getNidos()) {
            potenciaNidos += nido.getPotencia();
        }
        return super.getIra() + potenciaNidos;
    }

    public ArrayList<Nido> getNidos() {
        return nidos;
    }

    public void agregarNido(Nido nido) {
        this.getNidos().add(nido);
    }


}
