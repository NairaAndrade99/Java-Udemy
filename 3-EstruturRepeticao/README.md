## Estrutura de repetição

#### *_Estrutura repetitiva "enquanto"   WHILE_*
+ É uma **_estrutura de controle_** que **_repete_** um bloco de comandos **_enquanto_** uma **_condição_** for verdadeira    
**_Quando usar:_** quando **_não_** se sabe previamente a quantidade de repetições que será realizada. 

##### V: executa e volta    F: pula fora 
#### Sintaxe 

~~~~java
while (condição){
    comando 1
    comando 2
}
~~~~

#### Exemplo 
~~~~~java
while (x != 0){
    x = sc.nextInt();
}
~~~~~
----
#### *_Estrutura repetitiva "faça-enquanto"   DO-WHILE_*
+ O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final 
##### V: volta   F: pula fora 
#### Sintaxe 

~~~~java
do{
    comando 1
    comando 2
}while (condição);
~~~~

#### Exemplo 
~~~~~java
do{
     x = sc.nextInt();
}while (x != 0);
   
~~~~~
----
#### *_Estrutura repetitiva "para"   FOR_*
+ É uma **_estrutura de controle_** que **_repete_** um bloco de comandos **_para_** um certo **_intervalo de valores ._**   
**_Quando usar:_** quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.

##### Executa somente na primeira vez ->  V: executa e volta  F: pula fora  -> Executa toda vez depois de voltar 

#### Sintaxe 

~~~~java
for (inicio; condição;incremento){
    comando 1
    comando 2
}
~~~~

#### Exemplo 
~~~~~java
for (int i = 0; i < 10; i++){
     system.out.println(i);
}
~~~~~
-----