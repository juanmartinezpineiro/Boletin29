package boletin29;

/**
 *
 * @author jmartinezpineiro
 */
public class Yate extends Barco {
    private int nCamarotes, cv;

    public Yate() {
    }

    public Yate(int nCamarotes, int cv, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.nCamarotes = nCamarotes;
        this.cv = cv;
    }

    public void setnCamarotes(int nCamarotes) {
        this.nCamarotes = nCamarotes;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getnCamarotes() {
        return nCamarotes;
    }

    public int getCv() {
        return cv;
    }

    
    @Override
    public void CalcularPrecio() {
        float precio=10*super.getEslora()*super.getDias()+2*cv+25*nCamarotes;
        super.setPrecio(precio);
    }

    @Override
    public String toString() {
        return super.toString()+"NCamarotes= " + nCamarotes + "\ncv= " + cv;
    }
    
    
}
