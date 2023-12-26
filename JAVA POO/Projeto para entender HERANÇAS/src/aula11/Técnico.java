package aula11;
public class Técnico extends Aluno{
    private int registro;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    public void praticar(){
        System.out.println("Praticando....");
    }

    @Override
    public String toString() {
        return "T\u00e9cnico{" + "registro=" + registro + '}';
    }
    
    
}
