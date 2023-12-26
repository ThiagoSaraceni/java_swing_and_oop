package aula07;
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    
    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalide(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitoria(vitorias);
        this.setDerrota(derrotas);
        this.setEmpate(empates);
    }

    //Metodos getter and setters
    public void setNome(String no) {
        this.nome = no;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNacionalide(String na){
        this.nacionalidade = na;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setAltura(float al){
        this.altura = al;
    }
    
    public float getAltura(){
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        if (this.getPeso()<52.2){
            this.categoria = "Inválido";
        } else if (this.getPeso()<= 70.3){
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }

    public String getCategoria() {
        return categoria;
    }
    
    

    public void setVitoria(int vi){
        this.vitorias = vi;
    }
    
    public int getVitoria(){
        return vitorias;
    }
    
    public void setDerrota(int de){
        this.derrotas = de;
    }
    
    public int getDerrota(){
        return derrotas;
    }
    
    public void setEmpate(int em){
        this.empates = em;
    }
    
    public int getEmpate(){
        return empates;
    }
    
    
    
    //Métodos
    public void apresentar(){
        System.out.println("-----------------------");
        System.out.print("CHEGOU A HORA! Apresentamos o ");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Diretamente de : " + this.getNacionalidade());
        System.out.println("com " + this.idade + " anos e");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitoria());
        System.out.println("Perdeu: " + this.getDerrota());
        System.out.println("Empatou: " + this.getEmpate());
    }
    
    public void status(){
        System.out.print(this.getNome());
        System.out.println(" é um peso " + this.getCategoria());
        System.out.println(this.getVitoria() + " vitórias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpate() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
}
