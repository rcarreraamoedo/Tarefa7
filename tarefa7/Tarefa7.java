
package tarefa7;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Tarefa7 {


    public static void main(String[] args) {
        ArrayList<Barco>listaBarco=new ArrayList<>();
        
        Yate yt= new Yate(21,2000,80,42,"Spagne");
        Deportivas dp = new Deportivas(2000,35,20,"CrowFun");
        Veleros vl = new Veleros(5,45,15,"Tuis tas loca");
        
        yt.calcularPrezo();
        dp.calcularPrezo();
        vl.calcularPrezo();
        
        listaBarco.add(yt);
        listaBarco.add(dp);
        listaBarco.add(vl);
        
        for(Barco l:listaBarco){
            JOptionPane.showMessageDialog(null,l);
        }
    }
}
