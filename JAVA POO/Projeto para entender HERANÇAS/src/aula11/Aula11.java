package aula11;
public class Aula11 {
    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        */
        /*
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        */
        
        Professor p1 = new Professor();
        p1.setSalario(2500f);
        p1.setNome("Jânio");
        p1.setEspecialidade("Matemática");
        p1.mostrarSalario();
        p1.receberAumento(500);
        p1.mostrarSalario();
        System.out.println(p1.toString());
        
        
        Técnico t1 = new Técnico();
        t1.setNome("José");
        t1.setRegistro(2222);
        t1.setSexo("M");
        System.out.println(t1.toString());
        t1.praticar();
    }
    
}
