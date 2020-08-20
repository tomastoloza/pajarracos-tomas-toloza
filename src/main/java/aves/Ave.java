package aves;

import isla.Isla;

public abstract class Ave {
    private int fuerza;

    public abstract void recibeDisgusto();

    public abstract int getFuerza();

    public void setFuerza(int fuerza) throws Exception {
        this.fuerza = fuerza;
    }

    public abstract boolean estaConforme(Isla isla);

    public abstract void alimentarse(Isla isla);

    public abstract void relajar();
}
