## Outros tópicos básicos sobre Java 
#### *_Restrições e convenções para nomes_*

> ### Convenções 
> Camel Case: LastName
>- Pacotes
>- Atributos
>- Métodos 
>- Variáveis e parâmetros
>
> Pascal Case: ProductService 
>- Classes 

 ----
 #### *_Operadores bitwise_*
 *_Operador_* | *_Significado_*
 -------------|-------------
 &            | Operação "E" bit a bit 
 /            | Operação "OU" bia a bit 
 ^            | Operação "OU-EXCLUSIVO" bit a bit 
 
 #### TABELA VERDADE  & "E"

C1 | C2 | C1 **E** C2
:---|:----|:-----------
F  | F  |  F
F  | V  |  F
V  | F  |  F
V  | V  |  V 


#### TABELA VERDADE  / "OU"

C1 | C2 | C1 **OU** C2
:---|:----|:-----------
F  | F  |  F
F  | V  |  V
V  | F  |  V
V  | V  |  V 

#### TABELA VERDADE  ^ "XOR"

C1 | C2 | C1 **XOR** C2
:---|:----|:-----------
F  | F  |  F
F  | V  |  V
V  | F  |  V
V  | V  |  F 

#### DEMO 

> ### (89) 0101 1001
> ### (60) 0011 1100

+ E                           

89 | 60 | 89 **&** 60      
:--|:---|:-----------     
0  | 0  |  0
1  | 0  |  0
0  | 1  |  0
1  | 1  |  1 
1  | 1  |  1
0  | 1  |  0
0  | 0  |  0
1  | 0  |  0

+ OU

89 | 60 | 89 **//** 60
:--|:---|:-----------
0  | 0  |  0
1  | 0  |  1
0  | 1  |  1
1  | 1  |  1 
1  | 1  |  1
0  | 1  |  1
0  | 0  |  0
1  | 0  |  1

+ XOR 

89 | 60 | 89 **^** 60
:--|:---|:-----------
0  | 0  |  0
1  | 0  |  1
0  | 1  |  1
1  | 1  |  0 
1  | 1  |  0
0  | 1  |  1
0  | 0  |  0
1  | 0  |  1
------
#### Funções para String 

> #### Checklist
>- Formatar
>>- toLowerCase();      ->  maiúculo  
>>- toUpperCase();      ->  minúsculo
>>- trim();             -> remover espaços 
>- Recortar 
>>- substring(inicio);
>>- substring(inicio, fim);
>- Substituir 
>>- Replace(char,char);
>>- Replace (string, string);
>- Buscar
>>- IndexOf   
>>- LastIndextOf
>- str.Split("");   -> recortar string 

#### DEMO 

+ #### Formatar
 ##### toLowerCase()
~~~~JAVA 
String original = "ads NAIRA SILVA  java ANDRADE";

String maiusculo = original.toLowerCase();
~~~~
#### Saída na tela 
`ads naira silva java andrade `

##### toUpperCase()
~~~~JAVA 
String original = "ads NAIRA SILVA  java ANDRADE";

String minusculo = original.toUpperCase();
~~~~
#### Saída na tela 
`ADS NAIRA SILVA JAVA ANDRADE `

##### trim()
~~~~JAVA 
String original = " - ads NAIRA SILVA  java ANDRADE - ";

String espaco = original.trim();
~~~~
#### Saída na tela 
`-ads NAIRA SILVA  java ANDRADE-`

+ #### Recortar
 ##### substring(inicio)
~~~~JAVA 
String original = "ads NAIRA SILVA  java ANDRADE";

String recorte = original.substring(2);
~~~~
#### Saída na tela 
`s NAIRA SILVA  java ANDRADE `

##### substring(inicio, fim)
~~~~JAVA 
String original = "ads NAIRA SILVA  java ANDRADE";

String recorte = original.substring(2,9);
~~~~
#### Saída na tela 
`s NAIR`

+ #### Substituir
##### Replace(char,char)
~~~~JAVA 
String original = "ads NAIRA SILVA  java ANDRADE";

String substuicao = original.Replace('a','x');
~~~~
#### Saída na tela 
`xds NAIRA SILVA  jxvx ANDRADE`

##### Replace (string, string)
~~~~JAVA 
String original = "ads NAIRA SILVA  java ANDRADE";

String substuicao = original.Replace("ads","xy");
~~~~
#### Saída na tela 
`xy NAIRA SILVA  java ANDRADE`

+ #### Buscar
##### IndexOf 
~~~~JAVA 
String original = "ads NAIRA SILVA  java ANDRADE";

String buscarPosicao = original.IndexOf ("ds");
~~~~
#### Saída na tela 
`1`

##### LastIndextOf 
~~~~JAVA 
String original = "ads NAIRA SILVA  java ANDRADE";

String buscarPosicao = original.LastIndextOf ("ds");
~~~~
#### Saída na tela 
`1`

+ #### Split 
##### str.split("") 
~~~~JAVA 
String original = "ads NAIRA SILVA  java ANDRADE";

String [] vect = original.split (" ");
String word1 = vect[0];
String word2 = vect[1];
String word3 = vect[2];
String word4 = vect[3];

~~~~
#### Saída na tela 
`ads NAIRA SILVA  java`

---- 
### *_Comentários em java_*
+ Bloco 
~~~~java 
/*  
 * coemntários 
 * 
*/
~~~~
+ Linha 
~~~~~java 
// comentário
~~~~~
----- 
### Funções em java 
> Dados de entrada e saída 
>>- Funções podem receber dados de entrada (parâmetros ou argumentos)
>>- Funções podem ou não retornar uma saída

> Em orientação a objetos, funções em classes recebem o nome de "Métodos"

#### Exemplo 
##### Criando o método
~~~~java
public static int max (int a, int b, int c) {
    int aux;
  if (a > b && a > c){
      aux = a;
  }else if (b > c){
      aux = b;
  } else {
       aux = c;
  }
    return aux;
}
public static void showResult (int val){
    system.out.println(val);

}
~~~~
##### Chamando o método
~~~~java

int higher = max(a,b,c);
showResult (higher);
~~~~







 


