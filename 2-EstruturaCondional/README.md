## Estrutura condicional 

#### *_Expressões comparativas_*

#### expressão -> resultado -> valor verdade 
------
### Operadores comparativos 

*_Operador_* | *_significado_*
-------------|----------------
' > '        | maior 
' < '        | menor 
' >= '       | maior ou igual 
' <= '       | menor ou igual
' == '       | igual 
' != '       | diferente 

-------
#### *_Expressões lógicas_*
#### expressão -> resultado -> valor verdade 
-----
### Operadores lógicos 

*_Operador_* | *_Significado_*
-----------| ------------
' &&  '       |  E
' // '        |   OU
' ! '          |   NÃO 
-------

#### Operador E 
+ Todas as condiçõs devem ser verdadeiras

#### Tabela verdade 
A  | B | A && B
---|---|------
F  | F | F
F  | V | F
V  | F | F
V  | V | V
-----------
#### Operador OU
+ Pelo menos uma condição deve ser verdadeiras

#### Tabela verdade 
A  | B | A  //  B
---|---|------
F  | F | F
F  | V | v
V  | F | v
V  | V | V
-----
#### Operador NÃO
+ Inverte a condição

#### Tabela verdade 

A  | !A
---|---
F  | V
V  | F 
--------
### *_IF-ELSE_*
+ É uma **_estrutura de controle_** que permite definir quen um certo **_bloco de comandos_** somente será exercutado dependendo de uma **_condição_**

------
### Simples 
+ V: executa o bloco de comandos 
  F: pula o bloco de comandos

#### Sintaxe 
~~~~java 
if (<condição>){
    <comando 1>
    <comando 2>
}
~~~~~~

#### Exemplo 

~~~java
int 5;

if (x > 0){
   system.out.println("Boa tarde !");
}
~~~~

### Composto 
+ V: executa somente o bloco do if 
  F: executa somente o bloco do else 
#### Sintaxe 

~~~~java 
if (<condição>){
    <comando 1>
    <comando 2>
}else {
    <comando 3>
}
~~~~~~
#### Exemplo 

~~~java
int 5;

if (x < 0){
   system.out.println(" Boa noite !");
}else if ( x > 0 ){
    system.out.println("Bom dia !");
}else {
    system.out.println("Boa tarde !");
}
~~~~

### Encadeamento de estruturas condicionais 

#### Sintaxe 

~~~~java 
if (<condição 1>){
    <comando 1>
    <comando 2>
}else {
    if (<condição 2>){
    <comando 3>
    <comando 4>
 } else {
    <comando 5>
    <comando 6>
  }  
}
~~~~~~
#### Exemplo 

~~~java
int 5;

if (x < 12){
   system.out.println(" Bom dia !");
}else {
    if (x < 18){
        system.out.println(" Boa tarde!");
    }else {
        system.out.println(" Boa noite !");
    }
}

~~~~
#### ELSE IF 

#### Exemplo 

~~~java
int 5;

if (x < 12){
   system.out.println(" Bom dia !");
}else if (x < 18){
        system.out.println(" Boa tarde!");
    }else {
        system.out.println(" Boa noite !");
    }
~~~~

---- 
#### Operadores de atribuição cumulativa 

a += b; | a = a + b;
--------|-----------
a -= b; | a = a - b;
a *= b; | a = a * b;
a /= b; | a = a / b;
a %= b; | a = a % b;
-------
### Estrutura SWITCH-CASE
+ Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável estruturas if-else encadeadas alguns preferem  utilizar a estrutura switch-case
 
#### Sintaxe 
~~~~java 
 switch (expressão){
    case valor1:
        comando1
        comando2
      break;
    case valor2:
         comando3
         comando4 
      break;
    default:
         comando5
         comando6
      break;
 }
~~~~
 #### Exemplo 
 ~~~~java 
 int x = sc.nestInt();
 String dia;

 switch (x){
    case 1: 
       dia = "Domingo";
       break;
    case 2:
        dia = "Segunda";
        break;
    case 3:
        dia = "Terça";
        break;
    case 4:
        dia = "Quarta";
        break;
    case 5:
        dia = "Quinta";
        break;
    case 6:
        dia = "Sexta";
        break;
    case 5:
        dia = "Sábado";
        break;
    default:
      dia = "Valor inválido";
      break;
 }
 system.out.printf("Dia da semana %s ", dia);
 ~~~~
------
### Expressão condicinal ternária 
+ Estrutura opcional ao if-else quando se deseja decidir um valor com base em uma condição

#### Sintaxe 
~~~~java
(condição) ? valor_se_verdadeiro : valor_se_falso
~~~~~

#### Exemplo 
~~~~~java
(2 > 4) ? 50 : 80              -> 80
(10 != 3) ? "Maria" : "Alex"   ->  Maria
~~~~~~

