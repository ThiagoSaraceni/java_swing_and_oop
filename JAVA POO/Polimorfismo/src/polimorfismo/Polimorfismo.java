package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {
         Mamífero m = new Mamífero();
         Réptil r = new Réptil();
         Peixe p = new Peixe();
         Ave a = new Ave();
         Canguru c = new Canguru();
         Cachorro cxr = new Cachorro();
         Cobra snake = new Cobra();
         Goldfish gfish = new Goldfish();
         Arara ar = new Arara();
         Tartaruga t = new Tartaruga(); 
         
         /*
         m.setPeso(85.3f);
         m.setIdade(2);
         m.setMembros(4);
         System.out.println(m.toString());
         m.locomover();
         m.alimentar();
         m.emitirSom();
         m.setCorPelo("Rosa");
         System.out.println("A cor do pelo é   " + m.getCorPelo());
         
         p.setPeso(0.35f);
         p.idade = 1;
         p.setMembros(0);
         System.out.println(p.toString());
         p.locomover();
         p.alimentar();
         p.soltarBolha();
         p.emitirSom();
         
         a.setPeso(0.89f);
         a.setIdade(2);
         a.setMembros(2);
         a.locomover();
         a.alimentar();
         a.emitirSom();
         a.fazerNinho();
         System.out.println(a.toString());
         */
          
        c.locomover();
        c.usarBolsa();
        cxr.locomover();
        cxr.emitirSom();
        c.emitirSom();
         
    }
    
}
