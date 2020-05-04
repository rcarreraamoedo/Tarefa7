
package tarefa7;

public abstract class Barco{
    
    private float eslora;
    private int dias;
    private String matricula;

    public Barco() {
    }

    public Barco(float eslora,int dias, String matricula) {
        this.eslora = eslora;
        this.dias = dias;
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Barco{" + "eslora=" + eslora+ ", dias=" + dias + ", matricula=" + matricula + '}';
    }
    
    
    public abstract void calcularPrezo();
    
    
}
