package polimorfismo.de.sobrecarga;
public class PolimorfismoDeSobrecarga {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Cachorro cxr = new Cachorro();
        Lobo l = new Lobo();
        /*m.emitirSom();
        l.emitirSom();
        cxr.emitirSom();*/
        cxr.reagir("Olá");
        cxr.reagir("Vai apanhar");
        cxr.reagir(11, 45);
        cxr.reagir(21, 00);
        cxr.reagir(true);
        cxr.reagir(false);
        cxr.reagir(2, 12.5f);
        cxr.reagir(17, 4.5f);
    }
    
}
