package aves;

public class PalomaMontera extends Paloma {
    private int topeDeFuerza = 200;

    public int getTopeDeFuerza() {
        return topeDeFuerza;
    }

    public void setTopeDeFuerza(int topeDeFuerza) {
        this.topeDeFuerza = topeDeFuerza;
    }

    @Override
    public void setFuerza(int fuerza) throws Exception {
        if (fuerza < this.topeDeFuerza) {
            this.setFuerza(fuerza);
        } else throw new Exception("Supera el tope de fuerza");
    }
}
