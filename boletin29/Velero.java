package boletin29;

/**
 *
 * @author jmartinezpineiro
 */
public class Velero extends Barco {
    private int nMastiles;

    public Velero() {
    }

    public Velero(int nMastiles, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.nMastiles = nMastiles;
    }

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    public int getnMastiles() {
        return nMastiles;
    }
    
    @Override
    public void CalcularPrecio() {
        float precio=10*super.getEslora()*super.getDias()+8*nMastiles;
        super.setPrecio(precio);
    }

    @Override
    public String toString() {
        return super.toString()+"NMastiles= " + nMastiles;
    }
    
}
