## Estrutura sequencial 

#### *_Três operações que o computador realiza_*

+  *_Entrada de dados_*
+  *_Processamneto de dados_*
+  *_Saída de dados_*
----

 Entrada de dados  |  Processamento de dados | Saída de dados 
:-------------------|:-------------------------|:---------------
Usuário -> Programa (dentro de variáveis) | Realização de cálculos | Programa -> Usuário 
Teclado |  Atribuição | Monitor 

----

### *_Saída de dados_* 

#### Imprimir uma mengem na tela 
~~~~~Java 
system.out.println("Olá, Mundo");
~~~~~~

#### Mostrar na tela o valor de uma variável 

~~~~ java 
int idade = 25;
system.out.println(idade);
~~~~~~

#### Imprimir no formato formatado 
~~~~java
double x = 1.5365
system.out.printf("%.2f", x);
~~~~
------

%f  | Pontos Flutuantes 
--- |----------------------
%d  | Inteiros 
%s  | Texto
%n  | Quebra de linha 
-----
#### Utilizar o ponto no lugar da virgula
~~~~java
Locale.setDefault (Locale.US);
~~~~
-------
#### *_Concatenação_*

##### Para *_print_* e *_println_*

~~~~java
elemento1 + elemento2 + elemento3 + ..... + elementoN
~~~~

##### Exemplo 
~~~~java 
system.out.prinrln ("Resultado = " + x + "metros");
~~~~

##### Para *_printf_*

~~~~java 
texto1 %f texto2 %f texto3 %f ...... textoN
~~~~

##### Exemplo 
~~~~java 
system.outprintf ("Resultado %.2f", x);
~~~~
----
### *_Processamento de dados_*

##### Comando de atribuição
##### Sintaxe

~~~~~java
<variável> = <expressão>;
~~~~~

##### Exemplo 
~~~~java
int x,y;
x = 5;
y = 10;
int soma = x * y;
system.out.println (soma);
~~~~~~
-----

### casting 
~~~~java
int a ; 
double b = 1.3;

b = (double) a;
system.out.println (b);
~~~~~~
-------
### *_Entrada de dados_* 

#### **_Scanner_** 
###### Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner" 

~~~~java 
Scanner sc = new Scanner (System.in);
~~~~~~

----
#### Para ler uma palavra 

~~~~java
String x;
x = sc.next();
~~~~

#### Para ler um numero inteiro 
~~~~java 
int idade;
idade = sc.nextInt();
~~~~~~

#### Para ler um número com ponto flutuante
~~~~java 
double y;
y = sc.nextDouble();
~~~~~~

#### Para ler um caractere 
~~~~java 
char x;
x = sc.next().charAt(0);
~~~~~~

#### Ler até a quebra de linha 
~~~~java 
x = sc.nextLine();
~~~~~~

------
### *_Funções matemáticas_*

*_Exemplo_* | *_Significado_*
--------| ------------
A = Math.sqrt(x); | Variável A recebe a raiz quadrada  de X
A = Math.pow (x,y) | Variável A recebe  o resultado de X elevado a Y
A = Math.abs(x); | Variável A recebe o valor absoluto de x 








 





