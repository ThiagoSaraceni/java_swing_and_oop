# java_swing_and_oop
Programas que fui fazendo e aprendendo enquanto estudava Java.
MINHAS ANOTAÇÕES


Somente o JAVA sem POO ainda.
sout = system.out.println

cliente: JRE

programdor: JDK

JDK: Java Development Kit

JRE: Java Runtime Environment
--
Extends J.Frame

extends = herança

Resumindo tudo que um J.frame tiver vai passar para minha herança
--
Encapsulamento = tornar coisas privadas a objetos
--

SAIDA DE DADOS

mostrar algo na variavel
nome_variavel.SetText("poe a variavel ou texto aqui")
--
System.out.print() = print sem pular linha
System.out.println() = print pulando linha 
---

System.out.printf() = print formatado
ou
System.out.format() = print formatado

exemplos do printf
se a var nota tiver o valor de 8.5
System.out.printf("A nota é %.2f", nota) = ai mostra sua nota é 8,50
senao mostra
System.out.printf("A nota é %.2f", nota) = ai mostra sua nota é 8,500000

system.out.printf e system.out.format são a mesma coisa
-----

ENTRADA DE DADOS

criando objeto para ler as entradas
importar a biblioteca primeiramente

import java.util.Scanner;


Scanner teclado = new Scanner(System.in);

ler inteiro
int idade = teclado.nextInt();

ler string
String nome = teclado.nextLine();

ler float
float salario  = teclado.nextFloat();

---
PASSANDO UM NUMERO INTEIRO E TRANSFORMANDO EM String
		int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
---
PASSANDO UM NUMERO DE UMA STRING E TRANSFORMANDO EM NUMERO
		String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
---
PASSANDO UM NUMERO DE UMA STRING E TRANSFORMANDO EM NUMERO REAL
		String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.println(idade);
-----
OBTER TEXTO DA CAIXA DE TEXTO
variavelNormalInteira = Integer.parseInt(nomevariavelcaixatexto.getText())

---
++ e --
se estiverem no final só contará depois que acabar o calculo
por exemplos
var num = 10
++num 
system.out.println(num)
voltar aos  20min de video do guanabara  caso necessario, mas se  for no final ele só contará após acabar a linha do codigo
se for antes ele já acrescenta um tiro um
++ num (ACRESCENTA NA HORA)
--num(DECRESCENTA NA HORA)
num ++(SO ACRESCENTA DEPOIS QUE ACABA LINHA DO CODIGO)
num --(SO DECRESCENTA DEPOIS QUE ACABA LINHA DO CODIGO)
----
CONDIÇÃO EM Java

nome_variavel = (condicao > outracondicão)?"CONDIÇÃOSESIM":"CONDIÇÃOSENÃO";

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
ESTUDOS JAVA COM POO
Vantagens POO

palavra chave - COMERNada


C - Confiavel
	O isolamento entre  as partes gera software seguro. Ao alterar uma  parte, nenhuma outra é afetada.
	
O - Oportuno
	Ao dividir tudo em partes, várias delas podem ser desenvolvidas em paralelo.

M - Manutenível
	Atualizar um software é mais fácil. Uma pequena modificação vai beneficiar todas as partes que usarem o objeto.
	
E - Extensível
	O software não é estático. Ele deve crescer para permanecer util(CRIAR USANDO O CODIGO ANTIGO)
	
R - Reutilizável
	Podemos usar objetos de um sistema que criamos em outra sistema futuro.
	
N - Natural
	Mais fácil de entender. Você se preocupa mais na funcionalidade do que nos detalhes de implementação.

------------------------
O que é um objeto
	Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas características, comportamentos e estado atual
	
O que classifica um objeto é uma classe   
Uma classe tem que sempre responder a três perguntas
1 - O que eu tenho
2 - O que eu faço
3 - Como eu estou agora.

Irei uma usar caneta como exemplo

1 - O que eu tenho
	Modelo
	Cor
	Ponta
	Carga
	Tampada
	
2 - O que eu faço
	Escrever
	Rabiscar
	Pintar
	
3 - Como eu estou agora
	50% de carga
	Ponta fina
	Cor azul
	Destampada
	Escrevendo 

Todo objeto tem ATRIBUTOS, MÉTODOS e ESTADO

Atributos(coisas que eu tenho)
Métodos(coisas que eu faço)
Estado(como eu estou agora)

-----
Classe Caneta
	modelo: caractere
	cor: caractere
	ponta: real
	carga: inteiro
	tampada: logico
	
	Metodo rabiscar()
		se(tampada) entao
			Escreva("ERRO")
		senao
			Escreva("RABISCO")
		FimSe
	FimMetodo
	
	Metodo tampar()
		tampada = verdadeiro
	FimMetodo
FimClasse

Atributos
	Modelo = "BIC Cristal"
	Cor = "AZUL"
	Ponta = 0.5
	Carga = 90
	Tampada = Falso

Metodos
	Escrever
	Rabiscar
	Pintar
	Tampar
	Destampar
	
Estado 
	Destampado
	Azul 
	90% de carga.
	
---
Quando tenho uma classe e quero transformar ela em um objeto. chama-se INSTANCIAR, que é quando pego uma classe e gero um objeto a partir dela.
Nao transformo uma classe em objeto, eu gero um objeto a partir de uma classe

Estou instanciando uma classe em forma de um objeto

c1 = nova Caneta
nome do objeto NOVA classe

c1.cor = "Azul"
c1.ponta = 0.5
c1.tampada = falso
c1.rabiscar()

c2 = nova Caneta
c2.cor = "Vermelha"
c2.ponta = 1.0
c2.tampada = falso
c2.tampar()


c1 e c2 são da mesma classe porém tem atributos diferentes
--

Classe 
	Define os atributos e métodos comuns que serão compartilhados por um objeto
Objeto
	É a instância de uma classe.
	

Classe é tipo "CARRO"
objeto são as varias marcas de carros que existem

--

Abstração
	Pegar somente os atributos que importar, ignoram os outros e pega somente os importantes.

--

Modificados de visibilidade
	Indicam o nível de acesso aos componentes internos de uma classe
	
3 simbolos da nomenclatura uml

+ público 
- privado
# protegido

TODO ATRIBUTO ou METODO declarado como publico:
	a classe atual e todas as outras classes possam ter acesso a ela(todo mundo pode ver e usar livremente)

TODO ATRIBUTO ou METODO declarado como privado:
	somente a classe atual tem acesso.

TODO ATRIBUTO ou METODO declarado como protegido:
	a classe atual e todas as suas sub-classes

exemplo telefone publico
qualquer lugar voce pode usar(orelhao)

telefone privado
meu celular, somente eu posso usar

telefone protegido 
telefone residencial, quem pode usar, somente quem é da minha familia(minha mae, pai e os filhos)

--

o o privado e mais usado para proteger o usuario de quebrar o codigo

--
Métodos acessores(Getters)

get - pega

Metodos acessores/metodos getter conseguem acessar determinado atributos mantendo a segurança de acesso a ele.
  
Métodos Modificadores/mutantes(Setters)

---
Se os atributos estão como privados nós não conseguimos inserir de maneira padrao, exemplo
c1.modelo = "trator";
teria que ser
c1.setModelo("trator")

o get e setter 

---
MÉTODO CONSTRUTOR maneira mais facil, sem parametros

public Caneta(){ //  Este é o método CONSTRUTOR
        this.tampar();
        this.cor = "Azul";
        
    }
	
toda caneta vem com esses atributos já inseridos
cor azul e tampada


MÉTODO CONSTRUTOR com parametros

SEM USAR O SET
public Caneta(String m, String c, float p){ //  Este é o método CONSTRUTOR
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        
    }
	
USANDO o SET
public Caneta(String m, String c, float p){ //  Este é o método CONSTRUTOR
        this.setModelo(m);
        this.cor = c;
        this.setPonta(p);
        this.tampar();
        
    }

Quando vai criar usa esse parametro.
Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);

---
Modelo get

public float getPonta(){
        return this.ponta;
		
Modelo set

public void setPonta(float p){
        this.ponta = p;
    }
	
get é sempre public tipo da variavel getNOMEVARIAVEL
	return this.VARIAVEL
	
set  public void setNOMEVARIAVEL (tipoprimitivovariavel NOMEVARIAVEL)
	this.NOMEVARIAVEL = NOMEVARIAVEL
	
---
Pilares da POO
EHP - 
Encapsulamento
Herança
Polimorfismo

Alguns lugares são considerados 4 pilares
AEHP
Abstração
Encapsulamento
Herança
Polimorfismo

ENCAPSULAMENTO
	Um software encapsulado protege o usuario do codigo e o código do usuario. Codigo encapsulado não deixa o programador fazer besteira. Codigo encapsulado usa interface, moldes padrão
	Encapsular - Ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior.
	
INTERFACE
	Lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com um objeto dessa classe.
	
HERANÇA
	Permite basear uma nova classe na definição de uma outra classe previamente existente.
	A herança será aplicada tanto para as características quanto para os comportamentos
	
	A classe mãe, também pode ser chamada de progenitora ou superclasse. Que no caso é uma classe que irá dar origem a outras classes, que vão herdar suas características e compotarmentos
	
	Classes filhas também podem ser chamadas de subclasses, são classes oriundas da suas superclasses. Para fazer uma classe filha eu não preciso dizer os atributos e compotarmentos que vem da classe mãe.
	
	Pra chamar a classe mãe é só colocar extends nomeClasseMãe
	
	Raiz: uma classe que não possui superclasses (mãe).
	Folha: uma classe que não possui subclasses (filhas).
	Descendente: A teve um filho AC e AC teve um filho ACA. A é ancestral de ACA. 
	A NÃO É ANCESTRAL DE AC
	Ascendente: ACA é descendente de A.
	AC NÃO É DESCENDENTE DE A
	Especialização: percorrer a árvore de cima pra baixo.
	Generalização: percorrer a árvore de baixo pra cima.

	HERANÇA DE IMPLEMENTAÇÃO (HERANÇA POBRE):
		Apenas herda os atributos e os métodos da classe mãe, sem implementar mais nenhum.


	HERANÇA PARA DIFERENÇA:
		Herda os atributos e os métodos da classe mãe, implementando outros métodos dela própria.
		
	Classe abstrata: não pode ser instanciada. Só pode servir como progenitora. (Não pode gerar objetos)
	Método abstrato: declarado, mas não implementado na progenitora. (Interfaces)
	Classe final: não pode ser herdada por outra classe. É obrigatoriamente folha. (Não pode ter filhos)
	Método final: não pode ser sobrescrito pelas suas sub-classes. É obrigatoriamente herdado. (Não pode gerar uma especialização)
	Sobrepor: fazer a mesma coisa de formas diferentes (@Override).

POLIMORFISMO
Poli = muitas
Morfo =formas
	Permite que um mesmo nome represente vários comportamentos diferentes.
	
Polimorfismo de sobreposição
	Acontece quando substituímos um método de uma superclasse na sua subclasse, usando a mesma assinatura.
	
Polimorfismo de sobrecarga
	Acontece quando dentro de uma classe temos mais de uma assinatura com metodos diferentes.

Assinatura de um metodo é a quantidade de atributos que ele recebe e os tipos de atributos.

Polimorfismo de sobreposição
	Mesma assinatura
	Classes diferentes
	usa o @Override
	
Polimorfismo de sobrecarga
	Assinaturas diferentes.
	Mesmas classes
	NÃO usa o @Override

