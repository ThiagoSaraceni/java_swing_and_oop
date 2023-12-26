package ex05;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public void setTipo(String s){
        this.tipo = s;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setDono(String nomedono){
        this.dono = nomedono;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setSaldo(float meusaldo){
        this.saldo = meusaldo;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setStatus(boolean sd){
        this.status = sd;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    
    public void abrirConta(){
        if (this.status == true && this.tipo.equals("CC")){
            this.saldo = this.getSaldo() + 50;
        } else if (this.status == true && this.tipo.equals("CP")){
            this.saldo = this.getSaldo() + 150;
        }else{
            System.out.println("Conta não esta ativa escolha Conta Poupança(CP) ou Conta Corrente(CC)");
        }
    }
    
    public void mostrar(){
        System.out.println("SEUS DADOS");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("tipo da conta: "+ this.getTipo());
        System.out.println("status " + this.status);
        System.out.println("Seu saldo é de " + this.getSaldo());
    }
    
    public void fecharConta(){
        if (this.saldo > 0){
            System.out.println("Você não pode fechar a conta, porque ainda tem dinheiro nela.");
        } else if (this.saldo < 0){
            System.out.println("Você não pode fechar a conta porque está devendo ao banco. Favor deposite o necessário para conseguir fechar");
        } else{
            this.status = false;
            System.out.println("Você fechou a conta!");
        }
    }
    
    public float depositar(float n){
        this.saldo = this.getSaldo() + n;
        return saldo;
    }
    
    public float sacar(float n){
        this.saldo = this.getSaldo() - n;
        return saldo;
    }
    
    public void pagarMensal(){
        if (this.tipo.equals("CC")){
            System.out.println("Será cobrado 12 reais de mensalidade, seu saldo era " + this.getSaldo());
            this.saldo = this.getSaldo() - 12;
            System.out.println("Agora é " + this.getSaldo());
        } else if (this.tipo.equals("CP")){
            System.out.println("Será cobrado 20 reais de mensalidade, seu saldo era " + this.getSaldo());
            this.saldo = this.getSaldo() - 20;
            System.out.println("Agora é " + this.getSaldo());
        }
        
    }
}
