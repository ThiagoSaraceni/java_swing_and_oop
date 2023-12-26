package ex05;
public class Ex05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setStatus(true);
        c1.setDono("Thiago");
        c1.setNumConta(1234);
        c1.setTipo("CP");
        c1.abrirConta();
        c1.mostrar();
        c1.fecharConta();
        c1.depositar(500);
        c1.sacar(400);
        c1.mostrar();
        c1.pagarMensal();
    }
    
}
