package aves;

public class PalomaTorcaza extends Paloma {
    private int cantidadDeHuevos = 3;

    @Override
    public int getFuerza() {
        return super.getFuerza() + (100 * this.cantidadDeHuevos);
    }

    @Override
    public void recibeDisgusto() {
        super.recibeDisgusto();
        this.cantidadDeHuevos += 1;
    }
}
