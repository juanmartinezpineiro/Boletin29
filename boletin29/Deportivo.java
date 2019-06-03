package boletin29;

/**
 *
 * @author jmartinezpineiro
 */
public class Deportivo extends Barco{
    private int cv;

    public Deportivo() {
    }

    public Deportivo(int cv, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.cv = cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }
    
    public void CalcularPrecio() {
        float precio=10*super.getEslora()*super.getDias()+2*cv;
        super.setPrecio(precio);
    }

    @Override
    public String toString() {
        return super.toString() + "cv= " + cv;
    }
    
}
