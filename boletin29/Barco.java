package boletin29;

/**
 *
 * @author jmartinezpineiro
 */
public abstract class Barco{
    private float eslora,precio;
    private int dias;
    private String matricula;
    
    public Barco() {
    }

    public Barco(float eslora,int dias,String matricula){
        this.eslora = eslora;
        this.dias = dias;
        this.matricula = matricula;
    }
    public Barco(float eslora, float precio,int dias) {
        this.eslora = eslora;
        this.precio = precio;
        this.dias = dias;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getEslora() {
        return eslora;
    }

    public float getPrecio() {
        return precio;
    }

    public int getDias() {
        return dias;
    }

    public abstract void CalcularPrecio();

    @Override
    public String toString() {
        return "Eslora= " + eslora + "\nPrecio= " + precio + "\nDias= " + dias + "\nMatricula= "+matricula+"\n";
    }
    
    
    
}
