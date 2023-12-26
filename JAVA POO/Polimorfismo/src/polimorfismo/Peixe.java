package polimorfismo;
public class Peixe extends Animal {
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando...");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo substâncias");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    void idade(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
