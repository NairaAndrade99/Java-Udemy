## **_Comportamentos de memórias, arrays, listas_**

### **_Tipos referêmcia VS tipos valor_**

#### Classes são tipos refrência 
##### Váriaveis cujo tipo são classes não devem ser entendidas como caixas, mas sim "tentáculos" (ponteiros) para caixas 

#### Sintaxe 
#### " p2 passa a apontar para onde p1 aponta "
~~~~java
Product p1, p2;
p1 =  new Product("TV",900.00,0);
p2 = p1;
~~~~
----
#### Valor "_null_"
##### Tipos referência aceita, o valor "null", que indica que a variável aponta para ninguém.

#### Sintaxe 
~~~~java
Product p1, p2;
p1 =  new Product("TV",900.00,0);
p2 = null;
~~~~
---
#### Tipos primitivos são tipos valor 
##### Em java, tipos primitivos são tipos valor. Tipos valor são **CAIXAS** e não ponteiros.

#### Sintaxe 
#### " y recebe uma **CÓPIA** de x "
~~~~java 
double x,y;
x = 10;
y = x;
~~~~
-----
#### Tipos primitivos e inicialização 
+ #### Demo:
~~~~java 
int p;
system.out.println(p); // erro: variáveçl não inicializada

p = 10;
system.out.println(p); // variável inicializada
~~~~
-----
#### Valores padrão 
>- Quando alocamos (new) qualquer tipo estruturado (classe ou array), são atribuidos valores padrão aos seus elementos
>>- número: 0;
>>- boolean: false;
>>- char: caractere código 0
>>- objeto: null

#### Sintaxe 
~~~~java 
Product p = new Product ();
~~~~
-----
### Tipos refência VS tipos valor 

**_classes_**| **_Tipos Primitivos_**
---------|--------
Vantagem: usufrui de todos recursos OO | Vantagem: é mais simples e mais performático
Variáveis são ponteiros| variáveis são caixas 
Objetos precisam ser instanciadas usando new, ou apontar para um objeto já existente| Não instancia. Uma vez declarados, são prontos para uso
Aceita valor null | Não aceita valor null
y = x; "y passa a apontar para onde x aponta" | y = x; "y recebe uma cópia de x"
Objetos instanciados no heap| "Objetos" instanciados no stack
Ojetos não utilizados são desalocados em um momento próximo pelo garbage collector| "Objetos" são desalocados imediatamente quando seu escopo execução é finalizado 
----
### Desalocação de memória - garbage collector e escopo local

#### **_Garbage collector_**
+ #### É um processo que autómatiza o gerenciamento de memória de um programa em execução
+ #### O garbage collector monitora os objetos alocados denamicamente pelo programa (no heap), desalocando aqueles que não estão mais sendo utilizados.

#### **_Desalocação por escopo local_** 
~~~~java 
void method1(){
    int x = 10;
    if (x > 0){
        int y = 20;
    }
    system.out.println(x);
}
~~~~
#### RESUMO
+ #### Objetos alocados denamicamente, quando não possuem mais referencia para eles, serão desalocados pelo garbage collect
+ #### Variáveis locais são desalocadas imediatamnete assim que seu escopo local sai de execução
----
### **VETORES**
>- Em progrmação, "Vetor" é o nome dado a rranjos unidimensionais
>- Arranjo (array) é uma estrutura de dados:
>>- Homogênea (dados do mesmo tipo)
>>- Ordenada (elementos acessados por meio de posições)
>>- Alocada de uma vez só, em um bloco contíguo de memória
>- Vantagns:
>>- Acesso imediato aos elementos pela sua posição
>- Desvantagens: 
>>- Tamanho fixo
>>- Dificuldade para se realizar insercões e delegação 
              
### Sintaxe
~~~~java 
tipo [] nome = new tipo [tamanho];
~~~~
### Exemplo
~~~~java 
int [] numero = new int [10];
~~~~

### É atráves do FOR que conseguimos pecorrer o vetor 

### Sintaxe 
~~~~java 
for (int i = 0; i < tamanho_do_vetor; i++){
    system.out.println("Elementos do vetor" + nome_do_vetor[i]);
}
~~~~
### Exemplo 
~~~~java 
int [] vetor = new int [10];
for (int i = 0; i < 10; i++){
    system.out.println("Elementos do vetor" + vetor[i]);
}
~~~~
### Vetor do tipo classe 

### Exemplo 
~~~~java 
Product [] vect = new Product[10];

for (int i = 0; i < 10; i++){
    String name = sc.nextLine();
    double price = sc.nextDouble();
    vect[i] = new Product(name, price);
}
double sum = 0.0;
for (int i = 0; i < 10; i++){
    sum += vect[i].getPrince(); 
}
~~~~
+ ### Atributo **_length_** busca o tamanho do vetor 
#### Exemplo 
~~~~java 
for (int i = 0; i < vect.length; i++){}
~~~~
-----
### Boxing, unboxing e wrapper classes
### Boxing
+ #### É o processo de conversão de um objeto tipo **valor** para um objeto tipo **referênce** compatível 
#### Exemplo 
~~~~java 
int x = 20;
Object obj = x;
~~~~
### Unboxing 
+ #### É o processo de conversão de um objeto tipo **referencia** para um objeto tipo **valor** compatível 



#### Exemplo 
~~~~java 
int x = 20;
Object obj = x;
int y = (int) obj;
~~~~
### wrapper classes
+ #### São classes equivalentes aos tipos primitivos
+ #### Boxing e unboxing é natural ba linguagem 
+ #### Uso comum: campos de entidades em sistemas de informação (inportante!)
>>- Pois tipos referência (classes) aceita, valor null e usufruem dos recursos OO
----
### Laço "**_FOR EACH_**"
#### Sintaxe opcional e simplificada para percorrer coleções
### Sintaxe 
~~~~java 
for (tipo apeçido: coleção){
    <comando 1>
    <comando 2>
}
~~~~
### Exemplo 
~~~~java 
String [] vect = new String [] {"Joao","Maria","Gabi"};

for (String nome: vect){
    System.out.println(nome);
}
~~~~
#### Saída 
`Joao Maria Gabi`

---
### Listas
>- Lista é uma estrutura de dados:
>>- Homogênea (dados do mesmo tipo)
>>- Ordenada (elementos acessados por meio de posições)
>>- Iniciar vazia, e seus elementos são alocados sob demanda
>>- Cada elemento ocupa um "nó" (ou nodo) da lista
>- Tipo (Interface): List
>- Classes que implementam: ArrayList, LinkedList, etc.:
>- Vantagens 
>>- Tamanho variável 
>>- Facilidade para se realizar inserções e deleções
>- Desvantagens:
>- Acesso sequencial aos elementos *

* ##### Não aceita tipos primitivos 
### Sinatxe 
~~~~java 
List <tipo> nome_da_lista = new Clases_que_implementa <> ();
~~~~
+ #### Imprimir a lista
~~~~java 
for (String lista: list){
    System.out.println(lista);
}
~~~~
#### Saída 
`Naira`
### Demo 
+ ### Tamaho da lista: **_size()_**
~~~~java
System.out.println(list.size());
~~~~
+ ### Inserir elemento na lista: **_add(obj)_**,**_add(int, obj)_**
~~~~java 
List <String> list = new ArrayList<String>();
list.add("Naira");
list.add(0,"Joao");
~~~~
+ ### Remover elemntos da lista: **_remove(obj)_**,**_remove(int)_**,**_removeIf(Predicate)_**
~~~~java 
list.remove("Naira");
list.remove(0);
list.removeIf(x -> x.charAt(0) == 'J');
~~~~
+ ### Encontrar posição de elemento: **_indexOf(obj)_**, **_lastIndexOf(obj)_**
~~~~java 
list.indexOf("naira");

~~~~
+ ### Filtrar lista com base em predicado: **_List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
~~~~java 
List <Integer> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList())
~~~~
+ ### Encontrar primeira ocorrência com base em predicado: **_Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
~~~~java 
String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null)
~~~~

