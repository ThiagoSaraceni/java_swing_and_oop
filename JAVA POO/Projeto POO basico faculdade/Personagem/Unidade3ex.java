package unidade3ex;
public class Unidade3ex {
    public static void main(String[] args) {
        //Criando o personagem
        Personagem mago = new Personagem("Gandalf", "Mago", 5);
        //Usando os metodos criados
        mago.mostrarPersonagem();
        mago.atacar();
        mago.defender();
        mago.especial();
        
        //Criando o personagem com a classe guerreiro
        Personagem guerreiro = new Personagem("Druida", "Guerreiro", 11);
        guerreiro.mostrarPersonagem();
        guerreiro.atacar();
        
    }
    
}
