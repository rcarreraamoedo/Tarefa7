
package tarefa7;


public class Veleros extends Barco {
    
    private int numeroMastiles;
    private float precio;

    public Veleros() {
    }

   

    public Veleros(int numeroMastiles, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public void calcularPrezo() {
    precio = 10*super.getEslora()*super.getDias()+8*numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero" + " precio: " + precio;
    }
    
    
    
    
}
