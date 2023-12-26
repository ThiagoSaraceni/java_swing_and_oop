package projetofinalcev;
public class ProjetoFinalCEV {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 2 POO");
        v[2] = new Video("HTML e CSS");
        
        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22,  "M", "juba");
        
        Visualizacao[] vis = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[2]);//Jubileu assiste html e css
        vis[1] = new Visualizacao(g[0], v[1]);//Jubileu assiste aula 2 de POO
        vis[0].avaliar();//avaliando comnota  5 o html e css
        vis[1].avaliar(87f);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        
        /*
        System.out.println("-----VIDEOS----");
        System.out.println(v[0].toString());
        System.out.println("-----GAFANHOTOS----");
        System.out.println(g[0].toString());
        */ 
    }
    
}
