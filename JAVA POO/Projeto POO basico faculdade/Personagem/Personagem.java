package unidade3ex;
public class Personagem {
    public String nome;
    private String classe;
    private int nivelxp;
    private int forca;
    private int vida; 
    private int defesa;
    private int especial;
    
    //Construtor da classe Personagem
    //No construtor você é obrigado a colocar o nome do personagem, classe e o nível dele, restante é atribuido sozinho no codigo
    public Personagem(String nome, String classe, int nivelxp){
        this.setNome(nome);
        this.setClasse(classe);
        this.setNivelxp(nivelxp);
        this.SetForca(20);
        this.setVida(100);
        this.SetDefesa(30);
        this.setEspecial(100);
    }
    
    

    //Getter and Setters
    
    //Esse set é para a vida aumentar 70 de vida a cada nível
    public void setVida(int n){
        this.vida = n + (this.getNivelxp() * 70);
    }
    
    public int getVida(){
        return vida;
    }
    
    //Força é padrão 20, ela aumenta baseada no seu nivel
    public void SetForca(int n){
        this.forca = n * this.getNivelxp();
    }
    
    public int getForca(){
        return forca;
    }
    
    //Defesa padrão é de 30, a cada nível ganha + 20 de defesa.
    public void SetDefesa(int n){
        this.defesa = n + (this.getNivelxp() * 20);
    }
    
    public int getDefesa(){
        return defesa;
    }
    
    //Especial valor padrão de 100, a cada nível ganha mais 60 de dano no especial
    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int n) {
        this.especial = n + (this.getNivelxp() * 60);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String c) {
        this.classe = c;
    }

    public int getNivelxp() {
        return nivelxp;
    }

    public void setNivelxp(int nivelxp) {
        this.nivelxp = nivelxp;
    }
    
    //Métodos
    
    //Esse metodo mostra todosos atributos do personagem que teve a classe criada
    public void mostrarPersonagem(){
        System.out.println("----------------");
        System.out.println("Personagem");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Classe: " + this.getClasse());
        System.out.println("Nivel XP:" + this.getNivelxp());
        System.out.println("Força: " + this.getForca());
        System.out.println("Defesa: " + this.getDefesa());
        System.out.println("Vida " +  this.getVida());
        System.out.println("----------------");
        System.out.println("");
        
    }
    
    //Metodo  para fazer o personagem atacar
    public void atacar(){
        System.out.print(this.getNome() + " está atacando,");
        System.out.println(" seu ataque causa " + this.getForca() +" dano");
        System.out.println("");
    }
    
    //Metodo  para fazer o personagem defender
    public void defender(){
        System.out.println(this.getNome() + " está se defendendo, seu poder de defesa é de " + this.getDefesa());
        System.out.println("");
    }
    
    //Metodo  para fazer o personagem usar o especial
    public void especial(){
        System.out.println(this.getNome() + " está usando seu poder especial, isso causa " +this.getEspecial() + " de dano");
        System.out.println("");
    }
   
    
}
