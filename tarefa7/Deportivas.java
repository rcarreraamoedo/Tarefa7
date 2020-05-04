
package tarefa7;


public class Deportivas extends Barco{
    
    private int cv;
    private float precio;
    public Deportivas() {
    }

    
    public Deportivas(int cv, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public void calcularPrezo() {
     precio=10*super.getEslora()*super.getDias()+2*cv;
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Deportivas" + " precio: " + precio;
    }

    

    
    
}
