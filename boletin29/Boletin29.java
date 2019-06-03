package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin29 {

    public static void main(String[] args) {
        byte dias=Byte.parseByte(JOptionPane.showInputDialog("introduzca el numero de dias"));
        ArrayList<Barco>listaBarcos=new ArrayList<>();
        Barco yate=new Yate(6,1200,7,dias,"3609uno");
        Velero velero=new Velero(3,10,dias,"7473ded");
        Deportivo deportivo=new Deportivo(1000,70,dias,"3500xxx");
        velero.CalcularPrecio();
        deportivo.CalcularPrecio();
        yate.CalcularPrecio();
        listaBarcos.add(velero);
        listaBarcos.add(deportivo);
        listaBarcos.add(yate);
        for(Barco l:listaBarcos){
            JOptionPane.showMessageDialog(null,l);
        }
        
                
    }
    
}
